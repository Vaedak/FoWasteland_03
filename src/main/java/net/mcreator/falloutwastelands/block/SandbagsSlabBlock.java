
package net.mcreator.falloutwastelands.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class SandbagsSlabBlock extends SlabBlock {
	public SandbagsSlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.SAND).strength(1.5f, 4f));
	}
}