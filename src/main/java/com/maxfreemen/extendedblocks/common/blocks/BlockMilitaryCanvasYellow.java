package com.maxfreemen.extendedblocks.common.blocks;

import com.maxfreemen.extendedblocks.init.TabsInit;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockMilitaryCanvasYellow extends Block{
	
 public BlockMilitaryCanvasYellow() {
	 
	 super(Material.CLOTH);
	 
	 this.setCreativeTab(TabsInit.MILITARY_BLOCKS);
	 this.setHardness(0);
	 this.setHarvestLevel("hand", 0);
	 this.setRegistryName("canvas_yellow");
	 this.setResistance(1);
	 this.setUnlocalizedName("extendedblocks.canvas_yellow");
	 
	 
	 
 }
}
