
package net.mcreator.falloutwastelands.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class TinBlockBlock extends Block {
	public TinBlockBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(4.5f, 5f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}