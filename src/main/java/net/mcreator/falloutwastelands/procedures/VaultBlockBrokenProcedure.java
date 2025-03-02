package net.mcreator.falloutwastelands.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.level.BlockEvent;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.falloutwastelands.init.FalloutWastelandsModBlocks;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class VaultBlockBrokenProcedure {
	@SubscribeEvent
	public static void onBlockBreak(BlockEvent.BreakEvent event) {
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getState());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		execute(null, world, x, y, z, blockstate);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		double zDirection = 0;
		double xDirection = 0;
		if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("fallout_wastelands_:vaultdoorblock")))) {
			if ((new Object() {
				public Direction getDirection(BlockState _bs) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp)
						return _bs.getValue(_dp);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
				}
			}.getDirection(blockstate)) == Direction.NORTH) {
				xDirection = 1;
			}
			if ((new Object() {
				public Direction getDirection(BlockState _bs) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp)
						return _bs.getValue(_dp);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
				}
			}.getDirection(blockstate)) == Direction.SOUTH) {
				xDirection = -1;
			}
			if ((new Object() {
				public Direction getDirection(BlockState _bs) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp)
						return _bs.getValue(_dp);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
				}
			}.getDirection(blockstate)) == Direction.WEST) {
				zDirection = -1;
			}
			if ((new Object() {
				public Direction getDirection(BlockState _bs) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp)
						return _bs.getValue(_dp);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
				}
			}.getDirection(blockstate)) == Direction.EAST) {
				zDirection = 1;
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == FalloutWastelandsModBlocks.VAULT_DOOR_SEALED.get()) {
				world.setBlock(BlockPos.containing(x + xDirection * (-1), y, z + zDirection * (-1)), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x + xDirection * (-1), y + 1, z + zDirection * (-1)), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(FalloutWastelandsModBlocks.VAULT_DOOR_SEALED.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == FalloutWastelandsModBlocks.VAULT_DOOR_OPEN.get()) {
				world.setBlock(BlockPos.containing(x + xDirection * (-1), y, z + zDirection * (-1)), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x + xDirection * (-1), y + 1, z + zDirection * (-1)), Blocks.AIR.defaultBlockState(), 3);
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(FalloutWastelandsModBlocks.VAULT_DOOR_SEALED.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == FalloutWastelandsModBlocks.VAULT_DOOR_TOP.get()) {
				world.setBlock(BlockPos.containing(x + xDirection * (-1), y, z + zDirection * (-1)), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x + xDirection * (-1), y - 1, z + zDirection * (-1)), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x, y - 1, z), Blocks.AIR.defaultBlockState(), 3);
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(FalloutWastelandsModBlocks.VAULT_DOOR_SEALED.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == FalloutWastelandsModBlocks.VAULT_DOOR_TOP_RIGHT.get()) {
				world.setBlock(BlockPos.containing(x + xDirection, y, z + zDirection), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x + xDirection, y - 1, z + zDirection), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x, y - 1, z), Blocks.AIR.defaultBlockState(), 3);
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(FalloutWastelandsModBlocks.VAULT_DOOR_SEALED.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == FalloutWastelandsModBlocks.VAULT_DOOR_BOTTOM_RIGHT.get()) {
				world.setBlock(BlockPos.containing(x + xDirection, y, z + zDirection), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x + xDirection, y + 1, z + zDirection), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(FalloutWastelandsModBlocks.VAULT_DOOR_SEALED.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
	}
}
