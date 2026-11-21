package com.maxzime.colouredsealanterns.datagen;

import com.maxzime.colouredsealanterns.blocks.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.storage.loot.IntLimit;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.LimitCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.ints.ContextIntProviders;

import java.util.concurrent.CompletableFuture;

public class ModBlockLootTableProvider extends FabricBlockLootSubProvider {


    public ModBlockLootTableProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(packOutput, registriesFuture);
    }

    @Override
    public void generate() {

        net.minecraft.world.level.block.Block[] seaLanterns = {
                ModBlocks.BROWN_SEA_LANTERN,
                ModBlocks.RED_SEA_LANTERN,
                ModBlocks.ORANGE_SEA_LANTERN,
                ModBlocks.YELLOW_SEA_LANTERN,
                ModBlocks.LIME_SEA_LANTERN,
                ModBlocks.GREEN_SEA_LANTERN,
                ModBlocks.CYAN_SEA_LANTERN,
                ModBlocks.LIGHT_BLUE_SEA_LANTERN,
                ModBlocks.BLUE_SEA_LANTERN,
                ModBlocks.PURPLE_SEA_LANTERN,
                ModBlocks.MAGENTA_SEA_LANTERN,
                ModBlocks.PINK_SEA_LANTERN,
                ModBlocks.WHITE_SEA_LANTERN,
                ModBlocks.LIGHT_GREY_SEA_LANTERN,
                ModBlocks.DARK_GREY_SEA_LANTERN,
                ModBlocks.BLACK_SEA_LANTERN
        };

        for (net.minecraft.world.level.block.Block lantern : seaLanterns) {
            add(lantern, createSilkTouchDispatchTable(
                    lantern,
                    this.applyExplosionDecay(
                            lantern,
                            LootItem.lootTableItem(Items.PRISMARINE_CRYSTALS)
                                    .apply(SetItemCountFunction.setCount(ContextIntProviders.between(2, 3)))
                                    .apply(ApplyBonusCount.addUniformBonusCount(enchantments.getOrThrow(Enchantments.FORTUNE),
                                            1
                                    ))
                                    .apply(LimitCount.limitCount(IntLimit.upperBound(5)))
                    )
            ));
        }
    }
}
