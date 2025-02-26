package net.mcreator.falloutwastelands.block.renderer;

public class BASEcoreTileRenderer extends GeoBlockRenderer<BASEcoreTileEntity> {
	public BASEcoreTileRenderer() {
		super(new BASEcoreBlockModel());
	}

	@Override
	public RenderType getRenderType(BASEcoreTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}