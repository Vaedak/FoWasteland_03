
package net.mcreator.falloutwastelands.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class PopulationIconItem extends Item {
	public PopulationIconItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
