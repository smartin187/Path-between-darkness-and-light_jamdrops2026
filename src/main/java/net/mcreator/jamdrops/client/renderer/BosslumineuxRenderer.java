package net.mcreator.jamdrops.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.jamdrops.entity.BosslumineuxEntity;
import net.mcreator.jamdrops.client.model.ModelBossLumiere;

public class BosslumineuxRenderer extends MobRenderer<BosslumineuxEntity, ModelBossLumiere<BosslumineuxEntity>> {
	private final ResourceLocation entityTexture = ResourceLocation.parse("jamdrops:textures/entities/texture_boss_lumineu.png");

	public BosslumineuxRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelBossLumiere<BosslumineuxEntity>(context.bakeLayer(ModelBossLumiere.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BosslumineuxEntity entity) {
		return entityTexture;
	}
}