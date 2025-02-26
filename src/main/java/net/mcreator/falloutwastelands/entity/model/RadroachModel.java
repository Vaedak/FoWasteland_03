package net.mcreator.falloutwastelands.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class RadroachModel extends GeoModel<RadroachEntity> {
	@Override
	public ResourceLocation getAnimationResource(RadroachEntity entity) {
		return new ResourceLocation("fallout_wastelands_", "animations/radroack.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RadroachEntity entity) {
		return new ResourceLocation("fallout_wastelands_", "geo/radroack.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RadroachEntity entity) {
		return new ResourceLocation("fallout_wastelands_", "textures/entities/" + entity.getTexture() + ".png");
	}

}