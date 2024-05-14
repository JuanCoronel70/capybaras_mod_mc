package net.juancoronel70.capybarasmod.event;

import net.juancoronel70.capybarasmod.CapybarasMod;
import net.juancoronel70.capybarasmod.entity.ModEntityTypes;
import net.juancoronel70.capybarasmod.entity.custom.CapybaraEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = CapybarasMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEvents {
    @SubscribeEvent
    public static void  entityAttributEvent(EntityAttributeCreationEvent event){
        event.put(ModEntityTypes.CAPYBARA.get(), CapybaraEntity.setAttributes());
    }
}
