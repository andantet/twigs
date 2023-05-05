package com.ninni.twigs.registry;

import com.ninni.twigs.Twigs;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

public class TwigsConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_RHYOLITE = createKey("ore_rhyolite");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_SCHIST = createKey("ore_schist");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_BLOODSTONE = createKey("ore_bloodstone");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SILT_STRIP = createKey("silt_strip");
    public static final ResourceKey<ConfiguredFeature<?, ?>> AZALEA_FLOWERS = createKey("azalea_flowers");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_TWIG = createKey("patch_twig");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_PEBBLE = createKey("patch_pebble");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_SEASHELL = createKey("patch_seashell");

    public static ResourceKey<ConfiguredFeature<?, ?>> createKey(String string) {
        return ResourceKey.create(Registry.CONFIGURED_FEATURE_REGISTRY, new ResourceLocation(Twigs.MOD_ID, string));
    }

}
