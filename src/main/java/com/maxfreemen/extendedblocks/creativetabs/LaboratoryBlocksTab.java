package com.maxfreemen.extendedblocks.creativetabs;

import com.maxfreemen.extendedblocks.init.BlocksInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class LaboratoryBlocksTab extends CreativeTabs {
	
	public LaboratoryBlocksTab() {
		
		super("laboratory");
		
	}

	@Override
    public ItemStack getTabIconItem() {
		
        return new ItemStack(BlocksInit.LABORATORY_BLOCK);
        
    }

}