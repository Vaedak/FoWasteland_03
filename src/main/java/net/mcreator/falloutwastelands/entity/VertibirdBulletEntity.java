
package net.mcreator.falloutwastelands.entity;

import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.util.RandomSource;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;

import net.mcreator.falloutwastelands.procedures.WhileProjectileFlyingTickProcedure;
import net.mcreator.falloutwastelands.procedures.GunProjectileHitsEntityProcedure;
import net.mcreator.falloutwastelands.procedures.GunProjectileHitsBlockProcedure;
import net.mcreator.falloutwastelands.init.FalloutWastelandsModEntities;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class VertibirdBulletEntity extends AbstractArrow implements ItemSupplier {
	public static final ItemStack PROJECTILE_ITEM = new ItemStack(Blocks.AIR);

	public VertibirdBulletEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(FalloutWastelandsModEntities.VERTIBIRD_BULLET.get(), world);
	}

	public VertibirdBulletEntity(EntityType<? extends VertibirdBulletEntity> type, Level world) {
		super(type, world);
	}

	public VertibirdBulletEntity(EntityType<? extends VertibirdBulletEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public VertibirdBulletEntity(EntityType<? extends VertibirdBulletEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return PROJECTILE_ITEM;
	}

	@Override
	protected ItemStack getPickupItem() {
		return PROJECTILE_ITEM;
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void onHitEntity(EntityHitResult entityHitResult) {
		super.onHitEntity(entityHitResult);
		GunProjectileHitsEntityProcedure.execute(this);
	}

	@Override
	public void onHitBlock(BlockHitResult blockHitResult) {
		super.onHitBlock(blockHitResult);
		GunProjectileHitsBlockProcedure.execute(this.level(), blockHitResult.getBlockPos().getX(), blockHitResult.getBlockPos().getY(), blockHitResult.getBlockPos().getZ(), this);
	}

	@Override
	public void tick() {
		super.tick();
		WhileProjectileFlyingTickProcedure.execute(this.level(), this);
		if (this.inGround)
			this.discard();
	}

	public static VertibirdBulletEntity shoot(Level world, LivingEntity entity, RandomSource source) {
		return shoot(world, entity, source, 1.7f, 2, 0);
	}

	public static VertibirdBulletEntity shoot(Level world, LivingEntity entity, RandomSource source, float pullingPower) {
		return shoot(world, entity, source, pullingPower * 1.7f, 2, 0);
	}

	public static VertibirdBulletEntity shoot(Level world, LivingEntity entity, RandomSource random, float power, double damage, int knockback) {
		VertibirdBulletEntity entityarrow = new VertibirdBulletEntity(FalloutWastelandsModEntities.VERTIBIRD_BULLET.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(true);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);
		return entityarrow;
	}

	public static VertibirdBulletEntity shoot(LivingEntity entity, LivingEntity target) {
		VertibirdBulletEntity entityarrow = new VertibirdBulletEntity(FalloutWastelandsModEntities.VERTIBIRD_BULLET.get(), entity, entity.level());
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 1.7f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(2);
		entityarrow.setKnockback(0);
		entityarrow.setCritArrow(true);
		entity.level().addFreshEntity(entityarrow);
		return entityarrow;
	}
}
