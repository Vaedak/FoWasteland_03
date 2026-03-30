package net.mcreator.falloutwastelands.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.commands.arguments.EntityAnchorArgument;

import net.mcreator.falloutwastelands.init.FalloutWastelandsModEntities;
import net.mcreator.falloutwastelands.entity.FriendlyTurretBulletEntity;

public class FriendlyMK1TurretOnEntityTickUpdateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double delayTicks = 0;
		delayTicks = 5;
		if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null)) {
			entity.lookAt(EntityAnchorArgument.Anchor.EYES,
					new Vec3(((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX()),
							((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY() + (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getBbHeight() / 2),
							((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ())));
			if (entity.getPersistentData().getDouble("fireCounter") < delayTicks) {
				entity.getPersistentData().putDouble("fireCounter", (entity.getPersistentData().getDouble("fireCounter") + 1));
			} else {
				entity.getPersistentData().putDouble("fireCounter", 0);
				{
					Entity _shootFrom = entity;
					Level projectileLevel = _shootFrom.level();
					if (!projectileLevel.isClientSide()) {
						Projectile _entityToSpawn = new Object() {
							public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
								AbstractArrow entityToSpawn = new FriendlyTurretBulletEntity(FalloutWastelandsModEntities.FRIENDLY_TURRET_BULLET.get(), level);
								entityToSpawn.setBaseDamage(damage);
								entityToSpawn.setKnockback(knockback);
								entityToSpawn.setSilent(true);
								entityToSpawn.setPierceLevel(piercing);
								return entityToSpawn;
							}
						}.getArrow(projectileLevel, 3, 0, (byte) 5);
						_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
						_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 2, 4);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
				}
			}
		}
	}
}
