package com.maxfreemen.extendedblocks.common.blocks;

import com.maxfreemen.extendedblocks.init.TabsInit;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockMilitaryWallTwo extends Block {

	public BlockMilitaryWallTwo() {
		
		super(Material.IRON);
		
		this.setCreativeTab(TabsInit.MILITARY_BLOCKS);
		this.setHardness(2.0F);
		this.setHarvestLevel("pickaxe", 3);
		this.setRegistryName("military_wall_two");
		this.setResistance(30.0F);
		this.setUnlocalizedName("extendedblocks.military_wall_two");

		
	}
}
