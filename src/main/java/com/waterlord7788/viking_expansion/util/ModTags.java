package com.waterlord7788.viking_expansion.util;

import com.waterlord7788.viking_expansion.VikingExpansion;
import net.minecraft.client.tutorial.Tutorial;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.Tag;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraft.data.tags.TagsProvider;
import net.minecraftforge.registries.ForgeRegistries;
import org.checkerframework.checker.signature.qual.Identifier;

import java.rmi.registry.Registry;

public class ModTags {
    public static class Blocks{
        public static final TagKey<Block> DOWSING_ROD_VALUABLES
                = tag("dowsing_rod_valuables");

        private static TagKey<Block> tag(String name){
            return BlockTags.create(new ResourceLocation(VikingExpansion.MOD_ID, name));
        }

        private static TagKey<Block> forgeTag(String name){
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }


    public static class Items{
        public static final TagKey<Item> ALL_SAPPHIRE_ORES
                = forgeTag("ores/sapphire");

        public static final TagKey<Item> SAPPHIRE_GEMS = forgeTag("gems/sapphire");

        public static final TagKey<Item> SAPPHIRE_ORES = forgeTag("ores/sapphire");

        private static TagKey<Item> tag(String name){
            return ItemTags.create(new ResourceLocation(VikingExpansion.MOD_ID, name));
        }

        private static TagKey<Item> forgeTag(String name){
            return ItemTags.create(new ResourceLocation("forge", name));
        }

    }
}
