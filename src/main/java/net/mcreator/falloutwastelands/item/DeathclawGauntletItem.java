
package net.mcreator.falloutwastelands.item;

public class DeathclawGauntletItem extends SwordItem {
	public DeathclawGauntletItem() {
		super(new Tier() {
			public int getUses() {
				return 240;
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
				return Ingredient.of();
			}
		}, 3, -2f, new Item.Properties());
	}
}
