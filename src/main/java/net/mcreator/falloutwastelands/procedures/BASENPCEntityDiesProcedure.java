package net.mcreator.falloutwastelands.procedures;

import net.minecraftforge.eventbus.api.Event;

public class BASENPCEntityDiesProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getPersistentData().getString("assignedBASE")).equals((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, BlockPos.containing(entity.getPersistentData().getDouble("basePosX"), entity.getPersistentData().getDouble("basePosY"), entity.getPersistentData().getDouble("basePosZ")), 201)).getDisplayName().getString())) {
			if (new Object() {
				public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
					return _retval.get();
				}
			}.getAmount(world, BlockPos.containing(entity.getPersistentData().getDouble("basePosX"), entity.getPersistentData().getDouble("basePosY"), entity.getPersistentData().getDouble("basePosZ")), 199) > 0) {
				{
					BlockEntity _ent = world.getBlockEntity(BlockPos.containing(entity.getPersistentData().getDouble("basePosX"), entity.getPersistentData().getDouble("basePosY"), entity.getPersistentData().getDouble("basePosZ")));
					if (_ent != null) {
						final int _slotid = 199;
						final ItemStack _setstack = new ItemStack(FalloutWastelandsModItems.DELETED_MOD_ELEMENT.get()).copy();
						_setstack.setCount((int) (new Object() {
							public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
								AtomicInteger _retval = new AtomicInteger(0);
								BlockEntity _ent = world.getBlockEntity(pos);
								if (_ent != null)
									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
								return _retval.get();
							}
						}.getAmount(world, BlockPos.containing(entity.getPersistentData().getDouble("basePosX"), entity.getPersistentData().getDouble("basePosY"), entity.getPersistentData().getDouble("basePosZ")), 199) - 1));
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
						});
					}
				}
			}
		}
	}
}
