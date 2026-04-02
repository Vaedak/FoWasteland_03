
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.falloutwastelands.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.falloutwastelands.entity.VertibirdEntityProjectile;
import net.mcreator.falloutwastelands.entity.VertibirdEntity;
import net.mcreator.falloutwastelands.entity.VertibirdBulletEntity;
import net.mcreator.falloutwastelands.entity.SpiderfloaterEntity;
import net.mcreator.falloutwastelands.entity.ShootNothingEntity;
import net.mcreator.falloutwastelands.entity.SettlerEntity;
import net.mcreator.falloutwastelands.entity.RipperProjectileProjectileEntity;
import net.mcreator.falloutwastelands.entity.RaiderscavangerEntity;
import net.mcreator.falloutwastelands.entity.RaiderDustwalkerEntity;
import net.mcreator.falloutwastelands.entity.RadscorpionEntity;
import net.mcreator.falloutwastelands.entity.RadroachEntity;
import net.mcreator.falloutwastelands.entity.PowerArmoredRaiderEntity;
import net.mcreator.falloutwastelands.entity.PowerArmorFrameEntity;
import net.mcreator.falloutwastelands.entity.PlasmaProjectileEntity;
import net.mcreator.falloutwastelands.entity.PADisplayEntityEntity;
import net.mcreator.falloutwastelands.entity.LobotomiteWalkerEntity;
import net.mcreator.falloutwastelands.entity.LaserBeamEntity;
import net.mcreator.falloutwastelands.entity.GeckoEntity;
import net.mcreator.falloutwastelands.entity.FriendlyTurretBulletEntity;
import net.mcreator.falloutwastelands.entity.FriendlyMK2TurretEntity;
import net.mcreator.falloutwastelands.entity.FriendlyMK1TurretEntity;
import net.mcreator.falloutwastelands.entity.FloaterEntity;
import net.mcreator.falloutwastelands.entity.FeralGhoulEntity;
import net.mcreator.falloutwastelands.entity.DynamiteEntityEntity;
import net.mcreator.falloutwastelands.entity.Cannibal02Entity;
import net.mcreator.falloutwastelands.entity.Cannibal01Entity;
import net.mcreator.falloutwastelands.entity.Cannibal00Entity;
import net.mcreator.falloutwastelands.entity.BrahminEntity;
import net.mcreator.falloutwastelands.entity.BlastmasterRaiderEntity;
import net.mcreator.falloutwastelands.entity.BaseGunItemProjectileEntity;
import net.mcreator.falloutwastelands.entity.BabyBrahminEntity;
import net.mcreator.falloutwastelands.FalloutWastelandsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FalloutWastelandsModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, FalloutWastelandsMod.MODID);
	public static final RegistryObject<EntityType<Cannibal00Entity>> CANNIBAL_00 = register("cannibal_00",
			EntityType.Builder.<Cannibal00Entity>of(Cannibal00Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Cannibal00Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PowerArmorFrameEntity>> POWER_ARMOR_FRAME = register("power_armor_frame", EntityType.Builder.<PowerArmorFrameEntity>of(PowerArmorFrameEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PowerArmorFrameEntity::new).fireImmune().sized(0.8f, 2f));
	public static final RegistryObject<EntityType<BaseGunItemProjectileEntity>> BASE_GUN_ITEM_PROJECTILE = register("base_gun_item_projectile", EntityType.Builder.<BaseGunItemProjectileEntity>of(BaseGunItemProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(BaseGunItemProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<RipperProjectileProjectileEntity>> RIPPER_PROJECTILE_PROJECTILE = register("ripper_projectile_projectile",
			EntityType.Builder.<RipperProjectileProjectileEntity>of(RipperProjectileProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(RipperProjectileProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<LaserBeamEntity>> LASER_BEAM = register("laser_beam",
			EntityType.Builder.<LaserBeamEntity>of(LaserBeamEntity::new, MobCategory.MISC).setCustomClientFactory(LaserBeamEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<PlasmaProjectileEntity>> PLASMA_PROJECTILE = register("plasma_projectile", EntityType.Builder.<PlasmaProjectileEntity>of(PlasmaProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(PlasmaProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<PADisplayEntityEntity>> PA_DISPLAY_ENTITY = register("pa_display_entity",
			EntityType.Builder.<PADisplayEntityEntity>of(PADisplayEntityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PADisplayEntityEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RaiderDustwalkerEntity>> RAIDER_DUSTWALKER = register("raider_dustwalker",
			EntityType.Builder.<RaiderDustwalkerEntity>of(RaiderDustwalkerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(80).setUpdateInterval(3).setCustomClientFactory(RaiderDustwalkerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BlastmasterRaiderEntity>> BLASTMASTER_RAIDER = register("blastmaster_raider",
			EntityType.Builder.<BlastmasterRaiderEntity>of(BlastmasterRaiderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(80).setUpdateInterval(3).setCustomClientFactory(BlastmasterRaiderEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RaiderscavangerEntity>> RAIDERSCAVANGER = register("raiderscavanger",
			EntityType.Builder.<RaiderscavangerEntity>of(RaiderscavangerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(80).setUpdateInterval(3).setCustomClientFactory(RaiderscavangerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BrahminEntity>> BRAHMIN = register("brahmin",
			EntityType.Builder.<BrahminEntity>of(BrahminEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BrahminEntity::new)

					.sized(0.8f, 1.5f));
	public static final RegistryObject<EntityType<GeckoEntity>> GECKO = register("gecko",
			EntityType.Builder.<GeckoEntity>of(GeckoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GeckoEntity::new)

					.sized(0.6f, 1.2f));
	public static final RegistryObject<EntityType<LobotomiteWalkerEntity>> LOBOTOMITE_WALKER = register("lobotomite_walker",
			EntityType.Builder.<LobotomiteWalkerEntity>of(LobotomiteWalkerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LobotomiteWalkerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DynamiteEntityEntity>> DYNAMITE_ENTITY = register("dynamite_entity", EntityType.Builder.<DynamiteEntityEntity>of(DynamiteEntityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DynamiteEntityEntity::new).fireImmune().sized(0.2f, 0.2f));
	public static final RegistryObject<EntityType<ShootNothingEntity>> SHOOT_NOTHING = register("shoot_nothing",
			EntityType.Builder.<ShootNothingEntity>of(ShootNothingEntity::new, MobCategory.MISC).setCustomClientFactory(ShootNothingEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0f, 0f));
	public static final RegistryObject<EntityType<Cannibal01Entity>> CANNIBAL_01 = register("cannibal_01",
			EntityType.Builder.<Cannibal01Entity>of(Cannibal01Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Cannibal01Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SpiderfloaterEntity>> SPIDERFLOATER = register("spiderfloater",
			EntityType.Builder.<SpiderfloaterEntity>of(SpiderfloaterEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SpiderfloaterEntity::new)

					.sized(1.5f, 1.5f));
	public static final RegistryObject<EntityType<Cannibal02Entity>> CANNIBAL_02 = register("cannibal_02",
			EntityType.Builder.<Cannibal02Entity>of(Cannibal02Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Cannibal02Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FloaterEntity>> FLOATER = register("floater",
			EntityType.Builder.<FloaterEntity>of(FloaterEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FloaterEntity::new)

					.sized(1.5f, 1.5f));
	public static final RegistryObject<EntityType<RadroachEntity>> RADROACH = register("radroach",
			EntityType.Builder.<RadroachEntity>of(RadroachEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RadroachEntity::new)

					.sized(0.6f, 1f));
	public static final RegistryObject<EntityType<RadscorpionEntity>> RADSCORPION = register("radscorpion",
			EntityType.Builder.<RadscorpionEntity>of(RadscorpionEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RadscorpionEntity::new)

					.sized(1f, 1f));
	public static final RegistryObject<EntityType<FeralGhoulEntity>> FERAL_GHOUL = register("feral_ghoul",
			EntityType.Builder.<FeralGhoulEntity>of(FeralGhoulEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FeralGhoulEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BabyBrahminEntity>> BABY_BRAHMIN = register("baby_brahmin",
			EntityType.Builder.<BabyBrahminEntity>of(BabyBrahminEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BabyBrahminEntity::new)

					.sized(0.8f, 1.5f));
	public static final RegistryObject<EntityType<PowerArmoredRaiderEntity>> POWER_ARMORED_RAIDER = register("power_armored_raider",
			EntityType.Builder.<PowerArmoredRaiderEntity>of(PowerArmoredRaiderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(80).setUpdateInterval(3).setCustomClientFactory(PowerArmoredRaiderEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<VertibirdBulletEntity>> VERTIBIRD_BULLET = register("vertibird_bullet", EntityType.Builder.<VertibirdBulletEntity>of(VertibirdBulletEntity::new, MobCategory.MISC)
			.setCustomClientFactory(VertibirdBulletEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<VertibirdEntity>> VERTIBIRD = register("vertibird",
			EntityType.Builder.<VertibirdEntity>of(VertibirdEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(80).setUpdateInterval(3).setCustomClientFactory(VertibirdEntity::new)

					.sized(2.5f, 2f));
	public static final RegistryObject<EntityType<VertibirdEntityProjectile>> VERTIBIRD_PROJECTILE = register("projectile_vertibird", EntityType.Builder.<VertibirdEntityProjectile>of(VertibirdEntityProjectile::new, MobCategory.MISC)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).setCustomClientFactory(VertibirdEntityProjectile::new).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FriendlyMK1TurretEntity>> FRIENDLY_MK_1_TURRET = register("friendly_mk_1_turret",
			EntityType.Builder.<FriendlyMK1TurretEntity>of(FriendlyMK1TurretEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FriendlyMK1TurretEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SettlerEntity>> SETTLER = register("settler",
			EntityType.Builder.<SettlerEntity>of(SettlerEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SettlerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FriendlyTurretBulletEntity>> FRIENDLY_TURRET_BULLET = register("friendly_turret_bullet", EntityType.Builder.<FriendlyTurretBulletEntity>of(FriendlyTurretBulletEntity::new, MobCategory.MISC)
			.setCustomClientFactory(FriendlyTurretBulletEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.1f, 0.1f));
	public static final RegistryObject<EntityType<FriendlyMK2TurretEntity>> FRIENDLY_MK_2_TURRET = register("friendly_mk_2_turret",
			EntityType.Builder.<FriendlyMK2TurretEntity>of(FriendlyMK2TurretEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FriendlyMK2TurretEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			Cannibal00Entity.init();
			PowerArmorFrameEntity.init();
			PADisplayEntityEntity.init();
			RaiderDustwalkerEntity.init();
			BlastmasterRaiderEntity.init();
			RaiderscavangerEntity.init();
			BrahminEntity.init();
			GeckoEntity.init();
			LobotomiteWalkerEntity.init();
			DynamiteEntityEntity.init();
			Cannibal01Entity.init();
			SpiderfloaterEntity.init();
			Cannibal02Entity.init();
			FloaterEntity.init();
			RadroachEntity.init();
			RadscorpionEntity.init();
			FeralGhoulEntity.init();
			BabyBrahminEntity.init();
			PowerArmoredRaiderEntity.init();
			VertibirdEntity.init();
			FriendlyMK1TurretEntity.init();
			SettlerEntity.init();
			FriendlyMK2TurretEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(CANNIBAL_00.get(), Cannibal00Entity.createAttributes().build());
		event.put(POWER_ARMOR_FRAME.get(), PowerArmorFrameEntity.createAttributes().build());
		event.put(PA_DISPLAY_ENTITY.get(), PADisplayEntityEntity.createAttributes().build());
		event.put(RAIDER_DUSTWALKER.get(), RaiderDustwalkerEntity.createAttributes().build());
		event.put(BLASTMASTER_RAIDER.get(), BlastmasterRaiderEntity.createAttributes().build());
		event.put(RAIDERSCAVANGER.get(), RaiderscavangerEntity.createAttributes().build());
		event.put(BRAHMIN.get(), BrahminEntity.createAttributes().build());
		event.put(GECKO.get(), GeckoEntity.createAttributes().build());
		event.put(LOBOTOMITE_WALKER.get(), LobotomiteWalkerEntity.createAttributes().build());
		event.put(DYNAMITE_ENTITY.get(), DynamiteEntityEntity.createAttributes().build());
		event.put(CANNIBAL_01.get(), Cannibal01Entity.createAttributes().build());
		event.put(SPIDERFLOATER.get(), SpiderfloaterEntity.createAttributes().build());
		event.put(CANNIBAL_02.get(), Cannibal02Entity.createAttributes().build());
		event.put(FLOATER.get(), FloaterEntity.createAttributes().build());
		event.put(RADROACH.get(), RadroachEntity.createAttributes().build());
		event.put(RADSCORPION.get(), RadscorpionEntity.createAttributes().build());
		event.put(FERAL_GHOUL.get(), FeralGhoulEntity.createAttributes().build());
		event.put(BABY_BRAHMIN.get(), BabyBrahminEntity.createAttributes().build());
		event.put(POWER_ARMORED_RAIDER.get(), PowerArmoredRaiderEntity.createAttributes().build());
		event.put(VERTIBIRD.get(), VertibirdEntity.createAttributes().build());
		event.put(FRIENDLY_MK_1_TURRET.get(), FriendlyMK1TurretEntity.createAttributes().build());
		event.put(SETTLER.get(), SettlerEntity.createAttributes().build());
		event.put(FRIENDLY_MK_2_TURRET.get(), FriendlyMK2TurretEntity.createAttributes().build());
	}
}
