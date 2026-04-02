
package net.mcreator.falloutwastelands.entity;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class VertibirdEntityProjectile extends AbstractArrow implements ItemSupplier {

	public VertibirdEntityProjectile(PlayMessages.SpawnEntity packet, Level world) {
		super(FalloutWastelandsModEntities.VERTIBIRD_PROJECTILE.get(), world);
	}

	public VertibirdEntityProjectile(EntityType<? extends VertibirdEntityProjectile> type, Level world) {
		super(type, world);
	}

	public VertibirdEntityProjectile(EntityType<? extends VertibirdEntityProjectile> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public VertibirdEntityProjectile(EntityType<? extends VertibirdEntityProjectile> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void doPostHurtEffects(LivingEntity livingEntity) {
		super.doPostHurtEffects(livingEntity);
		livingEntity.setArrowCount(livingEntity.getArrowCount() - 1);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(Blocks.AIR);
	}

	@Override
	protected ItemStack getPickupItem() {
		return new ItemStack(Blocks.AIR);
	}
}
