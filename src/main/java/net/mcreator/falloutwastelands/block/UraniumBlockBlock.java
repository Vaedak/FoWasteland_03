
package net.mcreator.falloutwastelands.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class UraniumBlockBlock extends Block {
	public UraniumBlockBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(8f, 20f).lightLevel(s -> 2).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}