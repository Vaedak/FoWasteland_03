
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.falloutwastelands.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.falloutwastelands.client.renderer.RaiderscavangerRenderer;
import net.mcreator.falloutwastelands.client.renderer.RaiderDustwalkerRenderer;
import net.mcreator.falloutwastelands.client.renderer.PowerArmorFrameRenderer;
import net.mcreator.falloutwastelands.client.renderer.PADisplayEntityRenderer;
import net.mcreator.falloutwastelands.client.renderer.LaserBeamRenderer;
import net.mcreator.falloutwastelands.client.renderer.GeckoRenderer;
import net.mcreator.falloutwastelands.client.renderer.Cannibal00Renderer;
import net.mcreator.falloutwastelands.client.renderer.BrahminRenderer;
import net.mcreator.falloutwastelands.client.renderer.BlastmasterRaiderRenderer;
import net.mcreator.falloutwastelands.client.renderer.BaseGunItemProjectileRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class FalloutWastelandsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(FalloutWastelandsModEntities.CANNIBAL_00.get(), Cannibal00Renderer::new);
		event.registerEntityRenderer(FalloutWastelandsModEntities.POWER_ARMOR_FRAME.get(), PowerArmorFrameRenderer::new);
		event.registerEntityRenderer(FalloutWastelandsModEntities.BASE_GUN_ITEM_PROJECTILE.get(), BaseGunItemProjectileRenderer::new);
		event.registerEntityRenderer(FalloutWastelandsModEntities.RIPPER_PROJECTILE_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(FalloutWastelandsModEntities.LASER_BEAM.get(), LaserBeamRenderer::new);
		event.registerEntityRenderer(FalloutWastelandsModEntities.PLASMA_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(FalloutWastelandsModEntities.PA_DISPLAY_ENTITY.get(), PADisplayEntityRenderer::new);
		event.registerEntityRenderer(FalloutWastelandsModEntities.RAIDER_DUSTWALKER.get(), RaiderDustwalkerRenderer::new);
		event.registerEntityRenderer(FalloutWastelandsModEntities.BLASTMASTER_RAIDER.get(), BlastmasterRaiderRenderer::new);
		event.registerEntityRenderer(FalloutWastelandsModEntities.RAIDERSCAVANGER.get(), RaiderscavangerRenderer::new);
		event.registerEntityRenderer(FalloutWastelandsModEntities.BRAHMIN.get(), BrahminRenderer::new);
		event.registerEntityRenderer(FalloutWastelandsModEntities.GECKO.get(), GeckoRenderer::new);
	}
}
