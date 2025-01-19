
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.falloutwastelands.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.falloutwastelands.FalloutWastelandsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FalloutWastelandsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FalloutWastelandsMod.MODID);
	public static final RegistryObject<CreativeModeTab> WASTELANDBLOCKSTAB = REGISTRY.register("wastelandblockstab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.fallout_wastelands_.wastelandblockstab")).icon(() -> new ItemStack(FalloutWastelandsModBlocks.WASTELAND_STONE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(FalloutWastelandsModBlocks.WASTELAND_DIRT.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELAND_STONE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELANDGRASSBLOCK.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.CRACKED_WASTELAND_CONCRETE_WALL.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.MOLDER_WOOD_BUTTON.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELAND_CONCRETE_STAIRS.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.MOLDER_WOOD_PRESSURE_PLATE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELAND_ROOTY_DIRT.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.MOLDER_WOOD_LOG.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.CRACKED_WASTELAND_CONCRETE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.MOLDER_WOOD_DOOR.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.THE_GLOW_DIRT.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.MOLDER_WOOD_TRAPDOOR.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.SLAB_WASTELAND_COBBLESTONE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELAND_COBBLESTONE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.STAIR_WASTELAND_COBBLESTONE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELAND_CONCRETE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.MOLDER_WOOD_STAIRS.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.CRACKED_WASTELAND_CONCRETE_STAIRS.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.MOLDER_WOOD_PLANKS.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELAND_BRICK.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.MOLDER_WOOD_FENCE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELAND_CONCRETE_WALL.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.MOLDER_WOOD_WOOD.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.CRACKED_WASTELAND_CONCRETE_SLABS.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.MOLDER_WOOD_SLAB.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WALL_WASTELAND_COBBLESTONE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.MOLDER_WOOD_FENCE_GATE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELAND_CONCRETE_SLAB.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELANDGRASSBUSH.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELANDBURNTGRASS.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELANDSHORTBURNTGRASS.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELAND_BRICK_STAIRS.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELAND_BRICKSLAB.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELANDPEBBLE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELANDGRAVEL.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELANDCOALORE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELANDCOPPERORE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELAND_GOLDORE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELANDIRONORE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELANDDIAMONDORE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELANDEMERALDORE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELANDLAPISORE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELANDREDSTONEORE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELAND_BROKEN_GLASS.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.LANDMINE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELAND_BRICK_WALL.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.LOCKER.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WORN_METAL.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.HANGARDOOR.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELAND_CRACKED_BRICK.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WIREFENCE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.STRIPPEDMOLDERWOODLOG.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELANDBRICKS.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.SUBWAYBRICKS.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.DOUBLE_SCAFFOLD_BLOCK.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.CAGE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.SCAFFOLDING_WALKWAYS_BLOCK.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.STEEL_POLE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.ROOF_METAL.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.BARRICADEPLANKS.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.REINFORCED_PLANKS.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.SHEETMETALBLOCK.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.RUSTY_SHEETMETALBLOCK.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.BARRICADESHEETMETALBLOCK.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.BURNISHED_GLASS.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.BLASTED_GLASS.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.BLASTED_GLASS_PANE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.BURNISHED_GLASS_PANE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELANDTILES.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.BAS_ECORE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.MILITARY_METAL_PLATE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.MILITARY_METAL_DOOR.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.MILITARY_METALWINDOW.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.CENTRALUNIT.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELANDVENTCONCRETE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.LINEDCONCRETE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WOODEDCONCRETE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.HORIZONTALLINEDCONCRETE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.GREY_TILES.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.BLACK_TILES.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.CONCRETE_TILE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.HARDCONCRETE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.HARDCONCRETESTAIRS.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.RUSTYSHEETMETALSTAIRS.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.SHEETMETALSTAIRS.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELANDTILESSTAIRS.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELANDTILESSLAB.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELANDHARDSTONE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.RUST_BLOCK.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELAND_ROAD_BLOCK.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELAND_ROAD_SLAB.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WORN_METAL_STAIRS.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WORN_METAL_SLAB.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.SCAFFOLDING_WALKWAYSLAB.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.SCAFFOLDING_WALKWAY_STAIRS.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.GORE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.SUPERMUTANTGORE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.DOUBLE_SCAFFOLD_WALL.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.EXPOSED_RUST_BLOCK.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.MELTED_STEEL_BLOCK.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.MELTED_IRON_BLOCK.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.URANIUM_BLOCK.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.BARBED_WIRES.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELAND_ALUMINUM_ORE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.ALUMINUM_BLOCK.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.BOS_DOOR.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.BOS_METAL_PLATING.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.BOS_METAL_PLATING_LIGHTED.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.BOS_STEEL_BLOCK.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.STEEL_BLOCK.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.ENCLAVE_DOOR.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.ENCLAVE_BUNKER_BLOCK.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.ENCLAVE_BUNKER_BLOCK_LOGO.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.ENCLAVE_BUNKER_FLOOR.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.BUNKER_BLOCK_LIGHT.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.INDUSTRIAL_ALLOY.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.INDUSTRIAL_ALLOY_PLAIN.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.INDUSTRIAL_ALLOY_SLAB.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.INDUSTRIAL_ALLOY_STAIR.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.INDUSTRIAL_ALLOY_WARNING.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.INDUSTRIAL_DOOR.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.INDUSTRIAL_ALLOW_MID_RIVET.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.INDUSTRIAL_ALLOY_BOTTOM_RIVET.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.INDUSTRIAL_WALKWAY.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.LEAD_BLOCK.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.LEAD_ORE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.MOLTEN_BOXITE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.MOLTEN_COPPER.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.MOLTEN_STEEL.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.MOLTEN_TIN.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.TIN_BLOCK.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.URANIUM_ORE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTE_SAND.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.TIN_ORE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.JIGSAW_BLOCK.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.BOS_STEEL_STAIR.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.STEEL_BARS.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.PLASTER.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.OXIDIZED_METAL.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.OXIDIZED_METAL_STAIR.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.OXIDIZED_METAL_WALL.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.RUINS_BASE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.RUINS.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.RUINS_GROUND.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.INDUSTRIAL_PLATING.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.INDUSTRIAL_SUPPORT.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.SINGLE_SCAFFOLD_BLOCK.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.VAULT_WALL.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.VAULT_REINFORCED_PILLAR.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.VAULT_WALL_CURVED.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.VAULT_WALL_EXPOSED.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.VAULT_FLOOR.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.VAULT_PILLAR.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.VAULT_VENT.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.OXIDIZED_METAL_SLAB.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.RUSTED_SHEET_METAL_WALL.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.MILITARY_METAL_PLATE_WALL.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.CHARRED_MOLDER_WOOD_PLANK.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.CHARRED_MOLDER_STAIRS.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.BOS_STEEL_SLABS.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.MILITARY_PLATING_SLAB.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.MILITARY_METAL_STAIR.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.MILITARY_METAL_HAZARD.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.MILITARY_PLATING_WALKWAY.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.MILITARY_METAL_RADIATION.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.CHARRED_MOLDER_SLAB.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.CHARRED_MOLDER_FENCE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.METAL_BARREL.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.RADIATION_BARREL.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.CEILING_LIGHT.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.FILING_CABINET.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.FLOOR_PAPERS.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.FRIDGE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.MEDICAL_BOX.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.METAL_CHAIR.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.MIXER.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.PIPE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.TELEVISION.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.TERMINAL.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.TIRE_STACK.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.TRASH_BIN.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.AMMO_BOX.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.LIGHT_TUBE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.ENCLAVE_BUNKER_STAIRS.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.METAL_SHELF.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.BOS_METAL_STAIRS.get().asItem());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> WASTELANDCOMBAT = REGISTRY.register("wastelandcombat",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.fallout_wastelands_.wastelandcombat")).icon(() -> new ItemStack(FalloutWastelandsModItems.RAIDERBLASTMASTER_HELMET.get())).displayItems((parameters, tabData) -> {
				tabData.accept(FalloutWastelandsModItems.RAIDERDUSTER_HELMET.get());
				tabData.accept(FalloutWastelandsModItems.RAIDERDUSTER_CHESTPLATE.get());
				tabData.accept(FalloutWastelandsModItems.RAIDERDUSTER_LEGGINGS.get());
				tabData.accept(FalloutWastelandsModItems.RAIDERDUSTER_BOOTS.get());
				tabData.accept(FalloutWastelandsModItems.RAIDERBASHER_HELMET.get());
				tabData.accept(FalloutWastelandsModItems.RAIDERBASHER_CHESTPLATE.get());
				tabData.accept(FalloutWastelandsModItems.RAIDERBASHER_LEGGINGS.get());
				tabData.accept(FalloutWastelandsModItems.RAIDERBASHER_BOOTS.get());
				tabData.accept(FalloutWastelandsModItems.RAIDERBLASTMASTER_HELMET.get());
				tabData.accept(FalloutWastelandsModItems.RAIDERBLASTMASTER_CHESTPLATE.get());
				tabData.accept(FalloutWastelandsModItems.RAIDERBLASTMASTER_LEGGINGS.get());
				tabData.accept(FalloutWastelandsModItems.RAIDERBLASTMASTER_BOOTS.get());
				tabData.accept(FalloutWastelandsModItems.COMBATARMOR_HELMET.get());
				tabData.accept(FalloutWastelandsModItems.COMBATARMOR_CHESTPLATE.get());
				tabData.accept(FalloutWastelandsModItems.COMBATARMOR_LEGGINGS.get());
				tabData.accept(FalloutWastelandsModItems.COMBATARMOR_BOOTS.get());
				tabData.accept(FalloutWastelandsModItems.REVOLVER_32.get());
				tabData.accept(FalloutWastelandsModItems.TEST_WEAPON.get());
				tabData.accept(FalloutWastelandsModItems.NINEMMPISTOL.get());
				tabData.accept(FalloutWastelandsModItems.ANTIRADSUIT_HELMET.get());
				tabData.accept(FalloutWastelandsModItems.ANTIRADSUIT_CHESTPLATE.get());
				tabData.accept(FalloutWastelandsModItems.ANTIRADSUIT_LEGGINGS.get());
				tabData.accept(FalloutWastelandsModItems.ANTIRADSUIT_BOOTS.get());
				tabData.accept(FalloutWastelandsModItems.TALONCOMBATARMOR_HELMET.get());
				tabData.accept(FalloutWastelandsModItems.TALONCOMBATARMOR_CHESTPLATE.get());
				tabData.accept(FalloutWastelandsModItems.TALONCOMBATARMOR_LEGGINGS.get());
				tabData.accept(FalloutWastelandsModItems.TALONCOMBATARMOR_BOOTS.get());
				tabData.accept(FalloutWastelandsModItems.TENMMPISTOL.get());
				tabData.accept(FalloutWastelandsModItems.TENMMAMMO.get());
				tabData.accept(FalloutWastelandsModItems.NINEMMAMMO.get());
				tabData.accept(FalloutWastelandsModItems.TENMMHOMEMADEASSAULTRIFLE.get());
				tabData.accept(FalloutWastelandsModItems.FIVEMM_AMMO.get());
				tabData.accept(FalloutWastelandsModItems.WRENCH.get());
				tabData.accept(FalloutWastelandsModItems.LASERRIFLE.get());
				tabData.accept(FalloutWastelandsModItems.NAILED_WRENCH.get());
				tabData.accept(FalloutWastelandsModItems.PLASMARIFLE.get());
				tabData.accept(FalloutWastelandsModItems.NAILGUN.get());
				tabData.accept(FalloutWastelandsModItems.ROLLINGPIN.get());
				tabData.accept(FalloutWastelandsModItems.CHINESEPISTOL.get());
				tabData.accept(FalloutWastelandsModItems.THIRTYTWOAMMO.get());
				tabData.accept(FalloutWastelandsModItems.ENERGY_CELL.get());
				tabData.accept(FalloutWastelandsModItems.TIRE_IRON.get());
				tabData.accept(FalloutWastelandsModItems.FIVEMMMINIGUN.get());
				tabData.accept(FalloutWastelandsModItems.RIPPER.get());
				tabData.accept(FalloutWastelandsModItems.T_45_PA_HELMET.get());
				tabData.accept(FalloutWastelandsModItems.T_45_PA_CHESTPLATE.get());
				tabData.accept(FalloutWastelandsModItems.T_45_PA_LEGGINGS.get());
				tabData.accept(FalloutWastelandsModItems.T_45_PA_BOOTS.get());
				tabData.accept(FalloutWastelandsModItems.BASE_GUN_ITEM.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> WASTELANDITEMS = REGISTRY.register("wastelanditems",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.fallout_wastelands_.wastelanditems")).icon(() -> new ItemStack(FalloutWastelandsModItems.JERRICAN.get())).displayItems((parameters, tabData) -> {
				tabData.accept(FalloutWastelandsModItems.CLOTH.get());
				tabData.accept(FalloutWastelandsModItems.TATO.get());
				tabData.accept(FalloutWastelandsModItems.ASBESTOS.get());
				tabData.accept(FalloutWastelandsModItems.ANTIRADCLOTHING.get());
				tabData.accept(FalloutWastelandsModItems.COPPERWIRES.get());
				tabData.accept(FalloutWastelandsModItems.JERRICAN.get());
				tabData.accept(FalloutWastelandsModItems.WASTELANDBRICKITEM.get());
				tabData.accept(FalloutWastelandsModItems.TININGOT.get());
				tabData.accept(FalloutWastelandsModItems.ALUMINUM_INGOT.get());
				tabData.accept(FalloutWastelandsModItems.STEEL_INGOT.get());
				tabData.accept(FalloutWastelandsModItems.LEAD_INGOT.get());
				tabData.accept(FalloutWastelandsModItems.URANIUM_INGOT.get());
				tabData.accept(FalloutWastelandsModItems.NUKA_COLA.get());
				tabData.accept(FalloutWastelandsModItems.EMPTY_NUKA_COLA_BOTTLE.get());
				tabData.accept(FalloutWastelandsModItems.NUKA_COLA_QUANTUM.get());
				tabData.accept(FalloutWastelandsModItems.BOTTLE_CAP.get());
				tabData.accept(FalloutWastelandsModItems.NEUTRONADE.get());
				tabData.accept(FalloutWastelandsModItems.NEUTRONADE_CAP.get());
				tabData.accept(FalloutWastelandsModItems.EMPTY_NEUTRONADE_BOTTLE.get());
				tabData.accept(FalloutWastelandsModItems.SCRAPMETAL.get());
				tabData.accept(FalloutWastelandsModItems.STIMPACK.get());
				tabData.accept(FalloutWastelandsModItems.PSYCHO.get());
				tabData.accept(FalloutWastelandsModItems.PIPBOY.get());
				tabData.accept(FalloutWastelandsModItems.CORN.get());
				tabData.accept(FalloutWastelandsModItems.INDUSTRIALSHOVEL.get());
				tabData.accept(FalloutWastelandsModItems.HACHET.get());
				tabData.accept(FalloutWastelandsModItems.NAIL.get());
				tabData.accept(FalloutWastelandsModItems.INDUSTRIALHAMMER.get());
				tabData.accept(FalloutWastelandsModItems.RAW_LEAD.get());
				tabData.accept(FalloutWastelandsModItems.RAW_ALUMINUM.get());
				tabData.accept(FalloutWastelandsModItems.RAW_URANIUM.get());
				tabData.accept(FalloutWastelandsModItems.RAW_TIN.get());
				tabData.accept(FalloutWastelandsModItems.ALUMINIUMNUGGET.get());
				tabData.accept(FalloutWastelandsModItems.LEAD_NUGGET.get());
				tabData.accept(FalloutWastelandsModItems.STEELNUGGET.get());
				tabData.accept(FalloutWastelandsModItems.TINNUGGET.get());
				tabData.accept(FalloutWastelandsModItems.URANIUM_NUGGET.get());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {

			tabData.accept(FalloutWastelandsModItems.CANNIBAL_00_SPAWN_EGG.get());
			tabData.accept(FalloutWastelandsModItems.POWER_ARMOR_FRAME_SPAWN_EGG.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {

			tabData.accept(FalloutWastelandsModItems.WASTELANDS.get());

		}
	}
}
