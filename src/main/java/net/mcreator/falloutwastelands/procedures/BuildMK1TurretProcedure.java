package net.mcreator.falloutwastelands.procedures;

import net.minecraftforge.eventbus.api.Event;

public class BuildMK1TurretProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(FalloutWastelandsModMobEffects.DELETED_MOD_ELEMENT.get())) {
			entity.getPersistentData().putBoolean("placeMK1", true);
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Crouch To Cancel"), true);
			if (entity instanceof Player _player)
				_player.closeContainer();
		}
	}
}
