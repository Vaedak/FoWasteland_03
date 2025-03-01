
package net.mcreator.falloutwastelands.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class UtsolBlock extends Block {
	public UtsolBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.MUD).strength(1.2f, 1f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}