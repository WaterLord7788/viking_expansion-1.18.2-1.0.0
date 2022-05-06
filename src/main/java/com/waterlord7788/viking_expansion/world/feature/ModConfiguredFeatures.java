package com.waterlord7788.viking_expansion.world.feature;

import com.google.common.collect.ImmutableList;
import com.waterlord7788.viking_expansion.blocks.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.TreeFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.TreePlacements;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.MegaPineFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.PineFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.treedecorators.AlterGroundDecorator;
import net.minecraft.world.level.levelgen.feature.trunkplacers.DarkOakTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.GiantTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import java.util.List;

// CF -> PF -> CF -> PF, where `CF` means configured feature and `PF` means placed feature
public class ModConfiguredFeatures {
    // Next chunk of code is needed to spawn a tree from a sapling
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> REDWOOD_TREE =
            FeatureUtils.register("redwood", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.REDWOOD_LOG.get()),
                    new StraightTrunkPlacer(5, 6, 3),
                    BlockStateProvider.simple(Blocks.SPRUCE_LEAVES),
                    // Experimenting with different foliage placers
                    new PineFoliagePlacer(ConstantInt.of(1), ConstantInt.of(1), UniformInt.of(3, 4)),
                    new TwoLayersFeatureSize(1, 0, 2)).build()); // Add `dirt()` method, if you want your sapling to be placed on different block

    public static final Holder<PlacedFeature> REDWOOD_CHECKED =
            PlacementUtils.register("redwood_checked", REDWOOD_TREE,
                    PlacementUtils.filteredByBlockSurvival(ModBlocks.REDWOOD_SAPLING.get()));


    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> REDWOOD_SPAWN =
            FeatureUtils.register("redwood_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(REDWOOD_CHECKED,
                            0.5F)), REDWOOD_CHECKED));



    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> MEGA_REDWOOD_TREE =
            FeatureUtils.register("mega_redwood", Feature.TREE, (new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.REDWOOD_LOG.get()),
                    //new GiantTrunkPlacer(30, 10, 20)
                    new DarkOakTrunkPlacer(15, 4, 10),
                    BlockStateProvider.simple(Blocks.SPRUCE_LEAVES),
                    new MegaPineFoliagePlacer(ConstantInt.of(1), ConstantInt.of(1), UniformInt.of(10, 18)),
                    new TwoLayersFeatureSize(10, 1, 10))).decorators(ImmutableList.of(new AlterGroundDecorator(BlockStateProvider.simple(Blocks.PODZOL)))).build());


    public static final Holder<PlacedFeature> MEGA_REDWOOD_CHECKED =
            PlacementUtils.register("mega_redwood_checked", MEGA_REDWOOD_TREE,
                    PlacementUtils.filteredByBlockSurvival(ModBlocks.REDWOOD_SAPLING.get()));


    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> MEGA_REDWOOD_SPAWN =
            FeatureUtils.register("mega_redwood_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(MEGA_REDWOOD_CHECKED, 0.025641026F),
                            new WeightedPlacedFeature(MEGA_REDWOOD_CHECKED, 0.30769232F)), TreePlacements.SPRUCE_CHECKED));


}