
package net.mcreator.falloutwastelands.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.falloutwastelands.entity.DynamiteEntityEntity;
import net.mcreator.falloutwastelands.client.model.Modeldynamite;

public class DynamiteEntityRenderer extends MobRenderer<DynamiteEntityEntity, Modeldynamite<DynamiteEntityEntity>> {
	public DynamiteEntityRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldynamite(context.bakeLayer(Modeldynamite.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(DynamiteEntityEntity entity) {
		return new ResourceLocation("fallout_wastelands_:textures/entities/dynamite.png");
	}
}
