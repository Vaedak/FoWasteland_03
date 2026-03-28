package net.mcreator.falloutwastelands.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.falloutwastelands.init.FalloutWastelandsModEntities;

public class RaidControllerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double enemyCount = 0;
		double enemyType = 0;
		double i = 0;
		double spawnOffset = 0;
		if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "raidCounter") > 0) {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("raidCounter", ((new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getPersistentData().getDouble(tag);
							return -1;
						}
					}.getValue(world, BlockPos.containing(x, y, z), "raidCounter")) - 1));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		} else {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("raidCounter", 100);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (Math.random() > 0.5) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7c\u00A7lBase Being Raided!"), true);
				enemyCount = (new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getDouble(tag);
						return -1;
					}
				}.getValue(world, BlockPos.containing(x, y, z), "baseTier")) * 2;
				enemyType = Math.round(Mth.nextInt(RandomSource.create(), 1, 4));
				spawnOffset = new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getDouble(tag);
						return -1;
					}
				}.getValue(world, BlockPos.containing(x, y, z), "zoneSize");
				i = 0;
				if (enemyType == 1) {
					while (i < enemyCount) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = FalloutWastelandsModEntities.CANNIBAL_00.get().spawn(_level, BlockPos.containing(x + spawnOffset, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
						i = i + 1;
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = FalloutWastelandsModEntities.CANNIBAL_01.get().spawn(_level, BlockPos.containing(x + spawnOffset, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
						i = i + 1;
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = FalloutWastelandsModEntities.CANNIBAL_02.get().spawn(_level, BlockPos.containing(x + spawnOffset, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
						i = i + 1;
					}
				}
				if (enemyType == 2) {
					while (i < enemyCount) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = FalloutWastelandsModEntities.BLASTMASTER_RAIDER.get().spawn(_level, BlockPos.containing(x + spawnOffset, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
						i = i + 1;
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = FalloutWastelandsModEntities.RAIDER_DUSTWALKER.get().spawn(_level, BlockPos.containing(x + spawnOffset, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
						i = i + 1;
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = FalloutWastelandsModEntities.RAIDERSCAVANGER.get().spawn(_level, BlockPos.containing(x + spawnOffset, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
						i = i + 1;
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = FalloutWastelandsModEntities.POWER_ARMORED_RAIDER.get().spawn(_level, BlockPos.containing(x + spawnOffset, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
						i = i + 1;
					}
				}
				if (enemyType == 3) {
					while (i < enemyCount) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = FalloutWastelandsModEntities.FLOATER.get().spawn(_level, BlockPos.containing(x + spawnOffset, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
						i = i + 1;
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = FalloutWastelandsModEntities.FERAL_GHOUL.get().spawn(_level, BlockPos.containing(x + spawnOffset, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
						i = i + 1;
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = FalloutWastelandsModEntities.SPIDERFLOATER.get().spawn(_level, BlockPos.containing(x + spawnOffset, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
						i = i + 1;
					}
				}
				if (enemyType == 4) {
					while (i < enemyCount) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = FalloutWastelandsModEntities.RADROACH.get().spawn(_level, BlockPos.containing(x + spawnOffset, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
						i = i + 1;
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = FalloutWastelandsModEntities.RADROACH.get().spawn(_level, BlockPos.containing(x + spawnOffset, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
						i = i + 1;
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = FalloutWastelandsModEntities.RADROACH.get().spawn(_level, BlockPos.containing(x + spawnOffset, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
						i = i + 1;
					}
				}
			}
		}
	}
}
