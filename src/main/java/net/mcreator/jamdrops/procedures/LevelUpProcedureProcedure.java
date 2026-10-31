package net.mcreator.jamdrops.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.client.player.LocalPlayer;

import net.mcreator.jamdrops.network.JamdropsModVariables;

import javax.annotation.Nullable;

import java.util.Collections;

@EventBusSubscriber
public class LevelUpProcedureProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!hasEntityRecipe(entity, ResourceLocation.parse("jamdrops:craft_boss_lumi"))) {
			if (entity.getData(JamdropsModVariables.PLAYER_VARIABLES).luminosite == 55) {
				if (entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("jamdrops:craft_boss_lumi")));
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							("title " + (entity.getDisplayName().getString() + "" + " title {\"text\":\"G\u00E9n\u00E9ral de la lumiere\",\"color\":\"gold\"}")));
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							("title " + (entity.getDisplayName().getString() + "" + " subtitle \"Vous pouvez crafter le boss de la lumiere\"")));
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.bell.resonate")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.bell.resonate")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
		}
		if (hasEntityRecipe(entity, ResourceLocation.parse("jamdrops:craft_boss_lumi"))) {
			if (entity.getData(JamdropsModVariables.PLAYER_VARIABLES).luminosite < 55) {
				if (entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.server.getRecipeManager().byKey(ResourceLocation.parse("jamdrops:craft_boss_lumi")).ifPresent(_rec -> _serverPlayer.resetRecipes(Collections.singleton(_rec)));
			}
		}
		if (!hasEntityRecipe(entity, ResourceLocation.parse("jamdrops:craft_pretre_distance"))) {
			if (entity.getData(JamdropsModVariables.PLAYER_VARIABLES).luminosite == 40) {
				if (entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("jamdrops:craft_pretre_distance")));
				if (entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("jamdrops:craft_pretre_cac")));
				if (entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("jamdrops:craft_pretre_heal")));
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							("title " + (entity.getDisplayName().getString() + "" + " title {\"text\":\"Paladin de la lumiere\",\"color\":\"gold\"}")));
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							("title " + (entity.getDisplayName().getString() + "" + " subtitle \"Vous pouvez crafter les mobs de la lumiere\"")));
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.bell.resonate")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.bell.resonate")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
		}
		if (hasEntityRecipe(entity, ResourceLocation.parse("jamdrops:craft_pretre_distance"))) {
			if (entity.getData(JamdropsModVariables.PLAYER_VARIABLES).luminosite < 40) {
				if (entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.server.getRecipeManager().byKey(ResourceLocation.parse("jamdrops:craft_pretre_distance")).ifPresent(_rec -> _serverPlayer.resetRecipes(Collections.singleton(_rec)));
				if (entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.server.getRecipeManager().byKey(ResourceLocation.parse("jamdrops:craft_pretre_cac")).ifPresent(_rec -> _serverPlayer.resetRecipes(Collections.singleton(_rec)));
				if (entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.server.getRecipeManager().byKey(ResourceLocation.parse("jamdrops:craft_pretre_heal")).ifPresent(_rec -> _serverPlayer.resetRecipes(Collections.singleton(_rec)));
			}
		}
		if (!hasEntityRecipe(entity, ResourceLocation.parse("jamdrops:craft_epee_lumiere"))) {
			if (entity.getData(JamdropsModVariables.PLAYER_VARIABLES).luminosite == 20) {
				if (entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("jamdrops:craft_epee_lumiere")));
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							("title " + (entity.getDisplayName().getString() + "" + " title {\"text\":\"Initi\u00E9 de la lumiere\",\"color\":\"gold\"}")));
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							("title " + (entity.getDisplayName().getString() + "" + " subtitle \"Vous pouvez crafter l'\u00E9p\u00E9e de la lumiere\"")));
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.bell.resonate")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.bell.resonate")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
		}
		if (hasEntityRecipe(entity, ResourceLocation.parse("jamdrops:craft_epee_lumiere"))) {
			if (entity.getData(JamdropsModVariables.PLAYER_VARIABLES).luminosite < 20) {
				if (entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.server.getRecipeManager().byKey(ResourceLocation.parse("jamdrops:craft_epee_lumiere")).ifPresent(_rec -> _serverPlayer.resetRecipes(Collections.singleton(_rec)));
			}
		}
		if (!hasEntityRecipe(entity, ResourceLocation.parse("jamdrops:craft_epee_ombre"))) {
			if (entity.getData(JamdropsModVariables.PLAYER_VARIABLES).luminosite == -20) {
				if (entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("jamdrops:craft_epee_ombre")));
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							("title " + (entity.getDisplayName().getString() + "" + " title {\"text\":\"Initi\u00E9 de l'obscurit\u00E9\",\"color\":\"gray\"}")));
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							("title " + (entity.getDisplayName().getString() + "" + " subtitle \"Vous pouvez crafter l'\u00E9p\u00E9e de l'obcurit\u00E9\"")));
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.bell.resonate")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.bell.resonate")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
		}
		if (hasEntityRecipe(entity, ResourceLocation.parse("jamdrops:craft_epee_ombre"))) {
			if (entity.getData(JamdropsModVariables.PLAYER_VARIABLES).luminosite > -20) {
				if (entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.server.getRecipeManager().byKey(ResourceLocation.parse("jamdrops:craft_epee_ombre")).ifPresent(_rec -> _serverPlayer.resetRecipes(Collections.singleton(_rec)));
			}
		}
		if (!hasEntityRecipe(entity, ResourceLocation.parse("jamdrops:craft_boss_obscu"))) {
			if (entity.getData(JamdropsModVariables.PLAYER_VARIABLES).luminosite == -55) {
				if (entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("jamdrops:craft_boss_obscu")));
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							("title " + (entity.getDisplayName().getString() + "" + " title {\"text\":\"G\u00E9n\u00E9ral de l'obscurit\u00E9\",\"color\":\"gray\"}")));
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							("title " + (entity.getDisplayName().getString() + "" + " subtitle \"Vous pouvez crafter le boss de l'obcurit\u00E9\"")));
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.bell.resonate")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.bell.resonate")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
		}
		if (hasEntityRecipe(entity, ResourceLocation.parse("jamdrops:craft_boss_obscu"))) {
			if (entity.getData(JamdropsModVariables.PLAYER_VARIABLES).luminosite > -55) {
				if (entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.server.getRecipeManager().byKey(ResourceLocation.parse("jamdrops:craft_boss_obscu")).ifPresent(_rec -> _serverPlayer.resetRecipes(Collections.singleton(_rec)));
			}
		}
	}

	private static boolean hasEntityRecipe(Entity entity, ResourceLocation recipe) {
		if (entity instanceof ServerPlayer player)
			return player.getRecipeBook().contains(recipe);
		else if (entity instanceof LocalPlayer player && player.level().isClientSide())
			return player.getRecipeBook().contains(recipe);
		return false;
	}
}