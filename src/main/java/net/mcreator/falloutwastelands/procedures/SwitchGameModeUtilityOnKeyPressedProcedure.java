package net.mcreator.falloutwastelands.procedures;

import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

public class SwitchGameModeUtilityOnKeyPressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("counter", (entity.getPersistentData().getDouble("counter") + 1));
		if (entity.getPersistentData().getDouble("counter") >= 2) {
			if (entity instanceof ServerPlayer _player)
				_player.setGameMode(GameType.SURVIVAL);
			entity.getPersistentData().putDouble("counter", 0);
		} else {
			if (entity instanceof ServerPlayer _player)
				_player.setGameMode(GameType.CREATIVE);
		}
	}
}
