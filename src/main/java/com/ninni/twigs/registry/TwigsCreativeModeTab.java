package com.ninni.twigs.registry;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.resources.ResourceLocation;

import static com.ninni.twigs.Twigs.MOD_ID;
import static com.ninni.twigs.registry.TwigsItems.*;

public class TwigsCreativeModeTab {

    static {
        FabricItemGroupBuilder.create(new ResourceLocation(MOD_ID,"item_group")).icon(TWIGS::getDefaultInstance).appendItems((stacks, group) -> {

            //collectibles
            stacks.add(AZALEA_FLOWERS.getDefaultInstance());
            stacks.add(TWIG.getDefaultInstance());
            stacks.add(PEBBLE.getDefaultInstance());
            stacks.add(BRONZED_SEASHELL.getDefaultInstance());
            stacks.add(OPALINE_SEASHELL.getDefaultInstance());
            stacks.add(ROSEATE_SEASHELL.getDefaultInstance());
            stacks.add(TANGERINE_SEASHELL.getDefaultInstance());

            stacks.add(BAMBOO_LEAVES.getDefaultInstance());
            stacks.add(BAMBOO_THATCH.getDefaultInstance());
            stacks.add(BAMBOO_THATCH_SLAB.getDefaultInstance());
            stacks.add(BAMBOO_MAT.getDefaultInstance());

            //paper lanterns
            stacks.add(PAPER_LANTERN.getDefaultInstance());
            stacks.add(ALLIUM_PAPER_LANTERN.getDefaultInstance());
            stacks.add(BLUE_ORCHID_PAPER_LANTERN.getDefaultInstance());
            stacks.add(CRIMSON_ROOTS_PAPER_LANTERN.getDefaultInstance());
            stacks.add(DANDELION_PAPER_LANTERN.getDefaultInstance());

            //lamps
            stacks.add(lAMP.getDefaultInstance());
            stacks.add(SOUL_LAMP.getDefaultInstance());
            stacks.add(CRIMSON_SHROOMLAMP.getDefaultInstance());
            stacks.add(WARPED_SHROOMLAMP.getDefaultInstance());

            //tables
            stacks.add(OAK_TABLE.getDefaultInstance());
            stacks.add(SPRUCE_TABLE.getDefaultInstance());
            stacks.add(BIRCH_TABLE.getDefaultInstance());
            stacks.add(JUNGLE_TABLE.getDefaultInstance());
            stacks.add(ACACIA_TABLE.getDefaultInstance());
            stacks.add(DARK_OAK_TABLE.getDefaultInstance());
            stacks.add(MANGROVE_TABLE.getDefaultInstance());
            stacks.add(BAMBOO_TABLE.getDefaultInstance());
            stacks.add(CRIMSON_TABLE.getDefaultInstance());
            stacks.add(WARPED_TABLE.getDefaultInstance());

            //basalt blocks
            stacks.add(POLISHED_BASALT_BRICKS.getDefaultInstance());
            stacks.add(CHISELED_SMOOTH_BASALT_BRICKS.getDefaultInstance());
            stacks.add(SMOOTH_BASALT_BRICKS.getDefaultInstance());
            stacks.add(SMOOTH_BASALT_BRICK_STAIRS.getDefaultInstance());
            stacks.add(SMOOTH_BASALT_BRICK_SLAB.getDefaultInstance());
            stacks.add(SMOOTH_BASALT_BRICK_WALL.getDefaultInstance());

            //bricks
            stacks.add(CRACKED_BRICKS.getDefaultInstance());
            stacks.add(MIXED_BRICKS.getDefaultInstance());
            stacks.add(CHISELED_BRICKS.getDefaultInstance());
            stacks.add(MOSSY_BRICKS.getDefaultInstance());
            stacks.add(MOSSY_BRICK_STAIRS.getDefaultInstance());
            stacks.add(MOSSY_BRICK_SLAB.getDefaultInstance());
            stacks.add(MOSSY_BRICK_WALL.getDefaultInstance());

            //gravel bricks
            stacks.add(GRAVEL_BRICKS.getDefaultInstance());
            stacks.add(GRAVEL_BRICK_STAIRS.getDefaultInstance());
            stacks.add(GRAVEL_BRICK_SLAB.getDefaultInstance());
            stacks.add(GRAVEL_BRICK_WALL.getDefaultInstance());

            //smooth stone bricks
            stacks.add(SMOOTH_STONE_BRICKS.getDefaultInstance());
            stacks.add(SMOOTH_STONE_BRICK_STAIRS.getDefaultInstance());
            stacks.add(SMOOTH_STONE_BRICK_SLAB.getDefaultInstance());
            stacks.add(SMOOTH_STONE_BRICK_WALL.getDefaultInstance());

            //columns
            stacks.add(QUARTZ_COLUMN.getDefaultInstance());
            stacks.add(STONE_COLUMN.getDefaultInstance());
            stacks.add(DEEPSLATE_COLUMN.getDefaultInstance());
            stacks.add(BLACKSTONE_COLUMN.getDefaultInstance());

            //copper pillars
            stacks.add(COPPER_PILLAR.getDefaultInstance());
            stacks.add(EXPOSED_COPPER_PILLAR.getDefaultInstance());
            stacks.add(WEATHERED_COPPER_PILLAR.getDefaultInstance());
            stacks.add(OXIDIZED_COPPER_PILLAR.getDefaultInstance());
            stacks.add(WAXED_COPPER_PILLAR.getDefaultInstance());
            stacks.add(WAXED_EXPOSED_COPPER_PILLAR.getDefaultInstance());
            stacks.add(WAXED_WEATHERED_COPPER_PILLAR.getDefaultInstance());
            stacks.add(WAXED_OXIDIZED_COPPER_PILLAR.getDefaultInstance());

            //amethyst blocks
            stacks.add(POLISHED_AMETHYST.getDefaultInstance());
            stacks.add(CUT_AMETHYST.getDefaultInstance());

            //misc
            stacks.add(PETRIFIED_LICHEN.getDefaultInstance());
            stacks.add(COMPACTED_DRIPSTONE.getDefaultInstance());
            stacks.add(ROCKY_DIRT.getDefaultInstance());

            //cobblestone bricks
            stacks.add(COBBLESTONE_BRICKS.getDefaultInstance());
            stacks.add(COBBLESTONE_BRICK_STAIRS.getDefaultInstance());
            stacks.add(COBBLESTONE_BRICK_SLAB.getDefaultInstance());
            stacks.add(COBBLESTONE_BRICK_WALL.getDefaultInstance());
            stacks.add(CRACKED_COBBLESTONE_BRICKS.getDefaultInstance());
            stacks.add(MOSSY_COBBLESTONE_BRICKS.getDefaultInstance());
            stacks.add(MOSSY_COBBLESTONE_BRICK_STAIRS.getDefaultInstance());
            stacks.add(MOSSY_COBBLESTONE_BRICK_SLAB.getDefaultInstance());
            stacks.add(MOSSY_COBBLESTONE_BRICK_WALL.getDefaultInstance());

            //decorated blackstone bricks
            stacks.add(TWISTING_POLISHED_BLACKSTONE_BRICKS.getDefaultInstance());
            stacks.add(TWISTING_POLISHED_BLACKSTONE_BRICK_STAIRS.getDefaultInstance());
            stacks.add(TWISTING_POLISHED_BLACKSTONE_BRICK_SLAB.getDefaultInstance());
            stacks.add(TWISTING_POLISHED_BLACKSTONE_BRICK_WALL.getDefaultInstance());
            stacks.add(WEEPING_POLISHED_BLACKSTONE_BRICKS.getDefaultInstance());
            stacks.add(WEEPING_POLISHED_BLACKSTONE_BRICK_STAIRS.getDefaultInstance());
            stacks.add(WEEPING_POLISHED_BLACKSTONE_BRICK_SLAB.getDefaultInstance());
            stacks.add(WEEPING_POLISHED_BLACKSTONE_BRICK_WALL.getDefaultInstance());

            //tuff blocks
            stacks.add(TUFF_STAIRS.getDefaultInstance());
            stacks.add(TUFF_SLAB.getDefaultInstance());
            stacks.add(TUFF_WALL.getDefaultInstance());
            stacks.add(POLISHED_TUFF.getDefaultInstance());
            stacks.add(POLISHED_TUFF_STAIRS.getDefaultInstance());
            stacks.add(POLISHED_TUFF_SLAB.getDefaultInstance());
            stacks.add(POLISHED_TUFF_BRICKS.getDefaultInstance());
            stacks.add(CRACKED_POLISHED_TUFF_BRICKS.getDefaultInstance());
            stacks.add(POLISHED_TUFF_BRICK_STAIRS.getDefaultInstance());
            stacks.add(POLISHED_TUFF_BRICK_SLAB.getDefaultInstance());
            stacks.add(POLISHED_TUFF_BRICK_WALL.getDefaultInstance());

            //calcite blocks
            stacks.add(CALCITE_STAIRS.getDefaultInstance());
            stacks.add(CALCITE_SLAB.getDefaultInstance());
            stacks.add(CALCITE_WALL.getDefaultInstance());
            stacks.add(POLISHED_CALCITE.getDefaultInstance());
            stacks.add(POLISHED_CALCITE_STAIRS.getDefaultInstance());
            stacks.add(POLISHED_CALCITE_SLAB.getDefaultInstance());
            stacks.add(POLISHED_CALCITE_BRICKS.getDefaultInstance());
            stacks.add(CRACKED_POLISHED_CALCITE_BRICKS.getDefaultInstance());
            stacks.add(POLISHED_CALCITE_BRICK_STAIRS.getDefaultInstance());
            stacks.add(POLISHED_CALCITE_BRICK_SLAB.getDefaultInstance());
            stacks.add(POLISHED_CALCITE_BRICK_WALL.getDefaultInstance());

            //schist blocks
            stacks.add(SCHIST.getDefaultInstance());
            stacks.add(SCHIST_STAIRS.getDefaultInstance());
            stacks.add(SCHIST_SLAB.getDefaultInstance());
            stacks.add(SCHIST_WALL.getDefaultInstance());
            stacks.add(POLISHED_SCHIST.getDefaultInstance());
            stacks.add(POLISHED_SCHIST_STAIRS.getDefaultInstance());
            stacks.add(POLISHED_SCHIST_SLAB.getDefaultInstance());
            stacks.add(POLISHED_SCHIST_BRICKS.getDefaultInstance());
            stacks.add(CRACKED_POLISHED_SCHIST_BRICKS.getDefaultInstance());
            stacks.add(POLISHED_SCHIST_BRICK_STAIRS.getDefaultInstance());
            stacks.add(POLISHED_SCHIST_BRICK_SLAB.getDefaultInstance());
            stacks.add(POLISHED_SCHIST_BRICK_WALL.getDefaultInstance());

            //rhyolite blocks
            stacks.add(RHYOLITE.getDefaultInstance());
            stacks.add(RHYOLITE_STAIRS.getDefaultInstance());
            stacks.add(RHYOLITE_SLAB.getDefaultInstance());
            stacks.add(RHYOLITE_WALL.getDefaultInstance());
            stacks.add(POLISHED_RHYOLITE.getDefaultInstance());
            stacks.add(POLISHED_RHYOLITE_STAIRS.getDefaultInstance());
            stacks.add(POLISHED_RHYOLITE_SLAB.getDefaultInstance());
            stacks.add(POLISHED_RHYOLITE_BRICKS.getDefaultInstance());
            stacks.add(CRACKED_POLISHED_RHYOLITE_BRICKS.getDefaultInstance());
            stacks.add(POLISHED_RHYOLITE_BRICK_STAIRS.getDefaultInstance());
            stacks.add(POLISHED_RHYOLITE_BRICK_SLAB.getDefaultInstance());
            stacks.add(POLISHED_RHYOLITE_BRICK_WALL.getDefaultInstance());

            //bloodstone blocks
            stacks.add(BLOODSTONE.getDefaultInstance());
            stacks.add(BLOODSTONE_STAIRS.getDefaultInstance());
            stacks.add(BLOODSTONE_SLAB.getDefaultInstance());
            stacks.add(BLOODSTONE_WALL.getDefaultInstance());
            stacks.add(POLISHED_BLOODSTONE.getDefaultInstance());
            stacks.add(POLISHED_BLOODSTONE_STAIRS.getDefaultInstance());
            stacks.add(POLISHED_BLOODSTONE_SLAB.getDefaultInstance());
            stacks.add(POLISHED_BLOODSTONE_BRICKS.getDefaultInstance());
            stacks.add(CRACKED_POLISHED_BLOODSTONE_BRICKS.getDefaultInstance());
            stacks.add(POLISHED_BLOODSTONE_BRICK_STAIRS.getDefaultInstance());
            stacks.add(POLISHED_BLOODSTONE_BRICK_SLAB.getDefaultInstance());
            stacks.add(POLISHED_BLOODSTONE_BRICK_WALL.getDefaultInstance());

            //silt blocks
            stacks.add(SILT.getDefaultInstance());
            stacks.add(SILT_BALL.getDefaultInstance());
            stacks.add(SILT_BRICK.getDefaultInstance());
            stacks.add(SILT_BRICKS.getDefaultInstance());
            stacks.add(CRACKED_SILT_BRICKS.getDefaultInstance());
            stacks.add(SILT_BRICK_STAIRS.getDefaultInstance());
            stacks.add(SILT_BRICK_SLAB.getDefaultInstance());
            stacks.add(SILT_BRICK_WALL.getDefaultInstance());
            stacks.add(CHISELED_SILT_BRICKS.getDefaultInstance());
            stacks.add(MIXED_SILT_BRICKS.getDefaultInstance());


            stacks.add(PACKED_SILT.getDefaultInstance());
            stacks.add(SILT_POT.getDefaultInstance());
            stacks.add(SILT_SHINGLES.getDefaultInstance());
            stacks.add(SILT_SHINGLE_STAIRS.getDefaultInstance());
            stacks.add(SILT_SHINGLE_SLAB.getDefaultInstance());
            stacks.add(SILT_SHINGLE_WALL.getDefaultInstance());

            stacks.add(WHITE_PACKED_SILT.getDefaultInstance());
            stacks.add(WHITE_SILT_POT.getDefaultInstance());
            stacks.add(WHITE_SILT_SHINGLES.getDefaultInstance());
            stacks.add(WHITE_SILT_SHINGLE_STAIRS.getDefaultInstance());
            stacks.add(WHITE_SILT_SHINGLE_SLAB.getDefaultInstance());
            stacks.add(WHITE_SILT_SHINGLE_WALL.getDefaultInstance());

            stacks.add(LIGHT_GRAY_PACKED_SILT.getDefaultInstance());
            stacks.add(LIGHT_GRAY_SILT_POT.getDefaultInstance());
            stacks.add(LIGHT_GRAY_SILT_SHINGLES.getDefaultInstance());
            stacks.add(LIGHT_GRAY_SILT_SHINGLE_STAIRS.getDefaultInstance());
            stacks.add(LIGHT_GRAY_SILT_SHINGLE_SLAB.getDefaultInstance());
            stacks.add(LIGHT_GRAY_SILT_SHINGLE_WALL.getDefaultInstance());

            stacks.add(GRAY_PACKED_SILT.getDefaultInstance());
            stacks.add(GRAY_SILT_POT.getDefaultInstance());
            stacks.add(GRAY_SILT_SHINGLES.getDefaultInstance());
            stacks.add(GRAY_SILT_SHINGLE_STAIRS.getDefaultInstance());
            stacks.add(GRAY_SILT_SHINGLE_SLAB.getDefaultInstance());
            stacks.add(GRAY_SILT_SHINGLE_WALL.getDefaultInstance());

            stacks.add(BLACK_PACKED_SILT.getDefaultInstance());
            stacks.add(BLACK_SILT_POT.getDefaultInstance());
            stacks.add(BLACK_SILT_SHINGLES.getDefaultInstance());
            stacks.add(BLACK_SILT_SHINGLE_STAIRS.getDefaultInstance());
            stacks.add(BLACK_SILT_SHINGLE_SLAB.getDefaultInstance());
            stacks.add(BLACK_SILT_SHINGLE_WALL.getDefaultInstance());

            stacks.add(BROWN_PACKED_SILT.getDefaultInstance());
            stacks.add(BROWN_SILT_POT.getDefaultInstance());
            stacks.add(BROWN_SILT_SHINGLES.getDefaultInstance());
            stacks.add(BROWN_SILT_SHINGLE_STAIRS.getDefaultInstance());
            stacks.add(BROWN_SILT_SHINGLE_SLAB.getDefaultInstance());
            stacks.add(BROWN_SILT_SHINGLE_WALL.getDefaultInstance());

            stacks.add(RED_PACKED_SILT.getDefaultInstance());
            stacks.add(RED_SILT_POT.getDefaultInstance());
            stacks.add(RED_SILT_SHINGLES.getDefaultInstance());
            stacks.add(RED_SILT_SHINGLE_STAIRS.getDefaultInstance());
            stacks.add(RED_SILT_SHINGLE_SLAB.getDefaultInstance());
            stacks.add(RED_SILT_SHINGLE_WALL.getDefaultInstance());

            stacks.add(ORANGE_PACKED_SILT.getDefaultInstance());
            stacks.add(ORANGE_SILT_POT.getDefaultInstance());
            stacks.add(ORANGE_SILT_SHINGLES.getDefaultInstance());
            stacks.add(ORANGE_SILT_SHINGLE_STAIRS.getDefaultInstance());
            stacks.add(ORANGE_SILT_SHINGLE_SLAB.getDefaultInstance());
            stacks.add(ORANGE_SILT_SHINGLE_WALL.getDefaultInstance());

            stacks.add(YELLOW_PACKED_SILT.getDefaultInstance());
            stacks.add(YELLOW_SILT_POT.getDefaultInstance());
            stacks.add(YELLOW_SILT_SHINGLES.getDefaultInstance());
            stacks.add(YELLOW_SILT_SHINGLE_STAIRS.getDefaultInstance());
            stacks.add(YELLOW_SILT_SHINGLE_SLAB.getDefaultInstance());
            stacks.add(YELLOW_SILT_SHINGLE_WALL.getDefaultInstance());

            stacks.add(LIME_PACKED_SILT.getDefaultInstance());
            stacks.add(LIME_SILT_POT.getDefaultInstance());
            stacks.add(LIME_SILT_SHINGLES.getDefaultInstance());
            stacks.add(LIME_SILT_SHINGLE_STAIRS.getDefaultInstance());
            stacks.add(LIME_SILT_SHINGLE_SLAB.getDefaultInstance());
            stacks.add(LIME_SILT_SHINGLE_WALL.getDefaultInstance());

            stacks.add(GREEN_PACKED_SILT.getDefaultInstance());
            stacks.add(GREEN_SILT_POT.getDefaultInstance());
            stacks.add(GREEN_SILT_SHINGLES.getDefaultInstance());
            stacks.add(GREEN_SILT_SHINGLE_STAIRS.getDefaultInstance());
            stacks.add(GREEN_SILT_SHINGLE_SLAB.getDefaultInstance());
            stacks.add(GREEN_SILT_SHINGLE_WALL.getDefaultInstance());

            stacks.add(CYAN_PACKED_SILT.getDefaultInstance());
            stacks.add(CYAN_SILT_POT.getDefaultInstance());
            stacks.add(CYAN_SILT_SHINGLES.getDefaultInstance());
            stacks.add(CYAN_SILT_SHINGLE_STAIRS.getDefaultInstance());
            stacks.add(CYAN_SILT_SHINGLE_SLAB.getDefaultInstance());
            stacks.add(CYAN_SILT_SHINGLE_WALL.getDefaultInstance());

            stacks.add(LIGHT_BLUE_PACKED_SILT.getDefaultInstance());
            stacks.add(LIGHT_BLUE_SILT_POT.getDefaultInstance());
            stacks.add(LIGHT_BLUE_SILT_SHINGLES.getDefaultInstance());
            stacks.add(LIGHT_BLUE_SILT_SHINGLE_STAIRS.getDefaultInstance());
            stacks.add(LIGHT_BLUE_SILT_SHINGLE_SLAB.getDefaultInstance());
            stacks.add(LIGHT_BLUE_SILT_SHINGLE_WALL.getDefaultInstance());

            stacks.add(BLUE_PACKED_SILT.getDefaultInstance());
            stacks.add(BLUE_SILT_POT.getDefaultInstance());
            stacks.add(BLUE_SILT_SHINGLES.getDefaultInstance());
            stacks.add(BLUE_SILT_SHINGLE_STAIRS.getDefaultInstance());
            stacks.add(BLUE_SILT_SHINGLE_SLAB.getDefaultInstance());
            stacks.add(BLUE_SILT_SHINGLE_WALL.getDefaultInstance());

            stacks.add(PURPLE_PACKED_SILT.getDefaultInstance());
            stacks.add(PURPLE_SILT_POT.getDefaultInstance());
            stacks.add(PURPLE_SILT_SHINGLES.getDefaultInstance());
            stacks.add(PURPLE_SILT_SHINGLE_STAIRS.getDefaultInstance());
            stacks.add(PURPLE_SILT_SHINGLE_SLAB.getDefaultInstance());
            stacks.add(PURPLE_SILT_SHINGLE_WALL.getDefaultInstance());

            stacks.add(MAGENTA_PACKED_SILT.getDefaultInstance());
            stacks.add(MAGENTA_SILT_POT.getDefaultInstance());
            stacks.add(MAGENTA_SILT_SHINGLES.getDefaultInstance());
            stacks.add(MAGENTA_SILT_SHINGLE_STAIRS.getDefaultInstance());
            stacks.add(MAGENTA_SILT_SHINGLE_SLAB.getDefaultInstance());
            stacks.add(MAGENTA_SILT_SHINGLE_WALL.getDefaultInstance());

            stacks.add(PINK_PACKED_SILT.getDefaultInstance());
            stacks.add(PINK_SILT_POT.getDefaultInstance());
            stacks.add(PINK_SILT_SHINGLES.getDefaultInstance());
            stacks.add(PINK_SILT_SHINGLE_STAIRS.getDefaultInstance());
            stacks.add(PINK_SILT_SHINGLE_SLAB.getDefaultInstance());
            stacks.add(PINK_SILT_SHINGLE_WALL.getDefaultInstance());

        }).build();
    }
}
