
package net.mcreator.falloutwastelands.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class MilitaryMetalHazardBlock extends Block {
	public MilitaryMetalHazardBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(0.65f, 9f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}