package net.mcreator.jamdrops.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.jamdrops.entity.PretreHealEntity;
import net.mcreator.jamdrops.client.model.ModelPretreMobCaC;

public class PretreHealRenderer extends MobRenderer<PretreHealEntity, ModelPretreMobCaC<PretreHealEntity>> {
	private final ResourceLocation entityTexture = ResourceLocation.parse("jamdrops:textures/entities/pretre_heal.png");

	public PretreHealRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelPretreMobCaC<PretreHealEntity>(context.bakeLayer(ModelPretreMobCaC.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PretreHealEntity entity) {
		return entityTexture;
	}
}