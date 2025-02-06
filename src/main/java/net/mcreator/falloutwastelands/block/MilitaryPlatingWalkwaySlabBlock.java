
package net.mcreator.falloutwastelands.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class MilitaryPlatingWalkwaySlabBlock extends SlabBlock {
	public MilitaryPlatingWalkwaySlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(0.65f, 9f).requiresCorrectToolForDrops());
	}
}
