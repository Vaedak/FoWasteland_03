
package net.mcreator.falloutwastelands.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class WirefenceBlock extends IronBarsBlock {
	public WirefenceBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(3.5f, 6f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}
}