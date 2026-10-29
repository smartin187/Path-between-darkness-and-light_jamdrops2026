package net.mcreator.jamdrops.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

public class ActionProjetilOmbreProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double conteur = 0;
		double conteur_x = 0;
		double conteur_z = 0;
		double largeur = 0;
		double longueur = 0;
		double profondeur = 0;
		largeur = Mth.nextDouble(RandomSource.create(), 1, 10);
		longueur = Mth.nextDouble(RandomSource.create(), 1, 10);
		profondeur = Mth.nextDouble(RandomSource.create(), 1, 30);
		conteur_x = 0 - largeur / 2;
		for (int _i1 = 0; _i1 < (int) largeur; _i1++) {
			conteur_z = 0 - longueur / 2;
			for (int _i2 = 0; _i2 < (int) longueur; _i2++) {
				conteur = 0;
				for (int _i3 = 0; _i3 < (int) profondeur; _i3++) {
					world.setBlock(BlockPos.containing(x + conteur_x, y - conteur, z + conteur_z), Blocks.AIR.defaultBlockState(), 3);
					conteur = conteur + 1;
				}
				conteur_z = conteur_z + 1;
			}
			conteur_x = conteur_x + 1;
		}
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, (y - (profondeur + 1)), z, 4, Level.ExplosionInteraction.BLOCK);
	}
}