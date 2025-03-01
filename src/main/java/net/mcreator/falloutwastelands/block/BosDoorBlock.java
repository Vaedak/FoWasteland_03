
package net.mcreator.falloutwastelands.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class BosDoorBlock extends DoorBlock {
	public BosDoorBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(5f, 7f).requiresCorrectToolForDrops(), BlockSetType.STONE);
	}
}