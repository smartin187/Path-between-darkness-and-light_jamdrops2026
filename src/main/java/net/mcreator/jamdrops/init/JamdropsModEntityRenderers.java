/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jamdrops.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.jamdrops.client.renderer.PretreLumineuxRenderer;
import net.mcreator.jamdrops.client.renderer.BosslumineuxRenderer;
import net.mcreator.jamdrops.client.renderer.BossSombreRenderer;

@EventBusSubscriber(Dist.CLIENT)
public class JamdropsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(JamdropsModEntities.BOSSLUMINEUX.get(), BosslumineuxRenderer::new);
		event.registerEntityRenderer(JamdropsModEntities.BOSSLUMINEUX_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(JamdropsModEntities.BOSS_SOMBRE.get(), BossSombreRenderer::new);
		event.registerEntityRenderer(JamdropsModEntities.BOSS_SOMBRE_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(JamdropsModEntities.PRETRE_LUMINEUX.get(), PretreLumineuxRenderer::new);
	}
}