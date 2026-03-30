package net.mcreator.falloutwastelands.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class FriendlyTurretBulletProjectileHitsLivingEntityProcedure {
	public static void execute(Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("fallout_wastelands_:base_entities")))) {
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + 10));
		}
		if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("fallout_wastelands_:base_turrets")))) {
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth(20);
		} else {
			if (!immediatesourceentity.level().isClientSide())
				immediatesourceentity.discard();
		}
	}
}
