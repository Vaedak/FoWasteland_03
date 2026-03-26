package net.mcreator.falloutwastelands.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;

import net.mcreator.falloutwastelands.init.FalloutWastelandsModEntities;
import net.mcreator.falloutwastelands.entity.FriendlyMK1TurretEntity;

public class DisplayMK1TurretProcedure {
	public static Entity execute(LevelAccessor world) {
		return world instanceof Level _level ? new FriendlyMK1TurretEntity(FalloutWastelandsModEntities.FRIENDLY_MK_1_TURRET.get(), _level) : null;
	}
}
