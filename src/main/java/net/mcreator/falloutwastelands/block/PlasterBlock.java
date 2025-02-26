
package net.mcreator.falloutwastelands.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class PlasterBlock extends Block {
	public PlasterBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.GRAVEL).strength(0.75f, 3.5f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}