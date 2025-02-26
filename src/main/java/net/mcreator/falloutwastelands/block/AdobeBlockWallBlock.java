
package net.mcreator.falloutwastelands.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class AdobeBlockWallBlock extends WallBlock {
	public AdobeBlockWallBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.MUD_BRICKS).strength(0.55f, 6f).requiresCorrectToolForDrops().forceSolidOn());
	}
}