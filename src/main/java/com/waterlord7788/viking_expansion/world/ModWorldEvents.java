package com.waterlord7788.viking_expansion.world;

import com.waterlord7788.viking_expansion.VikingExpansion;
import com.waterlord7788.viking_expansion.world.gen.ModFlowerGeneration;
import com.waterlord7788.viking_expansion.world.gen.ModTreeGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = VikingExpansion.MOD_ID)
public class ModWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        ModTreeGeneration.generateTrees(event);
        ModFlowerGeneration.generateFlowers(event);
    }
}