package com.deltataugamma.skysoaring.entity.plane;

import com.deltataugamma.skysoaring.SkySoaringMain;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class PlaneEntityType {

    public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, SkySoaringMain.MOD_ID);

    public static final RegistryObject<EntityType<PlaneEntity>> Plane = ENTITY_TYPES.register("Plane", () -> EntityType.Builder.create(PlaneEntity::new, EntityClassification.CREATURE)
            .size(3.0f,  2.0f)
            .build(new ResourceLocation(SkySoaringMain.MOD_ID, "plane").toString()));
        }