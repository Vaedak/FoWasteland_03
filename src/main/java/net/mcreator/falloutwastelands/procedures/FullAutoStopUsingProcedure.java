package net.mcreator.falloutwastelands.procedures;

import net.minecraft.world.item.ItemStack;

public class FullAutoStopUsingProcedure {
	public static void execute(ItemStack itemstack) {
		itemstack.getOrCreateTag().putBoolean("autoFire", false);
	}
}
