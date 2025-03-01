
package net.mcreator.falloutwastelands.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class SupermutantgoreBlock extends Block {
	public SupermutantgoreBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.MUD).strength(1.4f, 2f).friction(0.7f).speedFactor(0.8f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}