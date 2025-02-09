package net.mcreator.falloutwastelands.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.falloutwastelands.network.FalloutWastelandsModVariables;

public class FusionCoreItemIsDroppedByPlayerProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = 0;
			entity.getCapability(FalloutWastelandsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.fusionCorePower = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
