package com.omegice.item;

import com.omegice.entity.custom.ModBoatEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

public class ModBoatItem extends Item {
    private final RegistryObject<EntityType<ModBoatEntity>> type;

    public ModBoatItem(RegistryObject<EntityType<ModBoatEntity>> type, Properties properties) {
        super(properties);
        this.type = type;
    }
}