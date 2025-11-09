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
public class Modeltfourtyfive<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("fallout_wastelands_", "modeltfourtyfive"), "main");
	public final ModelPart powerarmor;
	public final ModelPart rightleg;
	public final ModelPart leftleg;
	public final ModelPart rightarm;
	public final ModelPart rightshoulder;
	public final ModelPart leftarm;
	public final ModelPart leftshoulder;
	public final ModelPart body;
	public final ModelPart head;
	public final ModelPart tube;
	public final ModelPart lamptow;

	public Modeltfourtyfive(ModelPart root) {
		this.powerarmor = root.getChild("powerarmor");
		this.rightleg = this.powerarmor.getChild("rightleg");
		this.leftleg = this.powerarmor.getChild("leftleg");
		this.rightarm = this.powerarmor.getChild("rightarm");
		this.rightshoulder = this.rightarm.getChild("rightshoulder");
		this.leftarm = this.powerarmor.getChild("leftarm");
		this.leftshoulder = this.leftarm.getChild("leftshoulder");
		this.body = this.powerarmor.getChild("body");
		this.head = this.powerarmor.getChild("head");
		this.tube = this.head.getChild("tube");
		this.lamptow = this.head.getChild("lamptow");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition powerarmor = partdefinition.addOrReplaceChild("powerarmor", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition rightleg = powerarmor.addOrReplaceChild("rightleg",
				CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.4F)).texOffs(120, 19).addBox(-1.5F, 4.0F, -3.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.4F)),
				PartPose.offset(-2.0F, -12.0F, 0.0F));
		PartDefinition leftleg = powerarmor.addOrReplaceChild("leftleg", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.41F)).mirror(false).texOffs(120, 19).mirror()
				.addBox(-1.5F, 4.0F, -3.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.4F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));
		PartDefinition rightarm = powerarmor.addOrReplaceChild("rightarm", CubeListBuilder.create().texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.4F)), PartPose.offset(-5.0F, -22.0F, 0.0F));
		PartDefinition rightshoulder = rightarm.addOrReplaceChild("rightshoulder", CubeListBuilder.create().texOffs(57, 24).addBox(-7.5F, 0.0F, -3.0F, 7.0F, 2.0F, 6.0F, new CubeDeformation(0.4F)),
				PartPose.offsetAndRotation(1.5F, -4.0F, 0.0F, 0.0F, 0.0F, -0.2618F));
		PartDefinition leftarm = powerarmor.addOrReplaceChild("leftarm", CubeListBuilder.create().texOffs(40, 16).mirror().addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.4F)).mirror(false), PartPose.offset(5.0F, -22.0F, 0.0F));
		PartDefinition leftshoulder = leftarm.addOrReplaceChild("leftshoulder", CubeListBuilder.create().texOffs(57, 24).mirror().addBox(0.5F, 0.0F, -3.0F, 7.0F, 2.0F, 6.0F, new CubeDeformation(0.4F)).mirror(false),
				PartPose.offsetAndRotation(-1.5F, -4.0F, 0.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition body = powerarmor.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.42F)).texOffs(89, 17).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 7.0F, 8.0F, new CubeDeformation(0.41F)),
				PartPose.offset(0.0F, -24.0F, 0.0F));
		PartDefinition head = powerarmor.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.4F)).texOffs(123, 24).addBox(2.0F, -7.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.4F)),
				PartPose.offset(0.0F, -24.0F, 0.0F));
		PartDefinition tube = head.addOrReplaceChild("tube", CubeListBuilder.create().texOffs(58, 15).addBox(-5.0F, -0.5F, -4.0F, 10.0F, 1.0F, 7.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(0.0F, -2.5F, 0.5F, 0.1745F, 0.0F, 0.0F));
		PartDefinition lamptow = head.addOrReplaceChild("lamptow", CubeListBuilder.create().texOffs(76, 24).addBox(-1.0F, -0.5F, -3.5F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.4F)),
				PartPose.offsetAndRotation(-5.6F, -7.0F, -0.5F, 0.0F, 0.0F, -0.7854F));
		return LayerDefinition.create(meshdefinition, 128, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		powerarmor.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.rightleg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.rightarm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.leftleg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.leftarm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}
