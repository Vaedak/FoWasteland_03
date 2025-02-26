
package net.mcreator.falloutwastelands.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class IndustrialDoorBlock extends DoorBlock {
	public IndustrialDoorBlock() {
		super(BlockBehaviour.Properties.of().ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.METAL).strength(4.6f, 3.5f).requiresCorrectToolForDrops(), BlockSetType.OAK);
	}
}