package net.mcreator.falloutwastelands;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraftforge.network.simple.SimpleChannel;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.util.thread.SidedThreadGroups;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;

import net.mcreator.falloutwastelands.world.features.StructureFeature;
import net.mcreator.falloutwastelands.init.FalloutWastelandsModTabs;
import net.mcreator.falloutwastelands.init.FalloutWastelandsModSounds;
import net.mcreator.falloutwastelands.init.FalloutWastelandsModParticleTypes;
import net.mcreator.falloutwastelands.init.FalloutWastelandsModMobEffects;
import net.mcreator.falloutwastelands.init.FalloutWastelandsModMenus;
import net.mcreator.falloutwastelands.init.FalloutWastelandsModItems;
import net.mcreator.falloutwastelands.init.FalloutWastelandsModFluids;
import net.mcreator.falloutwastelands.init.FalloutWastelandsModFluidTypes;
import net.mcreator.falloutwastelands.init.FalloutWastelandsModEntities;
import net.mcreator.falloutwastelands.init.FalloutWastelandsModBlocks;
import net.mcreator.falloutwastelands.init.FalloutWastelandsModBlockEntities;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiConsumer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import java.util.AbstractMap;

@Mod("fallout_wastelands_")
public class FalloutWastelandsMod {
	public static final Logger LOGGER = LogManager.getLogger(FalloutWastelandsMod.class);
	public static final String MODID = "fallout_wastelands_";

	public FalloutWastelandsMod() {
		// Start of user code block mod constructor
		// End of user code block mod constructor
		MinecraftForge.EVENT_BUS.register(this);
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		FalloutWastelandsModSounds.REGISTRY.register(bus);
		FalloutWastelandsModBlocks.REGISTRY.register(bus);
		FalloutWastelandsModBlockEntities.REGISTRY.register(bus);
		FalloutWastelandsModItems.REGISTRY.register(bus);
		FalloutWastelandsModEntities.REGISTRY.register(bus);

		FalloutWastelandsModTabs.REGISTRY.register(bus);

		StructureFeature.REGISTRY.register(bus);
		FalloutWastelandsModMobEffects.REGISTRY.register(bus);

		FalloutWastelandsModParticleTypes.REGISTRY.register(bus);

		FalloutWastelandsModMenus.REGISTRY.register(bus);
		FalloutWastelandsModFluids.REGISTRY.register(bus);
		FalloutWastelandsModFluidTypes.REGISTRY.register(bus);

		// Start of user code block mod init
		// End of user code block mod init
	}

	// Start of user code block mod methods
	// End of user code block mod methods
	private static final String PROTOCOL_VERSION = "1";
	public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation(MODID, MODID), () -> PROTOCOL_VERSION, PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);
	private static int messageID = 0;

	public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder, BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
		PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
		messageID++;
	}

	private static final Collection<AbstractMap.SimpleEntry<Runnable, Integer>> workQueue = new ConcurrentLinkedQueue<>();

	public static void queueServerWork(int tick, Runnable action) {
		if (Thread.currentThread().getThreadGroup() == SidedThreadGroups.SERVER)
			workQueue.add(new AbstractMap.SimpleEntry<>(action, tick));
	}

	@SubscribeEvent
	public void tick(TickEvent.ServerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			List<AbstractMap.SimpleEntry<Runnable, Integer>> actions = new ArrayList<>();
			workQueue.forEach(work -> {
				work.setValue(work.getValue() - 1);
				if (work.getValue() == 0)
					actions.add(work);
			});
			actions.forEach(e -> e.getKey().run());
			workQueue.removeAll(actions);
		}
	}
}
