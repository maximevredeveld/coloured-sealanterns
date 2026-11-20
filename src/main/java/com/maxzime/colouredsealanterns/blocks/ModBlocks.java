package com.maxzime.colouredsealanterns.blocks;

import com.maxzime.colouredsealanterns.ColouredSealanterns;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

import java.util.function.Function;

public class ModBlocks {

    public static final Block BROWN_SEA_LANTERN = registerBlock("brown_sea_lantern", properties -> new Block(properties
            .mapColor(MapColor.QUARTZ)
            .instrument(NoteBlockInstrument.HAT)
            .strength(0.3F)
            .sound(SoundType.GLASS)
            .lightLevel(state -> 15)
            .isRedstoneConductor(Blocks::never)
            .noOcclusion())
    );
    public static final Block RED_SEA_LANTERN = registerBlock("red_sea_lantern", properties -> new Block(properties
            .mapColor(MapColor.QUARTZ)
            .instrument(NoteBlockInstrument.HAT)
            .strength(0.3F)
            .sound(SoundType.GLASS)
            .lightLevel(state -> 15)
            .isRedstoneConductor(Blocks::never)
            .noOcclusion())
    );
    public static final Block ORANGE_SEA_LANTERN = registerBlock("orange_sea_lantern", properties -> new Block(properties
            .mapColor(MapColor.QUARTZ)
            .instrument(NoteBlockInstrument.HAT)
            .strength(0.3F)
            .sound(SoundType.GLASS)
            .lightLevel(state -> 15)
            .isRedstoneConductor(Blocks::never)
            .noOcclusion())
    );
    public static final Block YELLOW_SEA_LANTERN = registerBlock("yellow_sea_lantern", properties -> new Block(properties
            .mapColor(MapColor.QUARTZ)
            .instrument(NoteBlockInstrument.HAT)
            .strength(0.3F)
            .sound(SoundType.GLASS)
            .lightLevel(state -> 15)
            .isRedstoneConductor(Blocks::never)
            .noOcclusion())
    );
    public static final Block LIME_SEA_LANTERN = registerBlock("lime_sea_lantern", properties -> new Block(properties
            .mapColor(MapColor.QUARTZ)
            .instrument(NoteBlockInstrument.HAT)
            .strength(0.3F)
            .sound(SoundType.GLASS)
            .lightLevel(state -> 15)
            .isRedstoneConductor(Blocks::never)
            .noOcclusion())
    );
    public static final Block GREEN_SEA_LANTERN = registerBlock("green_sea_lantern", properties -> new Block(properties
            .mapColor(MapColor.QUARTZ)
            .instrument(NoteBlockInstrument.HAT)
            .strength(0.3F)
            .sound(SoundType.GLASS)
            .lightLevel(state -> 15)
            .isRedstoneConductor(Blocks::never)
            .noOcclusion())
    );
    public static final Block CYAN_SEA_LANTERN = registerBlock("cyan_sea_lantern", properties -> new Block(properties
            .mapColor(MapColor.QUARTZ)
            .instrument(NoteBlockInstrument.HAT)
            .strength(0.3F)
            .sound(SoundType.GLASS)
            .lightLevel(state -> 15)
            .isRedstoneConductor(Blocks::never)
            .noOcclusion())
    );
    public static final Block LIGHT_BLUE_SEA_LANTERN = registerBlock("light_blue_sea_lantern", properties -> new Block(properties
            .mapColor(MapColor.QUARTZ)
            .instrument(NoteBlockInstrument.HAT)
            .strength(0.3F)
            .sound(SoundType.GLASS)
            .lightLevel(state -> 15)
            .isRedstoneConductor(Blocks::never)
            .noOcclusion())
    );
    public static final Block BLUE_SEA_LANTERN = registerBlock("blue_sea_lantern", properties -> new Block(properties
            .mapColor(MapColor.QUARTZ)
            .instrument(NoteBlockInstrument.HAT)
            .strength(0.3F)
            .sound(SoundType.GLASS)
            .lightLevel(state -> 15)
            .isRedstoneConductor(Blocks::never)
            .noOcclusion())
    );
    public static final Block PURPLE_SEA_LANTERN = registerBlock("purple_sea_lantern", properties -> new Block(properties
            .mapColor(MapColor.QUARTZ)
            .instrument(NoteBlockInstrument.HAT)
            .strength(0.3F)
            .sound(SoundType.GLASS)
            .lightLevel(state -> 15)
            .isRedstoneConductor(Blocks::never)
            .noOcclusion())
    );
    public static final Block MAGENTA_SEA_LANTERN = registerBlock("magenta_sea_lantern", properties -> new Block(properties
            .mapColor(MapColor.QUARTZ)
            .instrument(NoteBlockInstrument.HAT)
            .strength(0.3F)
            .sound(SoundType.GLASS)
            .lightLevel(state -> 15)
            .isRedstoneConductor(Blocks::never)
            .noOcclusion())
    );
    public static final Block PINK_SEA_LANTERN = registerBlock("pink_sea_lantern", properties -> new Block(properties
            .mapColor(MapColor.QUARTZ)
            .instrument(NoteBlockInstrument.HAT)
            .strength(0.3F)
            .sound(SoundType.GLASS)
            .lightLevel(state -> 15)
            .isRedstoneConductor(Blocks::never)
            .noOcclusion())
    );
    public static final Block WHITE_SEA_LANTERN = registerBlock("white_sea_lantern", properties -> new Block(properties
            .mapColor(MapColor.QUARTZ)
            .instrument(NoteBlockInstrument.HAT)
            .strength(0.3F)
            .sound(SoundType.GLASS)
            .lightLevel(state -> 15)
            .isRedstoneConductor(Blocks::never)
            .noOcclusion())
    );
    public static final Block LIGHT_GREY_SEA_LANTERN = registerBlock("light_grey_sea_lantern", properties -> new Block(properties
            .mapColor(MapColor.QUARTZ)
            .instrument(NoteBlockInstrument.HAT)
            .strength(0.3F)
            .sound(SoundType.GLASS)
            .lightLevel(state -> 15)
            .isRedstoneConductor(Blocks::never)
            .noOcclusion())
    );
    public static final Block DARK_GREY_SEA_LANTERN = registerBlock("dark_grey_sea_lantern", properties -> new Block(properties
            .mapColor(MapColor.QUARTZ)
            .instrument(NoteBlockInstrument.HAT)
            .strength(0.3F)
            .sound(SoundType.GLASS)
            .lightLevel(state -> 15)
            .isRedstoneConductor(Blocks::never)
            .noOcclusion())
    );
    public static final Block BLACK_SEA_LANTERN = registerBlock("black_sea_lantern", properties -> new Block(properties
            .mapColor(MapColor.QUARTZ)
            .instrument(NoteBlockInstrument.HAT)
            .strength(0.3F)
            .sound(SoundType.GLASS)
            .lightLevel(state -> 15)
            .isRedstoneConductor(Blocks::never)
            .noOcclusion())
    );

    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function) {
        Block toRegister = function.apply(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(ColouredSealanterns.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(ColouredSealanterns.MOD_ID, name), toRegister);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(ColouredSealanterns.MOD_ID, name),
        new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(ColouredSealanterns.MOD_ID, name)))));
    }

    public static void registerModBlocks() {
        ColouredSealanterns.LOGGER.info("Registering Mod Blocks for " + ColouredSealanterns.MOD_ID);
    }
}

