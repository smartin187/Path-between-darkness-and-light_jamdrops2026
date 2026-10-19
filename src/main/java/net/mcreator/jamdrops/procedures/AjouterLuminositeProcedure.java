package net.mcreator.jamdrops.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.jamdrops.network.JamdropsModVariables;
import net.mcreator.jamdrops.JamdropsMod;

public class AjouterLuminositeProcedure {
	public static void execute(LevelAccessor world) {
		JamdropsMod.LOGGER.info(("Avant changement" + JamdropsModVariables.WorldVariables.get(world).luminosite));
		JamdropsModVariables.WorldVariables.get(world).luminosite = JamdropsModVariables.WorldVariables.get(world).luminosite - 1;
		JamdropsModVariables.WorldVariables.get(world).markSyncDirty();
		JamdropsMod.LOGGER.info(("Changement luminosit\u00E9" + JamdropsModVariables.WorldVariables.get(world).luminosite));
	}
}