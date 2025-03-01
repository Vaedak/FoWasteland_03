
package net.mcreator.falloutwastelands.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class MilitaryplatingstairsBlock extends StairBlock {
	public MilitaryplatingstairsBlock() {
		super(() -> Blocks.AIR.defaultBlockState(), BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(0.65f, 9f).requiresCorrectToolForDrops());
	}

	@Override
	public float getExplosionResistance() {
		return 9f;
	}

	@Override
	public boolean isRandomlyTicking(BlockState state) {
		return false;
	}
}