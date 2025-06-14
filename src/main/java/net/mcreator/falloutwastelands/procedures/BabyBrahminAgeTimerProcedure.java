package net.mcreator.falloutwastelands.procedures;

import net.minecraftforge.eventbus.api.Event;

public class BabyBrahminAgeTimerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		FalloutWastelandsMod.queueServerWork(5000, () -> {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = FalloutWastelandsModEntities.BRAHMIN.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 7, 1, 1, 1, 0.01);
			if (!entity.level().isClientSide())
				entity.discard();
		});
	}
}
