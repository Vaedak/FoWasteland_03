package net.mcreator.falloutwastelands.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.falloutwastelands.init.FalloutWastelandsModItems;

import java.util.List;
import java.util.Comparator;

public class FrameInitialSpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		SpawnInvisibleArmorStandProcedure.execute(world, x, y, z);
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof ArmorStand) {
					if (entity.getX() == entityiterator.getX() && entity.getY() == entityiterator.getY() && entity.getZ() == entityiterator.getZ()) {
						if (!world.isClientSide() && world.getServer() != null)
							world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("found frame"), false);
						entityiterator.startRiding(entity);
						if (entity.isVehicle()) {
							if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
								{
									Entity _entity = entityiterator;
									if (_entity instanceof Player _player) {
										_player.getInventory().armor.set(3, new ItemStack(FalloutWastelandsModItems.POWER_ARMOR_FRAME_ARMOR_HELMET.get()));
										_player.getInventory().setChanged();
									} else if (_entity instanceof LivingEntity _living) {
										_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(FalloutWastelandsModItems.POWER_ARMOR_FRAME_ARMOR_HELMET.get()));
									}
								}
							}
							if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
								{
									Entity _entity = entityiterator;
									if (_entity instanceof Player _player) {
										_player.getInventory().armor.set(2, new ItemStack(FalloutWastelandsModItems.POWER_ARMOR_FRAME_ARMOR_CHESTPLATE.get()));
										_player.getInventory().setChanged();
									} else if (_entity instanceof LivingEntity _living) {
										_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(FalloutWastelandsModItems.POWER_ARMOR_FRAME_ARMOR_CHESTPLATE.get()));
									}
								}
							}
							if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
								{
									Entity _entity = entityiterator;
									if (_entity instanceof Player _player) {
										_player.getInventory().armor.set(1, new ItemStack(FalloutWastelandsModItems.POWER_ARMOR_FRAME_ARMOR_LEGGINGS.get()));
										_player.getInventory().setChanged();
									} else if (_entity instanceof LivingEntity _living) {
										_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(FalloutWastelandsModItems.POWER_ARMOR_FRAME_ARMOR_LEGGINGS.get()));
									}
								}
							}
							if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
								{
									Entity _entity = entityiterator;
									if (_entity instanceof Player _player) {
										_player.getInventory().armor.set(0, new ItemStack(FalloutWastelandsModItems.POWER_ARMOR_FRAME_ARMOR_BOOTS.get()));
										_player.getInventory().setChanged();
									} else if (_entity instanceof LivingEntity _living) {
										_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(FalloutWastelandsModItems.POWER_ARMOR_FRAME_ARMOR_BOOTS.get()));
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
