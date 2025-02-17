
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.falloutwastelands.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.falloutwastelands.client.gui.PowerArmorFrameGUIScreen;
import net.mcreator.falloutwastelands.client.gui.MedicalboxGUIScreen;
import net.mcreator.falloutwastelands.client.gui.LockerStorageScreen;
import net.mcreator.falloutwastelands.client.gui.BoxScreen;
import net.mcreator.falloutwastelands.client.gui.BASEMenuUIScreen;
import net.mcreator.falloutwastelands.client.gui.BASEInventoryScreen;
import net.mcreator.falloutwastelands.client.gui.AmmoBoxGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class FalloutWastelandsModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(FalloutWastelandsModMenus.LOCKER_STORAGE.get(), LockerStorageScreen::new);
			MenuScreens.register(FalloutWastelandsModMenus.BASE_MENU_UI.get(), BASEMenuUIScreen::new);
			MenuScreens.register(FalloutWastelandsModMenus.BASE_INVENTORY.get(), BASEInventoryScreen::new);
			MenuScreens.register(FalloutWastelandsModMenus.POWER_ARMOR_FRAME_GUI.get(), PowerArmorFrameGUIScreen::new);
			MenuScreens.register(FalloutWastelandsModMenus.BOX.get(), BoxScreen::new);
			MenuScreens.register(FalloutWastelandsModMenus.AMMO_BOX_GUI.get(), AmmoBoxGUIScreen::new);
			MenuScreens.register(FalloutWastelandsModMenus.MEDICALBOX_GUI.get(), MedicalboxGUIScreen::new);
		});
	}
}
