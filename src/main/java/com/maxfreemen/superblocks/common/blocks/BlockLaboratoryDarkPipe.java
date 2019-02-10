package com.maxfreemen.superblocks.common.blocks;

import com.maxfreemen.superblocks.init.TabsInit;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockLaboratoryDarkPipe extends Block {
	
public BlockLaboratoryDarkPipe() {
		
		super(Material.IRON);
		
		this.setCreativeTab(TabsInit.LABORATORY_BLOCKS);
		this.setHardness(2.0F); //Скорость добычи как у большинства блоков
		this.setHarvestLevel("pickaxe", 2); //добыча железной киркой
		this.setRegistryName("laboratory_block_dark_pipe");
		this.setResistance(15.0F); //Взрывоустойчивость как у камня
		this.setUnlocalizedName("superblocks.laboratory_block_dark_pipe");
		
	}
}
