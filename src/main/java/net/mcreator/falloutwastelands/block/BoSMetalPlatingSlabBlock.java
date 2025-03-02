
package net.mcreator.falloutwastelands.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class BoSMetalPlatingSlabBlock extends SlabBlock {
	public BoSMetalPlatingSlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(5f, 7f).requiresCorrectToolForDrops());
	}
}
