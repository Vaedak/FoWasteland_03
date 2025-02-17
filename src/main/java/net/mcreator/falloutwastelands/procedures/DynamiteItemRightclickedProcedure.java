package net.mcreator.falloutwastelands.procedures;

import net.minecraftforge.eventbus.api.Event;

public class DynamiteItemRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = FalloutWastelandsModEntities.DYNAMITE_ENTITY.get().spawn(_level, BlockPos.containing(x, y + 2, z), MobSpawnType.MOB_SUMMONED);
			if (entityToSpawn != null) {
				entityToSpawn.setDeltaMovement(((entity.getDeltaMovement().x() + entity.getLookAngle().x) * 2), ((entity.getDeltaMovement().y() + entity.getLookAngle().y) * 2), ((entity.getDeltaMovement().z() + entity.getLookAngle().z) * 2));
			}
		}
	}
}
