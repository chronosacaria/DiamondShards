package com.github.chronosacaria;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class DiamondShards implements ModInitializer {
	private static final Item DIAMOND_SHARD = new DiamondShardItem(new Item.Settings().group(ItemGroup.MATERIALS));

	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("diamondshards", "diamond_shard"), DIAMOND_SHARD);

		System.out.println("Hello Fabric world!");

	}
}
