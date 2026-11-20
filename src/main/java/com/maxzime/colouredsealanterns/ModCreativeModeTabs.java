package com.maxzime.colouredsealanterns;

import com.maxzime.colouredsealanterns.blocks.ModBlocks;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {
    public static final CreativeModeTab SEALANTERN_BLOCKS_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(ColouredSealanterns.MOD_ID, "sealantern_blocks"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.RED_SEA_LANTERN))
                    .title(Component.translatable("creativetab.colouredsealanterns.sealantern_blocks"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModBlocks.RED_SEA_LANTERN);
                        output.accept(ModBlocks.ORANGE_SEA_LANTERN);
                        output.accept(ModBlocks.YELLOW_SEA_LANTERN);
                        output.accept(ModBlocks.LIME_SEA_LANTERN);
                        output.accept(ModBlocks.GREEN_SEA_LANTERN);
                        output.accept(ModBlocks.CYAN_SEA_LANTERN);
                        output.accept(ModBlocks.LIGHT_BLUE_SEA_LANTERN);
                        output.accept(ModBlocks.BLUE_SEA_LANTERN);
                        output.accept(ModBlocks.PURPLE_SEA_LANTERN);
                        output.accept(ModBlocks.MAGENTA_SEA_LANTERN);
                        output.accept(ModBlocks.PINK_SEA_LANTERN);
                        output.accept(ModBlocks.BROWN_SEA_LANTERN);
                        output.accept(ModBlocks.WHITE_SEA_LANTERN);
                        output.accept(ModBlocks.LIGHT_GREY_SEA_LANTERN);
                        output.accept(ModBlocks.DARK_GREY_SEA_LANTERN);
                        output.accept(ModBlocks.BLACK_SEA_LANTERN);


                    }).build());


    public static void registerCreativeModeTabs() {
        ColouredSealanterns.LOGGER.info("Registering Creative Mode Tabs for " + ColouredSealanterns.MOD_ID);
    }
}
