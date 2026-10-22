/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jamdrops.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.jamdrops.item.GemmeSombreItem;
import net.mcreator.jamdrops.item.GemmeLumineuxItem;
import net.mcreator.jamdrops.item.EpeeLumiereItem;
import net.mcreator.jamdrops.JamdropsMod;

public class JamdropsModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(JamdropsMod.MODID);
	public static final DeferredItem<Item> BOSSLUMINEUX_SPAWN_EGG;
	public static final DeferredItem<Item> BOSS_SOMBRE_SPAWN_EGG;
	public static final DeferredItem<Item> GEMME_LUMINEUX;
	public static final DeferredItem<Item> GEMME_SOMBRE;
	public static final DeferredItem<Item> PRETRE_LUMINEUX_SPAWN_EGG;
	public static final DeferredItem<Item> EPEE_LUMIERE;
	public static final DeferredItem<Item> BLOCK_DE_LUMIERE;
	static {
		BOSSLUMINEUX_SPAWN_EGG = REGISTRY.register("bosslumineux_spawn_egg", () -> new DeferredSpawnEggItem(JamdropsModEntities.BOSSLUMINEUX, -1, -1, new Item.Properties()));
		BOSS_SOMBRE_SPAWN_EGG = REGISTRY.register("boss_sombre_spawn_egg", () -> new DeferredSpawnEggItem(JamdropsModEntities.BOSS_SOMBRE, -13421773, -13421773, new Item.Properties()));
		GEMME_LUMINEUX = REGISTRY.register("gemme_lumineux", GemmeLumineuxItem::new);
		GEMME_SOMBRE = REGISTRY.register("gemme_sombre", GemmeSombreItem::new);
		PRETRE_LUMINEUX_SPAWN_EGG = REGISTRY.register("pretre_lumineux_spawn_egg", () -> new DeferredSpawnEggItem(JamdropsModEntities.PRETRE_LUMINEUX, -10066330, -1, new Item.Properties()));
		EPEE_LUMIERE = REGISTRY.register("epee_lumiere", EpeeLumiereItem::new);
		BLOCK_DE_LUMIERE = block(JamdropsModBlocks.BLOCK_DE_LUMIERE);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}