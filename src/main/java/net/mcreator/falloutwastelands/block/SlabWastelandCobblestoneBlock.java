
package net.mcreator.falloutwastelands.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class SlabWastelandCobblestoneBlock extends SlabBlock {
	public SlabWastelandCobblestoneBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.STONE).strength(0.3f, 7f).requiresCorrectToolForDrops());
	}
}