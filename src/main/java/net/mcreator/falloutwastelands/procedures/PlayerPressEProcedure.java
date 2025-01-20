package net.mcreator.falloutwastelands.procedures;

import net.minecraft.world.entity.Entity;

public class PlayerPressEProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("inventoryOpen") == false) {
			entity.getPersistentData().putBoolean("inventoryOpen", true);
		} else {
			entity.getPersistentData().putBoolean("inventoryOpen", false);
		}
	}
}
