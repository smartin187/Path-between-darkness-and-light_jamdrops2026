/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jamdrops.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.jamdrops.block.*;
import net.mcreator.jamdrops.JamdropsMod;

public class JamdropsModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(JamdropsMod.MODID);
	public static final DeferredBlock<Block> BLOCK_DE_LUMIERE;
	public static final DeferredBlock<Block> DALE_DE_LUMIERE;
	public static final DeferredBlock<Block> ESCALIER_DE_LUMIERE;
	public static final DeferredBlock<Block> MURRET_DE_LUMIERE;
	public static final DeferredBlock<Block> BLOC_D_OBSCURITE;
	public static final DeferredBlock<Block> DALLE_D_OBSCURITE;
	static {
		BLOCK_DE_LUMIERE = REGISTRY.register("block_de_lumiere", BlockDeLumiereBlock::new);
		DALE_DE_LUMIERE = REGISTRY.register("dale_de_lumiere", DaleDeLumiereBlock::new);
		ESCALIER_DE_LUMIERE = REGISTRY.register("escalier_de_lumiere", EscalierDeLumiereBlock::new);
		MURRET_DE_LUMIERE = REGISTRY.register("murret_de_lumiere", MurretDeLumiereBlock::new);
		BLOC_D_OBSCURITE = REGISTRY.register("bloc_d_obscurite", BlocDObscuriteBlock::new);
		DALLE_D_OBSCURITE = REGISTRY.register("dalle_d_obscurite", DalleDObscuriteBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}