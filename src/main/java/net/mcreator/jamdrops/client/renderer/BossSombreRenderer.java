package net.mcreator.jamdrops.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.jamdrops.entity.BossSombreEntity;
import net.mcreator.jamdrops.client.model.ModelBoss_sombre;

public class BossSombreRenderer extends MobRenderer<BossSombreEntity, ModelBoss_sombre<BossSombreEntity>> {
	private final ResourceLocation entityTexture = ResourceLocation.parse("jamdrops:textures/entities/texture_boss_lumineu.png");

	public BossSombreRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelBoss_sombre<BossSombreEntity>(context.bakeLayer(ModelBoss_sombre.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BossSombreEntity entity) {
		return entityTexture;
	}
}