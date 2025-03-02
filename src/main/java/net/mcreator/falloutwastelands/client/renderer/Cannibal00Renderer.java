
package net.mcreator.falloutwastelands.client.renderer;

public class Cannibal00Renderer extends HumanoidMobRenderer<Cannibal00Entity, HumanoidModel<Cannibal00Entity>> {

	public Cannibal00Renderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));

	}

	@Override
	public ResourceLocation getTextureLocation(Cannibal00Entity entity) {
		return new ResourceLocation("fallout_wastelands_:textures/entities/cannibal_grunt.png");
	}

}
