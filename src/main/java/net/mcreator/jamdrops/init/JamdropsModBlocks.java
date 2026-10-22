/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jamdrops.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.jamdrops.block.DaleDeLumiereBlock;
import net.mcreator.jamdrops.block.BlockDeLumiereBlock;
import net.mcreator.jamdrops.JamdropsMod;

public class JamdropsModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(JamdropsMod.MODID);
	public static final DeferredBlock<Block> BLOCK_DE_LUMIERE;
	public static final DeferredBlock<Block> DALE_DE_LUMIERE;
	static {
		BLOCK_DE_LUMIERE = REGISTRY.register("block_de_lumiere", BlockDeLumiereBlock::new);
		DALE_DE_LUMIERE = REGISTRY.register("dale_de_lumiere", DaleDeLumiereBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}