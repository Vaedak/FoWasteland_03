
package net.mcreator.falloutwastelands.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class MeltedSteelBlockBlock extends Block {
	public MeltedSteelBlockBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.COPPER).strength(0.5f, 5f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}