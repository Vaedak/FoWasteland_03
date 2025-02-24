
package net.mcreator.falloutwastelands.client.renderer;

public class RadroachRenderer extends GeoEntityRenderer<RadroachEntity> {
	public RadroachRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new RadroachModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(RadroachEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, RadroachEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}

}