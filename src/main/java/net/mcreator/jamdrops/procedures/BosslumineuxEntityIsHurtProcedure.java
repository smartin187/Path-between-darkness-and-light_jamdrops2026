package net.mcreator.jamdrops.procedures;

import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;

public class BosslumineuxEntityIsHurtProcedure {
	public static boolean execute(DamageSource damagesource) {
		if (damagesource == null)
			return false;
		if (damagesource.is(DamageTypes.LIGHTNING_BOLT) || damagesource.is(DamageTypes.ON_FIRE) || damagesource.is(DamageTypes.IN_FIRE)) {
			return false;
		}
		return true;
	}
}