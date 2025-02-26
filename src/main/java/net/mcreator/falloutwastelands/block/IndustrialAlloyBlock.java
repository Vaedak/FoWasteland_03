
package net.mcreator.falloutwastelands.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class IndustrialAlloyBlock extends Block {
	public IndustrialAlloyBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(4.6f, 3.5f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}