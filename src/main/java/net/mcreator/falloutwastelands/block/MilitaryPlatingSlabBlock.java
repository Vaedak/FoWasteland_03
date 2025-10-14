
package net.mcreator.falloutwastelands.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class MilitaryPlatingSlabBlock extends SlabBlock {
	public MilitaryPlatingSlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(6.5f, 9f).requiresCorrectToolForDrops());
	}
}
