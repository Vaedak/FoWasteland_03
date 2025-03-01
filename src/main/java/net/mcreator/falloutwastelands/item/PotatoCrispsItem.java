
package net.mcreator.falloutwastelands.item;

public class PotatoCrispsItem extends Item {
	public PotatoCrispsItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(3).saturationMod(0.2f).build()));
	}
}