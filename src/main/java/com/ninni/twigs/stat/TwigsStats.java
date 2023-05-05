package com.ninni.twigs.stat;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.stats.StatFormatter;
import static net.minecraft.stats.Stats.CUSTOM;

public interface TwigsStats {

    ResourceLocation OPEN_SILT_POT = register("open_silt_pot", StatFormatter.DEFAULT);


    private static ResourceLocation register(String id, StatFormatter formatter) {
        ResourceLocation rl = new ResourceLocation(id);
        Registry.register(Registry.CUSTOM_STAT, id, rl);
        CUSTOM.get(rl, formatter);
        return rl;
    }
}
