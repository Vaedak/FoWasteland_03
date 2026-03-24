
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.falloutwastelands.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class FalloutWastelandsModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.WEAPONSMITH) {
			event.getTrades().get(1)
					.add(new BasicItemListing(new ItemStack(FalloutWastelandsModItems.BOTTLE_CAP.get(), 15), new ItemStack(FalloutWastelandsModItems.NEUTRONADE_CAP.get(), 5), new ItemStack(FalloutWastelandsModItems.STIMPACK.get()), 10, 5, 0.05f));
		}
	}
}
