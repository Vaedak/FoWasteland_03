
package net.mcreator.falloutwastelands.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class SandbagsSlabBlock extends SlabBlock {
	public SandbagsSlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.SAND).strength(1.5f, 2f));
	}
}
