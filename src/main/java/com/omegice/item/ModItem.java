// ModItem.java
package com.omegice.item;

import com.omegice.Vanilla_refine;
import com.omegice.entity.custom.ModEntityType;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItem {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Vanilla_refine.MODID);

    public static final RegistryObject<Item> CRIMSON_BOAT = ITEMS.register("crimson_boat",
            () -> new ModBoatItem(ModEntityType.CRIMSON_BOAT_ENTITY, new Item.Properties().stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}