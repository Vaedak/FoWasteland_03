
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.falloutwastelands.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.falloutwastelands.block.entity.TrashBinBlockEntity;
import net.mcreator.falloutwastelands.block.entity.LockerBlockEntity;
import net.mcreator.falloutwastelands.block.entity.FilingCabinetBlockEntity;
import net.mcreator.falloutwastelands.block.entity.BASEcoreTileEntity;
import net.mcreator.falloutwastelands.FalloutWastelandsMod;

public class FalloutWastelandsModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, FalloutWastelandsMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> LOCKER = register("locker", FalloutWastelandsModBlocks.LOCKER, LockerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<BASEcoreTileEntity>> BAS_ECORE = REGISTRY.register("bas_ecore", () -> BlockEntityType.Builder.of(BASEcoreTileEntity::new, FalloutWastelandsModBlocks.BAS_ECORE.get()).build(null));
	public static final RegistryObject<BlockEntityType<?>> FILING_CABINET = register("filing_cabinet", FalloutWastelandsModBlocks.FILING_CABINET, FilingCabinetBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TRASH_BIN = register("trash_bin", FalloutWastelandsModBlocks.TRASH_BIN, TrashBinBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
