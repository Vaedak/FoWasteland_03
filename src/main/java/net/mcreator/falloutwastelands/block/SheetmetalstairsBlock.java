
package net.mcreator.falloutwastelands.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Blocks;

public class SheetmetalstairsBlock extends StairBlock {
	public SheetmetalstairsBlock() {
		super(() -> Blocks.AIR.defaultBlockState(), BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(0.55f, 6f).requiresCorrectToolForDrops());
	}

	@Override
	public float getExplosionResistance() {
		return 6f;
	}

	@Override
	public boolean isRandomlyTicking(BlockState state) {
		return false;
	}
}
