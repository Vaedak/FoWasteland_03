
package net.mcreator.falloutwastelands.item;

public class NeutronadeCapItem extends Item {
	public NeutronadeCapItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("Currency from the wastelands"));
	}
}