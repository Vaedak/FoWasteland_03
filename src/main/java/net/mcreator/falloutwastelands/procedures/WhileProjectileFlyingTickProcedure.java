package net.mcreator.falloutwastelands.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.falloutwastelands.FalloutWastelandsMod;

public class WhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		if (immediatesourceentity.getPersistentData().getBoolean("enableGravity") == false) {
			immediatesourceentity.setNoGravity(true);
		} else {
			immediatesourceentity.setNoGravity(false);
		}
		FalloutWastelandsMod.queueServerWork(80, () -> {
			immediatesourceentity.getPersistentData().putBoolean("enableGravity", true);
		});
	}
}
