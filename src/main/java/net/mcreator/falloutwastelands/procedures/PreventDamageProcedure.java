package net.mcreator.falloutwastelands.procedures;

import net.minecraftforge.eventbus.api.Event;

public class PreventDamageProcedure {
	public static void execute(ItemStack itemstack) {
		itemstack.setDamageValue(itemstack.getMaxDamage());
	}
}
