
package net.mcreator.falloutwastelands.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class VaultHullItem extends Item {
	public VaultHullItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
