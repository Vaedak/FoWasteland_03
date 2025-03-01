
package net.mcreator.falloutwastelands.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class BosSteelSlabsBlock extends SlabBlock {
	public BosSteelSlabsBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(5.2f, 7.5f).requiresCorrectToolForDrops());
	}
}