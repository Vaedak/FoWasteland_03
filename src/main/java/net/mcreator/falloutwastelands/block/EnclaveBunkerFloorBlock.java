
package net.mcreator.falloutwastelands.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class EnclaveBunkerFloorBlock extends Block {
	public EnclaveBunkerFloorBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(5.2f, 7.5f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}