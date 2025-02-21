package net.mcreator.falloutwastelands.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class SpiderfloaterModel extends GeoModel<SpiderfloaterEntity> {
	@Override
	public ResourceLocation getAnimationResource(SpiderfloaterEntity entity) {
		return new ResourceLocation("fallout_wastelands_", "animations/needletoothfloater.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpiderfloaterEntity entity) {
		return new ResourceLocation("fallout_wastelands_", "geo/needletoothfloater.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpiderfloaterEntity entity) {
		return new ResourceLocation("fallout_wastelands_", "textures/entities/" + entity.getTexture() + ".png");
	}

}