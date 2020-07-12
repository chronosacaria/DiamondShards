package com.github.chronosacaria;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class DiamondShardItem extends Item {
    DiamondShardItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
        if (hand == Hand.MAIN_HAND) {
            System.out.println("Dinga Dinga Ding");
        }

        return super.use(world, playerEntity, hand);
    }
}
