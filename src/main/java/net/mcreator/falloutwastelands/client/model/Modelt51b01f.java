package net.mcreator.falloutwastelands.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelt51b01f<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("fallout_wastelands_", "modelt_51b_01f"), "main");
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public Modelt51b01f(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 10).addBox(-4.1111F, -8.1778F, -4.8889F, 8.0F, 8.0F, 9.0F, new CubeDeformation(0.3F)).texOffs(52, 0)
				.addBox(-1.6444F, -4.0F, -6.2889F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(52, 6).addBox(-1.1111F, -7.4667F, -5.9333F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -2.0F, -1.0F, 10.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1778F, -0.1778F, -4.8889F, 0.1745F, 0.0F, 0.0F));
		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(0, 27).addBox(-4.5F, -4.0F, -3.5F, 9.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0778F, -5.5333F, -3.3444F, -0.3054F, 0.0F, 0.0F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(30, 52).addBox(-4.0F, 0.0F, -1.4667F, 8.0F, 8.0F, 5.0F, new CubeDeformation(0.01F)).texOffs(32, 23)
				.addBox(-4.0667F, 0.0F, -2.4667F, 8.0F, 12.0F, 5.0F, new CubeDeformation(0.1F)).texOffs(62, 40).addBox(-4.0F, -1.0F, -3.4667F, 8.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Body_r1 = Body.addOrReplaceChild("Body_r1", CubeListBuilder.create().texOffs(34, 10).addBox(-5.0F, -2.5F, -4.0F, 10.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.1444F, -0.4667F, -0.3491F, 0.0F, 0.0F));
		PartDefinition Body_r2 = Body.addOrReplaceChild("Body_r2", CubeListBuilder.create().texOffs(0, 54).addBox(-4.0F, -4.0F, -3.5F, 8.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, 0.0333F, 0.2618F, 0.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(56, 52).addBox(-4.0F, -2.0F, -2.4667F, 5.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition cube_r2 = RightArm.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(38, 4).addBox(-2.0F, -4.0F, -4.0F, 7.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(38, 0).addBox(-2.0F, -4.0F, -12.0F, 7.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 4.0F, 8.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition cube_r3 = RightArm.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(32, 40).addBox(-2.0F, -4.0F, -4.0F, 7.0F, 4.0F, 8.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(-5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition RightArm_r1 = RightArm.addOrReplaceChild("RightArm_r1", CubeListBuilder.create().texOffs(0, 67).addBox(-2.5F, -3.0F, -3.0F, 5.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, 1.0F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(58, 23).addBox(-1.0F, -2.0F, -2.4667F, 5.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition RightArm_r2 = LeftArm.addOrReplaceChild("RightArm_r2", CubeListBuilder.create().texOffs(46, 69).addBox(-2.5F, -3.0F, -3.0F, 5.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5F, 1.0F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition cube_r4 = LeftArm.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(62, 47).addBox(-5.0F, -4.0F, -4.0F, 7.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(66, 17).addBox(-5.0F, -4.0F, 4.0F, 7.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 4.0F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition cube_r5 = LeftArm.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 42).addBox(-5.0F, -4.0F, -4.0F, 7.0F, 4.0F, 8.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(5.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(66, 0).addBox(-3.0F, 0.0F, -2.4667F, 5.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(76, 47).addBox(-3.2F, 0.0F, -2.8222F, 5.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(26, 65).addBox(-2.0F, 0.0F, -2.4667F, 5.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(68, 69).addBox(-2.0F, 0.0F, -2.8222F, 5.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 96, 96);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
