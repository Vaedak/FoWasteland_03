
package net.mcreator.falloutwastelands.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class EnclaveBunkerBlockSlabBlock extends SlabBlock {
	public EnclaveBunkerBlockSlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(5.2f, 7.5f).requiresCorrectToolForDrops());
	}
}
