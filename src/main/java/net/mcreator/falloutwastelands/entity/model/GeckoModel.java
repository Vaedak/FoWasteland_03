package net.mcreator.falloutwastelands.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.falloutwastelands.entity.GeckoEntity;

public class GeckoModel extends GeoModel<GeckoEntity> {
	@Override
	public ResourceLocation getAnimationResource(GeckoEntity entity) {
		return new ResourceLocation("fallout_wastelands_", "animations/geckotwo.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GeckoEntity entity) {
		return new ResourceLocation("fallout_wastelands_", "geo/geckotwo.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GeckoEntity entity) {
		return new ResourceLocation("fallout_wastelands_", "textures/entities/" + entity.getTexture() + ".png");
	}

}
