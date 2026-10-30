package net.mcreator.jamdrops.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.jamdrops.network.JamdropsModVariables;

public class AjouterLuminositeProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			JamdropsModVariables.PlayerVariables _vars = entity.getData(JamdropsModVariables.PLAYER_VARIABLES);
			_vars.luminosite = entity.getData(JamdropsModVariables.PLAYER_VARIABLES).luminosite + 5;
			_vars.markSyncDirty();
		}
	}
}