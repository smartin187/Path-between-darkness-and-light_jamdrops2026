package net.mcreator.jamdrops.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.jamdrops.entity.BossSombreEntity;
import net.mcreator.jamdrops.client.model.Modelbosssombre;

public class BossSombreRenderer extends MobRenderer<BossSombreEntity, Modelbosssombre<BossSombreEntity>> {
	private final ResourceLocation entityTexture = ResourceLocation.parse("jamdrops:textures/entities/boss_sombre.png");

	public BossSombreRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbosssombre<BossSombreEntity>(context.bakeLayer(Modelbosssombre.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BossSombreEntity entity) {
		return entityTexture;
	}
}