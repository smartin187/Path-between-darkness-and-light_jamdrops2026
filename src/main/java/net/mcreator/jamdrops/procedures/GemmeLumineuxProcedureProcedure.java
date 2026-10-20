package net.mcreator.jamdrops.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;

public class GemmeLumineuxProcedureProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		AjouterLuminositeProcedure.execute(entity);
		if (entity instanceof LivingEntity _entity) {
			ItemStack _setstack0 = new ItemStack(Blocks.AIR).copy();
			_setstack0.setCount(1);
			_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack0);
			if (_entity instanceof Player _player)
				_player.getInventory().setChanged();
		}
	}
}