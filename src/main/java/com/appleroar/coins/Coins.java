package com.appleroar.coins;

import com.appleroar.coins.registry.ModItems;
import com.appleroar.coins.registry.VillagerOffers;
import net.fabricmc.api.ModInitializer;


public class Coins implements ModInitializer {

    public static final String MOD_ID = "coins";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        VillagerOffers.registerVillagerOffers();
    }
}
