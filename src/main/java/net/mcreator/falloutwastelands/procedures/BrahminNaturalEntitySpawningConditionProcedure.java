package net.mcreator.falloutwastelands.procedures;

import net.minecraftforge.eventbus.api.Event;

public class BrahminNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == FalloutWastelandsModBlocks.WASTELANDBURNTGRASS.get()
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == FalloutWastelandsModBlocks.WASTELANDBURNTGRASS.get()) {
			return true;
		}
		return false;
	}
}
