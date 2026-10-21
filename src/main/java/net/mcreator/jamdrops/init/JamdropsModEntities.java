/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jamdrops.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.registries.Registries;

import net.mcreator.jamdrops.entity.BosslumineuxEntityProjectile;
import net.mcreator.jamdrops.entity.BosslumineuxEntity;
import net.mcreator.jamdrops.entity.BossSombreEntityProjectile;
import net.mcreator.jamdrops.entity.BossSombreEntity;
import net.mcreator.jamdrops.JamdropsMod;

@EventBusSubscriber
public class JamdropsModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, JamdropsMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<BosslumineuxEntity>> BOSSLUMINEUX = register("bosslumineux",
			EntityType.Builder.<BosslumineuxEntity>of(BosslumineuxEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(3f, 4f));
	public static final DeferredHolder<EntityType<?>, EntityType<BosslumineuxEntityProjectile>> BOSSLUMINEUX_PROJECTILE = register("projectile_bosslumineux",
			EntityType.Builder.<BosslumineuxEntityProjectile>of(BosslumineuxEntityProjectile::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BossSombreEntity>> BOSS_SOMBRE = register("boss_sombre",
			EntityType.Builder.<BossSombreEntity>of(BossSombreEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<BossSombreEntityProjectile>> BOSS_SOMBRE_PROJECTILE = register("projectile_boss_sombre",
			EntityType.Builder.<BossSombreEntityProjectile>of(BossSombreEntityProjectile::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		BosslumineuxEntity.init(event);
		BossSombreEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(BOSSLUMINEUX.get(), BosslumineuxEntity.createAttributes().build());
		event.put(BOSS_SOMBRE.get(), BossSombreEntity.createAttributes().build());
	}
}