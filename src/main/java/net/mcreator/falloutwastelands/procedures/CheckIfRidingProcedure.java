package net.mcreator.falloutwastelands.procedures;

import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.entity.Entity;

public class CheckIfRidingProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof ArmorStand) {
			if (!entity.isPassenger()) {
				if (!entity.level().isClientSide())
					entity.discard();
			}
		}
	}
}
