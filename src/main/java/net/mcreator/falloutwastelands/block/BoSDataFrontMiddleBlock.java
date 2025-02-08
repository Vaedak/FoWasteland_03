
package net.mcreator.falloutwastelands.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class BoSDataFrontMiddleBlock extends Block {
	public BoSDataFrontMiddleBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(5f, 7f).lightLevel(s -> 8).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}