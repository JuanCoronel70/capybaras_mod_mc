package net.juancoronel70.capybarasmod.datagen;

import net.juancoronel70.capybarasmod.CapybarasMod;
import net.juancoronel70.capybarasmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper){
        super(output, CapybarasMod.MOD_ID, existingFileHelper);

    }

    @Override
    protected void registerModels() {
        withExistingParent(ModItems.CAPYBARA_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
    }


}
