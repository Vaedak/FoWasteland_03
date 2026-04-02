
package net.mcreator.falloutwastelands.item;

public class TireIronItem extends SwordItem {
	public TireIronItem() {
		super(new Tier() {
			public int getUses() {
				return 40;
			}

			public float getSpeed() {
				return 6.5f;
			}

			public float getAttackDamageBonus() {
				return 1.5f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 5;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(FalloutWastelandsModItems.LEAD_INGOT.get()));
			}
		}, 3, -2.5f, new Item.Properties());
	}
}
