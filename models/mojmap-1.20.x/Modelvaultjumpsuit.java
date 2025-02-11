// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelvaultjumpsuit<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "vaultjumpsuit"), "main");
	private final ModelPart jumpsuit;
	private final ModelPart leftleg;
	private final ModelPart rightleg;
	private final ModelPart rightarm;
	private final ModelPart leftarm;
	private final ModelPart body;

	public Modelvaultjumpsuit(ModelPart root) {
		this.jumpsuit = root.getChild("jumpsuit");
		this.leftleg = this.jumpsuit.getChild("leftleg");
		this.rightleg = this.jumpsuit.getChild("rightleg");
		this.rightarm = this.jumpsuit.getChild("rightarm");
		this.leftarm = this.jumpsuit.getChild("leftarm");
		this.body = this.jumpsuit.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition jumpsuit = partdefinition.addOrReplaceChild("jumpsuit", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition leftleg = jumpsuit.addOrReplaceChild("leftleg",
				CubeListBuilder.create().texOffs(0, 16).mirror()
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.2601F)).mirror(false),
				PartPose.offset(2.0F, -12.0F, 0.0F));

		PartDefinition rightleg = jumpsuit.addOrReplaceChild("rightleg", CubeListBuilder.create().texOffs(0, 16)
				.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.26F)),
				PartPose.offset(-2.0F, -12.0F, 0.0F));

		PartDefinition rightarm = jumpsuit.addOrReplaceChild("rightarm", CubeListBuilder.create().texOffs(40, 16)
				.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.26F)),
				PartPose.offset(-5.0F, -22.0F, 0.0F));

		PartDefinition leftarm = jumpsuit.addOrReplaceChild("leftarm",
				CubeListBuilder.create().texOffs(40, 16).mirror()
						.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.26F)).mirror(false),
				PartPose.offset(5.0F, -22.0F, 0.0F));

		PartDefinition body = jumpsuit.addOrReplaceChild("body", CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F,
				0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.261F)), PartPose.offset(0.0F, -24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		jumpsuit.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.rightleg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.rightarm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.leftleg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.leftarm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}