package com.ninni.twigs.item;

import com.ninni.twigs.Twigs;
import com.ninni.twigs.registry.TwigsItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public interface TwigsCreativeModeTabs {
    CreativeModeTab ITEM_GROUP = new CreativeModeTab(Twigs.MOD_ID + ".item_group") {
        @Override
        public ItemStack makeIcon() {
            return TwigsItems.TWIGS.get().getDefaultInstance();
        }
    };
}
