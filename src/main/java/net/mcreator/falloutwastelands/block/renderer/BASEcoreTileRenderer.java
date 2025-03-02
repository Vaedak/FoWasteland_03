package net.mcreator.falloutwastelands.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.falloutwastelands.block.model.BASEcoreBlockModel;
import net.mcreator.falloutwastelands.block.entity.BASEcoreTileEntity;

public class BASEcoreTileRenderer extends GeoBlockRenderer<BASEcoreTileEntity> {
	public BASEcoreTileRenderer() {
		super(new BASEcoreBlockModel());
	}

	@Override
	public RenderType getRenderType(BASEcoreTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
