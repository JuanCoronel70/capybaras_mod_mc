package net.juancoronel70.capybarasmod.entity.client;

import net.juancoronel70.capybarasmod.CapybarasMod;
import net.juancoronel70.capybarasmod.entity.custom.CapybaraEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class CapybaraModel extends GeoModel<CapybaraEntity> {
    @Override
    public ResourceLocation getModelResource(CapybaraEntity capybaraEntity) {
        return new ResourceLocation(CapybarasMod.MOD_ID, "geo/capybara.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(CapybaraEntity capybaraEntity) {
        return new ResourceLocation(CapybarasMod.MOD_ID, "textures/entity/capybara.png");
    }

    @Override
    public ResourceLocation getAnimationResource(CapybaraEntity capybaraEntity) {
        return new ResourceLocation(CapybarasMod.MOD_ID, "animations/capybara.animation.json");
    }

    @Override
    public void setCustomAnimations(CapybaraEntity animatable, long instanceId, AnimationState<CapybaraEntity> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("Head");

        if (head != null){
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);

            head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
            head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
        }

    }
}
