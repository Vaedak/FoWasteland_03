
package net.mcreator.falloutwastelands.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class RustedSheetMetalWallBlock extends WallBlock {
	public RustedSheetMetalWallBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(0.55f, 6f).requiresCorrectToolForDrops().forceSolidOn());
	}
}