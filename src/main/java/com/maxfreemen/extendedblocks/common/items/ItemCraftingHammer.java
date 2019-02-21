package com.maxfreemen.extendedblocks.common.items;

import com.maxfreemen.extendedblocks.init.ItemsInit;

import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ItemCraftingHammer extends ItemSword {

	public ItemCraftingHammer() {
		
		super(ItemsInit.TEST_TOOL_MATERIAL);
		
		this.setMaxStackSize(1);
		this.setRegistryName("hammer_item");
		this.setUnlocalizedName("extendedblocks.hammer_item");
		
	}
	
	public EnumRarity getRarity(ItemStack stack) {
		
	    return ItemsInit.COMMON;
	    
	}
}
