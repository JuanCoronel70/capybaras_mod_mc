package net.juancoronel70.capybarasmod.entity;

import net.juancoronel70.capybarasmod.CapybarasMod;
import net.juancoronel70.capybarasmod.entity.custom.CapybaraEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {

    private static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, CapybarasMod.MOD_ID);

    public static final RegistryObject<EntityType<CapybaraEntity>> CAPYBARA =
            ENTITY_TYPES.register("capybara",
                    () -> EntityType.Builder.of(CapybaraEntity::new, MobCategory.CREATURE)
                            .sized(1.5f, 1.75f)
                            .build(new ResourceLocation(CapybarasMod.MOD_ID, "capybara").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
