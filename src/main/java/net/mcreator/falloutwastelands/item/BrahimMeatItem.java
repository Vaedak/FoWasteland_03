
package net.mcreator.falloutwastelands.item;

public class BrahimMeatItem extends Item {
	public BrahimMeatItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(4).saturationMod(0.4f).meat().build()));
	}
}