package net.mcreator.jamdrops.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;

import net.mcreator.jamdrops.network.JamdropsModVariables;

import javax.annotation.Nullable;

@EventBusSubscriber
public class MaxMinLuminositeProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		{
			JamdropsModVariables.PlayerVariables _vars = entity.getData(JamdropsModVariables.PLAYER_VARIABLES);
			_vars.luminosite = Mth.clamp(entity.getData(JamdropsModVariables.PLAYER_VARIABLES).luminosite, -63, 63);
			_vars.markSyncDirty();
		}
	}
}