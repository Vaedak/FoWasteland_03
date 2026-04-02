package net.mcreator.falloutwastelands.procedures;

import net.minecraftforge.eventbus.api.Event;

public class DisplayMK1TurretProcedure {
	public static Entity execute(LevelAccessor world) {
		return world instanceof Level _level ? new FriendlyMK1TurretEntity(FalloutWastelandsModEntities.FRIENDLY_MK_1_TURRET.get(), _level) : null;
	}
}
