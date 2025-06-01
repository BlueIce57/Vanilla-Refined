package com.omegice.entity.custom;

import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class ModBoatEntity extends Boat {

    public ModBoatEntity(EntityType<? extends Boat> type, Level level) {
        super(type, level, null);
    }

    @Override
    protected double rideHeight(@NotNull EntityDimensions p_363309_) {
        return 0;
    }
}
