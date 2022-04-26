package com.waterlord7788.viking_expansion.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab VIKINGEXPANSION_TAB = new CreativeModeTab("vikingexpansion") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SAPPHIRE.get());
        }
    };
}
