package net.mcreator.jamdrops.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.jamdrops.entity.PretreSombreSupportEntity;
import net.mcreator.jamdrops.client.model.ModelPretreMobCaC;

public class PretreSombreSupportRenderer extends MobRenderer<PretreSombreSupportEntity, ModelPretreMobCaC<PretreSombreSupportEntity>> {
	private final ResourceLocation entityTexture = ResourceLocation.parse("jamdrops:textures/entities/pretre_heal_negate.png");

	public PretreSombreSupportRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelPretreMobCaC<PretreSombreSupportEntity>(context.bakeLayer(ModelPretreMobCaC.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PretreSombreSupportEntity entity) {
		return entityTexture;
	}
}