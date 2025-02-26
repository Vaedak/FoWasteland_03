
package net.mcreator.falloutwastelands.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class WallWastelandCobblestoneBlock extends WallBlock {
	public WallWastelandCobblestoneBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.STONE).strength(0.3f, 12f).requiresCorrectToolForDrops().forceSolidOn());
	}
}