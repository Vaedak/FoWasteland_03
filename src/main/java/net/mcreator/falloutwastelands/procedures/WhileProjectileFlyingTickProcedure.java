package net.mcreator.falloutwastelands.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.particles.ParticleTypes;

public class WhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		if (immediatesourceentity.getPersistentData().getBoolean("enableGravity") == false) {
			immediatesourceentity.setNoGravity(true);
		} else {
			immediatesourceentity.setNoGravity(false);
		}
		if (200 > immediatesourceentity.getPersistentData().getDouble("enableGravityCounter")) {
			immediatesourceentity.getPersistentData().putDouble("enableGravityCounter", (immediatesourceentity.getPersistentData().getDouble("enableGravityCounter") + 1));
		} else {
			immediatesourceentity.getPersistentData().putBoolean("enableGravity", true);
		}
		if (immediatesourceentity.getPersistentData().getDouble("enableGravityCounter") <= 1) {
			world.addParticle(ParticleTypes.CAMPFIRE_COSY_SMOKE, x, y, z, 0, 0.07, 0);
		}
	}
}
