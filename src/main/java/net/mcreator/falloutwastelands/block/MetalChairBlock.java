
package net.mcreator.falloutwastelands.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class MetalChairBlock extends Block implements SimpleWaterloggedBlock {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
	public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

	public MetalChairBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(0.9f, 1.5f).requiresCorrectToolForDrops().noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
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
			default -> Shapes.or(box(1, 13, 1, 15, 27, 2), box(1, 9, 1, 15, 13, 15), box(1, 0, 1, 2, 9, 2), box(1, 0, 14, 2, 9, 15), box(14, 0, 1, 15, 9, 2), box(14, 0, 14, 15, 9, 15));
			case NORTH -> Shapes.or(box(1, 13, 14, 15, 27, 15), box(1, 9, 1, 15, 13, 15), box(14, 0, 14, 15, 9, 15), box(14, 0, 1, 15, 9, 2), box(1, 0, 14, 2, 9, 15), box(1, 0, 1, 2, 9, 2));
			case EAST -> Shapes.or(box(1, 13, 1, 2, 27, 15), box(1, 9, 1, 15, 13, 15), box(1, 0, 14, 2, 9, 15), box(14, 0, 14, 15, 9, 15), box(1, 0, 1, 2, 9, 2), box(14, 0, 1, 15, 9, 2));
			case WEST -> Shapes.or(box(14, 13, 1, 15, 27, 15), box(1, 9, 1, 15, 13, 15), box(14, 0, 1, 15, 9, 2), box(1, 0, 1, 2, 9, 2), box(14, 0, 14, 15, 9, 15), box(1, 0, 14, 2, 9, 15));
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