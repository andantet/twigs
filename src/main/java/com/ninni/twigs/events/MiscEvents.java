package com.ninni.twigs.events;

import com.google.common.base.Suppliers;
import com.ninni.twigs.Twigs;
import com.ninni.twigs.entity.Pebble;
import com.ninni.twigs.registry.TwigsBlocks;
import com.ninni.twigs.registry.TwigsItems;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import net.minecraft.Util;
import net.minecraft.advancements.critereon.EnchantmentPredicate;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.advancements.critereon.MinMaxBounds;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.core.Position;
import net.minecraft.core.Registry;
import net.minecraft.core.dispenser.AbstractProjectileDispenseBehavior;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BambooBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DispenserBlock;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.state.properties.BambooLeaves;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.InvertedLootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.predicates.MatchTool;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.event.TagsUpdatedEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Twigs.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MiscEvents {

    @SubscribeEvent
    public void onTagsUpdated(TagsUpdatedEvent event) {
        DispenserBlock.registerBehavior(TwigsItems.PEBBLE.get(), new AbstractProjectileDispenseBehavior() {
            @Override
            protected Projectile getProjectile(Level world, Position position, ItemStack stack) {
                return Util.make(new Pebble(world, position.x(), position.y(), position.z()), entity -> entity.setItem(stack));
            }
        });
    }

    @SubscribeEvent
    public void onLootTableLoad(LootTableLoadEvent event) {
        ResourceLocation id = event.getName();
        Supplier<Set<ResourceLocation>> leafTablesSupplier = Suppliers.memoize(() -> {
            return Registry.BLOCK.stream()
                    .filter(LeavesBlock.class::isInstance)
                    .map(Block::getLootTable)
                    .collect(Collectors.toSet());
        });
        if (id.equals(Blocks.BAMBOO.getLootTable())) {
            event.getTable().addPool(
                        LootPool.lootPool()
                                .add(
                                        LootItem.lootTableItem(TwigsBlocks.BAMBOO_LEAVES.get())
                                                .when(
                                                        InvertedLootItemCondition.invert(
                                                                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.BAMBOO)
                                                                        .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(BambooBlock.LEAVES, BambooLeaves.NONE))
                                                        )
                                                )
                                ).build()
                );
        }
        if (id.equals(Blocks.GRAVEL.getLootTable())) {
            event.getTable().addPool(
                        LootPool.lootPool()
                                .add(
                                        LootItem.lootTableItem(TwigsItems.PEBBLE.get())
                                                .when(InvertedLootItemCondition.invert(
                                                        MatchTool.toolMatches(
                                                                ItemPredicate.Builder.item()
                                                                        .hasEnchantment(new EnchantmentPredicate(Enchantments.SILK_TOUCH, MinMaxBounds.Ints.ANY)))
                                                ))
                                                .when(LootItemRandomChanceCondition.randomChance(0.2F))
                                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F)))
                                ).build()
                );
        }
    }

}
