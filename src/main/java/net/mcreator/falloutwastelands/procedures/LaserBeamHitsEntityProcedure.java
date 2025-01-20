package net.mcreator.falloutwastelands.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

public class LaserBeamHitsEntityProcedure {
	public static void execute(LevelAccessor world, Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		entity.setSecondsOnFire(5);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.WHITE_ASH, (immediatesourceentity.getX()), (immediatesourceentity.getY()), (immediatesourceentity.getZ()), 10, 0.01, 0.01, 0.01, (-0.05));
	}
}
