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

// Made with Blockbench 5.0.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelAPA<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("fallout_wastelands_", "model_apa"), "main");
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public ModelAPA(ModelPart root) {
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
		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.6F)).texOffs(16, 49).mirror().addBox(-1.4667F, -3.3556F, -4.4667F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.5F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(23, 17).mirror().addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.3F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.9556F, -5.1111F, -0.0433F, 0.1308F, 0.7892F));
		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(68, 36).addBox(-1.5F, -2.0F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.6F)),
				PartPose.offsetAndRotation(3.2778F, -8.3556F, 3.0333F, 0.0F, -0.2618F, -0.7854F));
		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(23, 17).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.3F)),
				PartPose.offsetAndRotation(0.0F, -1.9556F, -5.1111F, -0.0433F, -0.1308F, -0.7892F));
		PartDefinition Head_r4 = Head.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(56, 16).addBox(-1.5F, -0.5F, -4.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.6F)),
				PartPose.offsetAndRotation(-2.9F, -8.5F, 2.0F, -0.288F, 0.1942F, -0.4512F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(28, 30).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.61F)).texOffs(0, 16).addBox(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F, new CubeDeformation(0.6F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Body_r1 = Body.addOrReplaceChild("Body_r1", CubeListBuilder.create().texOffs(49, 47).addBox(-3.5F, -4.0F, -2.0F, 6.0F, 8.0F, 5.0F, new CubeDeformation(0.6F)),
				PartPose.offsetAndRotation(-6.5F, 0.4F, 2.5778F, 0.3201F, -0.2856F, -0.109F));
		PartDefinition Body_r2 = Body.addOrReplaceChild("Body_r2", CubeListBuilder.create().texOffs(0, 34).addBox(1.0F, -5.5F, -2.0F, 7.0F, 10.0F, 5.0F, new CubeDeformation(0.6F)),
				PartPose.offsetAndRotation(2.0667F, -0.5F, -1.0F, -0.7734F, 0.1536F, 0.1555F));
		PartDefinition Body_r3 = Body.addOrReplaceChild("Body_r3", CubeListBuilder.create().texOffs(32, 0).addBox(-8.0F, -5.5F, -2.0F, 7.0F, 10.0F, 5.0F, new CubeDeformation(0.6F)),
				PartPose.offsetAndRotation(-2.0667F, -0.5F, -1.0F, -0.7734F, -0.1536F, -0.1555F));
		PartDefinition Body_r4 = Body.addOrReplaceChild("Body_r4", CubeListBuilder.create().texOffs(26, 47).addBox(-2.5F, -4.0F, -2.0F, 6.0F, 8.0F, 5.0F, new CubeDeformation(0.6F)),
				PartPose.offsetAndRotation(6.5F, 0.4F, 2.5778F, 0.3201F, 0.2856F, 0.109F));
		PartDefinition Body_r5 = Body.addOrReplaceChild("Body_r5", CubeListBuilder.create().texOffs(29, 17).addBox(-4.5F, -4.0F, -2.0F, 8.0F, 8.0F, 5.0F, new CubeDeformation(0.6F)),
				PartPose.offsetAndRotation(0.5F, 0.2222F, 3.2889F, 0.3054F, 0.0F, 0.0F));
		PartDefinition Body_r6 = Body.addOrReplaceChild("Body_r6", CubeListBuilder.create().texOffs(1, 17).addBox(-4.0F, -6.0F, -2.0F, 8.0F, 8.0F, 5.0F, new CubeDeformation(0.61F)),
				PartPose.offsetAndRotation(0.0F, 7.2444F, 1.7111F, -0.5236F, 0.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(16, 60).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.6F)), PartPose.offset(-5.5333F, 2.0F, 0.0F));
		PartDefinition RightArm_r1 = RightArm.addOrReplaceChild("RightArm_r1", CubeListBuilder.create().texOffs(64, 60).addBox(-2.0F, 0.0F, -2.0F, 3.0F, 6.0F, 5.0F, new CubeDeformation(0.6F)),
				PartPose.offsetAndRotation(-3.0F, 2.0F, -0.5333F, 0.0F, 0.0F, -0.1309F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(32, 60).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.6F)), PartPose.offset(5.5333F, 2.0F, 0.0F));
		PartDefinition LeftArm_r1 = LeftArm.addOrReplaceChild("LeftArm_r1", CubeListBuilder.create().texOffs(48, 60).addBox(-1.0F, 0.0F, -2.0F, 3.0F, 6.0F, 5.0F, new CubeDeformation(0.6F)),
				PartPose.offsetAndRotation(3.0F, 2.0F, -0.5333F, 0.0F, 0.0F, 0.1309F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(56, 0).addBox(-2.7111F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.7F)), PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition RightLeg_r1 = RightLeg.addOrReplaceChild("RightLeg_r1", CubeListBuilder.create().texOffs(68, 26).addBox(-4.9F, -7.0F, -3.0F, 5.0F, 6.0F, 3.0F, new CubeDeformation(0.51F)),
				PartPose.offsetAndRotation(1.5444F, 11.3556F, -1.2444F, 0.0F, 0.3927F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(52, 30).addBox(-1.1111F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.7F)), PartPose.offset(1.9F, 12.0F, 0.0F));
		PartDefinition LeftLeg_r1 = LeftLeg.addOrReplaceChild("LeftLeg_r1", CubeListBuilder.create().texOffs(0, 65).addBox(-0.1F, -7.0F, -3.0F, 5.0F, 6.0F, 3.0F, new CubeDeformation(0.51F)),
				PartPose.offsetAndRotation(-1.5444F, 11.3556F, -1.2444F, 0.0F, -0.3927F, 0.0F));
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
