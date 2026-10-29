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
	private final ModelPart Corps;
	private final ModelPart Armure;
	private final ModelPart BrasDroit;
	private final ModelPart Arme;
	private final ModelPart BrasGauche;
	private final ModelPart Capuche;
	private final ModelPart Ailes;
	private final ModelPart AileDroite2;
	private final ModelPart AileGauche;
	private final ModelPart bb_main;

	public ModelBossLumiere(ModelPart root) {
		this.JambeDroite = root.getChild("JambeDroite");
		this.PiedDroit = this.JambeDroite.getChild("PiedDroit");
		this.JambeGauche = root.getChild("JambeGauche");
		this.PiedGauche = this.JambeGauche.getChild("PiedGauche");
		this.Ceinture = root.getChild("Ceinture");
		this.Corps = root.getChild("Corps");
		this.Armure = root.getChild("Armure");
		this.BrasDroit = root.getChild("BrasDroit");
		this.Arme = this.BrasDroit.getChild("Arme");
		this.BrasGauche = root.getChild("BrasGauche");
		this.Capuche = root.getChild("Capuche");
		this.Ailes = root.getChild("Ailes");
		this.AileDroite2 = this.Ailes.getChild("AileDroite2");
		this.AileGauche = this.Ailes.getChild("AileGauche");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition JambeDroite = partdefinition.addOrReplaceChild("JambeDroite",
				CubeListBuilder.create().texOffs(92, 116)
						.addBox(-29.0F, -25.0F, -1.0F, 7.0F, 25.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(120, 127)
						.addBox(-30.0F, -16.0F, -2.0F, 9.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(52, 96)
						.addBox(-31.0F, -31.0F, -3.0F, 10.0F, 12.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(18.0F, 24.0F, -3.0F));

		PartDefinition PiedDroit = JambeDroite.addOrReplaceChild("PiedDroit",
				CubeListBuilder.create().texOffs(132, 47)
						.addBox(-1.0F, -2.0F, -3.0F, 7.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(120, 140)
						.addBox(-1.0F, -4.0F, -1.0F, 7.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-28.0F, 0.0F, -6.0F));

		PartDefinition JambeGauche = partdefinition.addOrReplaceChild("JambeGauche",
				CubeListBuilder.create().texOffs(102, 61)
						.addBox(15.0F, -25.0F, -1.0F, 7.0F, 25.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(52, 118)
						.addBox(15.0F, -31.0F, -3.0F, 9.0F, 12.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(124, 34)
						.addBox(14.0F, -16.0F, -2.0F, 9.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-12.0F, 24.0F, -3.0F));

		PartDefinition PiedGauche = JambeGauche.addOrReplaceChild("PiedGauche",
				CubeListBuilder.create().texOffs(134, 91)
						.addBox(-3.0F, -2.0F, -3.0F, 7.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(146, 140)
						.addBox(-3.0F, -4.0F, -1.0F, 7.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(18.0F, 0.0F, -6.0F));

		PartDefinition Ceinture = partdefinition.addOrReplaceChild("Ceinture",
				CubeListBuilder.create().texOffs(162, 50)
						.addBox(-1.0F, -6.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(162, 84)
						.addBox(4.0F, -6.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, -4.0F, -6.0F));

		PartDefinition Ceinture_r1 = Ceinture
				.addOrReplaceChild("Ceinture_r1",
						CubeListBuilder.create().texOffs(162, 66).addBox(-1.0F, -8.0F, -1.0F, 2.0F, 7.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(7.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition Ceinture_r2 = Ceinture
				.addOrReplaceChild("Ceinture_r2",
						CubeListBuilder.create().texOffs(162, 101).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 3.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition Corps = partdefinition.addOrReplaceChild("Corps",
				CubeListBuilder.create().texOffs(0, 24)
						.addBox(-12.0F, -10.0F, -5.0F, 23.0F, 12.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-14.0F, -25.0F, -5.0F, 27.0F, 15.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(74, 50)
						.addBox(-10.0F, -27.0F, -5.0F, 20.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(120, 116)
						.addBox(-7.0F, -29.0F, -5.0F, 14.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -3.0F, 0.0F));

		PartDefinition Armure = partdefinition.addOrReplaceChild("Armure", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, -6.0F));

		PartDefinition ArmureDevant_r1 = Armure.addOrReplaceChild(
				"ArmureDevant_r1", CubeListBuilder.create().texOffs(52, 140).addBox(-4.0F, -8.0F, -1.0F, 7.0F, 17.0F,
						2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition ArmureDerriere_r1 = Armure.addOrReplaceChild("ArmureDerriere_r1",
				CubeListBuilder.create().texOffs(130, 61).addBox(-4.0F, -8.0F, -1.0F, 9.0F, 19.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 11.0F, 3.0107F, 0.0F, -3.1416F));

		PartDefinition BrasDroit = partdefinition.addOrReplaceChild("BrasDroit",
				CubeListBuilder.create().texOffs(24, 45).addBox(-5.0F, -7.0F, -10.0F, 10.0F, 10.0F, 15.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-18.0F, -23.0F, 1.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition BrasDroit_r1 = BrasDroit
				.addOrReplaceChild("BrasDroit_r1",
						CubeListBuilder.create().texOffs(74, 61).addBox(-4.0F, -25.0F, -1.0F, 7.0F, 28.0F, 7.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition Arme = BrasDroit.addOrReplaceChild("Arme", CubeListBuilder.create(),
				PartPose.offsetAndRotation(1.0F, 11.0F, -26.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition Pointe4_r1 = Arme.addOrReplaceChild("Pointe4_r1",
				CubeListBuilder.create().texOffs(164, 15)
						.addBox(-5.0F, -46.0F, 1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(164, 10)
						.addBox(0.0F, -46.0F, -4.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(162, 75)
						.addBox(-2.0F, -57.0F, -2.0F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(156, 127)
						.addBox(-3.0F, -51.0F, -2.0F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(164, 5)
						.addBox(-5.0F, -46.0F, -4.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(164, 0)
						.addBox(0.0F, -46.0F, 1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(152, 57)
						.addBox(-4.0F, -41.0F, -3.0F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(134, 101)
						.addBox(-5.0F, -43.0F, -4.0F, 7.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 112)
						.addBox(-4.0F, 13.0F, -3.0F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition Pointe1_r1 = Arme.addOrReplaceChild("Pointe1_r1",
				CubeListBuilder.create().texOffs(12, 45)
						.addBox(-2.0F, -43.0F, -3.0F, 3.0F, 64.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 45)
						.addBox(-2.0F, -43.0F, -3.0F, 3.0F, 64.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 1.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition BrasGauche = partdefinition.addOrReplaceChild("BrasGauche", CubeListBuilder.create(),
				PartPose.offset(18.0F, -23.0F, 1.0F));

		PartDefinition EpauliereGauche_r1 = BrasGauche.addOrReplaceChild(
				"EpauliereGauche_r1", CubeListBuilder.create().texOffs(24, 70).addBox(-9.0F, -7.0F, -9.0F, 10.0F, 10.0F,
						15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 0.0F, -1.0F, 1.0908F, 0.0F, 0.0F));

		PartDefinition BrasGauche_r1 = BrasGauche.addOrReplaceChild(
				"BrasGauche_r1", CubeListBuilder.create().texOffs(24, 95).addBox(-4.0F, -25.0F, -1.0F, 7.0F, 28.0F,
						7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.618F, 0.0F, 0.0F));

		PartDefinition Capuche = partdefinition.addOrReplaceChild("Capuche",
				CubeListBuilder.create().texOffs(124, 23)
						.addBox(-2.0F, -10.0F, -1.0F, 10.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(130, 82)
						.addBox(-1.0F, -11.0F, 0.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 130)
						.addBox(8.0F, -9.0F, -2.0F, 1.0F, 9.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 126)
						.addBox(-2.0F, -7.0F, -2.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 126)
						.addBox(4.0F, -7.0F, -2.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(162, 106)
						.addBox(-2.0F, -5.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(164, 20)
						.addBox(6.0F, -5.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(164, 24)
						.addBox(-2.0F, -3.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(164, 28)
						.addBox(7.0F, -3.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 122)
						.addBox(-2.0F, -9.0F, -2.0F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 130)
						.addBox(-3.0F, -9.0F, -2.0F, 1.0F, 9.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, -32.0F, -5.0F));

		PartDefinition Capuche_r1 = Capuche
				.addOrReplaceChild("Capuche_r1",
						CubeListBuilder.create().texOffs(12, 70).addBox(-10.0F, -11.0F, -1.0F, 12.0F, 2.0F, 11.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition Ailes = partdefinition.addOrReplaceChild("Ailes", CubeListBuilder.create().texOffs(122, 0)
				.addBox(-2.0F, 8.0F, 9.0F, 9.0F, 16.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, -32.0F, -5.0F));

		PartDefinition AileDroite2 = Ailes.addOrReplaceChild("AileDroite2",
				CubeListBuilder.create().texOffs(72, 0)
						.addBox(-33.0F, -25.0F, -1.0F, 23.0F, 23.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(70, 140)
						.addBox(-36.0F, -24.0F, -1.0F, 3.0F, 22.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(80, 140)
						.addBox(-39.0F, -21.0F, -1.0F, 3.0F, 22.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(90, 148)
						.addBox(-42.0F, -18.0F, -1.0F, 3.0F, 22.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(150, 148)
						.addBox(-45.0F, -15.0F, -1.0F, 3.0F, 21.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(152, 66)
						.addBox(-48.0F, -10.0F, -1.0F, 3.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 159)
						.addBox(2.0F, -11.0F, -1.0F, 3.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, 151)
						.addBox(-1.0F, -14.0F, -1.0F, 3.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(64, 25)
						.addBox(-4.0F, -17.0F, -1.0F, 3.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(10, 151)
						.addBox(-7.0F, -20.0F, -1.0F, 3.0F, 20.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(100, 148)
						.addBox(-10.0F, -23.0F, -1.0F, 3.0F, 22.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(134, 110)
						.addBox(-17.0F, -2.0F, -1.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(132, 57)
						.addBox(-14.0F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(160, 34)
						.addBox(-27.0F, -2.0F, -1.0F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(142, 57)
						.addBox(-33.0F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(102, 93)
						.addBox(-22.0F, -2.0F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, 20.0F, 17.0F, 0.201F, 0.4323F, 0.1175F));

		PartDefinition AileGauche = Ailes.addOrReplaceChild("AileGauche",
				CubeListBuilder.create().texOffs(74, 25)
						.addBox(-33.0F, -25.0F, -1.0F, 23.0F, 23.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(110, 148)
						.addBox(-36.0F, -24.0F, -1.0F, 3.0F, 22.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(120, 148)
						.addBox(-39.0F, -21.0F, -1.0F, 3.0F, 22.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(130, 148)
						.addBox(-42.0F, -18.0F, -1.0F, 3.0F, 22.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 151)
						.addBox(-45.0F, -15.0F, -1.0F, 3.0F, 21.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(60, 159)
						.addBox(-48.0F, -10.0F, -1.0F, 3.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(160, 148)
						.addBox(2.0F, -11.0F, -1.0F, 3.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(154, 0)
						.addBox(-1.0F, -14.0F, -1.0F, 3.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 151)
						.addBox(-4.0F, -17.0F, -1.0F, 3.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 151)
						.addBox(-7.0F, -20.0F, -1.0F, 3.0F, 20.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(140, 148)
						.addBox(-10.0F, -23.0F, -1.0F, 3.0F, 22.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(144, 110)
						.addBox(-17.0F, -2.0F, -1.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(154, 18)
						.addBox(-14.0F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(162, 42)
						.addBox(-27.0F, -2.0F, -1.0F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(154, 110)
						.addBox(-33.0F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(112, 93)
						.addBox(-22.0F, -2.0F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0F, 20.0F, 17.0F, 2.9032F, 0.6092F, 2.9928F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(92, 96)
				.addBox(-5.0F, -65.0F, -6.0F, 10.0F, 9.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		JambeDroite.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		JambeGauche.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Ceinture.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Corps.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Armure.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		BrasDroit.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		BrasGauche.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Capuche.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Ailes.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.JambeDroite.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.JambeGauche.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.BrasDroit.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.BrasGauche.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}