
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
import net.mcreator.falloutwastelands.world.inventory.MedicalboxGUIMenu;
import net.mcreator.falloutwastelands.world.inventory.LockerStorageMenu;
import net.mcreator.falloutwastelands.world.inventory.FridgeGUIMenu;
import net.mcreator.falloutwastelands.world.inventory.BoxMenu;
import net.mcreator.falloutwastelands.world.inventory.BASEMenuUIMenu;
import net.mcreator.falloutwastelands.world.inventory.BASEInventoryMenu;
import net.mcreator.falloutwastelands.world.inventory.AmmoBoxGUIMenu;
import net.mcreator.falloutwastelands.FalloutWastelandsMod;

public class FalloutWastelandsModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, FalloutWastelandsMod.MODID);
	public static final RegistryObject<MenuType<LockerStorageMenu>> LOCKER_STORAGE = REGISTRY.register("locker_storage", () -> IForgeMenuType.create(LockerStorageMenu::new));
	public static final RegistryObject<MenuType<BASEMenuUIMenu>> BASE_MENU_UI = REGISTRY.register("base_menu_ui", () -> IForgeMenuType.create(BASEMenuUIMenu::new));
	public static final RegistryObject<MenuType<BASEInventoryMenu>> BASE_INVENTORY = REGISTRY.register("base_inventory", () -> IForgeMenuType.create(BASEInventoryMenu::new));
	public static final RegistryObject<MenuType<PowerArmorFrameGUIMenu>> POWER_ARMOR_FRAME_GUI = REGISTRY.register("power_armor_frame_gui", () -> IForgeMenuType.create(PowerArmorFrameGUIMenu::new));
	public static final RegistryObject<MenuType<BoxMenu>> BOX = REGISTRY.register("box", () -> IForgeMenuType.create(BoxMenu::new));
	public static final RegistryObject<MenuType<AmmoBoxGUIMenu>> AMMO_BOX_GUI = REGISTRY.register("ammo_box_gui", () -> IForgeMenuType.create(AmmoBoxGUIMenu::new));
	public static final RegistryObject<MenuType<MedicalboxGUIMenu>> MEDICALBOX_GUI = REGISTRY.register("medicalbox_gui", () -> IForgeMenuType.create(MedicalboxGUIMenu::new));
	public static final RegistryObject<MenuType<FridgeGUIMenu>> FRIDGE_GUI = REGISTRY.register("fridge_gui", () -> IForgeMenuType.create(FridgeGUIMenu::new));
}
