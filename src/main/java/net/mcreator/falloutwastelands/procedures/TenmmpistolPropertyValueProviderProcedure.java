package net.mcreator.falloutwastelands.procedures;

import net.minecraft.world.item.ItemStack;

public class TenmmpistolPropertyValueProviderProcedure {
	public static double execute(ItemStack itemstack) {
		return itemstack.getOrCreateTag().getDouble("gunUsed");
	}
}
