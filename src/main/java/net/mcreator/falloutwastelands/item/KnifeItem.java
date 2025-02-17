
package net.mcreator.falloutwastelands.item;

public class KnifeItem extends SwordItem {
	public KnifeItem() {
		super(new Tier() {
			public int getUses() {
				return 80;
			}

			public float getSpeed() {
				return 6.5f;
			}

			public float getAttackDamageBonus() {
				return 0.5f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 0;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.IRON_INGOT));
			}
		}, 3, -2.6f, new Item.Properties());
	}
}
