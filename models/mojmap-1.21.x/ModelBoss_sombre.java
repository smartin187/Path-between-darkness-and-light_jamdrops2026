// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelBoss_sombre<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "boss_sombre"), "main");
	private final ModelPart bb_main;

	public ModelBoss_sombre(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(-4, -4)
						.addBox(-3.0F, -7.0F, -3.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -8.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(1, 1)
						.addBox(-3.0F, -5.0F, 2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 1)
						.addBox(2.0F, -5.0F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 1)
						.addBox(2.0F, -5.0F, 2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 1)
						.addBox(-4.0F, -4.0F, -3.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 1)
						.addBox(-3.0F, -4.0F, -4.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 1)
						.addBox(2.0F, -4.0F, -4.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 1)
						.addBox(3.0F, -4.0F, -3.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 1)
						.addBox(-3.0F, -4.0F, 3.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 1)
						.addBox(-4.0F, -4.0F, 2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 1)
						.addBox(3.0F, -4.0F, 2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 1)
						.addBox(2.0F, -4.0F, 3.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 1)
						.addBox(-3.0F, -5.0F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(-9, -6)
						.addBox(-4.0F, -10.0F, -4.0F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(-6, -4)
						.addBox(-3.0F, -18.0F, -3.0F, 6.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(-1, -2)
						.addBox(-4.0F, -16.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(1, 0)
						.addBox(-4.0F, -17.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(1, 0)
						.addBox(-4.0F, -12.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(3.0F, -12.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(3.0F, -17.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(-3, -2)
						.addBox(3.0F, -16.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(1, 1)
						.addBox(-3.0F, -18.0F, 3.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-5.0F, -20.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.0F, -21.0F, 3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(-1, -1)
						.addBox(-7.0F, -22.0F, 1.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(-2, -2)
						.addBox(-8.0F, -23.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(-2, -2)
						.addBox(-8.0F, -23.0F, -6.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(-1, -1)
						.addBox(-9.0F, -23.0F, -4.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(-1, -1)
						.addBox(-8.0F, -24.0F, -4.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(1, 1)
						.addBox(1.0F, -18.0F, 3.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(2.0F, -19.0F, 3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(3.0F, -20.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(4.0F, -21.0F, 3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(-1, -1)
						.addBox(5.0F, -22.0F, 1.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(-2, -2)
						.addBox(6.0F, -23.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(-1, -2)
						.addBox(7.0F, -23.0F, -6.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, -1)
						.addBox(7.0F, -24.0F, -4.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, -1)
						.addBox(8.0F, -23.0F, -4.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, -19.0F, 3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(-2, -1)
						.addBox(-2.5F, -24.0F, -2.0F, 5.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(1, 1)
						.addBox(-1.5F, -24.0F, -3.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(-3, -2)
						.addBox(-2.5F, -25.0F, -3.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(2, 1)
						.addBox(-3.5F, -24.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 0)
						.addBox(-3.5F, -24.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(1, 1)
						.addBox(2.5F, -24.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(2.5F, -24.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(2, 1)
						.addBox(-2.5F, -24.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 1)
						.addBox(1.5F, -24.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 1)
						.addBox(-0.5F, -22.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(-1, 1)
						.addBox(-2.5F, -24.0F, 1.0F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(-3, -2)
						.addBox(-2.0F, -5.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(1, 1)
						.addBox(1.0F, -17.0F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 1)
						.addBox(1.0F, -18.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 1)
						.addBox(1.0F, -17.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 1)
						.addBox(-3.0F, -17.0F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 1)
						.addBox(-2.0F, -18.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 1)
						.addBox(-2.0F, -17.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 1)
						.addBox(1.0F, -13.0F, -4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 1)
						.addBox(2.0F, -13.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 1)
						.addBox(1.0F, -13.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 1)
						.addBox(-3.0F, -13.0F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 1)
						.addBox(-2.0F, -12.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 1)
						.addBox(-2.0F, -13.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 1)
						.addBox(1.0F, -15.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 1)
						.addBox(-3.0F, -15.0F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 1)
						.addBox(-2.0F, -15.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 1)
						.addBox(1.0F, -15.0F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(-1, -1)
						.addBox(-1.0F, -12.0F, 3.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(-1, -1)
						.addBox(-1.0F, -11.0F, 5.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(-1, 0)
						.addBox(-3.0F, -10.0F, 7.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(-1, 0)
						.addBox(-6.0F, -9.0F, 7.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(-2, -2)
						.addBox(-7.0F, -9.0F, 4.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(-2, -2)
						.addBox(-8.0F, -8.0F, 1.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(-1, -2)
						.addBox(-8.0F, -7.0F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, -1)
						.addBox(-8.0F, -6.0F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, -1)
						.addBox(-9.0F, -7.0F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(-8, -8)
						.addBox(-1.0F, -2.0F, -5.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(-8, -8)
						.addBox(9.0F, -2.0F, -5.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, -12.0F, -4.0F, 0.4363F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}