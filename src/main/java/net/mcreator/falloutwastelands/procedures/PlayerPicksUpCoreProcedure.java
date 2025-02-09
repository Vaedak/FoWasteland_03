package net.mcreator.falloutwastelands.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

import net.mcreator.falloutwastelands.network.FalloutWastelandsModVariables;
import net.mcreator.falloutwastelands.init.FalloutWastelandsModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PlayerPicksUpCoreProcedure {
	@SubscribeEvent
	public static void onPickup(EntityItemPickupEvent event) {
		execute(event, event.getEntity(), event.getItem().getItem());
	}

	public static void execute(Entity entity, ItemStack itemstack) {
		execute(null, entity, itemstack);
	}

	private static void execute(@Nullable Event event, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getItem() == FalloutWastelandsModItems.FUSION_CORE.get()) {
			itemstack.getOrCreateTag().putBoolean("notSelected", true);
			itemstack.getOrCreateTag().putBoolean("selectedFusionCore", false);
			{
				double _setval = 0;
				entity.getCapability(FalloutWastelandsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.fusionCorePower = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
