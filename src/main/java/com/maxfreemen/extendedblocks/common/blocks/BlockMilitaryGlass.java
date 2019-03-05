package com.maxfreemen.extendedblocks.common.blocks;

import com.maxfreemen.extendedblocks.init.TabsInit;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockRenderLayer;


public class BlockMilitaryGlass extends Block {

	public BlockMilitaryGlass() {
		
		super(Material.GLASS);
		
		this.setCreativeTab(TabsInit.MILITARY_BLOCKS);
		this.setHardness(2.0F);
		this.setHarvestLevel("pickaxe", 3);
		this.setRegistryName("military_glass");
		this.setResistance(30.0F);
		this.setUnlocalizedName("extendedblocks.military_glass");

		
	}
	
	@Override
	public BlockRenderLayer getBlockLayer() { 
	return BlockRenderLayer.TRANSLUCENT; 
	}
	
}
