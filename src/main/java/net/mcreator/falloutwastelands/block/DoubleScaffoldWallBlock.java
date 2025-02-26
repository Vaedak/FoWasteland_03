
package net.mcreator.falloutwastelands.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class DoubleScaffoldWallBlock extends WallBlock {
	public DoubleScaffoldWallBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(1.5f, 3.5f).speedFactor(1.2f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false).forceSolidOn());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 5;
	}
}