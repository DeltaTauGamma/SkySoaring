//Copyright (c) 2021 DeltaTauGamma

package com.deltataugamma.skysoaring.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.world.World;

public class  PlaneEntity extends MobEntity {
    public PlaneEntity(EntityType<? extends TameableEntity> type, World worldIn) {
        super(type, worldIn);
    }
}

