package com.waterlord7788.viking_expansion.items;

import com.waterlord7788.viking_expansion.VikingExpansion;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, VikingExpansion.MOD_ID);

    // 'sapphire' is the item's name
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.VIKINGEXPANSION_TAB)));

    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.VIKINGEXPANSION_TAB)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

















}













