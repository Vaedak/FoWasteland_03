package net.mcreator.falloutwastelands.procedures;

import net.minecraftforge.eventbus.api.Event;

public class PickupCropsProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		ItemStack foundItem = ItemStack.EMPTY;
		double index = 0;
		Entity itemFound = null;
		String itemName = "";
		boolean foundPickup = false;
		boolean hasAvailableSlots = false;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof ItemEntity) {
					itemName = (entityiterator.getDisplayName().getString()).toLowerCase();
					if (itemName.contains("wheat")) {
						if (itemName.contains("seed")) {
							foundPickup = true;
							foundItem = new ItemStack(Items.WHEAT_SEEDS);
							itemFound = entityiterator;
						} else {
							foundPickup = true;
							foundItem = new ItemStack(Items.WHEAT);
							itemFound = entityiterator;
						}
					}
					if (itemName.contains("beet")) {
						foundPickup = true;
						foundItem = new ItemStack(Items.BEETROOT);
						itemFound = entityiterator;
					}
					if (itemName.contains("potato")) {
						foundPickup = true;
						foundItem = new ItemStack(Items.POTATO);
						itemFound = entityiterator;
					}
					if (itemName.contains("melon")) {
						foundPickup = true;
						foundItem = new ItemStack(Items.MELON_SLICE);
						itemFound = entityiterator;
					}
					if (itemName.contains("pumpkin")) {
						foundPickup = true;
						foundItem = new ItemStack(Blocks.PUMPKIN);
						itemFound = entityiterator;
					}
				}
			}
		}
		if (foundPickup) {
			index = 0;
			{
				AtomicReference<IItemHandler> _iitemhandlerref = new AtomicReference<>();
				entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(_iitemhandlerref::set);
				if (_iitemhandlerref.get() != null) {
					for (int _idx = 0; _idx < _iitemhandlerref.get().getSlots(); _idx++) {
						ItemStack itemstackiterator = _iitemhandlerref.get().getStackInSlot(_idx).copy();
						if (index > 5) {
							if (itemstackiterator.getItem() == Blocks.AIR.asItem()) {
								foundPickup = true;
							}
						}
						index = index + 1;
					}
				}
			}
			index = 0;
			{
				AtomicReference<IItemHandler> _iitemhandlerref = new AtomicReference<>();
				entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(_iitemhandlerref::set);
				if (_iitemhandlerref.get() != null) {
					for (int _idx = 0; _idx < _iitemhandlerref.get().getSlots(); _idx++) {
						ItemStack itemstackiterator = _iitemhandlerref.get().getStackInSlot(_idx).copy();
						if (hasAvailableSlots) {
							if (index > 5) {
								if (foundItem.getItem() == itemstackiterator.getItem()) {
									{
										final int _slotid = (int) index;
										final ItemStack _setstack = foundItem.copy();
										_setstack.setCount((int) (itemstackiterator.getCount() + 1));
										entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
											if (capability instanceof IItemHandlerModifiable _modHandlerEntSetSlot)
												_modHandlerEntSetSlot.setStackInSlot(_slotid, _setstack);
										});
									}
									itemstackiterator.grow(1);
									if (!itemFound.level().isClientSide())
										itemFound.discard();
									break;
								} else {
									if (itemstackiterator.getItem() == Blocks.AIR.asItem()) {
										{
											final int _slotid = (int) index;
											final ItemStack _setstack = foundItem.copy();
											_setstack.setCount(1);
											entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
												if (capability instanceof IItemHandlerModifiable _modHandlerEntSetSlot)
													_modHandlerEntSetSlot.setStackInSlot(_slotid, _setstack);
											});
										}
										if (!itemFound.level().isClientSide())
											itemFound.discard();
										break;
									}
								}
							}
							index = index + 1;
						} else {
							break;
						}
					}
				}
			}
		}
	}
}
