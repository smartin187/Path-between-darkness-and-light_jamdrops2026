package net.mcreator.jamdrops.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

import net.mcreator.jamdrops.network.JamdropsModVariables;

public class GemmeSombreProcedureProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (-60 < entity.getData(JamdropsModVariables.PLAYER_VARIABLES).luminosite) {
			DiminuerLuminositeProcedure.execute(entity);
			itemstack.shrink(1);
		}
	}
}