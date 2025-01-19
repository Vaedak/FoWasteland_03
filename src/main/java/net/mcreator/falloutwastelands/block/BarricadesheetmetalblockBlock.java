
package net.mcreator.falloutwastelands.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.SoundType;

public class BarricadesheetmetalblockBlock extends WallBlock {
	public BarricadesheetmetalblockBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(0.8f, 6f).requiresCorrectToolForDrops().forceSolidOn());
	}
}
