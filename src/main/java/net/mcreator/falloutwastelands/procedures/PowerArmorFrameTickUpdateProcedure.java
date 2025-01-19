package net.mcreator.falloutwastelands.procedures;

import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.falloutwastelands.init.FalloutWastelandsModMobEffects;

import java.util.concurrent.atomic.AtomicReference;

public class PowerArmorFrameTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.isVehicle()) {
			if ((entity.getFirstPassenger()) instanceof ArmorStand) {
				{
					Entity _ent = (entity.getFirstPassenger());
					_ent.setYRot(entity.getYRot());
					_ent.setXRot(0);
					_ent.setYBodyRot(_ent.getYRot());
					_ent.setYHeadRot(_ent.getYRot());
					_ent.yRotO = _ent.getYRot();
					_ent.xRotO = _ent.getXRot();
					if (_ent instanceof LivingEntity _entity) {
						_entity.yBodyRotO = _entity.getYRot();
						_entity.yHeadRotO = _entity.getYRot();
					}
				}
				if ((entity.getFirstPassenger()) instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(FalloutWastelandsModMobEffects.DELETE_ARMOR_STAND_IF_NOT_RIDING.get(), 20, 1, false, false));
				if (entity.getPersistentData().getBoolean("displayArmor") == true) {
					if (((entity.getFirstPassenger()) instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("fallout_wastelands_:pa_frame"))) == true) {
						{
							Entity _entity = (entity.getFirstPassenger());
							if (_entity instanceof Player _player) {
								_player.getInventory().armor.set(3, (new Object() {
									public ItemStack getItemStack(int sltid, Entity entity) {
										AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
										entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
											_retval.set(capability.getStackInSlot(sltid).copy());
										});
										return _retval.get();
									}
								}.getItemStack(3, entity)));
								_player.getInventory().setChanged();
							} else if (_entity instanceof LivingEntity _living) {
								_living.setItemSlot(EquipmentSlot.HEAD, (new Object() {
									public ItemStack getItemStack(int sltid, Entity entity) {
										AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
										entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
											_retval.set(capability.getStackInSlot(sltid).copy());
										});
										return _retval.get();
									}
								}.getItemStack(3, entity)));
							}
						}
					}
					if (((entity.getFirstPassenger()) instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("fallout_wastelands_:pa_frame"))) == true) {
						{
							Entity _entity = (entity.getFirstPassenger());
							if (_entity instanceof Player _player) {
								_player.getInventory().armor.set(2, (new Object() {
									public ItemStack getItemStack(int sltid, Entity entity) {
										AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
										entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
											_retval.set(capability.getStackInSlot(sltid).copy());
										});
										return _retval.get();
									}
								}.getItemStack(2, entity)));
								_player.getInventory().setChanged();
							} else if (_entity instanceof LivingEntity _living) {
								_living.setItemSlot(EquipmentSlot.CHEST, (new Object() {
									public ItemStack getItemStack(int sltid, Entity entity) {
										AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
										entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
											_retval.set(capability.getStackInSlot(sltid).copy());
										});
										return _retval.get();
									}
								}.getItemStack(2, entity)));
							}
						}
					}
					if (((entity.getFirstPassenger()) instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("fallout_wastelands_:pa_frame"))) == true) {
						{
							Entity _entity = (entity.getFirstPassenger());
							if (_entity instanceof Player _player) {
								_player.getInventory().armor.set(1, (new Object() {
									public ItemStack getItemStack(int sltid, Entity entity) {
										AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
										entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
											_retval.set(capability.getStackInSlot(sltid).copy());
										});
										return _retval.get();
									}
								}.getItemStack(1, entity)));
								_player.getInventory().setChanged();
							} else if (_entity instanceof LivingEntity _living) {
								_living.setItemSlot(EquipmentSlot.LEGS, (new Object() {
									public ItemStack getItemStack(int sltid, Entity entity) {
										AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
										entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
											_retval.set(capability.getStackInSlot(sltid).copy());
										});
										return _retval.get();
									}
								}.getItemStack(1, entity)));
							}
						}
					}
					if (((entity.getFirstPassenger()) instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("fallout_wastelands_:pa_frame"))) == true) {
						{
							Entity _entity = (entity.getFirstPassenger());
							if (_entity instanceof Player _player) {
								_player.getInventory().armor.set(0, (new Object() {
									public ItemStack getItemStack(int sltid, Entity entity) {
										AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
										entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
											_retval.set(capability.getStackInSlot(sltid).copy());
										});
										return _retval.get();
									}
								}.getItemStack(0, entity)));
								_player.getInventory().setChanged();
							} else if (_entity instanceof LivingEntity _living) {
								_living.setItemSlot(EquipmentSlot.FEET, (new Object() {
									public ItemStack getItemStack(int sltid, Entity entity) {
										AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
										entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
											_retval.set(capability.getStackInSlot(sltid).copy());
										});
										return _retval.get();
									}
								}.getItemStack(0, entity)));
							}
						}
					}
					entity.getPersistentData().putBoolean("displayArmor", false);
				}
			}
		} else {
			FrameInitialSpawnProcedure.execute(world, x, y, z, entity);
		}
	}
}
