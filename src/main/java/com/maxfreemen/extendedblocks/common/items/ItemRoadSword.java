package com.maxfreemen.extendedblocks.common.items;

import com.maxfreemen.extendedblocks.init.ItemsInit;

import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ItemRoadSword extends ItemSword {

	public ItemRoadSword() {
		
		super(ItemsInit.TEST_TOOL_MATERIAL);
		
		this.setMaxStackSize(1);
		this.setRegistryName("road_sword");
		this.setUnlocalizedName("extendedblocks.road_sword");
		
	}
	
	public EnumRarity getRarity(ItemStack stack) {
		
	    return ItemsInit.COMMON;
	    
	}
}
