
package net.mcreator.falloutwastelands.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class WastelandtilesstairsBlock extends StairBlock {
	public WastelandtilesstairsBlock() {
		super(() -> Blocks.AIR.defaultBlockState(), BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.STONE).strength(0.3f, 7f).requiresCorrectToolForDrops());
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