
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.falloutwastelands.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.falloutwastelands.FalloutWastelandsMod;

public class FalloutWastelandsModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, FalloutWastelandsMod.MODID);
	public static final RegistryObject<SimpleParticleType> ZONE_PARTICLE = REGISTRY.register("zone_particle", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> PLASMA_PARTICLE = REGISTRY.register("plasma_particle", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> PLASMA_PARTICLE_SPLASH = REGISTRY.register("plasma_particle_splash", () -> new SimpleParticleType(true));
}
