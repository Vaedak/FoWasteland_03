
package net.mcreator.falloutwastelands.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class BosMetalStairsBlock extends StairBlock {
	public BosMetalStairsBlock() {
		super(() -> Blocks.AIR.defaultBlockState(), BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(5f, 7f).requiresCorrectToolForDrops());
	}

	@Override
	public float getExplosionResistance() {
		return 7f;
	}

	@Override
	public boolean isRandomlyTicking(BlockState state) {
		return false;
	}
}