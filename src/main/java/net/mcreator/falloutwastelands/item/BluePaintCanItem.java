
package net.mcreator.falloutwastelands.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BluePaintCanItem extends Item {
	public BluePaintCanItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
