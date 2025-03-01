
package net.mcreator.falloutwastelands.entity;

import net.minecraft.nbt.Tag;
import net.minecraft.network.syncher.EntityDataAccessor;

public class LobotomiteWalkerEntity extends Monster {

	public LobotomiteWalkerEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(FalloutWastelandsModEntities.LOBOTOMITE_WALKER.get(), world);
	}

	public LobotomiteWalkerEntity(EntityType<LobotomiteWalkerEntity> type, Level world) {
		super(type, world);
		setMaxUpStep(0.6f);
		xpReward = 1;
		setNoAi(false);

		this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(FalloutWastelandsModItems.HACHET.get()));
		this.setItemSlot(EquipmentSlot.HEAD, new ItemStack(FalloutWastelandsModItems.LOBOTOMITE_SUIT_HELMET.get()));
		this.setItemSlot(EquipmentSlot.CHEST, new ItemStack(FalloutWastelandsModItems.LOBOTOMITE_SUIT_CHESTPLATE.get()));
		this.setItemSlot(EquipmentSlot.LEGS, new ItemStack(FalloutWastelandsModItems.LOBOTOMITE_SUIT_LEGGINGS.get()));
		this.setItemSlot(EquipmentSlot.FEET, new ItemStack(FalloutWastelandsModItems.LOBOTOMITE_SUIT_BOOTS.get()));

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
		this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, GeckoEntity.class, false, false));
		this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, Cannibal00Entity.class, false, false));
		this.goalSelector.addGoal(7, new MeleeAttackGoal(this, 1, false) {

			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth();
			}

		});
		this.goalSelector.addGoal(8, new RandomStrollGoal(this, 0.5));
		this.targetSelector.addGoal(9, new HurtByTargetGoal(this).setAlertOthers());
		this.goalSelector.addGoal(10, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(11, new FloatGoal(this));

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
		this.spawnAtLocation(new ItemStack(FalloutWastelandsModItems.NOODLES.get()));
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
	public boolean hurt(DamageSource damagesource, float amount) {
		if (damagesource.getDirectEntity() instanceof ThrownPotion || damagesource.getDirectEntity() instanceof AreaEffectCloud)
			return false;
		if (damagesource.is(DamageTypes.WITHER) || damagesource.is(DamageTypes.WITHER_SKULL))
			return false;
		return super.hurt(damagesource, amount);
	}

	public static void init() {
		SpawnPlacements.register(FalloutWastelandsModEntities.LOBOTOMITE_WALKER.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				(entityType, world, reason, pos, random) -> (world.getDifficulty() != Difficulty.PEACEFUL && Monster.isDarkEnoughToSpawn(world, pos, random) && Mob.checkMobSpawnRules(entityType, world, reason, pos, random)));

	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 24);
		builder = builder.add(Attributes.ARMOR, 0.1);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 0);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);

		return builder;
	}

}
