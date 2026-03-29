package net.mcreator.falloutwastelands.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;

import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Comparator;

public class ScrapperAIProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double i = 0;
		Entity foundItem = null;
		ItemStack foundEntityItem = ItemStack.EMPTY;
		boolean breakLoop = false;
		String itemName = "";
		if (!world.getEntitiesOfClass(ItemEntity.class, AABB.ofSize(new Vec3(x, y, z), 20, 20, 20), e -> true).isEmpty()) {
			foundItem = (Entity) world.getEntitiesOfClass(ItemEntity.class, AABB.ofSize(new Vec3(x, y, z), 20, 20, 20), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(x, y, z)).findFirst().orElse(null);
			if (entity instanceof Mob _entity)
				_entity.getNavigation().moveTo((foundItem.getX()), (foundItem.getY()), (foundItem.getZ()), 0.9);
		}
		i = 0;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(3 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof ItemEntity) {
					foundEntityItem = (entityiterator instanceof ItemEntity _itemEnt ? _itemEnt.getItem() : ItemStack.EMPTY);
					itemName = ForgeRegistries.ITEMS.getKey(foundEntityItem.getItem()).toString();
					{
						AtomicReference<IItemHandler> _iitemhandlerref = new AtomicReference<>();
						entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(_iitemhandlerref::set);
						if (_iitemhandlerref.get() != null) {
							for (int _idx = 0; _idx < _iitemhandlerref.get().getSlots(); _idx++) {
								ItemStack itemstackiterator = _iitemhandlerref.get().getStackInSlot(_idx).copy();
								if ((itemName).toLowerCase().contains("helmet") && (new Object() {
									public ItemStack getItemStack(int sltid, Entity entity) {
										AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
										entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
											_retval.set(capability.getStackInSlot(sltid).copy());
										});
										return _retval.get();
									}
								}.getItemStack(0, entity)).getItem() == Blocks.AIR.asItem()) {
									{
										final int _slotid = 0;
										final ItemStack _setstack = foundEntityItem.copy();
										_setstack.setCount(1);
										entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
											if (capability instanceof IItemHandlerModifiable _modHandlerEntSetSlot)
												_modHandlerEntSetSlot.setStackInSlot(_slotid, _setstack);
										});
									}
									if (!entityiterator.level().isClientSide())
										entityiterator.discard();
									breakLoop = true;
									break;
								}
								if ((itemName).toLowerCase().contains("chestplate") && (new Object() {
									public ItemStack getItemStack(int sltid, Entity entity) {
										AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
										entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
											_retval.set(capability.getStackInSlot(sltid).copy());
										});
										return _retval.get();
									}
								}.getItemStack(1, entity)).getItem() == Blocks.AIR.asItem()) {
									{
										final int _slotid = 1;
										final ItemStack _setstack = foundEntityItem.copy();
										_setstack.setCount(1);
										entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
											if (capability instanceof IItemHandlerModifiable _modHandlerEntSetSlot)
												_modHandlerEntSetSlot.setStackInSlot(_slotid, _setstack);
										});
									}
									if (!entityiterator.level().isClientSide())
										entityiterator.discard();
									breakLoop = true;
									break;
								}
								if ((itemName).toLowerCase().contains("legging") && (new Object() {
									public ItemStack getItemStack(int sltid, Entity entity) {
										AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
										entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
											_retval.set(capability.getStackInSlot(sltid).copy());
										});
										return _retval.get();
									}
								}.getItemStack(2, entity)).getItem() == Blocks.AIR.asItem()) {
									{
										final int _slotid = 2;
										final ItemStack _setstack = foundEntityItem.copy();
										_setstack.setCount(1);
										entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
											if (capability instanceof IItemHandlerModifiable _modHandlerEntSetSlot)
												_modHandlerEntSetSlot.setStackInSlot(_slotid, _setstack);
										});
									}
									if (!entityiterator.level().isClientSide())
										entityiterator.discard();
									breakLoop = true;
									break;
								}
								if ((itemName).toLowerCase().contains("boot") && (new Object() {
									public ItemStack getItemStack(int sltid, Entity entity) {
										AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
										entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
											_retval.set(capability.getStackInSlot(sltid).copy());
										});
										return _retval.get();
									}
								}.getItemStack(3, entity)).getItem() == Blocks.AIR.asItem()) {
									{
										final int _slotid = 3;
										final ItemStack _setstack = foundEntityItem.copy();
										_setstack.setCount(1);
										entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
											if (capability instanceof IItemHandlerModifiable _modHandlerEntSetSlot)
												_modHandlerEntSetSlot.setStackInSlot(_slotid, _setstack);
										});
									}
									if (!entityiterator.level().isClientSide())
										entityiterator.discard();
									breakLoop = true;
									break;
								}
								if (foundEntityItem.getMaxStackSize() == 1 && (new Object() {
									public ItemStack getItemStack(int sltid, Entity entity) {
										AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
										entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
											_retval.set(capability.getStackInSlot(sltid).copy());
										});
										return _retval.get();
									}
								}.getItemStack(4, entity)).getItem() == Blocks.AIR.asItem()) {
									{
										final int _slotid = 4;
										final ItemStack _setstack = foundEntityItem.copy();
										_setstack.setCount(1);
										entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
											if (capability instanceof IItemHandlerModifiable _modHandlerEntSetSlot)
												_modHandlerEntSetSlot.setStackInSlot(_slotid, _setstack);
										});
									}
									if (!entityiterator.level().isClientSide())
										entityiterator.discard();
									breakLoop = true;
									break;
								}
								if (foundEntityItem.getMaxStackSize() == 1 && (new Object() {
									public ItemStack getItemStack(int sltid, Entity entity) {
										AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
										entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
											_retval.set(capability.getStackInSlot(sltid).copy());
										});
										return _retval.get();
									}
								}.getItemStack(5, entity)).getItem() == Blocks.AIR.asItem()) {
									{
										final int _slotid = 5;
										final ItemStack _setstack = foundEntityItem.copy();
										_setstack.setCount(1);
										entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
											if (capability instanceof IItemHandlerModifiable _modHandlerEntSetSlot)
												_modHandlerEntSetSlot.setStackInSlot(_slotid, _setstack);
										});
									}
									if (!entityiterator.level().isClientSide())
										entityiterator.discard();
									breakLoop = true;
									break;
								}
								if (i > 5) {
									if (foundEntityItem.getItem() == itemstackiterator.getItem() && !foundEntityItem.isEnchanted()) {
										if (entity instanceof LivingEntity _entity)
											_entity.swing(InteractionHand.MAIN_HAND, true);
										{
											final int _slotid = (int) i;
											final ItemStack _setstack = itemstackiterator.copy();
											_setstack.setCount((int) (itemstackiterator.getCount() + foundEntityItem.getCount()));
											entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
												if (capability instanceof IItemHandlerModifiable _modHandlerEntSetSlot)
													_modHandlerEntSetSlot.setStackInSlot(_slotid, _setstack);
											});
										}
										if (!entityiterator.level().isClientSide())
											entityiterator.discard();
										breakLoop = true;
										break;
									}
									if (Blocks.AIR.asItem() == itemstackiterator.getItem()) {
										if (entity instanceof LivingEntity _entity)
											_entity.swing(InteractionHand.MAIN_HAND, true);
										{
											final int _slotid = (int) i;
											final ItemStack _setstack = foundEntityItem.copy();
											_setstack.setCount(foundEntityItem.getCount());
											entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
												if (capability instanceof IItemHandlerModifiable _modHandlerEntSetSlot)
													_modHandlerEntSetSlot.setStackInSlot(_slotid, _setstack);
											});
										}
										if (!entityiterator.level().isClientSide())
											entityiterator.discard();
										breakLoop = true;
										break;
									}
								}
								i = i + 1;
							}
						}
					}
				}
				if (breakLoop) {
					break;
				}
			}
		}
	}
}
