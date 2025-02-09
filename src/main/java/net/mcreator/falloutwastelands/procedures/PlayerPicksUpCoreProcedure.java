package net.mcreator.falloutwastelands.procedures;

import net.minecraftforge.eventbus.api.Event;

@Mod.EventBusSubscriber
public class PlayerPicksUpCoreProcedure {
	@SubscribeEvent
	public static void onPickup(EntityItemPickupEvent event) {
		execute(event, event.getItem().getItem());
	}

	public static void execute(ItemStack itemstack) {
		execute(null, itemstack);
	}

	private static void execute(@Nullable Event event, ItemStack itemstack) {
		if (itemstack.getItem() == FalloutWastelandsModItems.FUSION_CORE.get()) {
			itemstack.getOrCreateTag().putBoolean("notSelected", true);
			itemstack.getOrCreateTag().putBoolean("selectedFusionCore", false);
		}
	}
}
