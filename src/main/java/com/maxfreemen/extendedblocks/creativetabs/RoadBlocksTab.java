package com.maxfreemen.extendedblocks.creativetabs;

import com.maxfreemen.extendedblocks.init.ItemsInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class RoadBlocksTab extends CreativeTabs{
	
	public RoadBlocksTab() {
		
		super("road");
		
	}

	@Override
    public ItemStack getTabIconItem() {
		
        return new ItemStack(ItemsInit.ROAD_SWORD);
        
    }

}
