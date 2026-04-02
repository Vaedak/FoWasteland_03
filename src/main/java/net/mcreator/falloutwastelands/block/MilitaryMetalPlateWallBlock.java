
package net.mcreator.falloutwastelands.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class MilitaryMetalPlateWallBlock extends WallBlock {
	public MilitaryMetalPlateWallBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(6.5f, 9f).requiresCorrectToolForDrops().forceSolidOn());
	}
}