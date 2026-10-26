package net.mcreator.jamdrops.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

public class ActionProjetilOmbreProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double conteur = 0;
		double conteur_x = 0;
		double conteur_z = 0;
		conteur_x = -3;
		for (int _i1 = 0; _i1 < 6; _i1++) {
			conteur_z = -3;
			for (int _i2 = 0; _i2 < 6; _i2++) {
				conteur = 0;
				for (int _i3 = 0; _i3 < 15; _i3++) {
					world.destroyBlock(BlockPos.containing(x + conteur_x, y - conteur, z + conteur_z), false);
					conteur = conteur + 1;
				}
				conteur_z = conteur_z + 1;
			}
			conteur_x = conteur_x + 1;
		}
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, (y - 16), z, 4, Level.ExplosionInteraction.BLOCK);
	}
}