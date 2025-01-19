package net.mcreator.falloutwastelands.procedures;

import net.minecraft.world.entity.Entity;

public class StopReloadOnKeyPressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putBoolean("ReloadGun", false);
		entity.getPersistentData().putDouble("timer", 0);
	}
}
