
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.falloutwastelands.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.falloutwastelands.client.renderer.SpiderfloaterRenderer;
import net.mcreator.falloutwastelands.client.renderer.RaiderscavangerRenderer;
import net.mcreator.falloutwastelands.client.renderer.RaiderDustwalkerRenderer;
import net.mcreator.falloutwastelands.client.renderer.RadscorpionRenderer;
import net.mcreator.falloutwastelands.client.renderer.RadroachRenderer;
import net.mcreator.falloutwastelands.client.renderer.PowerArmorFrameRenderer;
import net.mcreator.falloutwastelands.client.renderer.PADisplayEntityRenderer;
import net.mcreator.falloutwastelands.client.renderer.LobotomiteWalkerRenderer;
import net.mcreator.falloutwastelands.client.renderer.LaserBeamRenderer;
import net.mcreator.falloutwastelands.client.renderer.GeckoRenderer;
import net.mcreator.falloutwastelands.client.renderer.FloaterRenderer;
import net.mcreator.falloutwastelands.client.renderer.FeralGhoulRenderer;
import net.mcreator.falloutwastelands.client.renderer.DynamiteEntityRenderer;
import net.mcreator.falloutwastelands.client.renderer.Cannibal02Renderer;
import net.mcreator.falloutwastelands.client.renderer.Cannibal01Renderer;
import net.mcreator.falloutwastelands.client.renderer.Cannibal00Renderer;
import net.mcreator.falloutwastelands.client.renderer.BrahminRenderer;
import net.mcreator.falloutwastelands.client.renderer.BlastmasterRaiderRenderer;
import net.mcreator.falloutwastelands.client.renderer.BaseGunItemProjectileRenderer;
import net.mcreator.falloutwastelands.client.renderer.BabyBrahminRenderer;

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
		event.registerEntityRenderer(FalloutWastelandsModEntities.LOBOTOMITE_WALKER.get(), LobotomiteWalkerRenderer::new);
		event.registerEntityRenderer(FalloutWastelandsModEntities.DYNAMITE_ENTITY.get(), DynamiteEntityRenderer::new);
		event.registerEntityRenderer(FalloutWastelandsModEntities.SHOOT_NOTHING.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(FalloutWastelandsModEntities.CANNIBAL_01.get(), Cannibal01Renderer::new);
		event.registerEntityRenderer(FalloutWastelandsModEntities.SPIDERFLOATER.get(), SpiderfloaterRenderer::new);
		event.registerEntityRenderer(FalloutWastelandsModEntities.CANNIBAL_02.get(), Cannibal02Renderer::new);
		event.registerEntityRenderer(FalloutWastelandsModEntities.FLOATER.get(), FloaterRenderer::new);
		event.registerEntityRenderer(FalloutWastelandsModEntities.RADROACH.get(), RadroachRenderer::new);
		event.registerEntityRenderer(FalloutWastelandsModEntities.RADSCORPION.get(), RadscorpionRenderer::new);
		event.registerEntityRenderer(FalloutWastelandsModEntities.FERAL_GHOUL.get(), FeralGhoulRenderer::new);
		event.registerEntityRenderer(FalloutWastelandsModEntities.BABY_BRAHMIN.get(), BabyBrahminRenderer::new);
	}
}
