package net.mcreator.falloutwastelands.procedures;

import net.minecraft.world.item.ItemStack;

public class LeftClickFireHomemade10mmProcedure {
	public static void execute(ItemStack itemstack) {
		itemstack.getOrCreateTag().putBoolean("shootGun", true);
	}
}
