package net.mcreator.jamdrops.procedures;

import net.neoforged.neoforge.items.ItemHandlerHelper;
import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.jamdrops.network.JamdropsModVariables;
import net.mcreator.jamdrops.init.JamdropsModItems;
import net.mcreator.jamdrops.init.JamdropsModBlocks;

import javax.annotation.Nullable;

@EventBusSubscriber
public class CraftBossLumiereProcedureProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (hasEntityInInventory(entity, new ItemStack(JamdropsModItems.BOSSLUMINEUX_SPAWN_EGG.get()))) {
			if (entity.getData(JamdropsModVariables.PLAYER_VARIABLES).luminosite < 60) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(JamdropsModItems.BOSSLUMINEUX_SPAWN_EGG.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(JamdropsModItems.GEMME_LUMINEUX.get()).copy();
					_setstack.setCount(8);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(JamdropsModBlocks.BLOCK_DE_LUMIERE.get()).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Vous n'avez pas le niveau de luminosit\u00E9 necessaire"), false);
			}
		}
	}

	private static boolean hasEntityInInventory(Entity entity, ItemStack itemstack) {
		if (entity instanceof Player player)
			return player.getInventory().contains(stack -> !stack.isEmpty() && ItemStack.isSameItem(stack, itemstack));
		return false;
	}
}