
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.falloutwastelands.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.falloutwastelands.fluid.types.FEVgooFluidType;
import net.mcreator.falloutwastelands.FalloutWastelandsMod;

public class FalloutWastelandsModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, FalloutWastelandsMod.MODID);
	public static final RegistryObject<FluidType> FE_VGOO_TYPE = REGISTRY.register("fe_vgoo", () -> new FEVgooFluidType());
}
