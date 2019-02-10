package com.maxfreemen.superblocks.common.blocks;

import com.maxfreemen.superblocks.init.TabsInit;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockLamp extends Block {

	public BlockLamp() {
		
		super(Material.GLASS);
		
		this.setCreativeTab(TabsInit.LABORATORY_BLOCKS);
		this.setHardness(1.0F);
		this.setLightLevel(15.0F);
		this.setRegistryName("lamp");
		this.setResistance(1.0F);
		this.setUnlocalizedName("superblocks.lamp");
		
	}

}