
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.falloutwastelands.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.falloutwastelands.client.particle.ZoneParticleParticle;
import net.mcreator.falloutwastelands.client.particle.PlasmaParticleSplashParticle;
import net.mcreator.falloutwastelands.client.particle.PlasmaParticleParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class FalloutWastelandsModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(FalloutWastelandsModParticleTypes.ZONE_PARTICLE.get(), ZoneParticleParticle::provider);
		event.registerSpriteSet(FalloutWastelandsModParticleTypes.PLASMA_PARTICLE.get(), PlasmaParticleParticle::provider);
		event.registerSpriteSet(FalloutWastelandsModParticleTypes.PLASMA_PARTICLE_SPLASH.get(), PlasmaParticleSplashParticle::provider);
	}
}
