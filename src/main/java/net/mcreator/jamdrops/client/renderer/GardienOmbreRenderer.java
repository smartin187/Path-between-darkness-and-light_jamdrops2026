package net.mcreator.jamdrops.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.jamdrops.entity.GardienOmbreEntity;
import net.mcreator.jamdrops.client.model.ModelGardienSombre;

public class GardienOmbreRenderer extends MobRenderer<GardienOmbreEntity, ModelGardienSombre<GardienOmbreEntity>> {
	private final ResourceLocation entityTexture = ResourceLocation.parse("jamdrops:textures/entities/gardien_sombre_1.png");

	public GardienOmbreRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelGardienSombre<GardienOmbreEntity>(context.bakeLayer(ModelGardienSombre.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GardienOmbreEntity entity) {
		return entityTexture;
	}
}