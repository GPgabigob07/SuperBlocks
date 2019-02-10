package com.maxfreemen.superblocks.common.items;

import com.maxfreemen.superblocks.init.ItemsInit;

import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ItemTestSword extends ItemSword {

	public ItemTestSword() {
		
		super(ItemsInit.TEST_TOOL_MATERIAL);
		
		this.setMaxStackSize(1);
		this.setRegistryName("test_sword");
		this.setUnlocalizedName("superblocks.test_sword");
		
	}
	
	public EnumRarity getRarity(ItemStack stack) {
		
	    return ItemsInit.COMMON;
	    
	}

}