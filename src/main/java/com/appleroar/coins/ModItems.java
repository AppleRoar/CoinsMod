package com.appleroar.coins;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item GOLD_COIN = new Item(new Item.Settings().group(ItemGroup.MISC));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Coins.MOD_ID, "gold_coin"), GOLD_COIN);
    }
}
