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
public class ModelBoss_sombre<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("jamdrops", "model_boss_sombre"), "main");
	public final ModelPart bb_main;

	public ModelBoss_sombre(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(24, 22).addBox(-9.03F, -20.5825F, -12.4525F, 18.0F, 6.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(16, 53).addBox(-3.01F, -23.5625F, -6.4725F, 6.0F, 3.0F, 6.0F, new CubeDeformation(0.0F))
						.texOffs(48, 27).addBox(-8.98F, -14.6025F, 2.4975F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(8, 50).addBox(5.97F, -14.6025F, -12.4525F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(58, 10)
						.addBox(5.97F, -14.6025F, 2.4975F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 54).addBox(-11.97F, -11.6325F, -12.4525F, 3.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(4, 54)
						.addBox(-8.98F, -11.6325F, -15.4425F, 3.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(54, 35).addBox(5.97F, -11.6325F, -15.4425F, 3.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(54, 40)
						.addBox(8.96F, -11.6325F, -12.4525F, 3.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(54, 45).addBox(-8.98F, -11.6325F, 5.4875F, 3.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(44, 55)
						.addBox(-11.97F, -11.6325F, 2.4975F, 3.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(48, 55).addBox(8.96F, -11.6325F, 2.4975F, 3.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(52, 55)
						.addBox(5.97F, -11.6325F, 5.4875F, 3.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(58, 13).addBox(-8.98F, -14.6025F, -12.4525F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-12.04F, -29.5525F, -15.4425F, 24.0F, 6.0F, 24.0F, new CubeDeformation(0.0F)).texOffs(0, 10).addBox(-9.03F, -53.5325F, -12.4525F, 18.0F, 24.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(0, 36)
						.addBox(-11.97F, -47.5125F, -9.4625F, 3.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(16, 56).addBox(-11.97F, -50.4725F, -6.4725F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(22, 56)
						.addBox(-11.97F, -35.5225F, -6.4725F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(56, 23).addBox(8.96F, -35.5225F, -6.4725F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(56, 55)
						.addBox(8.96F, -50.4725F, -6.4725F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(10, 36).addBox(8.96F, -47.5125F, -9.4625F, 3.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(8, 57)
						.addBox(-8.99F, -53.4725F, 5.4875F, 6.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(48, 23).addBox(-14.97F, -59.4525F, 8.4775F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(12, 49)
						.addBox(-17.96F, -62.4425F, 5.4875F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(24, 44).addBox(-20.95F, -65.4325F, -0.4925F, 6.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(20, 38)
						.addBox(-23.94F, -68.4225F, -9.4625F, 6.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(34, 44).addBox(-23.93F, -68.4125F, -21.4225F, 3.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(20, 49)
						.addBox(-26.92F, -68.4125F, -15.4425F, 3.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(28, 49).addBox(-23.93F, -71.4025F, -15.4425F, 3.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(28, 57)
						.addBox(2.97F, -53.4725F, 5.4875F, 6.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(36, 49).addBox(5.96F, -56.4625F, 5.4875F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 50)
						.addBox(8.95F, -59.4525F, 8.4775F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(50, 0).addBox(11.94F, -62.4425F, 5.4875F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(44, 36)
						.addBox(14.93F, -65.4325F, -0.4925F, 6.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(32, 38).addBox(17.92F, -68.4225F, -9.4625F, 6.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(44, 41)
						.addBox(20.92F, -68.4125F, -21.4225F, 3.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(44, 51).addBox(20.92F, -71.4025F, -15.4425F, 3.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(52, 27)
						.addBox(23.91F, -68.4125F, -15.4425F, 3.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(52, 31).addBox(-11.98F, -56.4625F, 5.4875F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(24, 30)
						.addBox(-7.525F, -71.4425F, -9.4625F, 15.0F, 15.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(24, 53).addBox(-4.515F, -71.4125F, -12.4525F, 9.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(32, 0)
						.addBox(-7.525F, -74.3925F, -12.4525F, 15.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(34, 57).addBox(-10.475F, -71.4225F, -3.4825F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(32, 53)
						.addBox(-10.475F, -71.4125F, -9.4625F, 3.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(38, 57).addBox(7.465F, -71.4225F, -3.4825F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(38, 53)
						.addBox(7.465F, -71.4125F, -9.4625F, 3.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(20, 36).addBox(-7.485F, -71.4025F, -12.4525F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(40, 36)
						.addBox(4.475F, -71.4025F, -12.4525F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(58, 19).addBox(-1.505F, -65.4225F, -12.4525F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(12, 44)
						.addBox(-7.525F, -71.4325F, -0.4925F, 15.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(32, 5).addBox(-6.02F, -14.5925F, -9.4625F, 12.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(58, 0)
						.addBox(2.97F, -50.4725F, -15.4425F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(58, 21).addBox(2.98F, -53.4625F, -15.4425F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(58, 35)
						.addBox(2.98F, -50.4725F, -18.4325F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(58, 2).addBox(-8.99F, -50.4725F, -15.4425F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(58, 37)
						.addBox(-5.99F, -53.4625F, -15.4425F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(58, 39).addBox(-5.99F, -50.4725F, -18.4325F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(58, 16)
						.addBox(2.98F, -38.5225F, -15.4425F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(58, 41).addBox(5.97F, -38.5125F, -15.4425F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(58, 43)
						.addBox(2.98F, -38.5125F, -18.4325F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(58, 4).addBox(-8.99F, -38.5125F, -15.4425F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(58, 45)
						.addBox(-5.99F, -35.5225F, -15.4425F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(58, 47).addBox(-5.99F, -38.5125F, -18.4325F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(58, 49)
						.addBox(2.98F, -44.4925F, -18.4325F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(58, 6).addBox(-8.99F, -44.4925F, -15.4425F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(56, 58)
						.addBox(-5.99F, -44.4925F, -18.4325F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(58, 8).addBox(2.97F, -44.4925F, -15.4425F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(44, 46)
						.addBox(-3.01F, -35.5325F, 5.4875F, 6.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(48, 5).addBox(-3.01F, -32.5425F, 11.4675F, 6.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(48, 15)
						.addBox(-9.0F, -29.5525F, 17.4475F, 9.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(48, 19).addBox(-17.97F, -26.5625F, 17.4475F, 9.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(40, 30)
						.addBox(-20.95F, -26.5625F, 8.4775F, 6.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 44).addBox(-23.94F, -23.5725F, -0.4925F, 6.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(48, 10)
						.addBox(-23.93F, -20.5725F, -12.4525F, 3.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(52, 51).addBox(-23.93F, -17.5825F, -6.4725F, 3.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(8, 53)
						.addBox(-26.92F, -20.5725F, -6.4725F, 3.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(24, 10).addBox(-3.01F, -6.0F, -14.95F, 6.0F, 6.0F, 30.0F, new CubeDeformation(0.0F)).texOffs(0, 24).addBox(26.89F, -6.0F, -14.95F, 6.0F, 6.0F, 30.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.95F, -35.5125F, -15.4425F, 0.4363F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}
}