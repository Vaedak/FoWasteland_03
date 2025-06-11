package net.mcreator.falloutwastelands.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class BabyBrahminModel extends GeoModel<BabyBrahminEntity> {
	@Override
	public ResourceLocation getAnimationResource(BabyBrahminEntity entity) {
		return new ResourceLocation("fallout_wastelands_", "animations/brahmin.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BabyBrahminEntity entity) {
		return new ResourceLocation("fallout_wastelands_", "geo/brahmin.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BabyBrahminEntity entity) {
		return new ResourceLocation("fallout_wastelands_", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(BabyBrahminEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("lefthead");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}