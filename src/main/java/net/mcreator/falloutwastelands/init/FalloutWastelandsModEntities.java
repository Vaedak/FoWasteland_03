
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

import net.mcreator.falloutwastelands.entity.RipperProjectileProjectileEntity;
import net.mcreator.falloutwastelands.entity.RaiderscavangerEntity;
import net.mcreator.falloutwastelands.entity.RaiderDustwalkerEntity;
import net.mcreator.falloutwastelands.entity.PowerArmorFrameEntity;
import net.mcreator.falloutwastelands.entity.PlasmaProjectileEntity;
import net.mcreator.falloutwastelands.entity.PADisplayEntityEntity;
import net.mcreator.falloutwastelands.entity.LaserBeamEntity;
import net.mcreator.falloutwastelands.entity.GeckoEntity;
import net.mcreator.falloutwastelands.entity.Cannibal00Entity;
import net.mcreator.falloutwastelands.entity.BrahminEntity;
import net.mcreator.falloutwastelands.entity.BlastmasterRaiderEntity;
import net.mcreator.falloutwastelands.entity.BaseGunItemProjectileEntity;
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

					.sized(0.6f, 1f));
	public static final RegistryObject<EntityType<GeckoEntity>> GECKO = register("gecko",
			EntityType.Builder.<GeckoEntity>of(GeckoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GeckoEntity::new)

					.sized(0.6f, 1.2f));

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
	}
}
