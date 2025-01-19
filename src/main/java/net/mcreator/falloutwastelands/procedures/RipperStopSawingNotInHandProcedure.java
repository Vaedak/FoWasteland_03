package net.mcreator.falloutwastelands.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.falloutwastelands.init.FalloutWastelandsModItems;

public class RipperStopSawingNotInHandProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == FalloutWastelandsModItems.RIPPER.get()
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == FalloutWastelandsModItems.RIPPER.get()) == false) {
			entity.getPersistentData().putBoolean("RipperSaw", false);
		}
	}
}
