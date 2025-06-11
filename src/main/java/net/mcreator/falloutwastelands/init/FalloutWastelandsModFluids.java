
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.falloutwastelands.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.falloutwastelands.fluid.FEVgooFluid;
import net.mcreator.falloutwastelands.FalloutWastelandsMod;

public class FalloutWastelandsModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, FalloutWastelandsMod.MODID);
	public static final RegistryObject<FlowingFluid> FE_VGOO = REGISTRY.register("fe_vgoo", () -> new FEVgooFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_FE_VGOO = REGISTRY.register("flowing_fe_vgoo", () -> new FEVgooFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(FE_VGOO.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_FE_VGOO.get(), RenderType.translucent());
		}
	}
}
