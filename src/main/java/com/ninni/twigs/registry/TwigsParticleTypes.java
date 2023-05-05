package com.ninni.twigs.registry;

import com.ninni.twigs.Twigs;
import com.ninni.twigs.client.particle.TwigsParticleType;
import net.minecraft.core.Registry;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.resources.ResourceLocation;

public class TwigsParticleTypes {

    public static final SimpleParticleType ITEM_PEBBLE = Registry.register(Registry.PARTICLE_TYPE, new ResourceLocation(Twigs.MOD_ID, "item_pebble"), new TwigsParticleType(false));

}
