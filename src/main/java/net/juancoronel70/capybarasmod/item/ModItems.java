package net.juancoronel70.capybarasmod.item;

import net.juancoronel70.capybarasmod.CapybarasMod;
import net.juancoronel70.capybarasmod.entity.ModEntityTypes;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CapybarasMod.MOD_ID);

    public static final RegistryObject<Item> CAPYBARA_SPAWN_EGG = ITEMS.register("capybara_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.CAPYBARA, 0x1E51ED, 0x34BD27,
                    new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
