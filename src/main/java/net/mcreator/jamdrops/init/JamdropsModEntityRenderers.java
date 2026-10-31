/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jamdrops.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.jamdrops.client.renderer.*;

@EventBusSubscriber(Dist.CLIENT)
public class JamdropsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(JamdropsModEntities.BOSSLUMINEUX.get(), BosslumineuxRenderer::new);
		event.registerEntityRenderer(JamdropsModEntities.BOSS_SOMBRE.get(), BossSombreRenderer::new);
		event.registerEntityRenderer(JamdropsModEntities.PRETRE_LUMINEUX.get(), PretreLumineuxRenderer::new);
		event.registerEntityRenderer(JamdropsModEntities.FOUDRE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(JamdropsModEntities.ORBE_DE_LUMIERE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(JamdropsModEntities.PRETRE_CA_C.get(), PretreCaCRenderer::new);
		event.registerEntityRenderer(JamdropsModEntities.PROJECTIL_OMBRE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(JamdropsModEntities.PRETRE_HEAL.get(), PretreHealRenderer::new);
		event.registerEntityRenderer(JamdropsModEntities.GARDIEN_OMBRE.get(), GardienOmbreRenderer::new);
		event.registerEntityRenderer(JamdropsModEntities.PRETRE_SOMBRE.get(), PretreSombreRenderer::new);
		event.registerEntityRenderer(JamdropsModEntities.ORBE_D_OMBRE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(JamdropsModEntities.PRETRE_SOMBRE_SUPPORT.get(), PretreSombreSupportRenderer::new);
	}
}