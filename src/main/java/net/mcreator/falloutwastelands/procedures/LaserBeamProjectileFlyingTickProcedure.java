package net.mcreator.falloutwastelands.procedures;

import net.minecraft.world.entity.Entity;

public class LaserBeamProjectileFlyingTickProcedure {
	public static void execute(Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		BulletFallClockProcedure.execute(immediatesourceentity);
	}
}
