
package net.mcreator.falloutwastelands.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class MoltenBoxiteBlock extends Block {
	public MoltenBoxiteBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(1.05f, 4.5f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}