
package net.mcreator.falloutwastelands.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.falloutwastelands.entity.VertibirdEntity;
import net.mcreator.falloutwastelands.client.model.ModelvertibirdXBV02;

public class VertibirdRenderer extends MobRenderer<VertibirdEntity, ModelvertibirdXBV02<VertibirdEntity>> {
	public VertibirdRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelvertibirdXBV02(context.bakeLayer(ModelvertibirdXBV02.LAYER_LOCATION)), 2.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(VertibirdEntity entity) {
		return new ResourceLocation("fallout_wastelands_:textures/entities/vertibirddulled.png");
	}
}
