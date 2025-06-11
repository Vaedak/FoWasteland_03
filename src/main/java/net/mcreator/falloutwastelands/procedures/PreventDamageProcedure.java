package net.mcreator.falloutwastelands.procedures;

import net.minecraft.world.item.ItemStack;

public class PreventDamageProcedure {
	public static void execute(ItemStack itemstack) {
		itemstack.setDamageValue(0);
	}
}
