package net.mcreator.falloutwastelands.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.falloutwastelands.init.FalloutWastelandsModBlocks;

public class WastelandGrassTurnToDirtProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z)).getLightBlock(world, BlockPos.containing(x, y + 1, z)) == 0 || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.WATER
				|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.WATER) == false) {
			world.setBlock(BlockPos.containing(x, y, z), FalloutWastelandsModBlocks.WASTELAND_DIRT.get().defaultBlockState(), 3);
		}
	}
}
