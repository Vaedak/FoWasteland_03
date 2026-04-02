
package net.mcreator.falloutwastelands.client.renderer;

public class BabyBrahminRenderer extends GeoEntityRenderer<BabyBrahminEntity> {
	public BabyBrahminRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new BabyBrahminModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(BabyBrahminEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, BabyBrahminEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		float scale = 0.5f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}

}