package com.maxfreemen.extendedblocks.common.blocks;

import com.maxfreemen.extendedblocks.init.TabsInit;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockLabWallOne extends Block {

	public BlockLabWallOne() {
		
		super(Material.IRON);
		
		this.setCreativeTab(TabsInit.LABORATORY_BLOCKS);
		this.setHardness(15.0F);
		this.setLightLevel(0.0F);
		this.setLightOpacity(7); 
		this.setRegistryName("lab_wall_one");
		this.setResistance(1.0F);
		this.setUnlocalizedName("extendedblocks.lab_wall_one");
		
	}

}

