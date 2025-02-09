// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelenclaveofficeruniform<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "enclaveofficeruniform"), "main");
	private final ModelPart enclaveofficer;
	private final ModelPart leftleg;
	private final ModelPart rightleg;
	private final ModelPart torso;
	private final ModelPart rightarm;
	private final ModelPart leftarm;
	private final ModelPart head;
	private final ModelPart visor;
	private final ModelPart visor_r1;

	public Modelenclaveofficeruniform(ModelPart root) {
		this.enclaveofficer = root.getChild("enclaveofficer");
		this.leftleg = this.enclaveofficer.getChild("leftleg");
		this.rightleg = this.enclaveofficer.getChild("rightleg");
		this.torso = this.enclaveofficer.getChild("torso");
		this.rightarm = this.enclaveofficer.getChild("rightarm");
		this.leftarm = this.enclaveofficer.getChild("leftarm");
		this.head = this.enclaveofficer.getChild("head");
		this.visor = this.head.getChild("visor");
		this.visor_r1 = this.visor.getChild("visor_r1");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition enclaveofficer = partdefinition.addOrReplaceChild("enclaveofficer", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition leftleg = enclaveofficer.addOrReplaceChild("leftleg", CubeListBuilder.create().texOffs(0, 16)
				.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.201F)),
				PartPose.offset(2.0F, -12.0F, 0.0F));

		PartDefinition rightleg = enclaveofficer.addOrReplaceChild("rightleg",
				CubeListBuilder.create().texOffs(0, 16).mirror()
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)).mirror(false),
				PartPose.offset(-2.0F, -12.0F, 0.0F));

		PartDefinition torso = enclaveofficer.addOrReplaceChild("torso", CubeListBuilder.create().texOffs(16, 16)
				.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.202F)),
				PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition rightarm = enclaveofficer.addOrReplaceChild("rightarm",
				CubeListBuilder.create().texOffs(40, 16).mirror()
						.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)).mirror(false),
				PartPose.offset(-5.0F, -22.0F, 0.0F));

		PartDefinition leftarm = enclaveofficer.addOrReplaceChild("leftarm", CubeListBuilder.create().texOffs(40, 16)
				.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offset(5.0F, -22.0F, 0.0F));

		PartDefinition head = enclaveofficer.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(
				-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.3F)), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition visor = head.addOrReplaceChild("visor", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -4.5F, -4.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition visor_r1 = visor
				.addOrReplaceChild("visor_r1",
						CubeListBuilder.create().texOffs(92, 17).addBox(-1.0F, -1.0F, -1.6F, 8.0F, 1.0F, 2.0F,
								new CubeDeformation(0.2F)),
						PartPose.offsetAndRotation(-3.0F, 0.5F, 0.0F, 0.1745F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		enclaveofficer.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
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