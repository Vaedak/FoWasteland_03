
package net.mcreator.falloutwastelands.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class SandbagsBlock extends Block {
	public SandbagsBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.SAND).strength(1.5f, 4f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}