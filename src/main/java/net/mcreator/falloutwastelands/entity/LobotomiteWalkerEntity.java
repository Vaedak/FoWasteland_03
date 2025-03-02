
package net.mcreator.falloutwastelands.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.AreaEffectCloud;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.Difficulty;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;

import net.mcreator.falloutwastelands.init.FalloutWastelandsModItems;
import net.mcreator.falloutwastelands.init.FalloutWastelandsModEntities;

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
		this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, Cannibal01Entity.class, false, false));
		this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, Cannibal02Entity.class, false, false));
		this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, FloaterEntity.class, false, false));
		this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, SpiderfloaterEntity.class, false, false));
		this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, RadroachEntity.class, false, false));
		this.targetSelector.addGoal(12, new NearestAttackableTargetGoal(this, RadscorpionEntity.class, false, false));
		this.goalSelector.addGoal(13, new MeleeAttackGoal(this, 1, false) {
			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth();
			}
		});
		this.goalSelector.addGoal(14, new RandomStrollGoal(this, 0.5));
		this.targetSelector.addGoal(15, new HurtByTargetGoal(this).setAlertOthers());
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
