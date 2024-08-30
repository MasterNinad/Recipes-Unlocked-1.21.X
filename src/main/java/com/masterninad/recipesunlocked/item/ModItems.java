package com.masterninad.recipesunlocked.item;

import com.masterninad.recipesunlocked.RecipesUnlocked;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RecipesUnlocked.MOD_ID);

    public static final RegistryObject<Item> TOTEM_HEAD = ITEMS.register("totem_head",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
