
package net.mcreator.falloutwastelands.item;

public class MutlemonItem extends Item {
	public MutlemonItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(2).saturationMod(0.1f).build()));
	}
}