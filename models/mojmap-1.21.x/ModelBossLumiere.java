// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelBossLumiere<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "bosslumiere"), "main");
	private final ModelPart JambeDroite;
	private final ModelPart PiedDroit;
	private final ModelPart JambeGauche;
	private final ModelPart PiedGauche;
	private final ModelPart Ceinture;
	private final ModelPart bb_main;

	public ModelBossLumiere(ModelPart root) {
		this.JambeDroite = root.getChild("JambeDroite");
		this.PiedDroit = this.JambeDroite.getChild("PiedDroit");
		this.JambeGauche = root.getChild("JambeGauche");
		this.PiedGauche = this.JambeGauche.getChild("PiedGauche");
		this.Ceinture = root.getChild("Ceinture");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition JambeDroite = partdefinition.addOrReplaceChild("JambeDroite",
				CubeListBuilder.create().texOffs(-10, -5)
						.addBox(-29.0F, -25.0F, -1.0F, 9.0F, 25.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(-13, -7)
						.addBox(-30.0F, -16.0F, -2.0F, 11.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(-8, -7)
						.addBox(-32.0F, -28.0F, -2.0F, 4.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(16.0F, 24.0F, -3.0F));

		PartDefinition PiedDroit = JambeDroite.addOrReplaceChild("PiedDroit",
				CubeListBuilder.create().texOffs(-6, -6)
						.addBox(-1.0F, -2.0F, -3.0F, 9.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(-4, -4)
						.addBox(-1.0F, -4.0F, -1.0F, 9.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-28.0F, 0.0F, -6.0F));

		PartDefinition JambeGauche = partdefinition.addOrReplaceChild("JambeGauche",
				CubeListBuilder.create().texOffs(-12, -5)
						.addBox(15.0F, -25.0F, -1.0F, 9.0F, 25.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(-9, -7)
						.addBox(23.0F, -28.0F, -2.0F, 4.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(-15, -7)
						.addBox(14.0F, -16.0F, -2.0F, 11.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-10.0F, 24.0F, -3.0F));

		PartDefinition PiedGauche = JambeGauche.addOrReplaceChild("PiedGauche",
				CubeListBuilder.create().texOffs(-6, -6)
						.addBox(-3.0F, -2.0F, -3.0F, 9.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(-4, -4)
						.addBox(-3.0F, -4.0F, -1.0F, 9.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(18.0F, 0.0F, -6.0F));

		PartDefinition Ceinture = partdefinition.addOrReplaceChild("Ceinture",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-1.0F, -6.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(4.0F, -6.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, -4.0F, -6.0F));

		PartDefinition Ceinture_r1 = Ceinture
				.addOrReplaceChild("Ceinture_r1",
						CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -8.0F, -1.0F, 2.0F, 7.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(7.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition Ceinture_r2 = Ceinture
				.addOrReplaceChild("Ceinture_r2",
						CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 3.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(-20, -7)
				.addBox(-14.0F, -61.0F, -5.0F, 29.0F, 36.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition ArmureDevant_r1 = bb_main.addOrReplaceChild("ArmureDevant_r1",
				CubeListBuilder.create().texOffs(-3, 0).addBox(-4.0F, -8.0F, -1.0F, 9.0F, 13.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -24.0F, -6.0F, -0.1309F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		JambeDroite.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		JambeGauche.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Ceinture.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}