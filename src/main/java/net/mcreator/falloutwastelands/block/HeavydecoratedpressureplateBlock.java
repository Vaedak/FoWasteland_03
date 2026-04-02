
package net.mcreator.falloutwastelands.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class HeavydecoratedpressureplateBlock extends PressurePlateBlock {
	public HeavydecoratedpressureplateBlock() {
		super(Sensitivity.MOBS, BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(0.65f, 9f).requiresCorrectToolForDrops().forceSolidOn(), BlockSetType.IRON);
	}
}