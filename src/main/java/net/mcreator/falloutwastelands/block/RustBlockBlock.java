
package net.mcreator.falloutwastelands.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class RustBlockBlock extends Block {
	public RustBlockBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.CALCITE).strength(0.25f, 4f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}