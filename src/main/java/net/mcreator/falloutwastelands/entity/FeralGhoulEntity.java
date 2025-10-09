
package net.mcreator.falloutwastelands.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
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
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.Difficulty;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;

import net.mcreator.falloutwastelands.init.FalloutWastelandsModEntities;

public class FeralGhoulEntity extends Monster {
	public FeralGhoulEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(FalloutWastelandsModEntities.FERAL_GHOUL.get(), world);
	}

	public FeralGhoulEntity(EntityType<FeralGhoulEntity> type, Level world) {
		super(type, world);
		setMaxUpStep(0.6f);
		xpReward = 2;
		setNoAi(false);
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 0.65, false) {
			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth();
			}
		});
		this.goalSelector.addGoal(2, new RandomStrollGoal(this, 0.25));
		this.targetSelector.addGoal(3, new HurtByTargetGoal(this).setAlertOthers());
		this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, BrahminEntity.class, false, true));
		this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, BlastmasterRaiderEntity.class, false, true));
		this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, Cannibal00Entity.class, false, true));
		this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, Cannibal01Entity.class, false, true));
		this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, Cannibal02Entity.class, false, true));
		this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, BrahminEntity.class, false, true));
		this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, FloaterEntity.class, false, true));
		this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, GeckoEntity.class, false, true));
		this.targetSelector.addGoal(12, new NearestAttackableTargetGoal(this, LobotomiteWalkerEntity.class, false, true));
		this.targetSelector.addGoal(13, new NearestAttackableTargetGoal(this, RadroachEntity.class, false, true));
		this.targetSelector.addGoal(14, new NearestAttackableTargetGoal(this, RadscorpionEntity.class, false, true));
		this.targetSelector.addGoal(15, new NearestAttackableTargetGoal(this, RaiderDustwalkerEntity.class, false, true));
		this.targetSelector.addGoal(16, new NearestAttackableTargetGoal(this, RaiderscavangerEntity.class, false, true));
		this.targetSelector.addGoal(17, new NearestAttackableTargetGoal(this, SpiderfloaterEntity.class, false, true));
		this.targetSelector.addGoal(18, new NearestAttackableTargetGoal(this, Player.class, false, true));
		this.targetSelector.addGoal(19, new NearestAttackableTargetGoal(this, ServerPlayer.class, false, true));
		this.goalSelector.addGoal(20, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(21, new FloatGoal(this));
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEAD;
	}

	protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
		super.dropCustomDeathLoot(source, looting, recentlyHitIn);
		this.spawnAtLocation(new ItemStack(Items.ROTTEN_FLESH));
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
		SpawnPlacements.register(FalloutWastelandsModEntities.FERAL_GHOUL.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				(entityType, world, reason, pos, random) -> (world.getDifficulty() != Difficulty.PEACEFUL && Monster.isDarkEnoughToSpawn(world, pos, random) && Mob.checkMobSpawnRules(entityType, world, reason, pos, random)));
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.65);
		builder = builder.add(Attributes.MAX_HEALTH, 10);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		return builder;
	}
}
