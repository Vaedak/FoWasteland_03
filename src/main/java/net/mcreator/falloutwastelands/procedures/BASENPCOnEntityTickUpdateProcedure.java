package net.mcreator.falloutwastelands.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.falloutwastelands.init.FalloutWastelandsModMobEffects;
import net.mcreator.falloutwastelands.init.FalloutWastelandsModItems;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.List;
import java.util.Comparator;

public class BASENPCOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double destroyRange = 0;
		double detectRange = 0;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(FalloutWastelandsModMobEffects.IN_BASE.get())) {
			if (!(entity.getPersistentData().getString("assignedBASE")).equals((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
					return _retval.get();
				}
			}.getItemStack(world, BlockPos.containing(entity.getPersistentData().getDouble("basePosX"), entity.getPersistentData().getDouble("basePosY"), entity.getPersistentData().getDouble("basePosZ")), 201)).getDisplayName().getString())) {
				{
					BlockEntity _ent = world.getBlockEntity(BlockPos.containing(entity.getPersistentData().getDouble("basePosX"), entity.getPersistentData().getDouble("basePosY"), entity.getPersistentData().getDouble("basePosZ")));
					if (_ent != null) {
						final int _slotid = 199;
						final ItemStack _setstack = new ItemStack(FalloutWastelandsModItems.POPULATION_ICON.get()).copy();
						_setstack.setCount((int) (1 + new Object() {
							public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
								AtomicInteger _retval = new AtomicInteger(0);
								BlockEntity _ent = world.getBlockEntity(pos);
								if (_ent != null)
									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
								return _retval.get();
							}
						}.getAmount(world, BlockPos.containing(entity.getPersistentData().getDouble("basePosX"), entity.getPersistentData().getDouble("basePosY"), entity.getPersistentData().getDouble("basePosZ")), 199)));
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
						});
					}
				}
				entity.getPersistentData().putString("assignedBASE", ((new Object() {
					public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
						return _retval.get();
					}
				}.getItemStack(world, BlockPos.containing(entity.getPersistentData().getDouble("basePosX"), entity.getPersistentData().getDouble("basePosY"), entity.getPersistentData().getDouble("basePosZ")), 201)).getDisplayName().getString()));
			}
		} else {
			if ((entity.getPersistentData().getString("assignedBASE")).equals((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
					return _retval.get();
				}
			}.getItemStack(world, BlockPos.containing(entity.getPersistentData().getDouble("basePosX"), entity.getPersistentData().getDouble("basePosY"), entity.getPersistentData().getDouble("basePosZ")), 201)).getDisplayName().getString())) {
				if (entity instanceof Mob _entity)
					_entity.getNavigation().moveTo((entity.getPersistentData().getDouble("basePosX")), (entity.getPersistentData().getDouble("basePosY")), (entity.getPersistentData().getDouble("basePosZ")), 1);
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof Mob _entity)
						_entity.getNavigation().moveTo(x, y, z, 1);
				}
			}
		}
		if (entity.getPersistentData().getBoolean("farmer")) {
			FarmerAIProcedure.execute(world, x, y, z, entity);
		}
		if (entity.getPersistentData().getBoolean("defense")) {
			DefenseAIProcedure.execute(world, x, y, z, entity);
		}
	}
}
