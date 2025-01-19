
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.falloutwastelands.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.falloutwastelands.world.inventory.PowerArmorFrameGUIMenu;
import net.mcreator.falloutwastelands.world.inventory.LockerStorageMenu;
import net.mcreator.falloutwastelands.world.inventory.BASEMenuUIMenu;
import net.mcreator.falloutwastelands.world.inventory.BASEInventoryMenu;
import net.mcreator.falloutwastelands.FalloutWastelandsMod;

public class FalloutWastelandsModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, FalloutWastelandsMod.MODID);
	public static final RegistryObject<MenuType<LockerStorageMenu>> LOCKER_STORAGE = REGISTRY.register("locker_storage", () -> IForgeMenuType.create(LockerStorageMenu::new));
	public static final RegistryObject<MenuType<BASEMenuUIMenu>> BASE_MENU_UI = REGISTRY.register("base_menu_ui", () -> IForgeMenuType.create(BASEMenuUIMenu::new));
	public static final RegistryObject<MenuType<BASEInventoryMenu>> BASE_INVENTORY = REGISTRY.register("base_inventory", () -> IForgeMenuType.create(BASEInventoryMenu::new));
	public static final RegistryObject<MenuType<PowerArmorFrameGUIMenu>> POWER_ARMOR_FRAME_GUI = REGISTRY.register("power_armor_frame_gui", () -> IForgeMenuType.create(PowerArmorFrameGUIMenu::new));
}
