
package net.mcreator.falloutwastelands.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class VaultWallExposedBlock extends Block {
	public VaultWallExposedBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(5.7f, 8f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}