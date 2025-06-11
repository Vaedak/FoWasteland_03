package net.mcreator.falloutwastelands.procedures;

import net.minecraftforge.eventbus.api.Event;

public class BrahminOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double distance = 0;
		if ((entity instanceof BrahminEntity _datEntL0 && _datEntL0.getEntityData().get(BrahminEntity.DATA_breedingActive)) == true) {
			if (entity.getPersistentData().getDouble("particleCounter") > 0) {
				entity.getPersistentData().putDouble("particleCounter", (entity.getPersistentData().getDouble("particleCounter") - 1));
			} else {
				entity.getPersistentData().putDouble("particleCounter", 15);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.HEART, x, y, z, 5, 0.05, 0.5, 0.05, 0.01);
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(7 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					distance = Math.sqrt(Math.pow(entity.getX() - entityiterator.getX(), 2) + Math.pow(entity.getY() - entityiterator.getY(), 2) + Math.pow(entity.getZ() - entityiterator.getZ(), 2));
					if (!(entityiterator == entity)) {
						if (entityiterator instanceof BrahminEntity) {
							if ((entityiterator instanceof BrahminEntity _datEntL14 && _datEntL14.getEntityData().get(BrahminEntity.DATA_breedingActive)) == true) {
								entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ())));
								entity.push(((entity.getDeltaMovement().x() + entity.getLookAngle().x) * 0.01), ((entity.getDeltaMovement().y() + entity.getLookAngle().y) * 0.01), ((entity.getDeltaMovement().z() + entity.getLookAngle().z) * 0.01));
								if (distance <= 1.5) {
									if (world instanceof ServerLevel _level) {
										Entity entityToSpawn = FalloutWastelandsModEntities.BABY_BRAHMIN.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
										if (entityToSpawn != null) {
											entityToSpawn.setDeltaMovement(0, 0, 0);
										}
									}
									if (entityiterator instanceof BrahminEntity _datEntSetL)
										_datEntSetL.getEntityData().set(BrahminEntity.DATA_breedingActive, false);
									if (entity instanceof BrahminEntity _datEntSetL)
										_datEntSetL.getEntityData().set(BrahminEntity.DATA_breedingActive, false);
									if (entityiterator instanceof BrahminEntity _datEntSetI)
										_datEntSetI.getEntityData().set(BrahminEntity.DATA_breedCooldown, 500);
									if (entity instanceof BrahminEntity _datEntSetI)
										_datEntSetI.getEntityData().set(BrahminEntity.DATA_breedCooldown, 500);
								}
							}
						}
					}
				}
			}
		} else {
			if ((entity instanceof BrahminEntity _datEntI ? _datEntI.getEntityData().get(BrahminEntity.DATA_breedCooldown) : 0) > 0) {
				if (entity instanceof BrahminEntity _datEntSetI)
					_datEntSetI.getEntityData().set(BrahminEntity.DATA_breedCooldown, (int) ((entity instanceof BrahminEntity _datEntI ? _datEntI.getEntityData().get(BrahminEntity.DATA_breedCooldown) : 0) - 1));
			}
		}
	}
}
