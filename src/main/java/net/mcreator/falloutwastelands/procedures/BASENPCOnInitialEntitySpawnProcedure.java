package net.mcreator.falloutwastelands.procedures;

import net.minecraft.world.entity.Entity;

public class BASENPCOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		AssignRandomNameProcedure.execute(entity);
	}
}
