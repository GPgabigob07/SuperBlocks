package com.maxfreemen.extendedblocks.creativetabs;

import com.maxfreemen.extendedblocks.init.BlocksInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MedievalBlocksTab extends CreativeTabs {

	public MedievalBlocksTab() {
		
		super("medieval");
		
	}

	@Override
    public ItemStack getTabIconItem() {
		
        return new ItemStack(BlocksInit.BRICKS_BASIC);
        
    }
}
