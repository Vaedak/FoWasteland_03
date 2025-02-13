package net.mcreator.falloutwastelands.procedures;

import net.minecraft.world.entity.Entity;

public class DespawnNothingBulletProcedure {
	public static void execute(Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		if (!immediatesourceentity.level().isClientSide())
			immediatesourceentity.discard();
	}
}
