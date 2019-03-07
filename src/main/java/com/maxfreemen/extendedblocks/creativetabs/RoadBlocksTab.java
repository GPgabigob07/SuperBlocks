package com.maxfreemen.extendedblocks.creativetabs;

import com.maxfreemen.extendedblocks.init.BlocksInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class RoadBlocksTab extends CreativeTabs{
	
	public RoadBlocksTab() {
		
		super("road");
		
	}

	@Override
    public ItemStack getTabIconItem() {
		
        return new ItemStack(BlocksInit.ROAD_BLOCK_BASIC);
        
    }

}
