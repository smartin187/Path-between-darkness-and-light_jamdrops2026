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

import net.mcreator.jamdrops.entity.*;
import net.mcreator.jamdrops.JamdropsMod;

@EventBusSubscriber
public class JamdropsModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, JamdropsMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<BosslumineuxEntity>> BOSSLUMINEUX = register("bosslumineux",
			EntityType.Builder.<BosslumineuxEntity>of(BosslumineuxEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(3f, 4f));
	public static final DeferredHolder<EntityType<?>, EntityType<BossSombreEntity>> BOSS_SOMBRE = register("boss_sombre",
			EntityType.Builder.<BossSombreEntity>of(BossSombreEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(3f, 4f));
	public static final DeferredHolder<EntityType<?>, EntityType<PretreLumineuxEntity>> PRETRE_LUMINEUX = register("pretre_lumineux",
			EntityType.Builder.<PretreLumineuxEntity>of(PretreLumineuxEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<FoudreEntity>> FOUDRE = register("foudre",
			EntityType.Builder.<FoudreEntity>of(FoudreEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<OrbeDeLumiereEntity>> ORBE_DE_LUMIERE = register("orbe_de_lumiere",
			EntityType.Builder.<OrbeDeLumiereEntity>of(OrbeDeLumiereEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<PretreCaCEntity>> PRETRE_CA_C = register("pretre_ca_c",
			EntityType.Builder.<PretreCaCEntity>of(PretreCaCEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<ProjectilOmbreEntity>> PROJECTIL_OMBRE = register("projectil_ombre",
			EntityType.Builder.<ProjectilOmbreEntity>of(ProjectilOmbreEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<PretreHealEntity>> PRETRE_HEAL = register("pretre_heal",
			EntityType.Builder.<PretreHealEntity>of(PretreHealEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.8f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		BosslumineuxEntity.init(event);
		BossSombreEntity.init(event);
		PretreLumineuxEntity.init(event);
		PretreCaCEntity.init(event);
		PretreHealEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(BOSSLUMINEUX.get(), BosslumineuxEntity.createAttributes().build());
		event.put(BOSS_SOMBRE.get(), BossSombreEntity.createAttributes().build());
		event.put(PRETRE_LUMINEUX.get(), PretreLumineuxEntity.createAttributes().build());
		event.put(PRETRE_CA_C.get(), PretreCaCEntity.createAttributes().build());
		event.put(PRETRE_HEAL.get(), PretreHealEntity.createAttributes().build());
	}
}