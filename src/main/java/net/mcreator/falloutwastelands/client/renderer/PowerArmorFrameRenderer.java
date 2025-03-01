
package net.mcreator.falloutwastelands.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.VillagerModel;

import net.mcreator.falloutwastelands.entity.PowerArmorFrameEntity;

import com.mojang.blaze3d.vertex.PoseStack;

public class PowerArmorFrameRenderer extends MobRenderer<PowerArmorFrameEntity, VillagerModel<PowerArmorFrameEntity>> {
	public PowerArmorFrameRenderer(EntityRendererProvider.Context context) {
		super(context, new VillagerModel(context.bakeLayer(ModelLayers.VILLAGER)), 0.5f);
	}

	@Override
	protected void scale(PowerArmorFrameEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.9375f, 0.9375f, 0.9375f);
	}

	@Override
	public ResourceLocation getTextureLocation(PowerArmorFrameEntity entity) {
		return new ResourceLocation("fallout_wastelands_:textures/entities/invisible.png");
	}
}
