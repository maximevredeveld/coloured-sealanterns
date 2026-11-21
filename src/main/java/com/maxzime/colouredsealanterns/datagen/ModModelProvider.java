package com.maxzime.colouredsealanterns.datagen;

import com.maxzime.colouredsealanterns.blocks.ModBlocks;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import org.jspecify.annotations.NonNull;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        blockModelGenerators.createTrivialCube(ModBlocks.RED_SEA_LANTERN);
        blockModelGenerators.createTrivialCube(ModBlocks.ORANGE_SEA_LANTERN);
        blockModelGenerators.createTrivialCube(ModBlocks.YELLOW_SEA_LANTERN);
        blockModelGenerators.createTrivialCube(ModBlocks.LIME_SEA_LANTERN);
        blockModelGenerators.createTrivialCube(ModBlocks.GREEN_SEA_LANTERN);
        blockModelGenerators.createTrivialCube(ModBlocks.CYAN_SEA_LANTERN);
        blockModelGenerators.createTrivialCube(ModBlocks.LIGHT_BLUE_SEA_LANTERN);
        blockModelGenerators.createTrivialCube(ModBlocks.BLUE_SEA_LANTERN);
        blockModelGenerators.createTrivialCube(ModBlocks.PURPLE_SEA_LANTERN);
        blockModelGenerators.createTrivialCube(ModBlocks.MAGENTA_SEA_LANTERN);
        blockModelGenerators.createTrivialCube(ModBlocks.PINK_SEA_LANTERN);
        blockModelGenerators.createTrivialCube(ModBlocks.WHITE_SEA_LANTERN);
        blockModelGenerators.createTrivialCube(ModBlocks.BROWN_SEA_LANTERN);
        blockModelGenerators.createTrivialCube(ModBlocks.LIGHT_GREY_SEA_LANTERN);
        blockModelGenerators.createTrivialCube(ModBlocks.DARK_GREY_SEA_LANTERN);
        blockModelGenerators.createTrivialCube(ModBlocks.BLACK_SEA_LANTERN);
    }

    @Override
    public void generateItemModels(@NonNull ItemModelGenerators itemModelGenerators) {

    }
}
