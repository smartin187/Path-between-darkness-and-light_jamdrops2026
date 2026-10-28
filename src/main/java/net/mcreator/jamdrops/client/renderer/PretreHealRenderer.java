package net.mcreator.jamdrops.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.jamdrops.entity.PretreHealEntity;
import net.mcreator.jamdrops.client.model.ModelPretreMobCaC;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class PretreHealRenderer extends MobRenderer<PretreHealEntity, ModelPretreMobCaC<PretreHealEntity>> {
	private final ResourceLocation entityTexture = ResourceLocation.parse("jamdrops:textures/entities/pretre_heal.png");

	public PretreHealRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelPretreMobCaC<PretreHealEntity>(context.bakeLayer(ModelPretreMobCaC.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<PretreHealEntity, ModelPretreMobCaC<PretreHealEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("jamdrops:textures/entities/pretre_heal.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PretreHealEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(PretreHealEntity entity) {
		return entityTexture;
	}
}