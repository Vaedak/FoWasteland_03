package net.mcreator.falloutwastelands.procedures;

import net.minecraft.world.entity.Entity;

public class RipperStopSawingProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putBoolean("RipperSaw", false);
	}
}
