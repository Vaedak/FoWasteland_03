
package net.mcreator.falloutwastelands.client.renderer;

public class DynamiteEntityRenderer extends MobRenderer<DynamiteEntityEntity, Modeldynamite<DynamiteEntityEntity>> {

	public DynamiteEntityRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldynamite(context.bakeLayer(Modeldynamite.LAYER_LOCATION)), 0f);

	}

	@Override
	public ResourceLocation getTextureLocation(DynamiteEntityEntity entity) {
		return new ResourceLocation("fallout_wastelands_:textures/entities/dynamite.png");
	}

}
