package net.mcreator.jamdrops.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.Mth;

import net.mcreator.jamdrops.network.JamdropsModVariables;

import javax.annotation.Nullable;

@EventBusSubscriber
public class MaxMinLuminositeProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity().level());
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		JamdropsModVariables.WorldVariables.get(world).luminosite = Mth.clamp(JamdropsModVariables.WorldVariables.get(world).luminosite, -63, 63);
		JamdropsModVariables.WorldVariables.get(world).markSyncDirty();
	}
}