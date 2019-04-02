package com.maxfreemen.extendedblocks.common.blocks;

import com.maxfreemen.extendedblocks.init.TabsInit;
import net.minecraft.block.BlockBookshelf;



public class BigOakShelf extends BlockBookshelf {
	

	public BigOakShelf() {
		
	
		
		this.setCreativeTab(TabsInit.MEDIEVAL_BLOCKS);
		this.setHardness(2.0F); //Скорость добычи как у большинства блоков
		this.setHarvestLevel("pickaxe", 2); //добыча железной киркой
		this.setRegistryName("big_oak_shelf");
		this.setResistance(15.0F); //Взрывоустойчивость как у камня
		this.setUnlocalizedName("extendedblocks.big_oak_shelf");
	
		
	}
    
    
}
