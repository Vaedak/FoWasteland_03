package net.mcreator.falloutwastelands.procedures;

import net.minecraft.world.entity.Entity;

public class RipperStartSawingProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double speed = 0;
		entity.getPersistentData().putBoolean("RipperSaw", true);
	}
}
