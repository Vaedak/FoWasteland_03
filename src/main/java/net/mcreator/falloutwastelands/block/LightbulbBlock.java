
package net.mcreator.falloutwastelands.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class LightbulbBlock extends Block {
	public LightbulbBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.HAT).sound(SoundType.GLASS).strength(1f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public InteractionResult use(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
		super.use(blockstate, world, pos, entity, hand, hit);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		double hitX = hit.getLocation().x;
		double hitY = hit.getLocation().y;
		double hitZ = hit.getLocation().z;
		Direction direction = hit.getDirection();
		LightbulbonOnBlockRightClickedProcedure.execute();
		return InteractionResult.SUCCESS;
	}
}