//Copyright (c) 2021 DeltaTauGamma

package com.deltataugamma.skysoaring.entity.plane;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.item.BoatEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;


public class  PlaneEntity extends BoatEntity {

    public PlaneEntity(EntityType<? extends BoatEntity> type, World world) {
        super(type, world);
    }
    // func_233666_p_() -> registers attributes
    public static AttributeModifierMap.MutableAttribute setCustomPlaneAttributes() {
        return MobEntity.func_233666_p_()
                .createMutableAttribute(Attributes.MAX_HEALTH, 100.0D)
                .createMutableAttribute(Attributes.MOVEMENT_SPEED, 2.0D);
    }

    @Override
    protected int getXPPoints(PlayerEntity player) {
        return 50 + this.world.rand.nextInt(5);
    }
}

