
package net.mcreator.falloutwastelands.client.renderer;

public class FeralGhoulRenderer extends MobRenderer<FeralGhoulEntity, ModelGhoul<FeralGhoulEntity>> {

	public FeralGhoulRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelGhoul(context.bakeLayer(ModelGhoul.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(FeralGhoulEntity entity) {
		return new ResourceLocation("fallout_wastelands_:textures/entities/ghoul_.png");
	}

}
