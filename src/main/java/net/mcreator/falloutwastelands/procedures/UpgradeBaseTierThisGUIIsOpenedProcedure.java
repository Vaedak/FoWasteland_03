package net.mcreator.falloutwastelands.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.falloutwastelands.init.FalloutWastelandsModItems;

import java.util.function.Supplier;
import java.util.Map;

public class UpgradeBaseTierThisGUIIsOpenedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		ItemStack item1 = ItemStack.EMPTY;
		ItemStack item2 = ItemStack.EMPTY;
		ItemStack item4 = ItemStack.EMPTY;
		ItemStack item3 = ItemStack.EMPTY;
		double currentTier = 0;
		currentTier = entity.getPersistentData().getDouble("baseTier");
		item1 = new ItemStack(FalloutWastelandsModItems.STEEL_INGOT.get());
		item2 = new ItemStack(FalloutWastelandsModItems.SCRAPMETAL.get());
		item3 = new ItemStack(FalloutWastelandsModItems.BOTTLE_CAP.get());
		item4 = new ItemStack(FalloutWastelandsModItems.TININGOT.get());
		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			ItemStack _setstack = item1.copy();
			_setstack.setCount((int) (3 * currentTier));
			((Slot) _slots.get(0)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			ItemStack _setstack = item2.copy();
			_setstack.setCount((int) (2 * currentTier));
			((Slot) _slots.get(1)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			ItemStack _setstack = item3.copy();
			_setstack.setCount((int) (5 * currentTier));
			((Slot) _slots.get(2)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			ItemStack _setstack = item4.copy();
			_setstack.setCount((int) (2 * currentTier));
			((Slot) _slots.get(3)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
	}
}
