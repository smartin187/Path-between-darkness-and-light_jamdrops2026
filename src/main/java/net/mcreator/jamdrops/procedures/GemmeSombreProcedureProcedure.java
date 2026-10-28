package net.mcreator.jamdrops.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

public class GemmeSombreProcedureProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		DiminuerLuminositeProcedure.execute(entity);
		itemstack.shrink(1);
	}
}