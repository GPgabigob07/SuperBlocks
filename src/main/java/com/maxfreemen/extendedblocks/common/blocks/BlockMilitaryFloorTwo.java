package com.maxfreemen.extendedblocks.common.blocks;

import com.maxfreemen.extendedblocks.init.TabsInit;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockMilitaryFloorTwo extends Block{

	public BlockMilitaryFloorTwo() {
		
		super(Material.IRON);
		
		this.setCreativeTab(TabsInit.MILITARY_BLOCKS);
		this.setHardness(2.0F);
		this.setHarvestLevel("pickaxe", 3);
		this.setRegistryName("military_floor_two");
		this.setResistance(30.0F);
		this.setUnlocalizedName("extendedblocks.military_floor_two");

		
	}
}
