// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelbrahmin<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "brahmin"), "main");
	private final ModelPart brahmin;
	private final ModelPart body_r1;
	private final ModelPart lefthead_r1;
	private final ModelPart armleft;
	private final ModelPart armright;
	private final ModelPart legleft;
	private final ModelPart legright;
	private final ModelPart lefthead;
	private final ModelPart head;
	private final ModelPart lefhead_r1;
	private final ModelPart lefhead;
	private final ModelPart body;

	public Modelbrahmin(ModelPart root) {
		this.brahmin = root.getChild("brahmin");
		this.body_r1 = this.brahmin.getChild("body_r1");
		this.lefthead_r1 = this.brahmin.getChild("lefthead_r1");
		this.armleft = this.brahmin.getChild("armleft");
		this.armright = this.brahmin.getChild("armright");
		this.legleft = this.brahmin.getChild("legleft");
		this.legright = this.brahmin.getChild("legright");
		this.lefthead = this.brahmin.getChild("lefthead");
		this.head = this.brahmin.getChild("head");
		this.lefhead_r1 = this.head.getChild("lefhead_r1");
		this.lefhead = this.head.getChild("lefhead");
		this.body = this.brahmin.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition brahmin = partdefinition.addOrReplaceChild("brahmin", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body_r1 = brahmin.addOrReplaceChild("body_r1", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -19.0F, 2.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition lefthead_r1 = brahmin.addOrReplaceChild("lefthead_r1", CubeListBuilder.create(),
				PartPose.offsetAndRotation(4.0F, -20.3333F, -6.3333F, 0.0F, -0.5236F, 0.0F));

		PartDefinition armleft = brahmin.addOrReplaceChild("armleft",
				CubeListBuilder.create().texOffs(0, 16).mirror()
						.addBox(-2.0F, 0.0F, -1.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(4.0F, -12.0F, -6.0F));

		PartDefinition armright = brahmin.addOrReplaceChild("armright", CubeListBuilder.create().texOffs(0, 16)
				.addBox(-2.0F, 0.0F, -1.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.0F, -12.0F, -6.0F));

		PartDefinition legleft = brahmin.addOrReplaceChild("legleft",
				CubeListBuilder.create().texOffs(0, 16).mirror()
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(4.0F, -12.0F, 7.0F));

		PartDefinition legright = brahmin.addOrReplaceChild("legright", CubeListBuilder.create().texOffs(0, 16)
				.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.0F, -12.0F, 7.0F));

		PartDefinition lefthead = brahmin.addOrReplaceChild("lefthead", CubeListBuilder.create().texOffs(0, 0).mirror()
				.addBox(-4.0F, -3.6667F, -5.6667F, 8.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(22, 0).mirror().addBox(4.0F, -4.6667F, -3.6667F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(22, 0).mirror()
				.addBox(-5.0F, -4.6667F, -3.6667F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.0F, -20.3333F, -6.3333F, 0.0F, -0.5236F, 0.0F));

		PartDefinition head = brahmin.addOrReplaceChild("head", CubeListBuilder.create(),
				PartPose.offset(0.0F, -20.0F, -2.0F));

		PartDefinition lefhead_r1 = head.addOrReplaceChild("lefhead_r1", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-4.0F, -0.3333F, -4.3333F, 0.0F, 0.5236F, 0.0F));

		PartDefinition lefhead = head.addOrReplaceChild("lefhead",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.0F, -3.6667F, -5.6667F, 8.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(22, 0)
						.addBox(-5.0F, -4.6667F, -3.6667F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 0)
						.addBox(4.0F, -4.6667F, -3.6667F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, -0.3333F, -4.3333F, 0.0F, 0.5236F, 0.0F));

		PartDefinition body = brahmin.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(18, 4)
						.addBox(-6.0F, -10.0F, -7.0F, 12.0F, 18.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(52, 0)
						.addBox(-2.0F, 2.0F, -8.0F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -19.0F, 2.0F, 1.5708F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		brahmin.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.armright.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.legright.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.lefthead.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.lefthead.xRot = headPitch / (180F / (float) Math.PI);
		this.armleft.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.legleft.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}