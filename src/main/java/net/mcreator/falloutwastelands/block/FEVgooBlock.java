
package net.mcreator.falloutwastelands.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.falloutwastelands.procedures.FEVgooMobplayerCollidesBlockProcedure;
import net.mcreator.falloutwastelands.init.FalloutWastelandsModFluids;

public class FEVgooBlock extends LiquidBlock {
	public FEVgooBlock() {
		super(() -> FalloutWastelandsModFluids.FE_VGOO.get(),
				BlockBehaviour.Properties.of().mapColor(MapColor.WATER).strength(100f).lightLevel(s -> 6).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		FEVgooMobplayerCollidesBlockProcedure.execute(entity);
	}
}
