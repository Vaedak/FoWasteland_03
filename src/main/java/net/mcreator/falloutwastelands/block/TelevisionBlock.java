
package net.mcreator.falloutwastelands.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class TelevisionBlock extends Block implements SimpleWaterloggedBlock {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
	public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

	public TelevisionBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(0.6f, 1f).requiresCorrectToolForDrops().noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(WATERLOGGED, false));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return state.getFluidState().isEmpty();
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
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(1.5, 0, 12, 14.5, 12, 14), box(10, 0, 4, 12, 1, 6), box(4, 0, 4, 6, 1, 6), box(2, 0.5, 2, 14, 11.5, 13), box(7, 11.5, 7, 9, 12.5, 9));
			case NORTH -> Shapes.or(box(1.5, 0, 2, 14.5, 12, 4), box(4, 0, 10, 6, 1, 12), box(10, 0, 10, 12, 1, 12), box(2, 0.5, 3, 14, 11.5, 14), box(7, 11.5, 7, 9, 12.5, 9));
			case EAST -> Shapes.or(box(12, 0, 1.5, 14, 12, 14.5), box(4, 0, 4, 6, 1, 6), box(4, 0, 10, 6, 1, 12), box(2, 0.5, 2, 13, 11.5, 14), box(7, 11.5, 7, 9, 12.5, 9));
			case WEST -> Shapes.or(box(2, 0, 1.5, 4, 12, 14.5), box(10, 0, 10, 12, 1, 12), box(10, 0, 4, 12, 1, 6), box(3, 0.5, 2, 14, 11.5, 14), box(7, 11.5, 7, 9, 12.5, 9));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(FACING, WATERLOGGED);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		boolean flag = context.getLevel().getFluidState(context.getClickedPos()).getType() == Fluids.WATER;
		return super.getStateForPlacement(context).setValue(FACING, context.getHorizontalDirection().getOpposite()).setValue(WATERLOGGED, flag);
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public FluidState getFluidState(BlockState state) {
		return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
	}

	@Override
	public BlockState updateShape(BlockState state, Direction facing, BlockState facingState, LevelAccessor world, BlockPos currentPos, BlockPos facingPos) {
		if (state.getValue(WATERLOGGED)) {
			world.scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickDelay(world));
		}
		return super.updateShape(state, facing, facingState, world, currentPos, facingPos);
	}
}