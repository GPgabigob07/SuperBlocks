package com.maxfreemen.extendedblocks.common.items;

import com.maxfreemen.extendedblocks.init.ItemsInit;

import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ItemFactorySword extends ItemSword{

	public ItemFactorySword() {
		
		super(ItemsInit.TEST_TOOL_MATERIAL);
		
		this.setMaxStackSize(1);
		this.setRegistryName("factory_sword");
		this.setUnlocalizedName("extendedblocks.factory_sword");
		
	}
	
	public EnumRarity getRarity(ItemStack stack) {
		
	    return ItemsInit.COMMON;
	    
	}
}
