
package net.mcreator.falloutwastelands.client.renderer;

public class LobotomiteWalkerRenderer extends HumanoidMobRenderer<LobotomiteWalkerEntity, HumanoidModel<LobotomiteWalkerEntity>> {

	public LobotomiteWalkerRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));

	}

	@Override
	public ResourceLocation getTextureLocation(LobotomiteWalkerEntity entity) {
		return new ResourceLocation("fallout_wastelands_:textures/entities/male_base_lobotomite.png");
	}

}
