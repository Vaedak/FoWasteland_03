
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.falloutwastelands.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.falloutwastelands.FalloutWastelandsMod;

public class FalloutWastelandsModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, FalloutWastelandsMod.MODID);
	public static final RegistryObject<SoundEvent> PISTOL32FIRING = REGISTRY.register("pistol32firing", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("fallout_wastelands_", "pistol32firing")));
	public static final RegistryObject<SoundEvent> RIPPER = REGISTRY.register("ripper", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("fallout_wastelands_", "ripper")));
	public static final RegistryObject<SoundEvent> NINEMMSHOT = REGISTRY.register("ninemmshot", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("fallout_wastelands_", "ninemmshot")));
	public static final RegistryObject<SoundEvent> REVOLVERRELOADING = REGISTRY.register("revolverreloading", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("fallout_wastelands_", "revolverreloading")));
	public static final RegistryObject<SoundEvent> LASERRIFLESHOT = REGISTRY.register("laserrifleshot", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("fallout_wastelands_", "laserrifleshot")));
	public static final RegistryObject<SoundEvent> PISTOLRELOADING = REGISTRY.register("pistolreloading", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("fallout_wastelands_", "pistolreloading")));
	public static final RegistryObject<SoundEvent> MINIGUNFIRE = REGISTRY.register("minigunfire", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("fallout_wastelands_", "minigunfire")));
	public static final RegistryObject<SoundEvent> TENMMSHOT = REGISTRY.register("tenmmshot", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("fallout_wastelands_", "tenmmshot")));
	public static final RegistryObject<SoundEvent> LMGRELOADING = REGISTRY.register("lmgreloading", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("fallout_wastelands_", "lmgreloading")));
	public static final RegistryObject<SoundEvent> NAILPISTOLSHOT = REGISTRY.register("nailpistolshot", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("fallout_wastelands_", "nailpistolshot")));
	public static final RegistryObject<SoundEvent> WASTELAND_WIND = REGISTRY.register("wasteland_wind", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("fallout_wastelands_", "wasteland_wind")));
	public static final RegistryObject<SoundEvent> THE_GLOW = REGISTRY.register("the_glow", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("fallout_wastelands_", "the_glow")));
}
