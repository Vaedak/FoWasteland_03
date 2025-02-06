// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelgunshot<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "gunshot"), "main");
	private final ModelPart bullet;
	private final ModelPart bone;
	private final ModelPart bone2;

	public Modelgunshot(ModelPart root) {
		this.bullet = root.getChild("bullet");
		this.bone = this.bullet.getChild("bone");
		this.bone2 = this.bullet.getChild("bone2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bullet = partdefinition.addOrReplaceChild("bullet", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bone = bullet.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(5, 6).addBox(-2.0F,
				-16.0F, 0.0F, 4.0F, 32.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -16.0F, 0.0F));

		PartDefinition bone2 = bullet.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(5, 6).addBox(-2.0F, -13.0F, 0.0F, 4.0F, 32.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -11.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bullet.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.bullet.yRot = ageInTicks / 20.f;
	}
}