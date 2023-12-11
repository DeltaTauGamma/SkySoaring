package com.deltataugamma.skysoaring.renderer;

import com.deltataugamma.skysoaring.SkySoaringMain;
import com.deltataugamma.skysoaring.entity.plane.PlaneEntity;
import com.deltataugamma.skysoaring.entity.plane.models.PlaneModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class PlaneRenderer extends MobRenderer<PlaneEntity, PlaneModel<PlaneEntity>>{
    protected static final ResourceLocation TEXTURE = new ResourceLocation(SkySoaringMain.MOD_ID, "textures/entity/Plane.png");

    public PlaneRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new PlaneModel<>(), 2F);
    }

    @Override
    public ResourceLocation getEntityTexture(PlaneEntity entity) {
        return TEXTURE;
    }
}
