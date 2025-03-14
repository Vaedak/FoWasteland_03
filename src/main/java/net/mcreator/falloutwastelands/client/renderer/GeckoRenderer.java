
package net.mcreator.falloutwastelands.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.falloutwastelands.procedures.GeckoRandomScaleProcedure;
import net.mcreator.falloutwastelands.entity.model.GeckoModel;
import net.mcreator.falloutwastelands.entity.GeckoEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class GeckoRenderer extends GeoEntityRenderer<GeckoEntity> {
	public GeckoRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new GeckoModel());
		this.shadowRadius = 0.3f;
	}

	@Override
	public RenderType getRenderType(GeckoEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, GeckoEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		float scale = (float) GeckoRandomScaleProcedure.execute(entity);
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
