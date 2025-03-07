
package net.mcreator.falloutwastelands.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class IndusPipeHubBlock extends Block {
	public IndusPipeHubBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(1.5f, 3.5f).speedFactor(1.2f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
