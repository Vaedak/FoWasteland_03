
package net.mcreator.falloutwastelands.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.SoundType;

public class OxidizedMetalWallBlock extends WallBlock {
	public OxidizedMetalWallBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(0.55f, 5.5f).requiresCorrectToolForDrops().forceSolidOn());
	}
}
