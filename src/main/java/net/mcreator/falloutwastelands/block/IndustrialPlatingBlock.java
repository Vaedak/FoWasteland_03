
package net.mcreator.falloutwastelands.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class IndustrialPlatingBlock extends Block {
	public IndustrialPlatingBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(1.2f, 6f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}