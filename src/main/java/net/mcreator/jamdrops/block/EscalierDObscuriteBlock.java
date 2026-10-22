package net.mcreator.jamdrops.block;

import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class EscalierDObscuriteBlock extends StairBlock {
	public EscalierDObscuriteBlock() {
		super(Blocks.AIR.defaultBlockState(), BlockBehaviour.Properties.of().sound(SoundType.GRAVEL).strength(1f, 10f));
	}

	@Override
	public float getExplosionResistance() {
		return 10f;
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, list, flag);
		list.add(Component.translatable("block.jamdrops.escalier_d_obscurite.description_0"));
	}
}