
package net.mcreator.falloutwastelands.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RawUraniumItem extends Item {
	public RawUraniumItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}
}
