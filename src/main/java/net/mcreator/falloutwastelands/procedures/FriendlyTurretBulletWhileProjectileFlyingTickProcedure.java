package net.mcreator.falloutwastelands.procedures;

import net.minecraft.world.entity.Entity;

public class FriendlyTurretBulletWhileProjectileFlyingTickProcedure {
	public static void execute(Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		immediatesourceentity.setNoGravity(true);
		immediatesourceentity.getPersistentData().putDouble("despawnCounter", (immediatesourceentity.getPersistentData().getDouble("despawnCounter") + 1));
		if (immediatesourceentity.getPersistentData().getDouble("despawnCounter") > 250) {
			if (!immediatesourceentity.level().isClientSide())
				immediatesourceentity.discard();
		}
	}
}
