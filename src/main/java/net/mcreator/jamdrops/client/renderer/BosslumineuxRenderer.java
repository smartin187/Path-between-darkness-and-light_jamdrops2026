package net.mcreator.jamdrops.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.jamdrops.entity.BosslumineuxEntity;
import net.mcreator.jamdrops.client.model.ModelBossLumiere;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class BosslumineuxRenderer extends MobRenderer<BosslumineuxEntity, ModelBossLumiere<BosslumineuxEntity>> {
	private final ResourceLocation entityTexture = ResourceLocation.parse("jamdrops:textures/entities/texture_boss_lumineu.png");

	public BosslumineuxRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelBossLumiere<BosslumineuxEntity>(context.bakeLayer(ModelBossLumiere.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<BosslumineuxEntity, ModelBossLumiere<BosslumineuxEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("jamdrops:textures/entities/texture_boss_lumineu.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, BosslumineuxEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(BosslumineuxEntity entity) {
		return entityTexture;
	}
}