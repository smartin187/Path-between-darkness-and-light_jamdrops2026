package net.mcreator.jamdrops.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

public class GemmeLumineuxProcedureProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		AjouterLuminositeProcedure.execute(entity);
		itemstack.shrink(1);
	}
}