package net.mcreator.falloutwastelands.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.falloutwastelands.init.FalloutWastelandsModItems;

public class GunInHandTickProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double ammoCount = 0;
		boolean ammoChecked = false;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 5, 100, false, false));
		if (entity.getPersistentData().getDouble("cooldown") > 0) {
			entity.getPersistentData().putDouble("cooldown", (entity.getPersistentData().getDouble("cooldown") - 1));
		}
		if (entity.getPersistentData().getDouble("count") <= 0) {
			if (itemstack.getOrCreateTag().getBoolean("autoFire") == true) {
				itemstack.getOrCreateTag().putBoolean("shootGun", true);
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == FalloutWastelandsModItems.TENMMHOMEMADEASSAULTRIFLE.get()) {
				entity.getPersistentData().putDouble("count", 3);
			} else {
				entity.getPersistentData().putDouble("count", 0);
			}
		}
		if (entity.getPersistentData().getDouble("count") > 0) {
			entity.getPersistentData().putDouble("count", (entity.getPersistentData().getDouble("count") - 1));
		}
	}
}
