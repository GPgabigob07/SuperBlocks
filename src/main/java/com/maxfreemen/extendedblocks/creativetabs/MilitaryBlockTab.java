package com.maxfreemen.extendedblocks.creativetabs;

import com.maxfreemen.extendedblocks.init.ItemsInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MilitaryBlockTab extends CreativeTabs{
	
	public MilitaryBlockTab() {
		
		super("military");
		
	}

	@Override
    public ItemStack getTabIconItem() {
		
        return new ItemStack(ItemsInit.MILITARY_SHOVEL);
        
    }

}
