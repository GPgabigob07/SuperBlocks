package com.maxfreemen.extendedblocks.creativetabs;

import com.maxfreemen.extendedblocks.init.ItemsInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CraftingBlocksTab extends CreativeTabs {

	public CraftingBlocksTab() {
		
		super("crafting");
		
	}

	@Override
    public ItemStack getTabIconItem() {
		
        return new ItemStack(ItemsInit.HAMMER_ITEM);
        
    }
}
