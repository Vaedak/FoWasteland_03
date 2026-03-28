package net.mcreator.falloutwastelands.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.falloutwastelands.init.FalloutWastelandsModItems;

import java.util.function.Supplier;
import java.util.Map;

public class DisplayBASETierProcedure {
	public static String execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return "";
		double slotNumber = 0;
		slotNumber = 197;
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get((int) slotNumber)).getItem() : ItemStack.EMPTY)
				.getItem() == FalloutWastelandsModItems.BASE_TIER_ICON.get()) {
			return "Tier " + ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get((int) slotNumber)).getItem() : ItemStack.EMPTY).getCount());
		} else {
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
				if (_ent != null) {
					final int _slotid = (int) slotNumber;
					final ItemStack _setstack = new ItemStack(FalloutWastelandsModItems.BASE_TIER_ICON.get()).copy();
					_setstack.setCount(1);
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable)
							((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
					});
				}
			}
			(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get((int) slotNumber)).getItem() : ItemStack.EMPTY).setHoverName(Component.literal("0"));
		}
		return "Tier " + ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get((int) slotNumber)).getItem() : ItemStack.EMPTY).getCount());
	}
}
