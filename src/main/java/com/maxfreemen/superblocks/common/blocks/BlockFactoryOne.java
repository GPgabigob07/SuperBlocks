package com.maxfreemen.superblocks.common.blocks;

import com.maxfreemen.superblocks.init.TabsInit;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockFactoryOne extends Block {
	
	public BlockFactoryOne() {
		
		super(Material.IRON);
		
		this.setCreativeTab(TabsInit.FACTORY_BLOCKS);
		this.setHardness(2.0F); //Скорость добычи как у большинства блоков
		this.setHarvestLevel("pickaxe", 2); //добыча железной киркой
		this.setRegistryName("factory_block_one");
		this.setResistance(15.0F); //Взрывоустойчивость как у камня
		this.setUnlocalizedName("superblocks.factory_block_one");
		
	}
}
