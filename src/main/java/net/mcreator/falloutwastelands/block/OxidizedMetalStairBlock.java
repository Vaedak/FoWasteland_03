
package net.mcreator.falloutwastelands.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class OxidizedMetalStairBlock extends StairBlock {
	public OxidizedMetalStairBlock() {
		super(() -> Blocks.AIR.defaultBlockState(), BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(0.55f, 5.5f).requiresCorrectToolForDrops());
	}

	@Override
	public float getExplosionResistance() {
		return 5.5f;
	}

	@Override
	public boolean isRandomlyTicking(BlockState state) {
		return false;
	}
}