package net.juancoronel70.capybarasmod;

import com.mojang.logging.LogUtils;
import net.juancoronel70.capybarasmod.datagen.ModItemModelProvider;
import net.juancoronel70.capybarasmod.entity.ModEntityTypes;
import net.juancoronel70.capybarasmod.entity.client.CapybaraRenderer;
import net.juancoronel70.capybarasmod.entity.custom.CapybaraEntity;
import net.juancoronel70.capybarasmod.item.ModItems;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import org.slf4j.Logger;
import software.bernie.geckolib.GeckoLib;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(CapybarasMod.MOD_ID)
public class CapybarasMod
{

    public static final String MOD_ID = "capybarasmod";

    private static final Logger LOGGER = LogUtils.getLogger();


    public CapybarasMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        //added line for items
        ModItems.register(modEventBus);

        //added line for entities
        ModEntityTypes.register(modEventBus);

        //Initialize GeckoLib
        GeckoLib.initialize();


        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);

    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {

    }


    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            EntityRenderers.register(ModEntityTypes.CAPYBARA.get(), CapybaraRenderer::new);
        }
    }
}
