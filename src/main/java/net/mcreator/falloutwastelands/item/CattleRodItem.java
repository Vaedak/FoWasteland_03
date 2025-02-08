
package net.mcreator.falloutwastelands.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.falloutwastelands.procedures.CattleRodLivingEntityIsHitWithToolProcedure;
import net.mcreator.falloutwastelands.init.FalloutWastelandsModItems;

public class CattleRodItem extends SwordItem {
	public CattleRodItem() {
		super(new Tier() {
			public int getUses() {
				return 30;
			}

			public float getSpeed() {
				return 6.5f;
			}

			public float getAttackDamageBonus() {
				return -2f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 0;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.IRON_INGOT), new ItemStack(FalloutWastelandsModItems.COPPERWIRES.get()));
			}
		}, 3, -3.2f, new Item.Properties());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		CattleRodLivingEntityIsHitWithToolProcedure.execute(entity);
		return retval;
	}
}
