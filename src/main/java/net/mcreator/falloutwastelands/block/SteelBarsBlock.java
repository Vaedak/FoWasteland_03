
package net.mcreator.falloutwastelands.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class SteelBarsBlock extends IronBarsBlock {
	public SteelBarsBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(4.95f, 6.5f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}
}