
package net.mcreator.falloutwastelands.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class MilitaryMetalDoorBlock extends DoorBlock {
	public MilitaryMetalDoorBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(6.5f, 8.5f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false), BlockSetType.IRON);
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}
}