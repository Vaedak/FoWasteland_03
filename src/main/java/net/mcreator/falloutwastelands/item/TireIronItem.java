
package net.mcreator.falloutwastelands.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.falloutwastelands.init.FalloutWastelandsModItems;

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
				return 0;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(FalloutWastelandsModItems.LEAD_INGOT.get()));
			}
		}, 3, -3.2f, new Item.Properties());
	}
}
