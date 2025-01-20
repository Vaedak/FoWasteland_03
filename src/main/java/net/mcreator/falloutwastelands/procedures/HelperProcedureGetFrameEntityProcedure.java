package net.mcreator.falloutwastelands.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;

import net.mcreator.falloutwastelands.network.FalloutWastelandsModVariables;
import net.mcreator.falloutwastelands.init.FalloutWastelandsModEntities;
import net.mcreator.falloutwastelands.entity.PADisplayEntityEntity;

import java.util.List;
import java.util.Comparator;

public class HelperProcedureGetFrameEntityProcedure {
	public static Entity execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return null;
		Entity displayEntity = null;
		Entity armorStand = null;
		{
			final Vec3 _center = new Vec3(((entity.getCapability(FalloutWastelandsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FalloutWastelandsModVariables.PlayerVariables())).paFrameXcord),
					((entity.getCapability(FalloutWastelandsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FalloutWastelandsModVariables.PlayerVariables())).paFrameYcord),
					((entity.getCapability(FalloutWastelandsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FalloutWastelandsModVariables.PlayerVariables())).paFrameZcord));
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof ArmorStand) {
					armorStand = entityiterator;
					displayEntity = world instanceof Level _level ? new PADisplayEntityEntity(FalloutWastelandsModEntities.PA_DISPLAY_ENTITY.get(), _level) : null;
				}
			}
		}
		{
			Entity _entity = displayEntity;
			if (_entity instanceof Player _player) {
				_player.getInventory().armor.set(3, (armorStand instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY));
				_player.getInventory().setChanged();
			} else if (_entity instanceof LivingEntity _living) {
				_living.setItemSlot(EquipmentSlot.HEAD, (armorStand instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY));
			}
		}
		{
			Entity _entity = displayEntity;
			if (_entity instanceof Player _player) {
				_player.getInventory().armor.set(2, (armorStand instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY));
				_player.getInventory().setChanged();
			} else if (_entity instanceof LivingEntity _living) {
				_living.setItemSlot(EquipmentSlot.CHEST, (armorStand instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY));
			}
		}
		{
			Entity _entity = displayEntity;
			if (_entity instanceof Player _player) {
				_player.getInventory().armor.set(1, (armorStand instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY));
				_player.getInventory().setChanged();
			} else if (_entity instanceof LivingEntity _living) {
				_living.setItemSlot(EquipmentSlot.LEGS, (armorStand instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY));
			}
		}
		{
			Entity _entity = displayEntity;
			if (_entity instanceof Player _player) {
				_player.getInventory().armor.set(0, (armorStand instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY));
				_player.getInventory().setChanged();
			} else if (_entity instanceof LivingEntity _living) {
				_living.setItemSlot(EquipmentSlot.FEET, (armorStand instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY));
			}
		}
		return displayEntity;
	}
}
