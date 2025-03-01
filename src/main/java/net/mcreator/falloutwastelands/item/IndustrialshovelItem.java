
package net.mcreator.falloutwastelands.item;

public class IndustrialshovelItem extends PickaxeItem {
	public IndustrialshovelItem() {
		super(new Tier() {
			public int getUses() {
				return 150;
			}

			public float getSpeed() {
				return 7f;
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
				return Ingredient.of(new ItemStack(FalloutWastelandsModItems.STEEL_INGOT.get()));
			}
		}, 1, -3f, new Item.Properties());
	}
}
