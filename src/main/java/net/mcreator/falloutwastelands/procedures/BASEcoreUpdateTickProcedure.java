package net.mcreator.falloutwastelands.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.BlockPos;

import net.mcreator.falloutwastelands.network.FalloutWastelandsModVariables;
import net.mcreator.falloutwastelands.init.FalloutWastelandsModMobEffects;
import net.mcreator.falloutwastelands.entity.SettlerEntity;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.List;
import java.util.Comparator;

public class BASEcoreUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		Entity foundEntity = null;
		double i = 0;
		boolean breakLoop = false;
		ParticleSquareProcedure.execute(world, x, y, z);
		RaidControllerProcedure.execute(world, x, y, z);
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(((new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, BlockPos.containing(x, y, z), "zoneSize")) * 2) / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 60, 2, false, false));
				if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(FalloutWastelandsModMobEffects.IN_BASE.get(), 5, 1, false, false));
				entityiterator.getPersistentData().putDouble("basePosX", x);
				entityiterator.getPersistentData().putDouble("basePosY", y);
				entityiterator.getPersistentData().putDouble("basePosZ", z);
				entityiterator.getPersistentData().putDouble("baseTier", (new Object() {
					public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicInteger _retval = new AtomicInteger(0);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
						return _retval.get();
					}
				}.getAmount(world, BlockPos.containing(x, y, z), 197)));
				if ((((entityiterator.getDisplayName().getString()).replace("]", "")).replace("[", "")).equals((((new Object() {
					public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
						return _retval.get();
					}
				}.getItemStack(world, BlockPos.containing(x, y, z), 196)).getDisplayName().getString()).replace("]", "")).replace("[", ""))) {
					{
						double _setval = x;
						entityiterator.getCapability(FalloutWastelandsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.baseX = _setval;
							capability.syncPlayerVariables(entityiterator);
						});
					}
					{
						double _setval = y;
						entityiterator.getCapability(FalloutWastelandsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.baseY = _setval;
							capability.syncPlayerVariables(entityiterator);
						});
					}
					{
						double _setval = z;
						entityiterator.getCapability(FalloutWastelandsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.baseZ = _setval;
							capability.syncPlayerVariables(entityiterator);
						});
					}
					{
						String _setval = (new Object() {
							public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								BlockEntity _ent = world.getBlockEntity(pos);
								if (_ent != null)
									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
								return _retval.get();
							}
						}.getItemStack(world, BlockPos.containing(x, y, z), 201)).getDisplayName().getString();
						entityiterator.getCapability(FalloutWastelandsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.currentBase = _setval;
							capability.syncPlayerVariables(entityiterator);
						});
					}
				}
			}
		}
		if (!world.getEntitiesOfClass(SettlerEntity.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).isEmpty()) {
			if (((Entity) world.getEntitiesOfClass(SettlerEntity.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().getBoolean("scrapper")) {
				i = 0;
				breakLoop = false;
				foundEntity = (Entity) world.getEntitiesOfClass(SettlerEntity.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null);
				{
					AtomicReference<IItemHandler> _iitemhandlerref = new AtomicReference<>();
					foundEntity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(_iitemhandlerref::set);
					if (_iitemhandlerref.get() != null) {
						for (int _idx = 0; _idx < _iitemhandlerref.get().getSlots(); _idx++) {
							ItemStack itemstackiterator = _iitemhandlerref.get().getStackInSlot(_idx).copy();
							if (!(itemstackiterator.getItem() == Blocks.AIR.asItem())) {
								for (int index0 = 0; index0 < 29; index0++) {
									if ((new Object() {
										public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
											AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
											BlockEntity _ent = world.getBlockEntity(pos);
											if (_ent != null)
												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
											return _retval.get();
										}
									}.getItemStack(world, BlockPos.containing(x, y, z), (int) i)).getItem() == Blocks.AIR.asItem()) {
										{
											BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
											if (_ent != null) {
												final int _slotid = (int) i;
												final ItemStack _setstack = itemstackiterator.copy();
												_setstack.setCount(itemstackiterator.getCount());
												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
													if (capability instanceof IItemHandlerModifiable)
														((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
												});
											}
										}
										{
											final int _slotid = (int) i;
											final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
											_setstack.setCount(1);
											foundEntity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
												if (capability instanceof IItemHandlerModifiable _modHandlerEntSetSlot)
													_modHandlerEntSetSlot.setStackInSlot(_slotid, _setstack);
											});
										}
										breakLoop = true;
										break;
									}
									i = i + 1;
								}
							}
							if (itemstackiterator.getItem() == (new Object() {
								public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
									AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null)
										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
									return _retval.get();
								}
							}.getItemStack(world, BlockPos.containing(x, y, z), (int) i)).getItem()) {
								for (int index1 = 0; index1 < 29; index1++) {
									if ((new Object() {
										public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
											AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
											BlockEntity _ent = world.getBlockEntity(pos);
											if (_ent != null)
												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
											return _retval.get();
										}
									}.getItemStack(world, BlockPos.containing(x, y, z), (int) i)).getItem() == Blocks.AIR.asItem()) {
										{
											BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
											if (_ent != null) {
												final int _slotid = (int) i;
												final ItemStack _setstack = itemstackiterator.copy();
												_setstack.setCount((int) (itemstackiterator.getCount() + (new Object() {
													public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
														AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
														BlockEntity _ent = world.getBlockEntity(pos);
														if (_ent != null)
															_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
														return _retval.get();
													}
												}.getItemStack(world, BlockPos.containing(x, y, z), (int) i)).getCount()));
												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
													if (capability instanceof IItemHandlerModifiable)
														((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
												});
											}
										}
										{
											final int _slotid = (int) i;
											final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
											_setstack.setCount(1);
											foundEntity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
												if (capability instanceof IItemHandlerModifiable _modHandlerEntSetSlot)
													_modHandlerEntSetSlot.setStackInSlot(_slotid, _setstack);
											});
										}
										breakLoop = true;
										break;
									}
									i = i + 1;
								}
							}
							i = i + 1;
							if (breakLoop) {
								break;
							}
						}
					}
				}
			}
		}
	}
}
