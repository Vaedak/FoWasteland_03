
package net.mcreator.falloutwastelands.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class MilitaryPlatingSlabBlock extends SlabBlock {
	public MilitaryPlatingSlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(0.65f, 9f).requiresCorrectToolForDrops());
	}
}