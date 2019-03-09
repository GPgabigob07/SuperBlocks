package com.maxfreemen.extendedblocks.common.blocks;

import com.maxfreemen.extendedblocks.init.TabsInit;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockFactoryDarkTwo extends Block {

	public BlockFactoryDarkTwo() {
		
		super(Material.GLASS);
		
		this.setCreativeTab(TabsInit.LABORATORY_BLOCKS);
		this.setHardness(1.0F);
		this.setLightLevel(7.0F); //Выставляет свет
		this.setLightOpacity(7); //Выставляет поглощение света блоками за ним
		this.setRegistryName("dark_factory_two");
		this.setResistance(1.0F);
		this.setUnlocalizedName("extendedblocks.dark_factory_two");
		
	}

}
