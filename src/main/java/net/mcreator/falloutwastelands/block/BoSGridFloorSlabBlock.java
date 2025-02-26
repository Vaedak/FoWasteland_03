
package net.mcreator.falloutwastelands.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class BoSGridFloorSlabBlock extends SlabBlock {
	public BoSGridFloorSlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(5f, 7f).requiresCorrectToolForDrops());
	}
}