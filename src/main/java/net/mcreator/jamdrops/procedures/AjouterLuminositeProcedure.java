package net.mcreator.jamdrops.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.jamdrops.network.JamdropsModVariables;
import net.mcreator.jamdrops.JamdropsMod;

public class AjouterLuminositeProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		JamdropsMod.LOGGER.info(("Avant changement" + entity.getData(JamdropsModVariables.PLAYER_VARIABLES).luminosite));
		{
			JamdropsModVariables.PlayerVariables _vars = entity.getData(JamdropsModVariables.PLAYER_VARIABLES);
			_vars.luminosite = entity.getData(JamdropsModVariables.PLAYER_VARIABLES).luminosite - 1;
			_vars.markSyncDirty();
		}
		JamdropsMod.LOGGER.info(("Changement luminosit\u00E9" + entity.getData(JamdropsModVariables.PLAYER_VARIABLES).luminosite));
	}
}