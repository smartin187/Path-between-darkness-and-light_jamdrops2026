package net.mcreator.jamdrops.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.jamdrops.entity.PretreSombreEntity;
import net.mcreator.jamdrops.client.model.ModelPretreMob;

public class PretreSombreRenderer extends MobRenderer<PretreSombreEntity, ModelPretreMob<PretreSombreEntity>> {
	private final ResourceLocation entityTexture = ResourceLocation.parse("jamdrops:textures/entities/pretre_sombre_negate.png");

	public PretreSombreRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelPretreMob<PretreSombreEntity>(context.bakeLayer(ModelPretreMob.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PretreSombreEntity entity) {
		return entityTexture;
	}
}