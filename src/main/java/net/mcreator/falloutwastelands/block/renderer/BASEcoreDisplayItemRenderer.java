package net.mcreator.falloutwastelands.block.renderer;

public class BASEcoreDisplayItemRenderer extends GeoItemRenderer<BASEcoreDisplayItem> {
	public BASEcoreDisplayItemRenderer() {
		super(new BASEcoreDisplayModel());
	}

	@Override
	public RenderType getRenderType(BASEcoreDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}