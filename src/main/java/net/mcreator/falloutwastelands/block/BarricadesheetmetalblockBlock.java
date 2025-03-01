
package net.mcreator.falloutwastelands.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class BarricadesheetmetalblockBlock extends WallBlock {
	public BarricadesheetmetalblockBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(0.8f, 6f).requiresCorrectToolForDrops().forceSolidOn());
	}
}