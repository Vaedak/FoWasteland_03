
package net.mcreator.falloutwastelands.block;

import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.ButtonBlock;

public class EnclaveBunkerButtonBlock extends ButtonBlock {
	public EnclaveBunkerButtonBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(5.2f, 7.5f).requiresCorrectToolForDrops(), BlockSetType.STONE, 20, false);
	}
}
