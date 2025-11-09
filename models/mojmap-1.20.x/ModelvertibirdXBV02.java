// Made with Blockbench 5.0.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelvertibirdXBV02<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "vertibirdxbv02"), "main");
	private final ModelPart vertibird;
	private final ModelPart wheelleg2;
	private final ModelPart wheelleg;
	private final ModelPart wheelleg3;
	private final ModelPart Turret;
	private final ModelPart TurretBarrel;
	private final ModelPart ball1;
	private final ModelPart ball2;
	private final ModelPart wing2;
	private final ModelPart propeller2;
	private final ModelPart wing;
	private final ModelPart propeller;
	private final ModelPart tail;
	private final ModelPart tailback;

	public ModelvertibirdXBV02(ModelPart root) {
		this.vertibird = root.getChild("vertibird");
		this.wheelleg2 = this.vertibird.getChild("wheelleg2");
		this.wheelleg = this.vertibird.getChild("wheelleg");
		this.wheelleg3 = this.vertibird.getChild("wheelleg3");
		this.Turret = this.vertibird.getChild("Turret");
		this.TurretBarrel = this.Turret.getChild("TurretBarrel");
		this.ball1 = this.vertibird.getChild("ball1");
		this.ball2 = this.vertibird.getChild("ball2");
		this.wing2 = this.vertibird.getChild("wing2");
		this.propeller2 = this.wing2.getChild("propeller2");
		this.wing = this.vertibird.getChild("wing");
		this.propeller = this.wing.getChild("propeller");
		this.tail = this.vertibird.getChild("tail");
		this.tailback = this.tail.getChild("tailback");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition vertibird = partdefinition.addOrReplaceChild("vertibird", CubeListBuilder.create()
				.texOffs(0, 166).addBox(-17.0F, -9.25F, -56.5F, 34.0F, 25.0F, 25.0F, new CubeDeformation(0.0F))
				.texOffs(297, 257).addBox(-4.0F, -4.25F, -58.5F, 8.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(180, 335).addBox(16.0F, 7.75F, -59.5F, 7.0F, 7.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(211, 46).addBox(-19.0F, -9.275F, -60.5F, 38.0F, 2.0F, 17.0F, new CubeDeformation(0.0F))
				.texOffs(147, 306).addBox(-21.0F, -6.25F, -57.5F, 12.0F, 12.0F, 13.0F, new CubeDeformation(0.0F))
				.texOffs(198, 309).addBox(9.0F, -6.25F, -57.5F, 12.0F, 12.0F, 13.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-23.0F, -22.0F, -24.0F, 46.0F, 40.0F, 59.0F, new CubeDeformation(0.0F))
				.texOffs(0, 217).addBox(-29.0F, -23.0F, -30.0F, 15.0F, 36.0F, 21.0F, new CubeDeformation(0.0F))
				.texOffs(224, 212).addBox(14.0F, -23.0F, -30.0F, 15.0F, 36.0F, 21.0F, new CubeDeformation(0.0F))
				.texOffs(127, 158).addBox(-8.0F, -25.0F, -24.0F, 16.0F, 3.0F, 50.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -2.0F, 0.0F));

		PartDefinition cube_r1 = vertibird.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(247, 270).addBox(0.0F, -18.4316F, 14.2355F, 0.0F, 3.0F, 35.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.875F, 18.1965F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r2 = vertibird.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(127, 100).addBox(-19.0F, -26.6267F, -57.7421F, 38.0F, 30.0F, 27.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.875F, 18.1965F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r3 = vertibird.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(50, 289).addBox(1.9775F, -5.9775F, -79.6965F, 4.0F, 4.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.875F, 18.1965F, 0.0F, 0.0F, 2.3562F));

		PartDefinition wheelleg2 = vertibird.addOrReplaceChild("wheelleg2",
				CubeListBuilder.create().texOffs(296, 311).mirror()
						.addBox(-11.0F, -11.6418F, 4.0137F, 14.0F, 17.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(318, 257).mirror()
						.addBox(-12.0F, -5.6418F, 2.0137F, 9.0F, 12.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-13.0F, 19.6418F, -11.0137F));

		PartDefinition cube_r4 = wheelleg2.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(73, 256).mirror()
						.addBox(-32.125F, -10.25F, -26.1965F, 6.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(100, 256).mirror()
						.addBox(-31.125F, -9.25F, -25.1965F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(13.0F, -25.5168F, 29.2102F, 0.0F, 0.0F, -1.5708F));

		PartDefinition wheelleg = vertibird.addOrReplaceChild("wheelleg", CubeListBuilder.create().texOffs(296, 311)
				.addBox(-3.0F, -11.6418F, 4.0137F, 14.0F, 17.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(318, 257)
				.addBox(3.0F, -5.6418F, 2.0137F, 9.0F, 12.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(13.0F, 19.6418F, -11.0137F));

		PartDefinition cube_r5 = wheelleg.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(73, 256)
				.addBox(26.125F, -10.25F, -26.1965F, 6.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(100, 256)
				.addBox(27.125F, -9.25F, -25.1965F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.0F, -25.5168F, 29.2102F, 0.0F, 0.0F, 1.5708F));

		PartDefinition wheelleg3 = vertibird.addOrReplaceChild("wheelleg3",
				CubeListBuilder.create().texOffs(296, 311).mirror()
						.addBox(-8.7F, -11.085F, 1.4082F, 14.0F, 17.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(318, 257).mirror()
						.addBox(-9.7F, -5.085F, -0.5918F, 9.0F, 12.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.3F, 19.085F, 22.5918F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r6 = wheelleg3.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(119, 166).mirror()
						.addBox(-13.0953F, 25.1442F, -7.4784F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(4.3953F, -24.96F, 4.3F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r7 = wheelleg3.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(73, 256).mirror()
						.addBox(-32.125F, 0.6547F, -3.8918F, 6.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(100, 256).mirror()
						.addBox(-31.125F, 1.6547F, -2.8918F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.3953F, -24.96F, 4.3F, 0.0F, 0.0F, -1.5708F));

		PartDefinition Turret = vertibird.addOrReplaceChild("Turret",
				CubeListBuilder.create().texOffs(49, 275)
						.addBox(-2.5F, -3.625F, -3.25F, 5.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(279, 202)
						.addBox(-1.5F, -1.625F, -7.25F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(18.5F, 14.375F, -58.25F, 0.0F, 0.0F, 0.0F));

		PartDefinition TurretBarrel = Turret.addOrReplaceChild("TurretBarrel",
				CubeListBuilder.create().texOffs(261, 337)
						.addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(260, 202)
						.addBox(-2.0F, -2.0F, -5.5F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -0.125F, -14.75F));

		PartDefinition ball1 = vertibird.addOrReplaceChild("ball1",
				CubeListBuilder.create().texOffs(318, 279)
						.addBox(-25.0F, -19.0F, 1.0F, 9.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(337, 298)
						.addBox(-21.0F, -10.0F, 1.0F, 0.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.0F, 29.75F, -54.5F));

		PartDefinition ball2 = vertibird.addOrReplaceChild("ball2",
				CubeListBuilder.create().texOffs(322, 46)
						.addBox(8.0F, -19.0F, 1.0F, 9.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(337, 312)
						.addBox(13.0F, -10.0F, 1.0F, 0.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.0F, 29.75F, -54.5F));

		PartDefinition wing2 = vertibird.addOrReplaceChild("wing2", CubeListBuilder.create().texOffs(49, 303).mirror()
				.addBox(-43.0F, -13.4F, -5.9F, 12.0F, 23.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 330).mirror().addBox(-41.0F, 9.6F, -3.9F, 8.0F, 10.0F, 8.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(260, 183).mirror()
				.addBox(-31.0F, -6.4F, -1.9F, 36.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(211, 66).mirror().addBox(-6.0F, -8.4F, -5.9F, 11.0F, 16.0F, 11.0F, new CubeDeformation(0.0F))
				.mirror(false), PartPose.offset(-22.0F, -15.6F, -1.1F));

		PartDefinition propeller2 = wing2.addOrReplaceChild("propeller2",
				CubeListBuilder.create().texOffs(211, 335).mirror()
						.addBox(-3.0F, -8.5F, -3.0F, 6.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(260, 147).mirror()
						.addBox(-4.0F, -6.5F, -38.0F, 8.0F, 0.0F, 35.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-37.0F, -12.9F, 0.1F));

		PartDefinition cube_r8 = propeller2.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(260, 147).mirror()
						.addBox(-23.1965F, -29.125F, 21.0F, 8.0F, 0.0F, 35.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(59.0F, 22.625F, 19.1965F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r9 = propeller2.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(260, 147).mirror()
						.addBox(55.0F, -29.125F, -18.8035F, 8.0F, 0.0F, 35.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(59.0F, 22.625F, 19.1965F, 0.0F, -3.1416F, 0.0F));

		PartDefinition cube_r10 = propeller2.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(260, 147).mirror()
						.addBox(15.1965F, -29.125F, -97.0F, 8.0F, 0.0F, 35.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(59.0F, 22.625F, 19.1965F, 0.0F, 1.5708F, 0.0F));

		PartDefinition wing = vertibird.addOrReplaceChild("wing",
				CubeListBuilder.create().texOffs(49, 303)
						.addBox(31.0F, -13.4F, -5.9F, 12.0F, 23.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 330)
						.addBox(33.0F, 9.6F, -3.9F, 8.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(260, 183)
						.addBox(-5.0F, -6.4F, -1.9F, 36.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(211, 66)
						.addBox(-5.0F, -8.4F, -5.9F, 11.0F, 16.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offset(22.0F, -15.6F, -1.1F));

		PartDefinition propeller = wing.addOrReplaceChild("propeller",
				CubeListBuilder.create().texOffs(211, 335)
						.addBox(-3.0F, -8.5F, -3.0F, 6.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(260, 147)
						.addBox(-4.0F, -6.5F, -38.0F, 8.0F, 0.0F, 35.0F, new CubeDeformation(0.0F)),
				PartPose.offset(37.0F, -12.9F, 0.1F));

		PartDefinition cube_r11 = propeller.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(260, 147).addBox(15.1965F, -29.125F, 21.0F, 8.0F, 0.0F, 35.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-59.0F, 22.625F, 19.1965F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r12 = propeller.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(260, 147).addBox(-63.0F, -29.125F, -18.8035F, 8.0F, 0.0F, 35.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-59.0F, 22.625F, 19.1965F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r13 = propeller.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(260, 147).addBox(-23.1965F, -29.125F, -97.0F, 8.0F, 0.0F, 35.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-59.0F, 22.625F, 19.1965F, 0.0F, -1.5708F, 0.0F));

		PartDefinition tail = vertibird.addOrReplaceChild("tail",
				CubeListBuilder.create().texOffs(119, 212)
						.addBox(-11.0F, -22.0F, 0.5F, 22.0F, 24.0F, 30.0F, new CubeDeformation(0.0F)).texOffs(0, 100)
						.addBox(-15.0F, -26.0F, -27.5F, 30.0F, 32.0F, 33.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 11.0F, 44.5F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r14 = tail.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(211, 0).addBox(-15.0F, 20.6849F, -36.246F, 30.0F, 8.0F, 37.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -22.1681F, -22.0276F, -0.2182F, 0.0F, 0.0F));

		PartDefinition tailback = tail.addOrReplaceChild("tailback",
				CubeListBuilder.create().texOffs(258, 66)
						.addBox(-5.0F, 0.0F, 0.5F, 10.0F, 14.0F, 30.0F, new CubeDeformation(0.0F)).texOffs(73, 217)
						.addBox(-3.0F, -11.0F, 30.5F, 6.0F, 24.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(0, 275)
						.addBox(0.0F, -17.0F, 30.5F, 0.0F, 30.0F, 24.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -18.0F, 30.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r15 = tailback.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(323, 334).addBox(0.3062F, 6.5303F, 82.1965F, 0.0F, 7.0F, 14.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.1915F, -51.6965F, 0.0F, 0.0F, 0.5236F));

		PartDefinition cube_r16 = tailback.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(294, 334).addBox(-0.3062F, 6.5303F, 82.1965F, 0.0F, 7.0F, 14.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.1915F, -51.6965F, 0.0F, 0.0F, -0.5236F));

		return LayerDefinition.create(meshdefinition, 512, 512);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		vertibird.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.vertibird.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.vertibird.xRot = headPitch / (180F / (float) Math.PI);
		this.propeller.yRot = ageInTicks;
		this.TurretBarrel.zRot = ageInTicks;
		this.Turret.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Turret.xRot = headPitch / (180F / (float) Math.PI);
		this.propeller2.yRot = ageInTicks;
		this.wing2.xRot = headPitch / (180F / (float) Math.PI);
		this.wing.xRot = headPitch / (180F / (float) Math.PI);
	}
}