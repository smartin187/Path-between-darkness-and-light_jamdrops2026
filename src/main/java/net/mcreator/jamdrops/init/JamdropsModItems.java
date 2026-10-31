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

import net.mcreator.jamdrops.item.*;
import net.mcreator.jamdrops.JamdropsMod;

public class JamdropsModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(JamdropsMod.MODID);
	public static final DeferredItem<Item> BOSSLUMINEUX_SPAWN_EGG;
	public static final DeferredItem<Item> BOSS_SOMBRE_SPAWN_EGG;
	public static final DeferredItem<Item> GEMME_LUMINEUX;
	public static final DeferredItem<Item> GEMME_SOMBRE;
	public static final DeferredItem<Item> PRETRE_LUMINEUX_SPAWN_EGG;
	public static final DeferredItem<Item> FOUDREITEM;
	public static final DeferredItem<Item> ORBE_LUM_ITEM;
	public static final DeferredItem<Item> EPEE_LUMIERE;
	public static final DeferredItem<Item> BLOCK_DE_LUMIERE;
	public static final DeferredItem<Item> DALE_DE_LUMIERE;
	public static final DeferredItem<Item> ESCALIER_DE_LUMIERE;
	public static final DeferredItem<Item> MURRET_DE_LUMIERE;
	public static final DeferredItem<Item> BLOC_D_OBSCURITE;
	public static final DeferredItem<Item> DALLE_D_OBSCURITE;
	public static final DeferredItem<Item> ESCALIER_D_OBSCURITE;
	public static final DeferredItem<Item> MURRET_D_OBSCURITE;
	public static final DeferredItem<Item> EPEE_OBSCURITE;
	public static final DeferredItem<Item> PRETRE_CA_C_SPAWN_EGG;
	public static final DeferredItem<Item> PRETRE_HEAL_SPAWN_EGG;
	public static final DeferredItem<Item> GARDIEN_OMBRE_SPAWN_EGG;
	static {
		BOSSLUMINEUX_SPAWN_EGG = REGISTRY.register("bosslumineux_spawn_egg", () -> new DeferredSpawnEggItem(JamdropsModEntities.BOSSLUMINEUX, -1, -103, new Item.Properties()));
		BOSS_SOMBRE_SPAWN_EGG = REGISTRY.register("boss_sombre_spawn_egg", () -> new DeferredSpawnEggItem(JamdropsModEntities.BOSS_SOMBRE, -10092442, -16777216, new Item.Properties()));
		GEMME_LUMINEUX = REGISTRY.register("gemme_lumineux", GemmeLumineuxItem::new);
		GEMME_SOMBRE = REGISTRY.register("gemme_sombre", GemmeSombreItem::new);
		PRETRE_LUMINEUX_SPAWN_EGG = REGISTRY.register("pretre_lumineux_spawn_egg", () -> new DeferredSpawnEggItem(JamdropsModEntities.PRETRE_LUMINEUX, -1, -6684724, new Item.Properties()));
		FOUDREITEM = REGISTRY.register("foudreitem", FoudreitemItem::new);
		ORBE_LUM_ITEM = REGISTRY.register("orbe_lum_item", OrbeLumItemItem::new);
		EPEE_LUMIERE = REGISTRY.register("epee_lumiere", EpeeLumiereItem::new);
		BLOCK_DE_LUMIERE = block(JamdropsModBlocks.BLOCK_DE_LUMIERE);
		DALE_DE_LUMIERE = block(JamdropsModBlocks.DALE_DE_LUMIERE);
		ESCALIER_DE_LUMIERE = block(JamdropsModBlocks.ESCALIER_DE_LUMIERE);
		MURRET_DE_LUMIERE = block(JamdropsModBlocks.MURRET_DE_LUMIERE);
		BLOC_D_OBSCURITE = block(JamdropsModBlocks.BLOC_D_OBSCURITE);
		DALLE_D_OBSCURITE = block(JamdropsModBlocks.DALLE_D_OBSCURITE);
		ESCALIER_D_OBSCURITE = block(JamdropsModBlocks.ESCALIER_D_OBSCURITE);
		MURRET_D_OBSCURITE = block(JamdropsModBlocks.MURRET_D_OBSCURITE);
		EPEE_OBSCURITE = REGISTRY.register("epee_obscurite", EpeeObscuriteItem::new);
		PRETRE_CA_C_SPAWN_EGG = REGISTRY.register("pretre_ca_c_spawn_egg", () -> new DeferredSpawnEggItem(JamdropsModEntities.PRETRE_CA_C, -1, -10027213, new Item.Properties()));
		PRETRE_HEAL_SPAWN_EGG = REGISTRY.register("pretre_heal_spawn_egg", () -> new DeferredSpawnEggItem(JamdropsModEntities.PRETRE_HEAL, -1, -65536, new Item.Properties()));
		GARDIEN_OMBRE_SPAWN_EGG = REGISTRY.register("gardien_ombre_spawn_egg", () -> new DeferredSpawnEggItem(JamdropsModEntities.GARDIEN_OMBRE, -1, -10027213, new Item.Properties()));
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