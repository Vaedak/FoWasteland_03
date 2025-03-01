
package net.mcreator.falloutwastelands.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class BosSteelStairBlock extends StairBlock {
	public BosSteelStairBlock() {
		super(() -> Blocks.AIR.defaultBlockState(), BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(5.2f, 7.5f).requiresCorrectToolForDrops());
	}

	@Override
	public float getExplosionResistance() {
		return 7.5f;
	}

	@Override
	public boolean isRandomlyTicking(BlockState state) {
		return false;
	}
}