package com.maxfreemen.extendedblocks.creativetabs;

import com.maxfreemen.extendedblocks.init.ItemsInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class FactoryBlocksTab extends CreativeTabs{

	public FactoryBlocksTab() {
		
		super("factory");
		
	}

	@Override
    public ItemStack getTabIconItem() {
		
        return new ItemStack(ItemsInit.FACTORY_SWORD);
        
    }
}
