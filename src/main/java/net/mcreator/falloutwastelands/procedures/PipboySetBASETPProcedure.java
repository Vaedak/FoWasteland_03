package net.mcreator.falloutwastelands.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.falloutwastelands.init.FalloutWastelandsModBlocks;

public class PipboySetBASETPProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == FalloutWastelandsModBlocks.BAS_ECORE.get()) {
			itemstack.getOrCreateTag().putBoolean("linkedToBase", true);
			itemstack.getOrCreateTag().putDouble("baseX", x);
			itemstack.getOrCreateTag().putDouble("baseY", y);
			itemstack.getOrCreateTag().putDouble("baseZ", z);
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("BASE Linked"), true);
		}
	}
}
