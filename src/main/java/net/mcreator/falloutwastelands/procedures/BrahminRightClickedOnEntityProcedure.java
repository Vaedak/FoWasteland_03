package net.mcreator.falloutwastelands.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.falloutwastelands.init.FalloutWastelandsModItems;
import net.mcreator.falloutwastelands.entity.BrahminEntity;
import net.mcreator.falloutwastelands.FalloutWastelandsMod;

public class BrahminRightClickedOnEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if ((entity instanceof BrahminEntity _datEntI ? _datEntI.getEntityData().get(BrahminEntity.DATA_breedCooldown) : 0) <= 0) {
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == FalloutWastelandsModItems.CORN.get()) {
				if (sourceentity instanceof Player _player) {
					ItemStack _stktoremove = (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.horse.eat")), SoundSource.NEUTRAL, (float) 0.6, (float) 0.7);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.horse.eat")), SoundSource.NEUTRAL, (float) 0.6, (float) 0.7, false);
					}
				}
				if (entity instanceof BrahminEntity _datEntSetL)
					_datEntSetL.getEntityData().set(BrahminEntity.DATA_breedingActive, true);
				FalloutWastelandsMod.queueServerWork(350, () -> {
					if (entity instanceof BrahminEntity _datEntSetL)
						_datEntSetL.getEntityData().set(BrahminEntity.DATA_breedingActive, false);
				});
			}
		}
	}
}
