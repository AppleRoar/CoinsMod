package com.appleroar.coins.mixin;

import com.appleroar.coins.Coins;
import com.appleroar.coins.registry.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(TradeOffer.class)
public abstract class TradeOfferMixin {
    @ModifyVariable(method = "<init>(Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemStack;IIIFI)V", at = @At("HEAD"), ordinal = 0, argsOnly = true)
    private static ItemStack replaceFirstBuyStack(ItemStack firstBuyStack) {
        return replaceStack(firstBuyStack);
    }

    @ModifyVariable(method = "<init>(Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemStack;IIIFI)V", at = @At("HEAD"), ordinal = 1, argsOnly = true)
    private static ItemStack replaceSecondBuyStack(ItemStack secondBuyStack) {
        return replaceStack(secondBuyStack);
    }

    @ModifyVariable(method = "<init>(Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemStack;IIIFI)V", at = @At("HEAD"), ordinal = 2, argsOnly = true)
    private static ItemStack replaceSellStack(ItemStack sellStack) {
        return replaceStack(sellStack);
    }

    private static ItemStack replaceStack(ItemStack stackToReplace) {
        final int adjustedPrice = Math.min(stackToReplace.getCount() * Coins.EMERALD_TO_COIN_RATIO, 64);
        return stackToReplace.getItem().equals(Items.EMERALD) ? new ItemStack(ModItems.GOLD_COIN, adjustedPrice) : stackToReplace;
    }
}
