
package net.mcreator.falloutwastelands.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class GreyIndustrialWalkwayStairsBlock extends StairBlock {
	public GreyIndustrialWalkwayStairsBlock() {
		super(() -> Blocks.AIR.defaultBlockState(), BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(4.6f, 3.5f).requiresCorrectToolForDrops());
	}

	@Override
	public float getExplosionResistance() {
		return 3.5f;
	}

	@Override
	public boolean isRandomlyTicking(BlockState state) {
		return false;
	}
}