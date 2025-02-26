
package net.mcreator.falloutwastelands.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class ScaffoldingWalkwayStairsBlock extends StairBlock {
	public ScaffoldingWalkwayStairsBlock() {
		super(() -> Blocks.AIR.defaultBlockState(), BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(1.5f, 3.5f).speedFactor(1.2f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
	}

	@Override
	public float getExplosionResistance() {
		return 3.5f;
	}

	@Override
	public boolean isRandomlyTicking(BlockState state) {
		return false;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 5;
	}
}