package com.maxfreemen.extendedblocks.common.blocks;

import com.maxfreemen.extendedblocks.init.TabsInit;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


public class BlockSandBag extends Block {

	public BlockSandBag() {
		
		super(Material.SAND);
		
		this.setCreativeTab(TabsInit.MILITARY_BLOCKS);
		this.setHardness(2.0F);
		this.setHarvestLevel("pickaxe", 0);
		this.setRegistryName("sand_bag");
		this.setResistance(20.0F);
		this.setUnlocalizedName("extendedblocks.sand_bag");
		
	}
}
