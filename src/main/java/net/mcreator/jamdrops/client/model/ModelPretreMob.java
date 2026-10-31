package net.mcreator.jamdrops.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
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
public class ModelPretreMob<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("jamdrops", "model_pretre_mob"), "main");
	public final ModelPart JambeGauche;
	public final ModelPart JambeDroite;
	public final ModelPart BrasGauche;
	public final ModelPart BrasDroit;
	public final ModelPart Capuche;
	public final ModelPart bb_main;

	public ModelPretreMob(ModelPart root) {
		this.JambeGauche = root.getChild("JambeGauche");
		this.JambeDroite = root.getChild("JambeDroite");
		this.BrasGauche = root.getChild("BrasGauche");
		this.BrasDroit = root.getChild("BrasDroit");
		this.Capuche = root.getChild("Capuche");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition JambeGauche = partdefinition.addOrReplaceChild("JambeGauche", CubeListBuilder.create().texOffs(24, 14).addBox(-1.0F, -11.0F, -1.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 24.0F, -1.0F));
		PartDefinition JambeDroite = partdefinition.addOrReplaceChild("JambeDroite", CubeListBuilder.create().texOffs(0, 29).addBox(-1.0F, -11.0F, -1.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 24.0F, -1.0F));
		PartDefinition BrasGauche = partdefinition.addOrReplaceChild("BrasGauche", CubeListBuilder.create(), PartPose.offset(5.0F, 4.0F, 0.0F));
		PartDefinition Epaule_r1 = BrasGauche.addOrReplaceChild("Epaule_r1",
				CubeListBuilder.create().texOffs(25, 0).addBox(-4.0F, 2.0F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(28, 0).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, -1.0F, -1.0472F, 0.0F, 0.0F));
		PartDefinition BrasDroit = partdefinition.addOrReplaceChild("BrasDroit", CubeListBuilder.create(), PartPose.offset(-6.0F, 4.0F, 0.0F));
		PartDefinition Epaule_r2 = BrasDroit.addOrReplaceChild("Epaule_r2",
				CubeListBuilder.create().texOffs(19, 29).addBox(2.0F, 2.0F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 29).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, -1.0F, -1.0472F, 0.0F, 0.0F));
		PartDefinition Capuche = partdefinition.addOrReplaceChild("Capuche",
				CubeListBuilder.create().texOffs(0, 1).addBox(0.0F, -2.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 54).addBox(-1.0F, -4.0F, -1.0F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(1, 1)
						.addBox(4.0F, -2.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 1).addBox(5.0F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 1)
						.addBox(0.0F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, -1.0F, -3.0F));
		PartDefinition Capuche4_r1 = Capuche.addOrReplaceChild("Capuche4_r1", CubeListBuilder.create().texOffs(0, 49).addBox(-3.0F, 0.0F, -2.0F, 7.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, 0.0F, 1.5708F, 1.5708F));
		PartDefinition Capuche3_r1 = Capuche.addOrReplaceChild("Capuche3_r1", CubeListBuilder.create().texOffs(0, 58).addBox(-3.0F, 0.0F, -2.0F, 7.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, 0.0F, 3.0F, 0.0F, 1.5708F, 1.5708F));
		PartDefinition Capuche2_r1 = Capuche.addOrReplaceChild("Capuche2_r1", CubeListBuilder.create().texOffs(36, 57).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 0.0F, 7.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 14).addBox(-4.0F, -22.0F, -2.0F, 8.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(2, 1).addBox(-3.0F, -28.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		JambeGauche.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		JambeDroite.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		BrasGauche.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		BrasDroit.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		Capuche.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.JambeDroite.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.JambeGauche.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}