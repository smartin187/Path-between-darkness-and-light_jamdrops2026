/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jamdrops.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.jamdrops.item.GemmeSombreItem;
import net.mcreator.jamdrops.item.GemmeLumineuxItem;
import net.mcreator.jamdrops.item.FoudreitemItem;
import net.mcreator.jamdrops.JamdropsMod;

public class JamdropsModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(JamdropsMod.MODID);
	public static final DeferredItem<Item> BOSSLUMINEUX_SPAWN_EGG;
	public static final DeferredItem<Item> BOSS_SOMBRE_SPAWN_EGG;
	public static final DeferredItem<Item> GEMME_LUMINEUX;
	public static final DeferredItem<Item> GEMME_SOMBRE;
	public static final DeferredItem<Item> PRETRE_LUMINEUX_SPAWN_EGG;
	public static final DeferredItem<Item> FOUDREITEM;
	static {
		BOSSLUMINEUX_SPAWN_EGG = REGISTRY.register("bosslumineux_spawn_egg", () -> new DeferredSpawnEggItem(JamdropsModEntities.BOSSLUMINEUX, -1, -1, new Item.Properties()));
		BOSS_SOMBRE_SPAWN_EGG = REGISTRY.register("boss_sombre_spawn_egg", () -> new DeferredSpawnEggItem(JamdropsModEntities.BOSS_SOMBRE, -13421773, -13421773, new Item.Properties()));
		GEMME_LUMINEUX = REGISTRY.register("gemme_lumineux", GemmeLumineuxItem::new);
		GEMME_SOMBRE = REGISTRY.register("gemme_sombre", GemmeSombreItem::new);
		PRETRE_LUMINEUX_SPAWN_EGG = REGISTRY.register("pretre_lumineux_spawn_egg", () -> new DeferredSpawnEggItem(JamdropsModEntities.PRETRE_LUMINEUX, -10066330, -1, new Item.Properties()));
		FOUDREITEM = REGISTRY.register("foudreitem", FoudreitemItem::new);
	}
	// Start of user code block custom items
	// End of user code block custom items
}