
package net.mcreator.falloutwastelands.entity;

import net.minecraft.nbt.Tag;
import net.minecraft.network.syncher.EntityDataAccessor;

public class RaiderscavangerEntity extends Monster {

	public RaiderscavangerEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(FalloutWastelandsModEntities.RAIDERSCAVANGER.get(), world);
	}

	public RaiderscavangerEntity(EntityType<RaiderscavangerEntity> type, Level world) {
		super(type, world);
		setMaxUpStep(0.6f);
		xpReward = 1;
		setNoAi(false);

		this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(FalloutWastelandsModItems.INDUSTRIALHAMMER.get()));
		this.setItemSlot(EquipmentSlot.HEAD, new ItemStack(FalloutWastelandsModItems.RAIDERBASHER_HELMET.get()));
		this.setItemSlot(EquipmentSlot.CHEST, new ItemStack(FalloutWastelandsModItems.RAIDERBASHER_CHESTPLATE.get()));
		this.setItemSlot(EquipmentSlot.LEGS, new ItemStack(FalloutWastelandsModItems.RAIDERBASHER_LEGGINGS.get()));
		this.setItemSlot(EquipmentSlot.FEET, new ItemStack(FalloutWastelandsModItems.RAIDERBASHER_BOOTS.get()));

	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();

		this.targetSelector.addGoal(1, new NearestAttackableTargetGoal(this, Player.class, false, false));
		this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, Cannibal00Entity.class, false, false));
		this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, Villager.class, false, false));
		this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, IronGolem.class, false, false));
		this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, GeckoEntity.class, false, false));
		this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, LobotomiteWalkerEntity.class, false, false));
		this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, Cannibal01Entity.class, false, false));
		this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, Cannibal02Entity.class, false, false));
		this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, FloaterEntity.class, false, false));
		this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, RadroachEntity.class, false, false));
		this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, RadscorpionEntity.class, false, false));
		this.targetSelector.addGoal(12, new NearestAttackableTargetGoal(this, SpiderfloaterEntity.class, false, false));
		this.goalSelector.addGoal(13, new MeleeAttackGoal(this, 0.7, false) {

			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth();
			}

		});
		this.goalSelector.addGoal(14, new RandomStrollGoal(this, 0.6));
		this.targetSelector.addGoal(15, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(16, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(17, new FloatGoal(this));

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

	public static void init() {

	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 20);
		builder = builder.add(Attributes.ARMOR, 0.2);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		builder = builder.add(Attributes.FOLLOW_RANGE, 20);

		return builder;
	}

}
