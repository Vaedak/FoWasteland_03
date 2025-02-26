package net.mcreator.falloutwastelands.block.model;

public class BASEcoreBlockModel extends GeoModel<BASEcoreTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BASEcoreTileEntity animatable) {
		return new ResourceLocation("fallout_wastelands_", "animations/base.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BASEcoreTileEntity animatable) {
		return new ResourceLocation("fallout_wastelands_", "geo/base.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BASEcoreTileEntity animatable) {
		return new ResourceLocation("fallout_wastelands_", "textures/block/walkwaytop.png");
	}
}