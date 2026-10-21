// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelPretreMob<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "pretremob"), "main");
	private final ModelPart BrasGauche;
	private final ModelPart BrasDroit;
	private final ModelPart bb_main;

	public ModelPretreMob(ModelPart root) {
		this.BrasGauche = root.getChild("BrasGauche");
		this.BrasDroit = root.getChild("BrasDroit");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition BrasGauche = partdefinition.addOrReplaceChild("BrasGauche", CubeListBuilder.create(),
				PartPose.offset(5.0F, 4.0F, 0.0F));

		PartDefinition Epaule_r1 = BrasGauche.addOrReplaceChild("Epaule_r1",
				CubeListBuilder.create().texOffs(25, 0)
						.addBox(-4.0F, 2.0F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(28, 0)
						.addBox(-1.0F, -2.0F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, -1.0F, -1.0472F, 0.0F, 0.0F));

		PartDefinition BrasDroit = partdefinition.addOrReplaceChild("BrasDroit", CubeListBuilder.create(),
				PartPose.offset(-6.0F, 4.0F, 0.0F));

		PartDefinition Epaule_r2 = BrasDroit.addOrReplaceChild("Epaule_r2",
				CubeListBuilder.create().texOffs(19, 29)
						.addBox(2.0F, 2.0F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 29)
						.addBox(-1.0F, -2.0F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, -1.0F, -1.0472F, 0.0F, 0.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(24, 14)
						.addBox(0.0F, -11.0F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 29)
						.addBox(-4.0F, -11.0F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 14)
						.addBox(-4.0F, -22.0F, -2.0F, 8.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(2, 1)
						.addBox(-3.0F, -28.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(-9, -6)
						.addBox(-4.0F, -29.0F, -4.0F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(1, 1)
						.addBox(1.0F, -27.0F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(-3.0F, -27.0F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 1)
						.addBox(2.0F, -26.0F, -4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 1)
						.addBox(-3.0F, -26.0F, -4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Capuche4_r1 = bb_main.addOrReplaceChild("Capuche4_r1",
				CubeListBuilder.create().texOffs(-5, -3).addBox(-3.0F, 0.0F, -2.0F, 7.0F, 1.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -25.0F, 0.0F, 0.0F, 1.5708F, 1.5708F));

		PartDefinition Capuche3_r1 = bb_main.addOrReplaceChild("Capuche3_r1",
				CubeListBuilder.create().texOffs(-5, -3).addBox(-3.0F, 0.0F, -2.0F, 7.0F, 1.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -25.0F, 0.0F, 0.0F, 1.5708F, 1.5708F));

		PartDefinition Capuche2_r1 = bb_main.addOrReplaceChild("Capuche2_r1",
				CubeListBuilder.create().texOffs(-7, -4).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -25.0F, 4.0F, -1.5708F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		BrasGauche.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		BrasDroit.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}