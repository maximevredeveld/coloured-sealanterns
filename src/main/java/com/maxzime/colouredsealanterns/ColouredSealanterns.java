package com.maxzime.colouredsealanterns;

import com.maxzime.colouredsealanterns.blocks.ModBlocks;
import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ColouredSealanterns implements ModInitializer {
	public static final String MOD_ID = "coloured-sealanterns";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModCreativeModeTabs.registerCreativeModeTabs();

		ModBlocks.registerModBlocks();
	}
}
