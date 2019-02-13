package com.maxfreemen.superblocks.creativetabs;

import com.maxfreemen.superblocks.init.ItemsInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class FactoryBlocksTab extends CreativeTabs{

	public FactoryBlocksTab() {
		
		super("factory");
		
	}

	@Override
    public ItemStack getTabIconItem() {
		
        return new ItemStack(ItemsInit.TEST_SWORD);
        
    }
}
