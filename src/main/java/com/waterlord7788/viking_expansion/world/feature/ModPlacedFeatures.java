package com.waterlord7788.viking_expansion.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.RarityFilter;

public class ModPlacedFeatures {
    public static final Holder<PlacedFeature> REDWOOD_PLACED = PlacementUtils.register("redwood_placed",
            ModConfiguredFeatures.REDWOOD_SPAWN, VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(3, 0.1f, 2)
            ));

    public static final Holder<PlacedFeature> MEGA_REDWOOD_PLACED = PlacementUtils.register("mega_redwood_placed",
            ModConfiguredFeatures.MEGA_REDWOOD_SPAWN, VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(3, 0.1f, 2)
            ));
}