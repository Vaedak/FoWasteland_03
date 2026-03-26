package net.mcreator.falloutwastelands.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.falloutwastelands.init.FalloutWastelandsModMobEffects;

public class BuildMK1TurretProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(FalloutWastelandsModMobEffects.IN_BASE.get())) {
			entity.getPersistentData().putBoolean("placeMK1", true);
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Crouch To Cancel"), true);
			if (entity instanceof Player _player)
				_player.closeContainer();
		}
	}
}
