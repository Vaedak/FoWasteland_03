package net.mcreator.falloutwastelands.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class InBASEActiveTickConditionProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double size = 0;
		double vert_x = 0;
		double vert_y = 0;
		double vert_z = 0;
		double rayRange = 0;
		double n = 0;
		if (entity.getPersistentData().getBoolean("placeMK1")) {
			Display1BlockParticleProcedure.execute(world, entity);
			if (entity.isShiftKeyDown()) {
				entity.getPersistentData().putBoolean("placeMK1", false);
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Canceled Build"), true);
			}
		}
	}
}
