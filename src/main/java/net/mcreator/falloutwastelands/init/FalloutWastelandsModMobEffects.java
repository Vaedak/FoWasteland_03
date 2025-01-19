
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.falloutwastelands.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.falloutwastelands.potion.DeleteArmorStandIfNotRidingMobEffect;
import net.mcreator.falloutwastelands.FalloutWastelandsMod;

public class FalloutWastelandsModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, FalloutWastelandsMod.MODID);
	public static final RegistryObject<MobEffect> DELETE_ARMOR_STAND_IF_NOT_RIDING = REGISTRY.register("delete_armor_stand_if_not_riding", () -> new DeleteArmorStandIfNotRidingMobEffect());
}
