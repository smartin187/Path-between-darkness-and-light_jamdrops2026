/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jamdrops.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.jamdrops.client.model.ModelPretreMobCaC;
import net.mcreator.jamdrops.client.model.ModelPretreMob;
import net.mcreator.jamdrops.client.model.ModelBoss_sombre;
import net.mcreator.jamdrops.client.model.ModelBossLumiere;

@EventBusSubscriber(Dist.CLIENT)
public class JamdropsModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelPretreMob.LAYER_LOCATION, ModelPretreMob::createBodyLayer);
		event.registerLayerDefinition(ModelPretreMobCaC.LAYER_LOCATION, ModelPretreMobCaC::createBodyLayer);
		event.registerLayerDefinition(ModelBoss_sombre.LAYER_LOCATION, ModelBoss_sombre::createBodyLayer);
		event.registerLayerDefinition(ModelBossLumiere.LAYER_LOCATION, ModelBossLumiere::createBodyLayer);
	}
}