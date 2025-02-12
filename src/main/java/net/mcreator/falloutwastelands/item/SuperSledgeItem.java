
package net.mcreator.falloutwastelands.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.falloutwastelands.init.FalloutWastelandsModItems;

public class SuperSledgeItem extends SwordItem {
	public SuperSledgeItem() {
		super(new Tier() {
			public int getUses() {
				return 250;
			}

			public float getSpeed() {
				return 6.5f;
			}

			public float getAttackDamageBonus() {
				return 6.5f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 0;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(FalloutWastelandsModItems.INDUSTRIALHULL.get()));
			}
		}, 3, -3.6f, new Item.Properties());
	}
}
