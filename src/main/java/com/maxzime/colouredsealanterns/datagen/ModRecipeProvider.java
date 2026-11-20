package com.maxzime.colouredsealanterns.datagen;

import com.maxzime.colouredsealanterns.blocks.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {

        return new RecipeProvider(registries, output) {
            @Override
            public void buildRecipes() {
                List<DyeColorEntry> entries = List.of(
                        new DyeColorEntry(Items.BROWN_DYE, ModBlocks.BROWN_SEA_LANTERN),
                        new DyeColorEntry(Items.RED_DYE, ModBlocks.RED_SEA_LANTERN),
                        new DyeColorEntry(Items.ORANGE_DYE, ModBlocks.ORANGE_SEA_LANTERN),
                        new DyeColorEntry(Items.YELLOW_DYE, ModBlocks.YELLOW_SEA_LANTERN),
                        new DyeColorEntry(Items.LIME_DYE, ModBlocks.LIME_SEA_LANTERN),
                        new DyeColorEntry(Items.GREEN_DYE, ModBlocks.GREEN_SEA_LANTERN),
                        new DyeColorEntry(Items.CYAN_DYE, ModBlocks.CYAN_SEA_LANTERN),
                        new DyeColorEntry(Items.LIGHT_BLUE_DYE, ModBlocks.LIGHT_BLUE_SEA_LANTERN),
                        new DyeColorEntry(Items.BLUE_DYE, ModBlocks.BLUE_SEA_LANTERN),
                        new DyeColorEntry(Items.PURPLE_DYE, ModBlocks.PURPLE_SEA_LANTERN),
                        new DyeColorEntry(Items.MAGENTA_DYE, ModBlocks.MAGENTA_SEA_LANTERN),
                        new DyeColorEntry(Items.PINK_DYE, ModBlocks.PINK_SEA_LANTERN),
                        new DyeColorEntry(Items.WHITE_DYE, ModBlocks.WHITE_SEA_LANTERN),
                        new DyeColorEntry(Items.LIGHT_GRAY_DYE, ModBlocks.LIGHT_GREY_SEA_LANTERN),
                        new DyeColorEntry(Items.GRAY_DYE, ModBlocks.DARK_GREY_SEA_LANTERN),
                        new DyeColorEntry(Items.BLACK_DYE, ModBlocks.BLACK_SEA_LANTERN)
                );

                for (DyeColorEntry entry : entries) {
                    shaped(RecipeCategory.MISC, entry.seaLantern(), 1) // change `1` to `4` if you want 4 output lanterns
                            .pattern("SCS")
                            .pattern("CDC")
                            .pattern("SCS")
                            .define('C', Items.PRISMARINE_CRYSTALS)
                            .define('S', Items.PRISMARINE_SHARD)
                            .define('D', entry.dye())
                            .unlockedBy(getHasName(Items.PRISMARINE_SHARD), has(Items.PRISMARINE_SHARD))
                            .save(output);
                }
            }

            private record DyeColorEntry(Item dye, Block seaLantern) {}
        };
    }

    @Override
    public String getName() {
        return "Coloured Sea Lanterns Recipes";
    }
}
