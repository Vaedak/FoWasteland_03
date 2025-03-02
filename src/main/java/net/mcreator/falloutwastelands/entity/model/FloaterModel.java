package net.mcreator.falloutwastelands.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class FloaterModel extends GeoModel<FloaterEntity> {
	@Override
	public ResourceLocation getAnimationResource(FloaterEntity entity) {
		return new ResourceLocation("fallout_wastelands_", "animations/flatworm_floater.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FloaterEntity entity) {
		return new ResourceLocation("fallout_wastelands_", "geo/flatworm_floater.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FloaterEntity entity) {
		return new ResourceLocation("fallout_wastelands_", "textures/entities/" + entity.getTexture() + ".png");
	}

}