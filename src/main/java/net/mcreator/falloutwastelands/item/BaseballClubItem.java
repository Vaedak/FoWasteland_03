
package net.mcreator.falloutwastelands.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.falloutwastelands.init.FalloutWastelandsModItems;

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
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(FalloutWastelandsModItems.NAIL.get()));
			}
		}, 3, -2.5f, new Item.Properties());
	}
}
