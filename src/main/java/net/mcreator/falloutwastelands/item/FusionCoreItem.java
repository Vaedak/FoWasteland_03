
package net.mcreator.falloutwastelands.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.falloutwastelands.procedures.FusionCoreItemIsDroppedByPlayerProcedure;
import net.mcreator.falloutwastelands.procedures.FusionCoreItemInInventoryTickProcedure;

import java.util.List;

public class FusionCoreItem extends Item {
	public FusionCoreItem() {
		super(new Item.Properties().durability(101).rarity(Rarity.RARE));
	}

	@Override
	public int getEnchantmentValue() {
		return 10;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("Required for Power Armor"));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		FusionCoreItemInInventoryTickProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity, itemstack);
	}

	@Override
	public boolean onDroppedByPlayer(ItemStack itemstack, Player entity) {
		FusionCoreItemIsDroppedByPlayerProcedure.execute(entity);
		return true;
	}
}
