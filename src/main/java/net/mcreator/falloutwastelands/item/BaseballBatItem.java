
package net.mcreator.falloutwastelands.item;

public class BaseballBatItem extends SwordItem {
	public BaseballBatItem() {
		super(new Tier() {
			public int getUses() {
				return 70;
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
				return Ingredient.of(ItemTags.create(new ResourceLocation("minecraft:planks")));
			}
		}, 3, -3.2f, new Item.Properties());
	}
}
