package net.mcreator.falloutwastelands.procedures;

import net.minecraftforge.eventbus.api.Event;

public class VertibirdEntityDiesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, y, z, 4, Level.ExplosionInteraction.NONE);
		for (int index0 = 0; index0 < 38; index0++) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (x + Math.random() * 3), y, (z + Math.random() * 3), new ItemStack(FalloutWastelandsModItems.STEEL_INGOT.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		}
		for (int index1 = 0; index1 < 30; index1++) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (x + Math.random() * 3), y, (z + Math.random() * 3), new ItemStack(FalloutWastelandsModItems.SCRAPMETAL.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		}
	}
}
