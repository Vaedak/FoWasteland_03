
package net.mcreator.falloutwastelands.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class WornMetalSlabBlock extends SlabBlock {
	public WornMetalSlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(0.55f, 8f).requiresCorrectToolForDrops());
	}
}
