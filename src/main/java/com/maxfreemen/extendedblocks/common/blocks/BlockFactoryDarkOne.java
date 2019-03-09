package com.maxfreemen.extendedblocks.common.blocks;

import com.maxfreemen.extendedblocks.init.TabsInit;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockFactoryDarkOne extends Block {

	public BlockFactoryDarkOne() {
		
		super(Material.GLASS);
		
		this.setCreativeTab(TabsInit.FACTORY_BLOCKS);
		this.setHardness(1.0F);
		this.setLightLevel(0.0F); //Выставляет свет
		this.setLightOpacity(7); //Выставляет поглощение света блоками за ним
		this.setRegistryName("dark_factory_one");
		this.setResistance(1.0F);
		this.setUnlocalizedName("extendedblocks.dark_factory_one");
		
	}

}
