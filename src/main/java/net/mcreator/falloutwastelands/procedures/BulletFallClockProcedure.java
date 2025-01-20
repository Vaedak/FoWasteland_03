package net.mcreator.falloutwastelands.procedures;

import net.minecraft.world.entity.Entity;

public class BulletFallClockProcedure {
	public static void execute(Entity immediatesourceentity) {
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
	}
}
