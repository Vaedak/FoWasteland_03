package net.mcreator.falloutwastelands.client.renderer;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.falloutwastelands.entity.BaseGunItemProjectileEntity;
import net.mcreator.falloutwastelands.client.model.Modelgunshot;

import com.mojang.math.Axis;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class BaseGunItemProjectileRenderer extends EntityRenderer<BaseGunItemProjectileEntity> {
	private static final ResourceLocation texture = new ResourceLocation("fallout_wastelands_:textures/entities/gunshot.png");
	private final Modelgunshot model;

	public BaseGunItemProjectileRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new Modelgunshot(context.bakeLayer(Modelgunshot.LAYER_LOCATION));
	}

	@Override
	public void render(BaseGunItemProjectileEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Axis.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Axis.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		poseStack.popPose();
		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(BaseGunItemProjectileEntity entity) {
		return texture;
	}
}
