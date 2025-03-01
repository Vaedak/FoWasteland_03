
package net.mcreator.falloutwastelands.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class OxidizedMetalSlabBlock extends SlabBlock {
	public OxidizedMetalSlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(0.55f, 5.5f).requiresCorrectToolForDrops());
	}
}