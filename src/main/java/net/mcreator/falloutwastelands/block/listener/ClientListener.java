package net.mcreator.falloutwastelands.block.listener;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.falloutwastelands.init.FalloutWastelandsModBlockEntities;
import net.mcreator.falloutwastelands.block.renderer.BASEcoreTileRenderer;
import net.mcreator.falloutwastelands.FalloutWastelandsMod;

@Mod.EventBusSubscriber(modid = FalloutWastelandsMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(FalloutWastelandsModBlockEntities.BAS_ECORE.get(), context -> new BASEcoreTileRenderer());
	}
}
