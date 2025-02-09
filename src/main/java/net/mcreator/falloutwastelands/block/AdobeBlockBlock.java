
package net.mcreator.falloutwastelands.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class AdobeBlockBlock extends Block {
	public AdobeBlockBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.MUD_BRICKS).strength(0.55f, 6f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}