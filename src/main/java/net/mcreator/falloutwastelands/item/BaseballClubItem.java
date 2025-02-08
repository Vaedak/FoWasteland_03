
package net.mcreator.falloutwastelands.item;

public class BaseballClubItem extends SwordItem {
	public BaseballClubItem() {
		super(new Tier() {
			public int getUses() {
				return 55;
			}

			public float getSpeed() {
				return 6.5f;
			}

			public float getAttackDamageBonus() {
				return 1.5f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 0;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(FalloutWastelandsModItems.NAIL.get()));
			}
		}, 3, -3.2f, new Item.Properties());
	}
}
