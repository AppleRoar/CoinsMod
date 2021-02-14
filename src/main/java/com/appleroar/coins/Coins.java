package com.appleroar.coins;

import net.fabricmc.api.ModInitializer;

public class Coins implements ModInitializer {

    public static final String MOD_ID = "coins";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
    }
}
