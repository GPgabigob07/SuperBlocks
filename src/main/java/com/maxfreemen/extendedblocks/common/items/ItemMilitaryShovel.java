package com.maxfreemen.extendedblocks.common.items;

import com.maxfreemen.extendedblocks.init.ItemsInit;

import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ItemMilitaryShovel  extends ItemSword{

	public ItemMilitaryShovel() {
		
		super(ItemsInit.TEST_TOOL_MATERIAL);
		
		this.setMaxStackSize(1);
		this.setRegistryName("military_shovel");
		this.setUnlocalizedName("extendedblocks.military_shovel");
		
	}
	
	public EnumRarity getRarity(ItemStack stack) {
		
	    return ItemsInit.COMMON;
	    
	}
}

