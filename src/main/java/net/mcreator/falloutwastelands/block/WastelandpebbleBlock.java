
package net.mcreator.falloutwastelands.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class WastelandpebbleBlock extends FlowerBlock {
	public WastelandpebbleBlock() {
		super(() -> MobEffects.MOVEMENT_SPEED, 100,
				BlockBehaviour.Properties.of().mapColor(MapColor.STONE).sound(SoundType.DEEPSLATE).instabreak().noCollission().replaceable().offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY));
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		Vec3 offset = state.getOffset(world, pos);
		return box(0, 0, 0, 16, 1, 16).move(offset.x, offset.y, offset.z);
	}

	@Override
	public int getEffectDuration() {
		return 100;
	}

	@Override
	public boolean mayPlaceOn(BlockState groundState, BlockGetter worldIn, BlockPos pos) {
		return groundState.is(FalloutWastelandsModBlocks.WASTELAND_DIRT.get()) || groundState.is(FalloutWastelandsModBlocks.WASTELANDGRAVEL.get()) || groundState.is(FalloutWastelandsModBlocks.WASTELAND_COBBLESTONE.get())
				|| groundState.is(FalloutWastelandsModBlocks.WASTELANDGRASSBLOCK.get()) || groundState.is(FalloutWastelandsModBlocks.WASTELAND_ROOTY_DIRT.get());
	}

	@Override
	public boolean canSurvive(BlockState blockstate, LevelReader worldIn, BlockPos pos) {
		BlockPos blockpos = pos.below();
		BlockState groundState = worldIn.getBlockState(blockpos);
		return this.mayPlaceOn(groundState, worldIn, blockpos);
	}

	@Override
	public PlantType getPlantType(BlockGetter world, BlockPos pos) {
		return PlantType.CAVE;
	}
}