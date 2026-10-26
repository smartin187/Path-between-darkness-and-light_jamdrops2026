package net.mcreator.jamdrops.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

public class ActionProjetilOmbreProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double conteur = 0;
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, y, z, 4, Level.ExplosionInteraction.TNT);
		conteur = 0;
		for (int _i1 = 0; _i1 < 15; _i1++) {
			world.destroyBlock(BlockPos.containing(x, y - conteur, z), false);
			conteur = conteur + 1;
		}
		conteur = 0;
		for (int _i1 = 0; _i1 < 15; _i1++) {
			world.destroyBlock(BlockPos.containing(x - 1, y - conteur, z), false);
			conteur = conteur + 1;
		}
		conteur = 0;
		for (int _i1 = 0; _i1 < 15; _i1++) {
			world.destroyBlock(BlockPos.containing(x + 1, y - conteur, z), false);
			conteur = conteur + 1;
		}
		conteur = 0;
		for (int _i1 = 0; _i1 < 15; _i1++) {
			world.destroyBlock(BlockPos.containing(x, y - conteur, z - 1), false);
			conteur = conteur + 1;
		}
		conteur = 0;
		for (int _i1 = 0; _i1 < 15; _i1++) {
			world.destroyBlock(BlockPos.containing(x, y - conteur, z + 1), false);
			conteur = conteur + 1;
		}
	}
}