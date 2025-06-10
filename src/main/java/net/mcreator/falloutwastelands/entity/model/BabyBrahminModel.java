package net.mcreator.falloutwastelands.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.falloutwastelands.entity.BabyBrahminEntity;

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
