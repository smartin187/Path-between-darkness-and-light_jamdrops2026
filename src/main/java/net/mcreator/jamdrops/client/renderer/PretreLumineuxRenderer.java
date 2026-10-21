package net.mcreator.jamdrops.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.jamdrops.entity.PretreLumineuxEntity;
import net.mcreator.jamdrops.client.model.ModelPretreMob;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class PretreLumineuxRenderer extends MobRenderer<PretreLumineuxEntity, ModelPretreMob<PretreLumineuxEntity>> {
	private final ResourceLocation entityTexture = ResourceLocation.parse("jamdrops:textures/entities/pretre.png");

	public PretreLumineuxRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelPretreMob<PretreLumineuxEntity>(context.bakeLayer(ModelPretreMob.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<PretreLumineuxEntity, ModelPretreMob<PretreLumineuxEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("jamdrops:textures/entities/pretre.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PretreLumineuxEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(PretreLumineuxEntity entity) {
		return entityTexture;
	}
}