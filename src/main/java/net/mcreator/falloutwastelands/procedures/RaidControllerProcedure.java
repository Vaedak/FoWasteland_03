package net.mcreator.falloutwastelands.procedures;

import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.falloutwastelands.init.FalloutWastelandsModEntities;

import java.util.concurrent.atomic.AtomicReference;

public class RaidControllerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double enemyCount = 0;
		double enemyType = 0;
		double i = 0;
		double spawnOffset = 0;
		double spawnOffsetZ = 0;
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
					_blockEntity.getPersistentData().putDouble("raidCounter", 500);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (Math.random() > 0.5) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							("title " + (((new Object() {
								public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
									AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null)
										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
									return _retval.get();
								}
							}.getItemStack(world, BlockPos.containing(x, y, z), 196)).getDisplayName().getString() + "" + " actionbar {\"text\":\"Your B.A.S.E is Being Raided!\",\"color\":\"red\",\"bold\":true}").replace("[", "")).replace("]", "")));
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
				}.getValue(world, BlockPos.containing(x, y, z), "zoneSize") + Mth.nextInt(RandomSource.create(), -5, 5);
				spawnOffsetZ = Mth.nextInt(RandomSource.create(), (int) ((new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getDouble(tag);
						return -1;
					}
				}.getValue(world, BlockPos.containing(x, y, z), "zoneSize")) * (-1)), (int) (new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getDouble(tag);
						return -1;
					}
				}.getValue(world, BlockPos.containing(x, y, z), "zoneSize")));
				i = 0;
				if (enemyType == 1) {
					while (i < enemyCount) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = FalloutWastelandsModEntities.CANNIBAL_00.get().spawn(_level, BlockPos.containing(x + spawnOffset, y, z + spawnOffsetZ), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
						i = i + 1;
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = FalloutWastelandsModEntities.CANNIBAL_01.get().spawn(_level, BlockPos.containing(x + spawnOffset, y, z + spawnOffsetZ), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
						i = i + 1;
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = FalloutWastelandsModEntities.CANNIBAL_02.get().spawn(_level, BlockPos.containing(x + spawnOffset, y, z + spawnOffsetZ), MobSpawnType.MOB_SUMMONED);
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
							Entity entityToSpawn = FalloutWastelandsModEntities.BLASTMASTER_RAIDER.get().spawn(_level, BlockPos.containing(x + spawnOffset, y, z + spawnOffsetZ), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
						i = i + 1;
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = FalloutWastelandsModEntities.RAIDER_DUSTWALKER.get().spawn(_level, BlockPos.containing(x + spawnOffset, y, z + spawnOffsetZ), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
						i = i + 1;
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = FalloutWastelandsModEntities.RAIDERSCAVANGER.get().spawn(_level, BlockPos.containing(x + spawnOffset, y, z + spawnOffsetZ), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
						i = i + 1;
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = FalloutWastelandsModEntities.POWER_ARMORED_RAIDER.get().spawn(_level, BlockPos.containing(x + spawnOffset, y, z + spawnOffsetZ), MobSpawnType.MOB_SUMMONED);
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
							Entity entityToSpawn = FalloutWastelandsModEntities.FLOATER.get().spawn(_level, BlockPos.containing(x + spawnOffset, y, z + spawnOffsetZ), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
						i = i + 1;
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = FalloutWastelandsModEntities.FERAL_GHOUL.get().spawn(_level, BlockPos.containing(x + spawnOffset, y, z + spawnOffsetZ), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
						i = i + 1;
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = FalloutWastelandsModEntities.SPIDERFLOATER.get().spawn(_level, BlockPos.containing(x + spawnOffset, y, z + spawnOffsetZ), MobSpawnType.MOB_SUMMONED);
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
							Entity entityToSpawn = FalloutWastelandsModEntities.RADROACH.get().spawn(_level, BlockPos.containing(x + spawnOffset, y, z + spawnOffsetZ), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
						i = i + 1;
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = FalloutWastelandsModEntities.RADROACH.get().spawn(_level, BlockPos.containing(x + spawnOffset, y, z + spawnOffsetZ), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
						i = i + 1;
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = FalloutWastelandsModEntities.RADROACH.get().spawn(_level, BlockPos.containing(x + spawnOffset, y, z + spawnOffsetZ), MobSpawnType.MOB_SUMMONED);
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
