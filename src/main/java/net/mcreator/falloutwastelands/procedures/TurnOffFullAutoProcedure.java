package net.mcreator.falloutwastelands.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.falloutwastelands.init.FalloutWastelandsModItems;

public class TurnOffFullAutoProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == itemstack.getItem()) == false) {
			itemstack.getOrCreateTag().putBoolean("autoFire", false);
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == FalloutWastelandsModItems.TENMMHOMEMADEASSAULTRIFLE.get()) {
			if (itemstack.getOrCreateTag().getBoolean("shootGun") == true) {
				itemstack.getOrCreateTag().putBoolean("shootGun", false);
				Shoot10mmHommadeProcedure.execute(world, x, y, z, entity, itemstack);
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == FalloutWastelandsModItems.FIVEMMMINIGUN.get()) {
			if (itemstack.getOrCreateTag().getBoolean("shootGun") == true) {
				itemstack.getOrCreateTag().putBoolean("shootGun", false);
				FivemmShootProcedure.execute(world, x, y, z, entity, itemstack);
			}
		}
	}
}
