
package net.mcreator.falloutwastelands.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class GoreBlock extends Block {
	public GoreBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.MUD).strength(1.2f, 1f).friction(0.8f).speedFactor(0.8f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}