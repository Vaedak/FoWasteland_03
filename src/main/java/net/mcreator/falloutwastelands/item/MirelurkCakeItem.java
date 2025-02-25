
package net.mcreator.falloutwastelands.item;

public class MirelurkCakeItem extends Item {
	public MirelurkCakeItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(8).saturationMod(0.4f).meat().build()));
	}
}