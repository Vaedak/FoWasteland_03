package net.mcreator.falloutwastelands.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class BrahminModel extends GeoModel<BrahminEntity> {
	@Override
	public ResourceLocation getAnimationResource(BrahminEntity entity) {
		return new ResourceLocation("fallout_wastelands_", "animations/brahmin.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BrahminEntity entity) {
		return new ResourceLocation("fallout_wastelands_", "geo/brahmin.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BrahminEntity entity) {
		return new ResourceLocation("fallout_wastelands_", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(BrahminEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("lefthead");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}