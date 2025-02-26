
package net.mcreator.falloutwastelands.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class SteelPoleBlock extends Block {
	public SteelPoleBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(0.55f, 8f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}