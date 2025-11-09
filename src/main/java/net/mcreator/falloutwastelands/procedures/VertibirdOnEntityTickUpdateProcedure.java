package net.mcreator.falloutwastelands.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.arguments.EntityAnchorArgument;

import net.mcreator.falloutwastelands.init.FalloutWastelandsModEntities;
import net.mcreator.falloutwastelands.entity.VertibirdEntity;
import net.mcreator.falloutwastelands.entity.VertibirdBulletEntity;

import java.util.List;
import java.util.Comparator;

public class VertibirdOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double targetDistance = 0;
		double distance = 0;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) < 10) {
			entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(x, y, z));
			entity.push(0, (-0.05), 0);
			if (Math.random() < 0.5) {
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, (x + 5 * Math.random()), (y + 5 * Math.random()), (z + 5 * Math.random()), 1, Level.ExplosionInteraction.MOB);
				entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)), 3);
			}
		} else {
			if (Math.abs(Math.abs(entity.getY()) - Math.abs(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z))) < 9) {
				entity.push(0, 0.005, 0);
			} else {
				entity.push(0, (-0.004), 0);
			}
			if (!(((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) + "").equals("null"))) {
				if (entity instanceof VertibirdEntity _datEntSetL)
					_datEntSetL.getEntityData().set(VertibirdEntity.DATA_patrolling, false);
				entity.getPersistentData().putDouble("counter", 100);
			}
			if (entity.getPersistentData().getDouble("counter") > 0) {
				entity.getPersistentData().putDouble("counter", (entity.getPersistentData().getDouble("counter") - 1));
			} else {
				if (entity instanceof VertibirdEntity _datEntSetL)
					_datEntSetL.getEntityData().set(VertibirdEntity.DATA_patrolling, true);
			}
			if (entity instanceof VertibirdEntity _datEntL17 && _datEntL17.getEntityData().get(VertibirdEntity.DATA_patrolling)) {
				entity.push((entity.getLookAngle().x / 35), 0, (entity.getLookAngle().z / 35));
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(50 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == entityiterator) {
						if (entity instanceof VertibirdEntity _datEntSetL)
							_datEntSetL.getEntityData().set(VertibirdEntity.DATA_patrolling, false);
						entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ())));
						distance = Math.sqrt(Math.pow(entityiterator.getX() - entity.getX(), 2) + Math.pow(entityiterator.getY() - entity.getY(), 2) + Math.pow(entityiterator.getZ() - entity.getZ(), 2));
						if (world instanceof ServerLevel projectileLevel) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, float damage, int knockback) {
									AbstractArrow entityToSpawn = new VertibirdBulletEntity(FalloutWastelandsModEntities.VERTIBIRD_BULLET.get(), level);
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.setKnockback(knockback);
									entityToSpawn.setSilent(true);
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, 2, 1);
							_entityToSpawn.setPos((entity.getX()), (entity.getY()), (entity.getZ()));
							_entityToSpawn.shoot(((entityiterator.getX() - entity.getX()) / distance), ((entityiterator.getY() - (entity.getY() + entity.getBbHeight() / 2)) / distance), ((entityiterator.getZ() - entity.getZ()) / distance),
									(float) 2.7, 7);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fallout_wastelands_:minigunfire")), SoundSource.NEUTRAL, (float) 0.8, (float) 1.2);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fallout_wastelands_:minigunfire")), SoundSource.NEUTRAL, (float) 0.8, (float) 1.2, false);
							}
						}
						targetDistance = Math.abs((Math.abs(entityiterator.getX()) + Math.abs(entityiterator.getY()) + Math.abs(entityiterator.getZ())) - (Math.abs(entity.getX()) + Math.abs(entity.getY()) + Math.abs(entity.getZ())));
					}
					if (targetDistance < 5) {
						entity.push((entity.getLookAngle().x / 700), 0, (entity.getLookAngle().z / 700));
					} else {
						entity.push((entity.getLookAngle().x / (-700)), 0, (entity.getLookAngle().z / (-700)));
					}
				}
			}
		}
	}
}
