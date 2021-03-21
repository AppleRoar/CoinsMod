package com.appleroar.coins;

import com.appleroar.coins.registry.ModItems;
import net.fabricmc.api.ModInitializer;


public class Coins implements ModInitializer {

    public static final String MOD_ID = "coins";
    public static final int EMERALD_TO_COIN_RATIO = 3;

    @Override
    public void onInitialize() {
        ModItems.registerItems();
//        VillagerOffers.registerVillagerOffers();
    }
}
