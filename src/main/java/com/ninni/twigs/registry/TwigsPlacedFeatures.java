package com.ninni.twigs.registry;

import com.ninni.twigs.Twigs;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class TwigsPlacedFeatures {

    public static final ResourceKey<PlacedFeature> ORE_RHYOLITE = createKey("ore_rhyolite");
    public static final ResourceKey<PlacedFeature> ORE_BLOODSTONE = createKey("ore_bloodstone");
    public static final ResourceKey<PlacedFeature> ORE_SCHIST_UPPER = createKey("ore_schist_upper");
    public static final ResourceKey<PlacedFeature> ORE_SCHIST_LOWER = createKey("ore_schist_lower");
    public static final ResourceKey<PlacedFeature> SILT_STRIP = createKey("silt_strip");
    public static final ResourceKey<PlacedFeature> AZALEA_FLOWERS = createKey("azalea_flowers");
    public static final ResourceKey<PlacedFeature> PATCH_TWIG = createKey("patch_twig");
    public static final ResourceKey<PlacedFeature> PATCH_PEBBLE = createKey("patch_pebble");
    public static final ResourceKey<PlacedFeature> PATCH_SEASHELL_LAND = createKey("patch_seashell_land");
    public static final ResourceKey<PlacedFeature> PATCH_SEASHELL_WATER = createKey("patch_seashell_water");

    public static ResourceKey<PlacedFeature> createKey(String string) {
        return ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY, new ResourceLocation(Twigs.MOD_ID, string));
    }

}
