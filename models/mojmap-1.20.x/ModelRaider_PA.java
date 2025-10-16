// Made with Blockbench 5.0.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelRaider_PA<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "raider_pa"), "main");
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public ModelRaider_PA(ModelPart root) {
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

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-4.0F, -8.1778F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.8F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 33)
						.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.8F)).texOffs(60, 13)
						.addBox(-5.0F, -1.0F, 0.6667F, 10.0F, 5.0F, 4.0F, new CubeDeformation(0.8F)).texOffs(24, 46)
						.addBox(-4.0F, 0.0F, -2.6444F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.81F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Body_r1 = Body.addOrReplaceChild("Body_r1",
				CubeListBuilder.create().texOffs(32, 0).addBox(-5.0F, -6.0F, -2.5F, 10.0F, 8.0F, 5.0F,
						new CubeDeformation(0.91F)),
				PartPose.offsetAndRotation(0.0F, -3.5333F, 3.3889F, -0.3491F, 0.0F, 0.0F));

		PartDefinition Body_r2 = Body.addOrReplaceChild("Body_r2",
				CubeListBuilder.create().texOffs(0, 16).addBox(-5.0F, -6.0F, -2.5F, 10.0F, 12.0F, 5.0F,
						new CubeDeformation(0.91F)),
				PartPose.offsetAndRotation(0.0F, -3.5333F, -2.5F, 0.2618F, 0.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(32, 62)
				.addBox(-4.2444F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.65F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition cube_r1 = RightArm.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(48, 59).addBox(-2.1611F, -2.1611F, -4.0167F, 5.0F, 5.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.6611F, -2.8389F, 0.0167F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r2 = RightArm.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(30, 16).addBox(-3.3389F, -3.3389F, -4.4833F, 6.0F, 6.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.6611F, -3.3722F, 0.0167F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r3 = RightArm.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 49).addBox(-1.0F, -5.0F, -3.0F, 4.0F, 7.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.9556F, 7.0F, 0.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(48, 72)
				.addBox(0.2444F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.65F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition cube_r4 = LeftArm.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(30, 31).addBox(-2.6611F, -3.3389F, -4.4833F, 6.0F, 6.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.6611F, -3.3722F, 0.0167F, 0.0F, 0.0F, 0.2182F));

		PartDefinition cube_r5 = LeftArm.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(48, 46).addBox(-2.8389F, -2.1611F, -4.0167F, 5.0F, 5.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.6611F, -2.8389F, 0.0167F, 0.0F, 0.0F, 0.2182F));

		PartDefinition cube_r6 = LeftArm.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(60, 22).addBox(-3.0F, -5.0F, -3.0F, 4.0F, 7.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.9556F, 7.0F, 0.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(0, 62)
				.addBox(-2.7111F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.63F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition cube_r7 = RightLeg.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(60, 35).addBox(-3.0F, -5.0F, 0.0F, 4.0F, 5.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 7.0F, -3.0F, 0.0F, 0.0F, 0.0436F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(16, 62)
				.addBox(-1.2889F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.63F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));

		PartDefinition cube_r8 = LeftLeg.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(62, 0).addBox(-1.0F, -5.0F, 0.0F, 4.0F, 5.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 7.0F, -3.0F, 0.0F, 0.0F, -0.0436F));

		return LayerDefinition.create(meshdefinition, 96, 96);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}