package com.maxfreemen.extendedblocks.common.blocks;

import com.maxfreemen.extendedblocks.init.TabsInit;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BetterBirch extends Block {
	
	public BetterBirch() {
		
		super(Material.WOOD);
		
		this.setCreativeTab(TabsInit.MEDIEVAL_BLOCKS);
		this.setHardness(2.0F); 
		this.setHarvestLevel("hand", 0);
		this.setRegistryName("better_birch");
		this.setResistance(15.0F);
		this.setUnlocalizedName("extendedblocks.better_birch");
		
	}
}