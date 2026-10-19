package net.mcreator.jamdrops.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.jamdrops.network.JamdropsModVariables;

public class DiminuerLuminositeProcedure {
	public static void execute(LevelAccessor world) {
		JamdropsModVariables.WorldVariables.get(world).luminosite = JamdropsModVariables.WorldVariables.get(world).luminosite - 1;
		JamdropsModVariables.WorldVariables.get(world).markSyncDirty();
	}
}