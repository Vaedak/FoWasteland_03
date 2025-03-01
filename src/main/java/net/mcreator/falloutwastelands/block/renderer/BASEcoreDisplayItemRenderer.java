package net.mcreator.falloutwastelands.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.falloutwastelands.block.model.BASEcoreDisplayModel;
import net.mcreator.falloutwastelands.block.display.BASEcoreDisplayItem;

public class BASEcoreDisplayItemRenderer extends GeoItemRenderer<BASEcoreDisplayItem> {
	public BASEcoreDisplayItemRenderer() {
		super(new BASEcoreDisplayModel());
	}

	@Override
	public RenderType getRenderType(BASEcoreDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
