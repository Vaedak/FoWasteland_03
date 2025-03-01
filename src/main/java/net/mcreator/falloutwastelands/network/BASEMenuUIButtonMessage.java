
package net.mcreator.falloutwastelands.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.falloutwastelands.world.inventory.BASEMenuUIMenu;
import net.mcreator.falloutwastelands.procedures.SetBASENameProcedure;
import net.mcreator.falloutwastelands.procedures.OpenBASEInventoryProcedure;
import net.mcreator.falloutwastelands.procedures.InputCapsBASEUIProcedure;
import net.mcreator.falloutwastelands.procedures.ExitMenuUIProcedure;
import net.mcreator.falloutwastelands.FalloutWastelandsMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BASEMenuUIButtonMessage {
	private final int buttonID, x, y, z;

	public BASEMenuUIButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public BASEMenuUIButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(BASEMenuUIButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(BASEMenuUIButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = BASEMenuUIMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			OpenBASEInventoryProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			ExitMenuUIProcedure.execute(entity);
		}
		if (buttonID == 2) {

			SetBASENameProcedure.execute(world, x, y, z, entity, guistate);
		}
		if (buttonID == 3) {

			InputCapsBASEUIProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		FalloutWastelandsMod.addNetworkMessage(BASEMenuUIButtonMessage.class, BASEMenuUIButtonMessage::buffer, BASEMenuUIButtonMessage::new, BASEMenuUIButtonMessage::handler);
	}
}
