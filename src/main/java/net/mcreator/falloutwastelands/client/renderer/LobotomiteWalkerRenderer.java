
package net.mcreator.falloutwastelands.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.falloutwastelands.entity.LobotomiteWalkerEntity;

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
