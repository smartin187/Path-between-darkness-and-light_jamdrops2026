package net.mcreator.jamdrops.procedures;

import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.chat.Component;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.core.SectionPos;

import net.mcreator.jamdrops.network.JamdropsModVariables;
import net.mcreator.jamdrops.JamdropsMod;

import javax.annotation.Nullable;

@EventBusSubscriber(Dist.CLIENT)
public class TestLuminositeProcedure {
	@SubscribeEvent
	public static void onRightClick(PlayerInteractEvent.RightClickEmpty event) {
		if (event.getHand() != InteractionHand.MAIN_HAND)
			return;
		PacketDistributor.sendToServer(new TestLuminositeMessage());
		execute(event.getLevel(), event.getEntity());
	}

	@EventBusSubscriber
	public record TestLuminositeMessage() implements CustomPacketPayload {
		public static final Type<TestLuminositeMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(JamdropsMod.MODID, "procedure_test_luminosite"));
		public static final StreamCodec<RegistryFriendlyByteBuf, TestLuminositeMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, TestLuminositeMessage message) -> {
		}, (RegistryFriendlyByteBuf buffer) -> new TestLuminositeMessage());

		@Override
		public Type<TestLuminositeMessage> type() {
			return TYPE;
		}

		public static void handleData(final TestLuminositeMessage message, final IPayloadContext context) {
			if (context.flow() == PacketFlow.SERVERBOUND) {
				context.enqueueWork(() -> {
					if (!context.player().level().getChunkSource().hasChunk(SectionPos.blockToSectionCoord(context.player().getX()), SectionPos.blockToSectionCoord(context.player().getZ())))
						return;
					execute(context.player().level(), context.player());
				}).exceptionally(e -> {
					context.connection().disconnect(Component.literal(e.getMessage()));
					return null;
				});
			}
		}

		@SubscribeEvent
		public static void registerMessage(FMLCommonSetupEvent event) {
			JamdropsMod.addNetworkMessage(TestLuminositeMessage.TYPE, TestLuminositeMessage.STREAM_CODEC, TestLuminositeMessage::handleData);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity.isShiftKeyDown()) {
			JamdropsModVariables.WorldVariables.get(world).luminosite = JamdropsModVariables.WorldVariables.get(world).luminosite - 1;
			JamdropsModVariables.WorldVariables.get(world).markSyncDirty();
		} else {
			JamdropsModVariables.WorldVariables.get(world).luminosite = JamdropsModVariables.WorldVariables.get(world).luminosite + 1;
			JamdropsModVariables.WorldVariables.get(world).markSyncDirty();
		}
	}
}