package net.mcreator.falloutwastelands.procedures;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.falloutwastelands.init.FalloutWastelandsModMobEffects;
import net.mcreator.falloutwastelands.init.FalloutWastelandsModEntities;
import net.mcreator.falloutwastelands.FalloutWastelandsMod;

import javax.annotation.Nullable;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(value = {Dist.CLIENT})
public class RightClickPlaceObjectProcedure {
	@SubscribeEvent
	public static void onRightClick(PlayerInteractEvent.RightClickEmpty event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		FalloutWastelandsMod.PACKET_HANDLER.sendToServer(new RightClickPlaceObjectMessage());
		execute(event.getLevel(), event.getEntity());
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class RightClickPlaceObjectMessage {
		public RightClickPlaceObjectMessage() {
		}

		public RightClickPlaceObjectMessage(FriendlyByteBuf buffer) {
		}

		public static void buffer(RightClickPlaceObjectMessage message, FriendlyByteBuf buffer) {
		}

		public static void handler(RightClickPlaceObjectMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getSender().level().hasChunkAt(context.getSender().blockPosition()))
					return;
				execute(context.getSender().level(), context.getSender());
			});
			context.setPacketHandled(true);
		}

		@SubscribeEvent
		public static void registerMessage(FMLCommonSetupEvent event) {
			FalloutWastelandsMod.addNetworkMessage(RightClickPlaceObjectMessage.class, RightClickPlaceObjectMessage::buffer, RightClickPlaceObjectMessage::new, RightClickPlaceObjectMessage::handler);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(FalloutWastelandsModMobEffects.IN_BASE.get())) {
			if (entity.getPersistentData().getBoolean("placeMK1")) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = FalloutWastelandsModEntities.FRIENDLY_MK_1_TURRET.get().spawn(_level,
							new BlockPos(
									entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX(),
									entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY(),
									entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
							MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
				entity.getPersistentData().putBoolean("placeMK1", false);
			} else {
				entity.getPersistentData().putBoolean("placeMK1", false);
			}
		}
	}
}
