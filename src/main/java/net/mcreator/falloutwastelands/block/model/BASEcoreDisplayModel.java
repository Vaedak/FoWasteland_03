package net.mcreator.falloutwastelands.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.falloutwastelands.block.display.BASEcoreDisplayItem;

public class BASEcoreDisplayModel extends GeoModel<BASEcoreDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BASEcoreDisplayItem animatable) {
		return new ResourceLocation("fallout_wastelands_", "animations/brf.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BASEcoreDisplayItem animatable) {
		return new ResourceLocation("fallout_wastelands_", "geo/brf.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BASEcoreDisplayItem entity) {
		return new ResourceLocation("fallout_wastelands_", "textures/block/walkwaytop.png");
	}
}
