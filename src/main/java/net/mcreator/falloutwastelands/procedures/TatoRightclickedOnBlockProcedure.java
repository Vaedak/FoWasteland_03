package net.mcreator.falloutwastelands.procedures;

import net.minecraftforge.eventbus.api.Event;

public class TatoRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR) {
			world.setBlock(BlockPos.containing(x, y + 1, z), FalloutWastelandsModBlocks.TATOPLANT_0.get().defaultBlockState(), 3);
		}
	}
}
