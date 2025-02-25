
package net.mcreator.falloutwastelands.item;

public class RadroachMeatItem extends Item {
	public RadroachMeatItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(2).saturationMod(0.2f).meat().build()));
	}
}