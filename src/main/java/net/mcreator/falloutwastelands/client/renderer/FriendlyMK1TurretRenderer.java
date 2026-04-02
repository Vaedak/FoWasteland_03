
package net.mcreator.falloutwastelands.client.renderer;

public class FriendlyMK1TurretRenderer extends HumanoidMobRenderer<FriendlyMK1TurretEntity, HumanoidModel<FriendlyMK1TurretEntity>> {

	public FriendlyMK1TurretRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));

	}

	@Override
	public ResourceLocation getTextureLocation(FriendlyMK1TurretEntity entity) {
		return new ResourceLocation("fallout_wastelands_:textures/entities/cannibal_tribal.png");
	}

}
