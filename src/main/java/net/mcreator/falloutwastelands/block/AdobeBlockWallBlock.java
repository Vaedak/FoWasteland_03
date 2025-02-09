
package net.mcreator.falloutwastelands.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.SoundType;

public class AdobeBlockWallBlock extends WallBlock {
	public AdobeBlockWallBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.MUD_BRICKS).strength(0.55f, 6f).requiresCorrectToolForDrops().forceSolidOn());
	}
}
