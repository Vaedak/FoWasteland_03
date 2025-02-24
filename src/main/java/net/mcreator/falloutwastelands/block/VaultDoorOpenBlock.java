
package net.mcreator.falloutwastelands.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class VaultDoorOpenBlock extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public VaultDoorOpenBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.STONE).strength(5.7f, 8f).requiresCorrectToolForDrops().noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
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
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(0, 0, 0, 4, 8, 16), box(28, 0, 0, 32, 8, 16), box(0, 8, 0, 2, 30, 16), box(30, 8, 0, 32, 30, 16), box(0, 30, 0, 32, 32, 16));
			case NORTH -> Shapes.or(box(12, 0, 0, 16, 8, 16), box(-16, 0, 0, -12, 8, 16), box(14, 8, 0, 16, 30, 16), box(-16, 8, 0, -14, 30, 16), box(-16, 30, 0, 16, 32, 16));
			case EAST -> Shapes.or(box(0, 0, 12, 16, 8, 16), box(0, 0, -16, 16, 8, -12), box(0, 8, 14, 16, 30, 16), box(0, 8, -16, 16, 30, -14), box(0, 30, -16, 16, 32, 16));
			case WEST -> Shapes.or(box(0, 0, 0, 16, 8, 4), box(0, 0, 28, 16, 8, 32), box(0, 8, 0, 16, 30, 2), box(0, 8, 30, 16, 30, 32), box(0, 30, 0, 16, 32, 32));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return super.getStateForPlacement(context).setValue(FACING, context.getHorizontalDirection().getOpposite());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}
}