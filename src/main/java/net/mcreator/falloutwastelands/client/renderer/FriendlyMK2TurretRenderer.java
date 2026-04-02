
package net.mcreator.falloutwastelands.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.falloutwastelands.entity.FriendlyMK2TurretEntity;

public class FriendlyMK2TurretRenderer extends HumanoidMobRenderer<FriendlyMK2TurretEntity, HumanoidModel<FriendlyMK2TurretEntity>> {
	public FriendlyMK2TurretRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(FriendlyMK2TurretEntity entity) {
		return new ResourceLocation("fallout_wastelands_:textures/entities/cannibal_tribal.png");
	}
}
