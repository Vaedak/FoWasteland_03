
package net.mcreator.falloutwastelands.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.falloutwastelands.entity.FeralGhoulEntity;
import net.mcreator.falloutwastelands.client.model.ModelGhoul;

public class FeralGhoulRenderer extends MobRenderer<FeralGhoulEntity, ModelGhoul<FeralGhoulEntity>> {
	public FeralGhoulRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelGhoul(context.bakeLayer(ModelGhoul.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FeralGhoulEntity entity) {
		return new ResourceLocation("fallout_wastelands_:textures/entities/ghoul_.png");
	}
}
