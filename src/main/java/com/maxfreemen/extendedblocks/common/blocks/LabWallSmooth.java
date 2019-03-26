package com.maxfreemen.extendedblocks.common.blocks;

import com.maxfreemen.extendedblocks.init.TabsInit;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class LabWallSmooth extends Block {
	
	public LabWallSmooth() {
		
		super(Material.IRON);
		
		this.setCreativeTab(TabsInit.LABORATORY_BLOCKS);
		this.setHardness(2.0F); //Скорость добычи как у большинства блоков
		this.setHarvestLevel("pickaxe", 2); //добыча железной киркой
		this.setRegistryName("floor_lab_smooth");
		this.setResistance(15.0F); //Взрывоустойчивость как у камня
		this.setUnlocalizedName("extendedblocks.floor_lab_smooth");
		
	}

}