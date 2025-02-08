
package net.mcreator.falloutwastelands.entity;

import net.minecraft.nbt.Tag;
import net.minecraft.network.syncher.EntityDataAccessor;

public class BlastmasterRaiderEntity extends Monster implements RangedAttackMob {

	public BlastmasterRaiderEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(FalloutWastelandsModEntities.BLASTMASTER_RAIDER.get(), world);
	}

	public BlastmasterRaiderEntity(EntityType<BlastmasterRaiderEntity> type, Level world) {
		super(type, world);
		setMaxUpStep(0.6f);
		xpReward = 1;
		setNoAi(false);

		this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(FalloutWastelandsModItems.REVOLVER_32.get()));
		this.setItemSlot(EquipmentSlot.HEAD, new ItemStack(FalloutWastelandsModItems.RAIDERBLASTMASTER_HELMET.get()));
		this.setItemSlot(EquipmentSlot.CHEST, new ItemStack(FalloutWastelandsModItems.RAIDERBLASTMASTER_CHESTPLATE.get()));
		this.setItemSlot(EquipmentSlot.LEGS, new ItemStack(FalloutWastelandsModItems.RAIDERBLASTMASTER_LEGGINGS.get()));
		this.setItemSlot(EquipmentSlot.FEET, new ItemStack(FalloutWastelandsModItems.RAIDERBLASTMASTER_BOOTS.get()));

	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();

		this.targetSelector.addGoal(1, new NearestAttackableTargetGoal(this, Cannibal00Entity.class, false, false));
		this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, Player.class, false, false));
		this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, Villager.class, false, false));
		this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, IronGolem.class, false, false));
		this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, Player.class, false, false));
		this.goalSelector.addGoal(6, new MeleeAttackGoal(this, 1.2, false) {

			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth();
			}

		});
		this.goalSelector.addGoal(7, new RandomStrollGoal(this, 1));
		this.targetSelector.addGoal(8, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(9, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(10, new FloatGoal(this));

		this.goalSelector.addGoal(1, new RangedAttackGoal(this, 1.25, 35, 17f) {
			@Override
			public boolean canContinueToUse() {
				return this.canUse();
			}
		});
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override
	public double getMyRidingOffset() {
		return -0.35D;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
	}

	@Override
	public void performRangedAttack(LivingEntity target, float flval) {
		BaseGunItemProjectileEntity.shoot(this, target);
	}

	public static void init() {

	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 15);
		builder = builder.add(Attributes.ARMOR, 0.2);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		builder = builder.add(Attributes.FOLLOW_RANGE, 20);

		return builder;
	}

}
