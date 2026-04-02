
package net.mcreator.falloutwastelands.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class WastelandConcreteSlabBlock extends SlabBlock {
	public WastelandConcreteSlabBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.STONE).strength(3.5f, 5.5f).requiresCorrectToolForDrops());
	}
}