package net.mcreator.falloutwastelands.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.Entity;

import net.mcreator.falloutwastelands.entity.PowerArmorFrameEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PlayerInteractWIthEntityProcedure {
	@SubscribeEvent
	public static void onRightClickEntity(PlayerInteractEvent.EntityInteract event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getTarget(), event.getEntity());
	}

	public static void execute(Entity entity, Entity sourceentity) {
		execute(null, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity instanceof Villager) {
			sourceentity.getPersistentData().putBoolean("inventoryOpen", true);
		}
		if (entity instanceof PowerArmorFrameEntity && sourceentity.isShiftKeyDown()) {
			sourceentity.getPersistentData().putBoolean("inventoryOpen", true);
		}
	}
}
