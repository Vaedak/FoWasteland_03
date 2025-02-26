package net.mcreator.falloutwastelands.block.model;

public class BASEcoreDisplayModel extends GeoModel<BASEcoreDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BASEcoreDisplayItem animatable) {
		return new ResourceLocation("fallout_wastelands_", "animations/base.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BASEcoreDisplayItem animatable) {
		return new ResourceLocation("fallout_wastelands_", "geo/base.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BASEcoreDisplayItem entity) {
		return new ResourceLocation("fallout_wastelands_", "textures/block/walkwaytop.png");
	}
}