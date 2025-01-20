package net.mcreator.falloutwastelands.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.falloutwastelands.init.FalloutWastelandsModItems;

public class ReplacepaFramesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		ItemStack removeItem = ItemStack.EMPTY;
		if (((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) == true) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(FalloutWastelandsModItems.POWER_ARMOR_FRAME_ARMOR_HELMET.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 5, _player.inventoryMenu.getCraftSlots());
			}
			{
				Entity _entity = entity;
				if (_entity instanceof Player _player) {
					_player.getInventory().armor.set(3, new ItemStack(FalloutWastelandsModItems.POWER_ARMOR_FRAME_ARMOR_HELMET.get()));
					_player.getInventory().setChanged();
				} else if (_entity instanceof LivingEntity _living) {
					_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(FalloutWastelandsModItems.POWER_ARMOR_FRAME_ARMOR_HELMET.get()));
				}
			}
		} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("fallout_wastelands_:pa_frame"))) == false) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(FalloutWastelandsModItems.POWER_ARMOR_FRAME_ARMOR_HELMET.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 5, _player.inventoryMenu.getCraftSlots());
			}
			if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("fallout_wastelands_:pa_helmet"))) == false) {
				removeItem = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY);
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(FalloutWastelandsModItems.POWER_ARMOR_FRAME_ARMOR_HELMET.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 5, _player.inventoryMenu.getCraftSlots());
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(3, new ItemStack(FalloutWastelandsModItems.POWER_ARMOR_FRAME_ARMOR_HELMET.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(FalloutWastelandsModItems.POWER_ARMOR_FRAME_ARMOR_HELMET.get()));
					}
				}
				if (!(removeItem.getItem() == Blocks.AIR.asItem())) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = removeItem;
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, (y + 1), z, removeItem);
						entityToSpawn.setPickUpDelay(20);
						entityToSpawn.setUnlimitedLifetime();
						_level.addFreshEntity(entityToSpawn);
					}
					removeItem = new ItemStack(Blocks.AIR);
				}
			}
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(FalloutWastelandsModItems.POWER_ARMOR_FRAME_ARMOR_CHESTPLATE.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 2, _player.inventoryMenu.getCraftSlots());
			}
			{
				Entity _entity = entity;
				if (_entity instanceof Player _player) {
					_player.getInventory().armor.set(2, new ItemStack(FalloutWastelandsModItems.POWER_ARMOR_FRAME_ARMOR_CHESTPLATE.get()));
					_player.getInventory().setChanged();
				} else if (_entity instanceof LivingEntity _living) {
					_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(FalloutWastelandsModItems.POWER_ARMOR_FRAME_ARMOR_CHESTPLATE.get()));
				}
			}
		} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("fallout_wastelands_:pa_frame"))) == false) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(FalloutWastelandsModItems.POWER_ARMOR_FRAME_ARMOR_CHESTPLATE.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 2, _player.inventoryMenu.getCraftSlots());
			}
			if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("fallout_wastelands_:pa_chestplate"))) == false) {
				removeItem = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY);
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(FalloutWastelandsModItems.POWER_ARMOR_FRAME_ARMOR_CHESTPLATE.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 5, _player.inventoryMenu.getCraftSlots());
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(2, new ItemStack(FalloutWastelandsModItems.POWER_ARMOR_FRAME_ARMOR_CHESTPLATE.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(FalloutWastelandsModItems.POWER_ARMOR_FRAME_ARMOR_CHESTPLATE.get()));
					}
				}
				if (!(removeItem.getItem() == Blocks.AIR.asItem())) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = removeItem;
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, (y + 1), z, removeItem);
						entityToSpawn.setPickUpDelay(20);
						entityToSpawn.setUnlimitedLifetime();
						_level.addFreshEntity(entityToSpawn);
					}
					removeItem = new ItemStack(Blocks.AIR);
				}
			}
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(FalloutWastelandsModItems.POWER_ARMOR_FRAME_ARMOR_LEGGINGS.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 2, _player.inventoryMenu.getCraftSlots());
			}
			{
				Entity _entity = entity;
				if (_entity instanceof Player _player) {
					_player.getInventory().armor.set(1, new ItemStack(FalloutWastelandsModItems.POWER_ARMOR_FRAME_ARMOR_LEGGINGS.get()));
					_player.getInventory().setChanged();
				} else if (_entity instanceof LivingEntity _living) {
					_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(FalloutWastelandsModItems.POWER_ARMOR_FRAME_ARMOR_LEGGINGS.get()));
				}
			}
		} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("fallout_wastelands_:pa_frame"))) == false) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(FalloutWastelandsModItems.POWER_ARMOR_FRAME_ARMOR_LEGGINGS.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("fallout_wastelands_:pa_leggings"))) == false) {
				removeItem = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY);
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(FalloutWastelandsModItems.POWER_ARMOR_FRAME_ARMOR_LEGGINGS.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 5, _player.inventoryMenu.getCraftSlots());
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(1, new ItemStack(FalloutWastelandsModItems.POWER_ARMOR_FRAME_ARMOR_LEGGINGS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(FalloutWastelandsModItems.POWER_ARMOR_FRAME_ARMOR_LEGGINGS.get()));
					}
				}
				if (!(removeItem.getItem() == Blocks.AIR.asItem())) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = removeItem;
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, (y + 1), z, removeItem);
						entityToSpawn.setPickUpDelay(20);
						entityToSpawn.setUnlimitedLifetime();
						_level.addFreshEntity(entityToSpawn);
					}
					removeItem = new ItemStack(Blocks.AIR);
				}
			}
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(FalloutWastelandsModItems.POWER_ARMOR_FRAME_ARMOR_BOOTS.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			{
				Entity _entity = entity;
				if (_entity instanceof Player _player) {
					_player.getInventory().armor.set(0, new ItemStack(FalloutWastelandsModItems.POWER_ARMOR_FRAME_ARMOR_BOOTS.get()));
					_player.getInventory().setChanged();
				} else if (_entity instanceof LivingEntity _living) {
					_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(FalloutWastelandsModItems.POWER_ARMOR_FRAME_ARMOR_BOOTS.get()));
				}
			}
		} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("fallout_wastelands_:pa_frame"))) == false) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(FalloutWastelandsModItems.POWER_ARMOR_FRAME_ARMOR_BOOTS.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("fallout_wastelands_:pa_boots"))) == false) {
				removeItem = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY);
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(FalloutWastelandsModItems.POWER_ARMOR_FRAME_ARMOR_BOOTS.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 5, _player.inventoryMenu.getCraftSlots());
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(0, new ItemStack(FalloutWastelandsModItems.POWER_ARMOR_FRAME_ARMOR_BOOTS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(FalloutWastelandsModItems.POWER_ARMOR_FRAME_ARMOR_BOOTS.get()));
					}
				}
				if (!(removeItem.getItem() == Blocks.AIR.asItem())) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = removeItem;
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, (y + 1), z, removeItem);
						entityToSpawn.setPickUpDelay(20);
						entityToSpawn.setUnlimitedLifetime();
						_level.addFreshEntity(entityToSpawn);
					}
					removeItem = new ItemStack(Blocks.AIR);
				}
			}
		}
	}
}
