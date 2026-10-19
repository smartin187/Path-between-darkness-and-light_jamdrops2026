/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jamdrops.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.jamdrops.client.model.Modelbosssombre;
import net.mcreator.jamdrops.client.model.Modelboss_lumineux;

@EventBusSubscriber(Dist.CLIENT)
public class JamdropsModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelboss_lumineux.LAYER_LOCATION, Modelboss_lumineux::createBodyLayer);
		event.registerLayerDefinition(Modelbosssombre.LAYER_LOCATION, Modelbosssombre::createBodyLayer);
	}
}