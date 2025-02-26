
package net.mcreator.falloutwastelands.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class LeadBlockBlock extends Block {
	public LeadBlockBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(5.55f, 7.5f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}