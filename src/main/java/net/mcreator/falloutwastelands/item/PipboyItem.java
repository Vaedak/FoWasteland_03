
package net.mcreator.falloutwastelands.item;

public class PipboyItem extends Item {
	public PipboyItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.RARE));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("Your personal computer !"));
	}
}