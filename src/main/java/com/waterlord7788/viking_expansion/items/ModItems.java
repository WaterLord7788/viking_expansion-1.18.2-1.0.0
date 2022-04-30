package com.waterlord7788.viking_expansion.items;

import com.waterlord7788.viking_expansion.VikingExpansion;
import com.waterlord7788.viking_expansion.items.custom.CoalCokeItem;
import com.waterlord7788.viking_expansion.items.custom.DowsingRodItem;
import com.waterlord7788.viking_expansion.items.custom.ModArmorItem;
import com.waterlord7788.viking_expansion.items.custom.PoisonSwordItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, VikingExpansion.MOD_ID);

    // Item material for making tools out of it
    // 'sapphire' is the item's name
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.VIKINGEXPANSION_TAB)));

    // Ores, which will drop from block ores
    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.VIKINGEXPANSION_TAB)));

    // Custom advanced items
    public static final RegistryObject<Item> DOWSING_ROD = ITEMS.register("dowsing_rod",
            () -> new DowsingRodItem(new Item.Properties().tab(ModCreativeModeTab.VIKINGEXPANSION_TAB).durability(16)));

    // Foods
    public static final RegistryObject<Item> CUCUMBER = ITEMS.register("cucumber",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.VIKINGEXPANSION_TAB).food(ModFoods.CUCUMBER)));

    // Fuels
    public static final RegistryObject<Item> COAL_COKE = ITEMS.register("coal_coke",
            () -> new CoalCokeItem(new Item.Properties().tab(ModCreativeModeTab.VIKINGEXPANSION_TAB)));

    // Tools
    public static final RegistryObject<Item> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword",
            () -> new PoisonSwordItem(ModTiers.SAPPHIRE, 3, 0f,
                    new Item.Properties().tab(ModCreativeModeTab.VIKINGEXPANSION_TAB)));
    public static final RegistryObject<Item> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe",
            () -> new PickaxeItem(ModTiers.SAPPHIRE, 1, 0f,
                    new Item.Properties().tab(ModCreativeModeTab.VIKINGEXPANSION_TAB)));
    public static final RegistryObject<Item> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel",
            () -> new ShovelItem(ModTiers.SAPPHIRE, 0, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.VIKINGEXPANSION_TAB)));
    public static final RegistryObject<Item> SAPPHIRE_AXE = ITEMS.register("sapphire_axe",
            () -> new AxeItem(ModTiers.SAPPHIRE, 4, 0f,
                    new Item.Properties().tab(ModCreativeModeTab.VIKINGEXPANSION_TAB)));
    public static final RegistryObject<Item> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe",
            () -> new HoeItem(ModTiers.SAPPHIRE, 0, 0f,
                    new Item.Properties().tab(ModCreativeModeTab.VIKINGEXPANSION_TAB)));

    // Armor
    public static final RegistryObject<Item> SAPPHIRE_HELMET = ITEMS.register("sapphire_helmet",
            () -> new ModArmorItem(ModArmorMaterials.SAPPHIRE, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.VIKINGEXPANSION_TAB)));
    public static final RegistryObject<Item> SAPPHIRE_CHESTPLATE = ITEMS.register("sapphire_chestplate",
            () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.VIKINGEXPANSION_TAB)));
    public static final RegistryObject<Item> SAPPHIRE_LEGGINGS = ITEMS.register("sapphire_leggings",
            () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.VIKINGEXPANSION_TAB)));
    public static final RegistryObject<Item> SAPPHIRE_BOOTS = ITEMS.register("sapphire_boots",
            () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.VIKINGEXPANSION_TAB)));

    // Item with animated texture
    public static final RegistryObject<Item> MAGIC_DUST = ITEMS.register("magic_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.VIKINGEXPANSION_TAB)));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}













