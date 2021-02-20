package com.appleroar.coins.registry;

import com.appleroar.coins.BasicTradeFactory;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;

public class VillagerOffers {

    public static void registerVillagerOffers() {
        final int emeraldToCoinRatio = 3;
        // Armorer
        //  Novice
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 1, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.COAL, 15),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 16, 2, 0.05F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 1, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(ModItems.GOLD_COIN, 5*emeraldToCoinRatio),
                            new ItemStack(Items.IRON_HELMET), 12, 1, 0.2F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 1, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(ModItems.GOLD_COIN, (8*emeraldToCoinRatio)),
                            new ItemStack(Items.IRON_CHESTPLATE), 12, 1, 0.2F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 1, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(ModItems.GOLD_COIN, 7*emeraldToCoinRatio),
                            new ItemStack(Items.IRON_LEGGINGS), 12, 1, 0.2F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 1, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(ModItems.GOLD_COIN, 4*emeraldToCoinRatio),
                            new ItemStack(Items.IRON_BOOTS), 12, 1, 0.2F)));
        });


        //  Apprentice
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 2, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.IRON_INGOT, emeraldToCoinRatio),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 12, 10, 0.05F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 2, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(ModItems.GOLD_COIN, 3*emeraldToCoinRatio),
                            new ItemStack(Items.CHAINMAIL_LEGGINGS), 12, 5, 0.2F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 2, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio),
                            new ItemStack(Items.CHAINMAIL_BOOTS), 12, 5, 0.2F)));
        });


        //  Journeyman

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 3, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.COAL, 15),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 16, 2, 0.05F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 3, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.LAVA_BUCKET, 1),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 12, 20, 0.05F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 3, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio),
                            new ItemStack(Items.CHAINMAIL_HELMET), 12, 10, 0.2F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 3, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.COAL, 16),
                            new ItemStack(Items.CHAINMAIL_CHESTPLATE), 12, 10, 0.2F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 3, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(ModItems.GOLD_COIN, 5*emeraldToCoinRatio),
                            new ItemStack(Items.SHIELD), 12, 10, 0.2F)));
        });


        //Butcher

        //  Novice

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.BUTCHER, 1, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.CHICKEN, 14),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 16, 2, 0.05F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.BUTCHER, 1, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.PORKCHOP, 7),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 16, 2, 0.05F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.BUTCHER, 1, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.RABBIT, emeraldToCoinRatio),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 16, 2, 0.05F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.BUTCHER, 1, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio),
                            new ItemStack(Items.RABBIT_STEW), 12, 1, 0.05F)));
        });


        //  Apprentice

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.BUTCHER, 2, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.COAL, 15),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 16, 2, 0.05F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.BUTCHER, 2, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio),
                            new ItemStack(Items.COOKED_PORKCHOP, 5), 16, 5, 0.05F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.BUTCHER, 2, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio),
                            new ItemStack(Items.COOKED_CHICKEN, 8), 16, 5, 0.05F)));
        });


        //  Journeyman
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.BUTCHER, 3, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.MUTTON, 7),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 16, 20, 0.05F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.BUTCHER, 3, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.BEEF, 10),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 16, 20, 0.05F)));
        });


        //  Expert
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.BUTCHER, 4, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.DRIED_KELP_BLOCK, 10),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 12, 30, 0.05F)));
        });

        //  Master
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.BUTCHER, 5, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.SWEET_BERRIES, 10),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 12, 30, 0.05F)));
        });


        //Cartographer

        //  Novice
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CARTOGRAPHER, 1, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.PAPER, 24),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 16, 2, 0.05F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CARTOGRAPHER, 1, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(ModItems.GOLD_COIN, 7*emeraldToCoinRatio),
                            new ItemStack(Items.MAP), 12, 1, 0.05F)));
        });

        //  Apprentice
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CARTOGRAPHER, 2, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.GLASS_PANE, 11),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 16, 10, 0.05F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CARTOGRAPHER, 2, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(ModItems.GOLD_COIN, 13*emeraldToCoinRatio),
                            new ItemStack(Items.COMPASS),
                            new ItemStack(Items.FILLED_MAP), 12, 5, 0.2F)));
        });

        //  Journeyman
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CARTOGRAPHER, 2, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.COMPASS),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 12, 20, 0.05F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CARTOGRAPHER, 3, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(ModItems.GOLD_COIN, 14*emeraldToCoinRatio),
                            new ItemStack(Items.COMPASS),
                            new ItemStack(Items.FILLED_MAP), 12, 10, 0.2F)));
        });

        //  Expert
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CARTOGRAPHER, 4, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(ModItems.GOLD_COIN, 7*emeraldToCoinRatio),
                            new ItemStack(Items.ITEM_FRAME), 12, 15, 0.05F)));
        });

        //  Master
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CARTOGRAPHER, 5, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(ModItems.GOLD_COIN, 8*emeraldToCoinRatio),
                            new ItemStack(Items.GLOBE_BANNER_PATTERN), 12, 30, 0.05F)));
        });


        //Cleric

        //  Novice
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CLERIC, 1, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.ROTTEN_FLESH, 32),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 16, 2, 0.05F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CLERIC, 1, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio),
                            new ItemStack(Items.REDSTONE, 2), 12, 1, 0.05F)));
        });

        //  Apprentice
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CLERIC, 2, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.GOLD_INGOT, 3),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 12, 10, 0.05F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CLERIC, 2, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio),
                            new ItemStack(Items.LAPIS_LAZULI), 12, 5, 0.05F)));
        });

        //  Journeyman
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CLERIC, 3, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.RABBIT_FOOT, 2),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 12, 20, 0.05F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CLERIC, 3, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(ModItems.GOLD_COIN, 4*emeraldToCoinRatio),
                            new ItemStack(Items.GLOWSTONE), 12, 10, 0.05F)));
        });

        //  Expert
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CLERIC, 4, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.GLASS_BOTTLE, 9),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 12, 30, 0.05F)));
        });


        //Farmer

        //  Novice
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 1, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.WHEAT, 20),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 16, 2, 0.05F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 1, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.POTATO, 26),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 16, 2, 0.05F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 1, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.CARROT, 22),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 16, 2, 0.05F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 1, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.BEETROOT, 15),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 16, 2, 0.05F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 1, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio),
                            new ItemStack(Items.BREAD, 6), 16, 1, 0.05F)));
        });

        //  Apprentice
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 2, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.PUMPKIN, 6),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 12, 10, 0.05F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 2, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio),
                            new ItemStack(Items.PUMPKIN_PIE, emeraldToCoinRatio), 12, 5, 0.05F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 2, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio),
                            new ItemStack(Items.APPLE, emeraldToCoinRatio), 16, 5, 0.05F)));
        });

        //  Journeyman
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 3, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.MELON, emeraldToCoinRatio),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 12, 20, 0.05F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 3, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(ModItems.GOLD_COIN, 3*emeraldToCoinRatio),
                            new ItemStack(Items.COOKIE, 18), 12, 10, 0.05F)));
        });

        //  Master
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 5, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(ModItems.GOLD_COIN, 6*emeraldToCoinRatio),
                            new ItemStack(Items.GOLDEN_CARROT, 3), 12, 30, 0.05F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 5, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(ModItems.GOLD_COIN, 8*emeraldToCoinRatio),
                            new ItemStack(Items.GLISTERING_MELON_SLICE, 3), 12, 30, 0.05F)));
        });

        //Fisherman

        //  Novice
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FISHERMAN, 1, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.STRING, 20),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 16, 2, 0.05F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FISHERMAN, 1, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.COAL, 10),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 16, 2, 0.05F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FISHERMAN, 1, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio),
                            new ItemStack(Items.COD, 6),
                            new ItemStack(Items.COOKED_COD, 6), 16, 1, 0.05F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FISHERMAN, 1, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(ModItems.GOLD_COIN, 3*emeraldToCoinRatio),
                            new ItemStack(Items.COD_BUCKET), 16, 1, 0.05F)));
        });

        //  Apprentice
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FISHERMAN, 2, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.COD, 15),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 16, 10, 0.05F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FISHERMAN, 1, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio),
                            new ItemStack(Items.SALMON, 6),
                            new ItemStack(Items.COOKED_SALMON, 6), 16, 5, 0.05F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FISHERMAN, 2, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(ModItems.GOLD_COIN, 2*emeraldToCoinRatio),
                            new ItemStack(Items.CAMPFIRE), 12, 5, 0.05F)));
        });

        //  Journeyman
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FISHERMAN, 3, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.SALMON, 13),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 16, 20, 0.05F)));
        });

        //  Expert
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FISHERMAN, 4, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.TROPICAL_FISH, 6),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 12, 30, 0.05F)));
        });

        //Fletcher

        //  Novice
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 1, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.STICK, 32),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 16, 2, 0.05F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 1, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio),
                            new ItemStack(Items.ARROW, 16), 12, 1, 0.05F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 1, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio),
                            new ItemStack(Items.GRAVEL, 10),
                            new ItemStack(Items.FLINT, 10), 12, 1, 0.05F)));
        });

        //  Apprentice
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 2, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.FLINT, 26),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 12, 10, 0.05F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 2, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(ModItems.GOLD_COIN, 2*emeraldToCoinRatio),
                            new ItemStack(Items.BOW), 12, 5, 0.05F)));
        });

        //  Journeyman
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 3, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.STRING, 14),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 12, 20, 0.05F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 3, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(ModItems.GOLD_COIN, 3*emeraldToCoinRatio),
                            new ItemStack(Items.CROSSBOW), 12, 10, 0.05F)));
        });

        //  Expert
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 4, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.FEATHER, 24),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 16, 30, 0.05F)));
        });

        //  Master
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 5, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.TRIPWIRE_HOOK, 8),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 12, 30, 0.05F)));
        });

        //Leatherworker

        //  Novice
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LEATHERWORKER, 1, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.LEATHER, 6),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 16, 2, 0.05F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LEATHERWORKER, 1, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(ModItems.GOLD_COIN, 3*emeraldToCoinRatio),
                            new ItemStack(Items.LEATHER_LEGGINGS), 12, 1, 0.2F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LEATHERWORKER, 1, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(ModItems.GOLD_COIN, 7*emeraldToCoinRatio),
                            new ItemStack(Items.LEATHER_CHESTPLATE), 12, 1, 0.2F)));
        });

        //  Apprentice
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LEATHERWORKER, 2, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.FLINT, 26),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 12, 10, 0.05F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LEATHERWORKER, 2, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(ModItems.GOLD_COIN, 5*emeraldToCoinRatio),
                            new ItemStack(Items.LEATHER_HELMET), 12, 5, 0.2F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LEATHERWORKER, 2, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(ModItems.GOLD_COIN, 4*emeraldToCoinRatio),
                            new ItemStack(Items.LEATHER_BOOTS), 12, 5, 0.2F)));
        });

        //  Journeyman
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LEATHERWORKER, 3, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.RABBIT_HIDE, 9),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 12, 20, 0.05F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LEATHERWORKER, 3, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(ModItems.GOLD_COIN, 7*emeraldToCoinRatio),
                            new ItemStack(Items.LEATHER_CHESTPLATE), 12, 1, 0.2F)));
        });

        //  Master
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LEATHERWORKER, 5, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(ModItems.GOLD_COIN, 5*emeraldToCoinRatio),
                            new ItemStack(Items.LEATHER_HELMET), 12, 30, 0.2F)));
        });


        //Librarian

        //  Novice
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LIBRARIAN, 1, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.PAPER, 24),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 16, 2, 0.05F)));
        });

        //  Apprentice
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LIBRARIAN, 2, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio),
                            new ItemStack(Items.LANTERN), 12, 5, 0.05F)));
        });

        //  Journeyman
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LIBRARIAN, 3, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio),
                            new ItemStack(Items.GLASS, emeraldToCoinRatio), 12, 10, 0.05F)));
        });

        //  Expert
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LIBRARIAN, 4, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(ModItems.GOLD_COIN, 5*emeraldToCoinRatio),
                            new ItemStack(Items.CLOCK), 12, 15, 0.05F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LIBRARIAN, 4, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(ModItems.GOLD_COIN, 4*emeraldToCoinRatio),
                            new ItemStack(Items.COMPASS), 12, 15, 0.05F)));
        });

        //Mason

        //  Novice
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 1, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.CLAY_BALL, 10),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 16, 2, 0.05F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 1, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio),
                            new ItemStack(Items.BRICK, 10), 16, 1, 0.05F)));
        });

        //  Apprentice
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 2, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.STONE, 20),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 16, 10, 0.05F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 2, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio),
                            new ItemStack(Items.CHISELED_STONE_BRICKS, emeraldToCoinRatio), 16, 5, 0.05F)));
        });

        //  Journeyman
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 3, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.GRANITE, 16),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 16, 20, 0.05F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 3, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.ANDESITE, 16),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 16, 20, 0.05F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 3, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.DIORITE, 16),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 16, 20, 0.05F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 3, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio),
                            new ItemStack(Items.POLISHED_GRANITE, emeraldToCoinRatio), 16, 10, 0.05F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 3, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio),
                            new ItemStack(Items.POLISHED_ANDESITE, emeraldToCoinRatio), 16, 10, 0.05F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 3, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio),
                            new ItemStack(Items.POLISHED_DIORITE, emeraldToCoinRatio), 16, 10, 0.05F)));
        });

        //  Master
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 5, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio),
                            new ItemStack(Items.QUARTZ_PILLAR, emeraldToCoinRatio), 12, 30, 0.05F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 5, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio),
                            new ItemStack(Items.QUARTZ_BLOCK, emeraldToCoinRatio), 12, 30, 0.05F)));
        });

        //Shepherd

        //  Novice
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 1, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.WHITE_WOOL, 18),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 16, 2, 0.05F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 1, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.BROWN_WOOL, 18),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 16, 2, 0.05F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 1, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.BLACK_WOOL, 18),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 16, 2, 0.05F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 1, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.GRAY_WOOL, 18),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 16, 2, 0.05F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 1, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(ModItems.GOLD_COIN, 2*emeraldToCoinRatio),
                            new ItemStack(Items.SHEARS), 12, 1, 0.05F)));
        });

        //  Apprentice
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 2, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.BLACK_DYE, 12),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 16, 10, 0.05F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 2, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.GRAY_DYE, 12),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 16, 10, 0.05F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 2, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.LIME_DYE, 12),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 16, 10, 0.05F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 2, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.LIGHT_BLUE_DYE, 12),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 16, 10, 0.05F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 2, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.WHITE_DYE, 12),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 16, 10, 0.05F)));
        });

        //  Journeyman
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 3, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.RED_DYE, 12),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 16, 20, 0.05F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 3, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.LIGHT_GRAY_DYE, 12),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 16, 20, 0.05F)));
        });


        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 3, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.PINK_DYE, 12),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 16, 20, 0.05F)));
        });


        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 3, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.YELLOW_DYE, 12),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 16, 20, 0.05F)));
        });


        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 3, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.ORANGE_DYE, 12),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 16, 20, 0.05F)));
        });


        //  Expert
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 4, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.GREEN_DYE, 12),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 16, 30, 0.05F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 4, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.BROWN_DYE, 12),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 16, 30, 0.05F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 4, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.BLUE_DYE, 12),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 16, 30, 0.05F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 4, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.PURPLE_DYE, 12),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 16, 30, 0.05F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 4, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.CYAN_DYE, 12),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 16, 30, 0.05F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 4, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.MAGENTA_DYE, 12),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 16, 30, 0.05F)));
        });

        //  Master
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 5, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(ModItems.GOLD_COIN, 2*emeraldToCoinRatio),
                            new ItemStack(Items.PAINTING, 3), 12, 30, 0.05F)));
        });

        //Toolsmith

        //  Novice
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 1, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.COAL, 15),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 16, 2, 0.05F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 1, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio),
                            new ItemStack(Items.STONE_AXE), 12, 1, 0.2F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 1, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio),
                            new ItemStack(Items.STONE_SHOVEL), 12, 1, 0.2F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 1, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio),
                            new ItemStack(Items.STONE_PICKAXE), 12, 1, 0.2F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 1, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio),
                            new ItemStack(Items.STONE_HOE), 12, 1, 0.2F)));
        });

        //  Apprentice
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 2, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.IRON_INGOT, emeraldToCoinRatio),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 12, 10, 0.05F)));
        });

        //  Journeyman
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 3, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.FLINT, 30),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 12, 20, 0.05F)));
        });

        //Weaponsmith

        //  Novice
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 1, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.COAL, 15),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 16, 2, 0.05F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 1, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(ModItems.GOLD_COIN, 3*emeraldToCoinRatio),
                            new ItemStack(Items.IRON_AXE), 12, 1, 0.2F)));
        });

        //  Apprentice
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 2, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.IRON_INGOT, emeraldToCoinRatio),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 12, 10, 0.05F)));
        });

        //  Journeyman
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 3, factories -> {
            factories.add(new BasicTradeFactory(
                    new TradeOffer(new ItemStack(Items.FLINT, 24),
                            new ItemStack(ModItems.GOLD_COIN, emeraldToCoinRatio), 12, 20, 0.05F)));
        });
    }
}
