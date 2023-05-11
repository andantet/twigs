package com.ninni.twigs.registry;

import com.ninni.twigs.Twigs;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.registries.ForgeRegistries;

public class TwigsBiomeModifier {
    private static final ResourceKey<BiomeModifier> ADD_ORE_BLOODSTONE = createKey("add_ore_bloodstone");
    private static final ResourceKey<BiomeModifier> ORE_RHYOLITE = createKey("add_ore_rhyolite");
    private static final ResourceKey<BiomeModifier> ADD_ORE_SCHIST = createKey("add_ore_schist");
    private static final ResourceKey<BiomeModifier> ADD_SILT_STRIP = createKey("add_silt_strip");
    private static final ResourceKey<BiomeModifier> ADD_AZALEA_FLOWERS = createKey("add_azalea_flowers");
    private static final ResourceKey<BiomeModifier> ADD_TWIGS = createKey("add_twigs");
    private static final ResourceKey<BiomeModifier> ADD_PEBBLES = createKey("add_pebbles");
    private static final ResourceKey<BiomeModifier> ADD_LAND_SEA_SHELLS = createKey("add_land_sea_shells");
    private static final ResourceKey<BiomeModifier> ADD_WATER_SEA_SHELLS = createKey("add_water_sea_shells");

    public static ResourceKey<BiomeModifier> createKey(String string) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(Twigs.MOD_ID, string));
    }

}
