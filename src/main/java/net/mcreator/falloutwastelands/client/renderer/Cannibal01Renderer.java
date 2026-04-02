
package net.mcreator.falloutwastelands.client.renderer;

public class Cannibal01Renderer extends HumanoidMobRenderer<Cannibal01Entity, HumanoidModel<Cannibal01Entity>> {

	public Cannibal01Renderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));

	}

	@Override
	public ResourceLocation getTextureLocation(Cannibal01Entity entity) {
		return new ResourceLocation("fallout_wastelands_:textures/entities/cannibal_tribal.png");
	}

}
