
package net.mcreator.falloutwastelands.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class WastelandBrickWallBlock extends WallBlock {
	public WastelandBrickWallBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE_BRICKS).strength(0.55f, 12.5f).requiresCorrectToolForDrops().forceSolidOn());
	}
}