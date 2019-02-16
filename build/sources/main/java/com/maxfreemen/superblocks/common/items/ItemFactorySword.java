package com.maxfreemen.superblocks.common.items;

import com.maxfreemen.superblocks.init.ItemsInit;

import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ItemFactorySword extends ItemSword{

	public ItemFactorySword() {
		
		super(ItemsInit.TEST_TOOL_MATERIAL);
		
		this.setMaxStackSize(1);
		this.setRegistryName("factory_sword");
		this.setUnlocalizedName("superblocks.factory_sword");
		
	}
	
	public EnumRarity getRarity(ItemStack stack) {
		
	    return ItemsInit.COMMON;
	    
	}
}
