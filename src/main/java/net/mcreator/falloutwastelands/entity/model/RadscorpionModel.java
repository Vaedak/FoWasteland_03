package net.mcreator.falloutwastelands.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class RadscorpionModel extends GeoModel<RadscorpionEntity> {
	@Override
	public ResourceLocation getAnimationResource(RadscorpionEntity entity) {
		return new ResourceLocation("fallout_wastelands_", "animations/radscorpion.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RadscorpionEntity entity) {
		return new ResourceLocation("fallout_wastelands_", "geo/radscorpion.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RadscorpionEntity entity) {
		return new ResourceLocation("fallout_wastelands_", "textures/entities/" + entity.getTexture() + ".png");
	}

}