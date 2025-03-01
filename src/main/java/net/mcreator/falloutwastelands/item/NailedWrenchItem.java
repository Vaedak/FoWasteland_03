
package net.mcreator.falloutwastelands.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.mcreator.falloutwastelands.init.FalloutWastelandsModItems;

import java.util.List;

public class NailedWrenchItem extends SwordItem {
	public NailedWrenchItem() {
		super(new Tier() {
			public int getUses() {
				return 90;
			}

			public float getSpeed() {
				return 2f;
			}

			public float getAttackDamageBonus() {
				return 0.5f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 5;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(FalloutWastelandsModItems.LEAD_INGOT.get()), new ItemStack(FalloutWastelandsModItems.NAIL.get()));
			}
		}, 3, -2.7f, new Item.Properties());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("Some nails cannot harm ... can they ?"));
	}
}
