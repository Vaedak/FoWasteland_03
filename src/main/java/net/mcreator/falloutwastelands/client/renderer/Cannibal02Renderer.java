
package net.mcreator.falloutwastelands.client.renderer;

public class Cannibal02Renderer extends HumanoidMobRenderer<Cannibal02Entity, HumanoidModel<Cannibal02Entity>> {

	public Cannibal02Renderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));

	}

	@Override
	public ResourceLocation getTextureLocation(Cannibal02Entity entity) {
		return new ResourceLocation("fallout_wastelands_:textures/entities/cannibal_trapper.png");
	}

}
