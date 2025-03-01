
package net.mcreator.falloutwastelands.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class NailItem extends Item {
	public NailItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
