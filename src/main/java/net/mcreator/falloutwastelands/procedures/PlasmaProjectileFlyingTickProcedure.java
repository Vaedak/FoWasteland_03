package net.mcreator.falloutwastelands.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.falloutwastelands.init.FalloutWastelandsModParticleTypes;

public class PlasmaProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		world.addParticle((SimpleParticleType) (FalloutWastelandsModParticleTypes.PLASMA_PARTICLE.get()), x, y, z, 0, 0, 0);
		BulletFallClockProcedure.execute(immediatesourceentity);
	}
}
