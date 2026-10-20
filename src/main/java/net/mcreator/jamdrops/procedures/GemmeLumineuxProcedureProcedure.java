package net.mcreator.jamdrops.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.jamdrops.init.JamdropsModItems;

public class GemmeLumineuxProcedureProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		AjouterLuminositeProcedure.execute(world);
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = new ItemStack(JamdropsModItems.GEMME_LUMINEUX.get());
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
	}
}