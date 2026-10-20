package net.mcreator.jamdrops.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelBossLumiere<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("jamdrops", "model_boss_lumiere"), "main");
	public final ModelPart JambeDroite;
	public final ModelPart PiedDroit;
	public final ModelPart JambeGauche;
	public final ModelPart PiedGauche;
	public final ModelPart Ceinture;
	public final ModelPart Corps;
	public final ModelPart Armure;
	public final ModelPart BrasDroit;
	public final ModelPart Arme;
	public final ModelPart BrasGauche;
	public final ModelPart bb_main;

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
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition JambeDroite = partdefinition.addOrReplaceChild("JambeDroite", CubeListBuilder.create().texOffs(102, 67).addBox(-29.0F, -25.0F, -1.0F, 7.0F, 25.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 115)
				.addBox(-30.0F, -16.0F, -2.0F, 9.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(72, 0).addBox(-31.0F, -31.0F, -3.0F, 10.0F, 12.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(18.0F, 24.0F, -3.0F));
		PartDefinition PiedDroit = JambeDroite.addOrReplaceChild("PiedDroit",
				CubeListBuilder.create().texOffs(110, 121).addBox(-1.0F, -2.0F, -3.0F, 7.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(130, 42).addBox(-1.0F, -4.0F, -1.0F, 7.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-28.0F, 0.0F, -6.0F));
		PartDefinition JambeGauche = partdefinition.addOrReplaceChild("JambeGauche", CubeListBuilder.create().texOffs(102, 35).addBox(15.0F, -25.0F, -1.0F, 7.0F, 25.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(102, 99)
				.addBox(15.0F, -31.0F, -3.0F, 9.0F, 12.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(66, 105).addBox(14.0F, -16.0F, -2.0F, 9.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(-12.0F, 24.0F, -3.0F));
		PartDefinition PiedGauche = JambeGauche.addOrReplaceChild("PiedGauche",
				CubeListBuilder.create().texOffs(122, 23).addBox(-3.0F, -2.0F, -3.0F, 7.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(130, 50).addBox(-3.0F, -4.0F, -1.0F, 7.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(18.0F, 0.0F, -6.0F));
		PartDefinition Ceinture = partdefinition.addOrReplaceChild("Ceinture",
				CubeListBuilder.create().texOffs(66, 95).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(130, 89).addBox(4.0F, -6.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, -4.0F, -6.0F));
		PartDefinition Ceinture_r1 = Ceinture.addOrReplaceChild("Ceinture_r1", CubeListBuilder.create().texOffs(64, 35).addBox(-1.0F, -8.0F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5708F));
		PartDefinition Ceinture_r2 = Ceinture.addOrReplaceChild("Ceinture_r2", CubeListBuilder.create().texOffs(110, 131).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 1.5708F));
		PartDefinition Corps = partdefinition
				.addOrReplaceChild(
						"Corps", CubeListBuilder.create().texOffs(0, 24).addBox(-12.0F, -10.0F, -5.0F, 23.0F, 12.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-14.0F, -25.0F, -5.0F, 27.0F, 15.0F, 9.0F, new CubeDeformation(0.0F))
								.texOffs(64, 24).addBox(-10.0F, -27.0F, -5.0F, 20.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(112, 0).addBox(-7.0F, -29.0F, -5.0F, 14.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)),
						PartPose.offset(0.0F, -3.0F, 0.0F));
		PartDefinition Armure = partdefinition.addOrReplaceChild("Armure", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -6.0F));
		PartDefinition ArmureDevant_r1 = Armure.addOrReplaceChild("ArmureDevant_r1", CubeListBuilder.create().texOffs(0, 128).addBox(-4.0F, -8.0F, -1.0F, 7.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1309F, 0.0F, 0.0F));
		PartDefinition ArmureDerriere_r1 = Armure.addOrReplaceChild("ArmureDerriere_r1", CubeListBuilder.create().texOffs(88, 121).addBox(-4.0F, -8.0F, -1.0F, 9.0F, 19.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 11.0F, 3.0107F, 0.0F, -3.1416F));
		PartDefinition BrasDroit = partdefinition.addOrReplaceChild("BrasDroit", CubeListBuilder.create().texOffs(24, 45).addBox(-5.0F, -7.0F, -10.0F, 10.0F, 10.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-18.0F, -23.0F, 1.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition BrasDroit_r1 = BrasDroit.addOrReplaceChild("BrasDroit_r1", CubeListBuilder.create().texOffs(74, 35).addBox(-4.0F, -25.0F, -1.0F, 7.0F, 28.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));
		PartDefinition Arme = BrasDroit.addOrReplaceChild("Arme", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 11.0F, -26.0F, -0.3491F, 0.0F, 0.0F));
		PartDefinition Cristal_r1 = Arme.addOrReplaceChild("Cristal_r1", CubeListBuilder.create().texOffs(18, 128).addBox(-2.0F, -3.0F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -45.0F, -18.0F, -0.3054F, 0.0F, -0.3054F));
		PartDefinition Pointe4_r1 = Arme.addOrReplaceChild("Pointe4_r1",
				CubeListBuilder.create().texOffs(26, 134).addBox(-5.0F, -46.0F, 1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 134).addBox(0.0F, -46.0F, -4.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(126, 131)
						.addBox(-5.0F, -46.0F, -4.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(118, 131).addBox(0.0F, -46.0F, 1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(130, 68)
						.addBox(-4.0F, -41.0F, -3.0F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(130, 33).addBox(-5.0F, -43.0F, -4.0F, 7.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(130, 58)
						.addBox(-4.0F, 13.0F, -3.0F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3491F, 0.0F, 0.0F));
		PartDefinition Pointe1_r1 = Arme.addOrReplaceChild("Pointe1_r1",
				CubeListBuilder.create().texOffs(12, 45).addBox(-2.0F, -43.0F, -3.0F, 3.0F, 64.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 45).addBox(-2.0F, -43.0F, -3.0F, 3.0F, 64.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 1.0F, 0.3491F, 0.0F, 0.0F));
		PartDefinition BrasGauche = partdefinition.addOrReplaceChild("BrasGauche", CubeListBuilder.create(), PartPose.offset(18.0F, -23.0F, 1.0F));
		PartDefinition EpauliereGauche_r1 = BrasGauche.addOrReplaceChild("EpauliereGauche_r1", CubeListBuilder.create().texOffs(24, 70).addBox(-9.0F, -7.0F, -9.0F, 10.0F, 10.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 0.0F, -1.0F, 1.0908F, 0.0F, 0.0F));
		PartDefinition BrasGauche_r1 = BrasGauche.addOrReplaceChild("BrasGauche_r1", CubeListBuilder.create().texOffs(74, 70).addBox(-4.0F, -25.0F, -1.0F, 7.0F, 28.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.618F, 0.0F, 0.0F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(24, 95).addBox(-5.0F, -65.0F, -6.0F, 10.0F, 9.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(36, 115).addBox(5.0F, -65.0F, -7.0F, 1.0F, 9.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(62, 118)
						.addBox(-6.0F, -65.0F, -7.0F, 1.0F, 9.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(130, 81).addBox(-5.0F, -63.0F, -7.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(130, 77)
						.addBox(-5.0F, -65.0F, -7.0F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(134, 131).addBox(-5.0F, -61.0F, -7.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 128)
						.addBox(-5.0F, -59.0F, -7.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(34, 136).addBox(4.0F, -59.0F, -7.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(134, 135)
						.addBox(3.0F, -61.0F, -7.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(130, 85).addBox(1.0F, -63.0F, -7.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(113, 12)
						.addBox(-5.0F, -66.0F, -6.0F, 10.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition Capuche_r1 = bb_main.addOrReplaceChild("Capuche_r1", CubeListBuilder.create().texOffs(12, 70).addBox(-10.0F, -11.0F, -1.0F, 12.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -56.0F, -5.0F, 0.0F, 0.0F, 1.5708F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		JambeDroite.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		JambeGauche.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		Ceinture.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		Corps.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		Armure.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		BrasDroit.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		BrasGauche.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}
}