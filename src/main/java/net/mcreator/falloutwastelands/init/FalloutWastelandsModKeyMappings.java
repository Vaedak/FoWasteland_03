
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.falloutwastelands.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.falloutwastelands.network.SwitchGameModeUtilityMessage;
import net.mcreator.falloutwastelands.network.StopReloadMessage;
import net.mcreator.falloutwastelands.network.PlayerPressesESCMessage;
import net.mcreator.falloutwastelands.network.PlayerOpensInventoryMessage;
import net.mcreator.falloutwastelands.network.GunReloadKeybindMessage;
import net.mcreator.falloutwastelands.network.ExitPowerArmorMessage;
import net.mcreator.falloutwastelands.FalloutWastelandsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class FalloutWastelandsModKeyMappings {
	public static final KeyMapping SWITCH_GAME_MODE_UTILITY = new KeyMapping("key.fallout_wastelands_.switch_game_mode_utility", GLFW.GLFW_KEY_C, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				FalloutWastelandsMod.PACKET_HANDLER.sendToServer(new SwitchGameModeUtilityMessage(0, 0));
				SwitchGameModeUtilityMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping GUN_RELOAD_KEYBIND = new KeyMapping("key.fallout_wastelands_.gun_reload_keybind", GLFW.GLFW_KEY_R, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				FalloutWastelandsMod.PACKET_HANDLER.sendToServer(new GunReloadKeybindMessage(0, 0));
				GunReloadKeybindMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping STOP_RELOAD = new KeyMapping("key.fallout_wastelands_.stop_reload", GLFW.GLFW_KEY_SCROLL_LOCK, "key.categories.fallout_wastelands") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				FalloutWastelandsMod.PACKET_HANDLER.sendToServer(new StopReloadMessage(0, 0));
				StopReloadMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping EXIT_POWER_ARMOR = new KeyMapping("key.fallout_wastelands_.exit_power_armor", GLFW.GLFW_KEY_X, "key.categories.fallout_wastelands_") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				FalloutWastelandsMod.PACKET_HANDLER.sendToServer(new ExitPowerArmorMessage(0, 0));
				ExitPowerArmorMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping PLAYER_OPENS_INVENTORY = new KeyMapping("key.fallout_wastelands_.player_opens_inventory", GLFW.GLFW_KEY_E, "key.categories.fallout_wastelands") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				FalloutWastelandsMod.PACKET_HANDLER.sendToServer(new PlayerOpensInventoryMessage(0, 0));
				PlayerOpensInventoryMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping PLAYER_PRESSES_ESC = new KeyMapping("key.fallout_wastelands_.player_presses_esc", GLFW.GLFW_KEY_ESCAPE, "key.categories.fallout_wastelands") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				FalloutWastelandsMod.PACKET_HANDLER.sendToServer(new PlayerPressesESCMessage(0, 0));
				PlayerPressesESCMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(SWITCH_GAME_MODE_UTILITY);
		event.register(GUN_RELOAD_KEYBIND);
		event.register(STOP_RELOAD);
		event.register(EXIT_POWER_ARMOR);
		event.register(PLAYER_OPENS_INVENTORY);
		event.register(PLAYER_PRESSES_ESC);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				SWITCH_GAME_MODE_UTILITY.consumeClick();
				GUN_RELOAD_KEYBIND.consumeClick();
				STOP_RELOAD.consumeClick();
				EXIT_POWER_ARMOR.consumeClick();
				PLAYER_OPENS_INVENTORY.consumeClick();
				PLAYER_PRESSES_ESC.consumeClick();
			}
		}
	}
}
