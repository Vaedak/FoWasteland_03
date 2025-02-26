
package net.mcreator.falloutwastelands.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class WastelandRoadYellowSlabBlock extends SlabBlock {
	public WastelandRoadYellowSlabBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.STONE).strength(0.7f, 5.5f).requiresCorrectToolForDrops().speedFactor(1.1f));
	}
}