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
public class ModelBoss_sombre<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("jamdrops", "model_boss_sombre"), "main");
	public final ModelPart bras_droit;
	public final ModelPart bras_gauche;
	public final ModelPart Jambe_droite;
	public final ModelPart Jambe_gauche;
	public final ModelPart bb_main;

	public ModelBoss_sombre(ModelPart root) {
		this.bras_droit = root.getChild("bras_droit");
		this.bras_gauche = root.getChild("bras_gauche");
		this.Jambe_droite = root.getChild("Jambe_droite");
		this.Jambe_gauche = root.getChild("Jambe_gauche");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bras_droit = partdefinition.addOrReplaceChild("bras_droit", CubeListBuilder.create(), PartPose.offset(14.95F, -11.5125F, -15.4425F));
		PartDefinition cube_r1 = bras_droit.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 72).addBox(-3.01F, -6.0F, -14.95F, 6.0F, 6.0F, 30.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4363F, 0.0F, 0.0F));
		PartDefinition bras_gauche = partdefinition.addOrReplaceChild("bras_gauche", CubeListBuilder.create(), PartPose.offset(-14.95F, -11.5125F, -15.4425F));
		PartDefinition cube_r2 = bras_gauche.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(72, 30).addBox(-3.01F, -6.0F, -14.95F, 6.0F, 6.0F, 30.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4363F, 0.0F, 0.0F));
		PartDefinition Jambe_droite = partdefinition.addOrReplaceChild("Jambe_droite",
				CubeListBuilder.create().texOffs(172, 147).addBox(-5.0F, -3.0F, -2.0F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(92, 132).addBox(-5.0F, -24.0F, 1.0F, 6.0F, 24.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-7.0F, 24.0F, -3.0F));
		PartDefinition Jambe_gauche = partdefinition.addOrReplaceChild("Jambe_gauche",
				CubeListBuilder.create().texOffs(172, 165).addBox(-5.0F, -3.0F, -2.0F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(72, 132).addBox(-5.0F, -24.0F, 1.0F, 6.0F, 24.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(11.0F, 24.0F, -3.0F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(72, 66).addBox(-9.03F, -20.5825F, -12.4525F, 18.0F, 6.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(0, 162).addBox(-3.01F, -23.5625F, -6.4725F, 6.0F, 3.0F, 6.0F, new CubeDeformation(0.0F))
						.texOffs(0, 0).addBox(-12.04F, -29.5525F, -15.4425F, 24.0F, 6.0F, 24.0F, new CubeDeformation(0.0F)).texOffs(0, 30).addBox(-9.03F, -53.5325F, -12.4525F, 18.0F, 24.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(0, 108)
						.addBox(-11.97F, -47.5125F, -9.4625F, 3.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 171).addBox(-11.97F, -50.4725F, -6.4725F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(18, 171)
						.addBox(-11.97F, -35.5225F, -6.4725F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(36, 171).addBox(8.96F, -35.5225F, -6.4725F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(54, 171)
						.addBox(8.96F, -50.4725F, -6.4725F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(30, 108).addBox(8.96F, -47.5125F, -9.4625F, 3.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(96, 171)
						.addBox(-8.99F, -53.4725F, 5.4875F, 6.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(112, 147).addBox(-14.97F, -59.4525F, 8.4775F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 150)
						.addBox(-17.96F, -62.4425F, 5.4875F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(132, 108).addBox(-20.95F, -65.4325F, -0.4925F, 6.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(60, 114)
						.addBox(-23.94F, -68.4225F, -9.4625F, 6.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(142, 123).addBox(-23.93F, -68.4125F, -21.4225F, 3.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(150, 0)
						.addBox(-26.92F, -68.4125F, -15.4425F, 3.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(136, 153).addBox(-23.93F, -71.4025F, -15.4425F, 3.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(114, 171)
						.addBox(2.97F, -53.4725F, 5.4875F, 6.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(156, 84).addBox(5.96F, -56.4625F, 5.4875F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(156, 96)
						.addBox(8.95F, -59.4525F, 8.4775F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(36, 147).addBox(11.94F, -62.4425F, 5.4875F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(112, 132)
						.addBox(14.93F, -65.4325F, -0.4925F, 6.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(96, 114).addBox(17.92F, -68.4225F, -9.4625F, 6.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(142, 138)
						.addBox(20.92F, -68.4125F, -21.4225F, 3.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(24, 159).addBox(20.92F, -71.4025F, -15.4425F, 3.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(48, 159)
						.addBox(23.91F, -68.4125F, -15.4425F, 3.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(112, 159).addBox(-11.98F, -56.4625F, 5.4875F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(72, 90)
						.addBox(-7.525F, -71.4425F, -9.4625F, 15.0F, 15.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(162, 108).addBox(-4.515F, -71.4125F, -12.4525F, 9.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(96, 0)
						.addBox(-7.525F, -74.3925F, -12.4525F, 15.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(60, 147).addBox(-10.475F, -71.4225F, -3.4825F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(136, 165)
						.addBox(-10.475F, -71.4125F, -9.4625F, 3.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(72, 172).addBox(7.465F, -71.4225F, -3.4825F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(154, 165)
						.addBox(7.465F, -71.4125F, -9.4625F, 3.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(174, 0).addBox(-7.485F, -71.4025F, -12.4525F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(174, 6)
						.addBox(4.475F, -71.4025F, -12.4525F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(174, 12).addBox(-1.505F, -65.4225F, -12.4525F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(36, 132)
						.addBox(-7.525F, -71.4325F, -0.4925F, 15.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(96, 15).addBox(-6.02F, -14.5925F, -9.4625F, 12.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(162, 117)
						.addBox(2.97F, -50.4725F, -15.4425F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(174, 18).addBox(2.98F, -53.4625F, -15.4425F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(60, 108)
						.addBox(2.98F, -50.4725F, -18.4325F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(172, 123).addBox(-8.99F, -50.4725F, -15.4425F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(174, 24)
						.addBox(-5.99F, -53.4625F, -15.4425F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(120, 108).addBox(-5.99F, -50.4725F, -18.4325F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(24, 150)
						.addBox(2.98F, -38.5225F, -15.4425F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(174, 30).addBox(5.97F, -38.5125F, -15.4425F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(144, 84)
						.addBox(2.98F, -38.5125F, -18.4325F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(172, 129).addBox(-8.99F, -38.5125F, -15.4425F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(174, 36)
						.addBox(-5.99F, -35.5225F, -15.4425F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(96, 160).addBox(-5.99F, -38.5125F, -18.4325F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(84, 172)
						.addBox(2.98F, -44.4925F, -18.4325F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(172, 135).addBox(-8.99F, -44.4925F, -15.4425F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(172, 171)
						.addBox(-5.99F, -44.4925F, -18.4325F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(172, 141).addBox(2.97F, -44.4925F, -15.4425F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(144, 15)
						.addBox(-3.01F, -35.5325F, 5.4875F, 6.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(144, 30).addBox(-3.01F, -32.5425F, 11.4675F, 6.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(144, 60)
						.addBox(-9.0F, -29.5525F, 17.4475F, 9.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(144, 72).addBox(-17.97F, -26.5625F, 17.4475F, 9.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(120, 90)
						.addBox(-20.95F, -26.5625F, 8.4775F, 6.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 132).addBox(-23.94F, -23.5725F, -0.4925F, 6.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(144, 45)
						.addBox(-23.93F, -20.5725F, -12.4525F, 3.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(72, 160).addBox(-23.93F, -17.5825F, -6.4725F, 3.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(160, 153)
						.addBox(-26.92F, -20.5725F, -6.4725F, 3.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(30, 198).addBox(-7.0F, -57.0F, -9.0F, 14.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		bras_droit.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		bras_gauche.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		Jambe_droite.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		Jambe_gauche.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.Jambe_droite.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.bras_gauche.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.bras_droit.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.Jambe_gauche.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}