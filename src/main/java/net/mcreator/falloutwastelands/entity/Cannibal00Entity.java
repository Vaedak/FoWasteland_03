
package net.mcreator.falloutwastelands.entity;

import net.minecraft.nbt.Tag;
import net.minecraft.network.syncher.EntityDataAccessor;

public class Cannibal00Entity extends Monster {

	public Cannibal00Entity(PlayMessages.SpawnEntity packet, Level world) {
		this(FalloutWastelandsModEntities.CANNIBAL_00.get(), world);
	}

	public Cannibal00Entity(EntityType<Cannibal00Entity> type, Level world) {
		super(type, world);
		setMaxUpStep(0.6f);
		xpReward = 1;
		setNoAi(false);

		this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(FalloutWastelandsModItems.MACHETE.get()));

	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();

		this.targetSelector.addGoal(1, new NearestAttackableTargetGoal(this, BlastmasterRaiderEntity.class, false, false));
		this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, RaiderDustwalkerEntity.class, false, false));
		this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, RaiderscavangerEntity.class, false, false));
		this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, Player.class, false, false));
		this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, LobotomiteWalkerEntity.class, false, false));
		this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, GeckoEntity.class, false, false));
		this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, BlastmasterRaiderEntity.class, false, false));
		this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, LobotomiteWalkerEntity.class, false, false));
		this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, RadroachEntity.class, false, false));
		this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, RadscorpionEntity.class, false, false));
		this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, SpiderfloaterEntity.class, false, false));
		this.targetSelector.addGoal(12, new NearestAttackableTargetGoal(this, FloaterEntity.class, false, false));
		this.goalSelector.addGoal(13, new MeleeAttackGoal(this, 1.2, false) {

			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth();
			}

		});
		this.goalSelector.addGoal(14, new RandomStrollGoal(this, 1));
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

	protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
		super.dropCustomDeathLoot(source, looting, recentlyHitIn);
		this.spawnAtLocation(new ItemStack(FalloutWastelandsModItems.STRANGE_MEAT_PATTY.get()));
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
		builder = builder.add(Attributes.MAX_HEALTH, 24);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 0);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);

		return builder;
	}

}
