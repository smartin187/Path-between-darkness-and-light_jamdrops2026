/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jamdrops.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.jamdrops.JamdropsMod;

@EventBusSubscriber
public class JamdropsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, JamdropsMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MENU = REGISTRY.register("menu",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.jamdrops.menu")).icon(() -> new ItemStack(JamdropsModItems.GEMME_LUMINEUX.get())).displayItems((parameters, tabData) -> {
				tabData.accept(JamdropsModItems.GEMME_LUMINEUX.get());
				tabData.accept(JamdropsModItems.GEMME_SOMBRE.get());
				tabData.accept(JamdropsModItems.FOUDREITEM.get());
				tabData.accept(JamdropsModItems.ORBE_LUM_ITEM.get());
				tabData.accept(JamdropsModBlocks.BLOCK_DE_LUMIERE.get().asItem());
				tabData.accept(JamdropsModBlocks.DALE_DE_LUMIERE.get().asItem());
				tabData.accept(JamdropsModBlocks.ESCALIER_DE_LUMIERE.get().asItem());
				tabData.accept(JamdropsModBlocks.MURRET_DE_LUMIERE.get().asItem());
				tabData.accept(JamdropsModBlocks.BLOC_D_OBSCURITE.get().asItem());
				tabData.accept(JamdropsModBlocks.DALLE_D_OBSCURITE.get().asItem());
				tabData.accept(JamdropsModBlocks.ESCALIER_D_OBSCURITE.get().asItem());
				tabData.accept(JamdropsModBlocks.MURRET_D_OBSCURITE.get().asItem());
				tabData.accept(JamdropsModItems.EPEE_LUMIERE.get());
				tabData.accept(JamdropsModItems.EPEE_OBSCURITE.get());
				tabData.accept(JamdropsModItems.BOSSLUMINEUX_SPAWN_EGG.get());
				tabData.accept(JamdropsModItems.BOSS_SOMBRE_SPAWN_EGG.get());
				tabData.accept(JamdropsModItems.PRETRE_LUMINEUX_SPAWN_EGG.get());
				tabData.accept(JamdropsModItems.PRETRE_CA_C_SPAWN_EGG.get());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(JamdropsModItems.BOSSLUMINEUX_SPAWN_EGG.get());
			tabData.accept(JamdropsModItems.BOSS_SOMBRE_SPAWN_EGG.get());
			tabData.accept(JamdropsModItems.PRETRE_LUMINEUX_SPAWN_EGG.get());
			tabData.accept(JamdropsModItems.PRETRE_CA_C_SPAWN_EGG.get());
			tabData.accept(JamdropsModItems.PRETRE_HEAL_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(JamdropsModItems.EPEE_LUMIERE.get());
			tabData.accept(JamdropsModItems.EPEE_OBSCURITE.get());
		}
	}
}