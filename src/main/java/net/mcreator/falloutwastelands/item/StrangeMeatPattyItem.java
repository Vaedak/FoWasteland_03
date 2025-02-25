
package net.mcreator.falloutwastelands.item;

public class StrangeMeatPattyItem extends Item {
	public StrangeMeatPattyItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(4).saturationMod(0.4f).meat().build()));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("Perfect with fava beans and a nice Cianti."));
	}
}