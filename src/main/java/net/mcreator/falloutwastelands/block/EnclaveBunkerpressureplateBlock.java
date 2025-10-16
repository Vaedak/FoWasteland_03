
package net.mcreator.falloutwastelands.block;

import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.PressurePlateBlock;

public class EnclaveBunkerpressureplateBlock extends PressurePlateBlock {
	public EnclaveBunkerpressureplateBlock() {
		super(Sensitivity.MOBS, BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(5.2f, 7.5f).requiresCorrectToolForDrops().forceSolidOn(), BlockSetType.IRON);
	}
}
