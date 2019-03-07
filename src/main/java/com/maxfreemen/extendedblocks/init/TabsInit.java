package com.maxfreemen.extendedblocks.init;

import com.maxfreemen.extendedblocks.creativetabs.CraftingBlocksTab;
import com.maxfreemen.extendedblocks.creativetabs.FactoryBlocksTab;
import com.maxfreemen.extendedblocks.creativetabs.LaboratoryBlocksTab;
import com.maxfreemen.extendedblocks.creativetabs.MedievalBlocksTab;
import com.maxfreemen.extendedblocks.creativetabs.MilitaryBlockTab;
import com.maxfreemen.extendedblocks.creativetabs.RoadBlocksTab;

import net.minecraft.creativetab.CreativeTabs;

public class TabsInit {
	
	public static final CreativeTabs LABORATORY_BLOCKS = new LaboratoryBlocksTab();
	public static final CreativeTabs FACTORY_BLOCKS = new FactoryBlocksTab();
	public static final CreativeTabs ROAD_BLOCKS = new RoadBlocksTab();
	public static final CreativeTabs CRAFTING_BLOCKS = new CraftingBlocksTab();
	public static final CreativeTabs MILITARY_BLOCKS = new MilitaryBlockTab ();
	public static final CreativeTabs MEDIEVAL_BLOCKS = new MedievalBlocksTab();

}