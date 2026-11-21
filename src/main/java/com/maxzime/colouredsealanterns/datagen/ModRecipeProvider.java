package com.maxzime.colouredsealanterns.datagen;

import com.maxzime.colouredsealanterns.blocks.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.advancements.Advancement;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.level.block.Block;
import org.jspecify.annotations.NonNull;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected @NonNull RecipeProvider createRecipeProvider(HolderLookup.@NonNull Provider registries, @NonNull BootstrapContext<Recipe<?>> recipes, @NonNull BootstrapContext<Advancement> advancements) {

        return new RecipeProvider(recipes, advancements) {
            @Override
            public void buildRecipes() {
                List<DyeColorEntry> entries = List.of(
                        new DyeColorEntry(DyeColor.BROWN, ModBlocks.BROWN_SEA_LANTERN),
                        new DyeColorEntry(DyeColor.RED, ModBlocks.RED_SEA_LANTERN),
                        new DyeColorEntry(DyeColor.ORANGE, ModBlocks.ORANGE_SEA_LANTERN),
                        new DyeColorEntry(DyeColor.YELLOW, ModBlocks.YELLOW_SEA_LANTERN),
                        new DyeColorEntry(DyeColor.LIME, ModBlocks.LIME_SEA_LANTERN),
                        new DyeColorEntry(DyeColor.GREEN, ModBlocks.GREEN_SEA_LANTERN),
                        new DyeColorEntry(DyeColor.CYAN, ModBlocks.CYAN_SEA_LANTERN),
                        new DyeColorEntry(DyeColor.LIGHT_BLUE, ModBlocks.LIGHT_BLUE_SEA_LANTERN),
                        new DyeColorEntry(DyeColor.BLUE, ModBlocks.BLUE_SEA_LANTERN),
                        new DyeColorEntry(DyeColor.PURPLE, ModBlocks.PURPLE_SEA_LANTERN),
                        new DyeColorEntry(DyeColor.MAGENTA, ModBlocks.MAGENTA_SEA_LANTERN),
                        new DyeColorEntry(DyeColor.PINK, ModBlocks.PINK_SEA_LANTERN),
                        new DyeColorEntry(DyeColor.WHITE, ModBlocks.WHITE_SEA_LANTERN),
                        new DyeColorEntry(DyeColor.LIGHT_GRAY, ModBlocks.LIGHT_GREY_SEA_LANTERN),
                        new DyeColorEntry(DyeColor.GRAY, ModBlocks.DARK_GREY_SEA_LANTERN),
                        new DyeColorEntry(DyeColor.BLACK, ModBlocks.BLACK_SEA_LANTERN)
                );

                for (DyeColorEntry entry : entries) {
                    shaped(RecipeCategory.MISC, entry.seaLantern(), 1)
                            .pattern("SCS")
                            .pattern("CDC")
                            .pattern("SCS")
                            .define('C', Items.PRISMARINE_CRYSTALS)
                            .define('S', Items.PRISMARINE_SHARD)
                            .define('D', Items.DYE.pick(entry.dye()))
                            .unlockedBy(getHasName(Items.PRISMARINE_SHARD), has(Items.PRISMARINE_SHARD))
                            .save(output);
                }
            }

            private record DyeColorEntry(DyeColor dye, Block seaLantern) {}
        };
    }

    @Override
    public @NonNull String getName() {
        return "Coloured Sea Lanterns Recipes";
    }
}
