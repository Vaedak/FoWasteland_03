// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelraiderwarmongerarmor<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "raiderwarmongerarmor"), "main");
	private final ModelPart armor;
	private final ModelPart rightleg;
	private final ModelPart leftleg;
	private final ModelPart rightarm;
	private final ModelPart leftarm;
	private final ModelPart body;
	private final ModelPart head;

	public Modelraiderwarmongerarmor(ModelPart root) {
		this.armor = root.getChild("armor");
		this.rightleg = this.armor.getChild("rightleg");
		this.leftleg = this.armor.getChild("leftleg");
		this.rightarm = this.armor.getChild("rightarm");
		this.leftarm = this.armor.getChild("leftarm");
		this.body = this.armor.getChild("body");
		this.head = this.armor.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition armor = partdefinition.addOrReplaceChild("armor", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition rightleg = armor.addOrReplaceChild("rightleg", CubeListBuilder.create().texOffs(0, 16)
				.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offset(-2.0F, -12.0F, 0.0F));

		PartDefinition leftleg = armor.addOrReplaceChild("leftleg",
				CubeListBuilder.create().texOffs(0, 16).mirror()
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)).mirror(false),
				PartPose.offset(2.0F, -12.0F, 0.0F));

		PartDefinition rightarm = armor.addOrReplaceChild("rightarm", CubeListBuilder.create().texOffs(40, 16)
				.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offset(-5.0F, -22.0F, 0.0F));

		PartDefinition leftarm = armor.addOrReplaceChild("leftarm",
				CubeListBuilder.create().texOffs(40, 16).mirror()
						.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)).mirror(false),
				PartPose.offset(5.0F, -22.0F, 0.0F));

		PartDefinition body = armor.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(16, 16)
						.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)).texOffs(-3, 0)
						.addBox(-1.5F, -1.0F, 2.5F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 3)
						.addBox(-0.5F, -1.0F, 3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition tank_r1 = body
				.addOrReplaceChild("tank_r1",
						CubeListBuilder.create().texOffs(48, 4).addBox(-2.0F, -8.0F, -1.0F, 4.0F, 8.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 8.0F, 5.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition head = armor.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F,
				-8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)), PartPose.offset(0.0F, -24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		armor.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.rightleg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.rightarm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.leftleg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.leftarm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}