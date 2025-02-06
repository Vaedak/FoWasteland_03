
package net.mcreator.falloutwastelands.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.InteractionResult;

import net.mcreator.falloutwastelands.procedures.TatoRightclickedOnBlockProcedure;

public class TatoItem extends Item {
	public TatoItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(3).saturationMod(0.5f).build()));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		TatoRightclickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ());
		return InteractionResult.SUCCESS;
	}
}
