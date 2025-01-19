package net.mcreator.falloutwastelands.procedures;

import net.minecraft.world.entity.Entity;

public class DeleteAtShortRangeProcedure {
	public static void execute(Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		if (immediatesourceentity.getPersistentData().getDouble("despawnCounter") < 3) {
			immediatesourceentity.getPersistentData().putDouble("despawnCounter", (immediatesourceentity.getPersistentData().getDouble("despawnCounter") + 1));
		}
		if (immediatesourceentity.getPersistentData().getDouble("despawnCounter") >= 3) {
			if (!immediatesourceentity.level().isClientSide())
				immediatesourceentity.discard();
		}
	}
}
