package net.mcreator.falloutwastelands.procedures;

import net.minecraftforge.eventbus.api.Event;

@Mod.EventBusSubscriber
public class DetectPlayerDimensionProcedure {
	@SubscribeEvent
	public static void onEntityTravelToDimension(EntityTravelToDimensionEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player || entity instanceof ServerPlayer) {
		}
	}
}
