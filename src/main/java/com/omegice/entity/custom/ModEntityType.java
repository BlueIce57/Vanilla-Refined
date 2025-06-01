package com.omegice.entity.custom;

import com.omegice.Vanilla_refine;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityType {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPE = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Vanilla_refine.MODID);

    public static final ResourceKey<EntityType<?>> CRIMSON_BOAT_KEY =
            ResourceKey.create(
                    Registries.ENTITY_TYPE,
                    ResourceLocation.fromNamespaceAndPath("vanilla_refine", "crimson_boat")
            );

    public static final RegistryObject<EntityType<ModBoatEntity>> CRIMSON_BOAT_ENTITY = ENTITY_TYPE.register("crimson_boat", () -> EntityType.Builder.of(ModBoatEntity::new, MobCategory.MISC)
            .sized(1.375F, 0.5625F)
            .clientTrackingRange(10)
            .updateInterval(20)
            .build(CRIMSON_BOAT_KEY));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPE.register(eventBus);
    }
}