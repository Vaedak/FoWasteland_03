
package net.mcreator.falloutwastelands.item;

public class WhiskeyItem extends Item {
	public WhiskeyItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(-4).saturationMod(1.5f).alwaysEat().build()));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.DRINK;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		BeerPlayerFinishesUsingItemProcedure.execute(entity);
		return retval;
	}
}