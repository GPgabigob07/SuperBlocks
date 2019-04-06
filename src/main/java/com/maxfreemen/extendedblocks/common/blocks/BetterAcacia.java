package com.maxfreemen.extendedblocks.common.blocks;

import com.maxfreemen.extendedblocks.init.TabsInit;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BetterAcacia extends Block {
	
	public BetterAcacia() {
		
		super(Material.WOOD);
		
		this.setCreativeTab(TabsInit.MEDIEVAL_BLOCKS);
		this.setHardness(2.0F); 
		this.setHarvestLevel("hand", 0);
		this.setRegistryName("better_acacia");
		this.setResistance(15.0F);
		this.setUnlocalizedName("extendedblocks.better_acacia");
		
	}
}