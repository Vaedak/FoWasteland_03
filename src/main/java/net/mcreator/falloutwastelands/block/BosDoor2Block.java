
package net.mcreator.falloutwastelands.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class BosDoor2Block extends DoorBlock {
	public BosDoor2Block() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(5f, 7f).requiresCorrectToolForDrops(), BlockSetType.STONE);
	}
}