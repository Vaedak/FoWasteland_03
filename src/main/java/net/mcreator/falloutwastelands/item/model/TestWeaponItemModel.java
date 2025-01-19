package net.mcreator.falloutwastelands.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.falloutwastelands.item.TestWeaponItem;

public class TestWeaponItemModel extends GeoModel<TestWeaponItem> {
	@Override
	public ResourceLocation getAnimationResource(TestWeaponItem animatable) {
		return new ResourceLocation("fallout_wastelands_", "animations/brf.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TestWeaponItem animatable) {
		return new ResourceLocation("fallout_wastelands_", "geo/brf.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TestWeaponItem animatable) {
		return new ResourceLocation("fallout_wastelands_", "textures/item/texture.png");
	}
}
