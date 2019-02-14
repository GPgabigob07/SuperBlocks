package com.maxfreemen.superblocks.common.blocks;

import com.maxfreemen.superblocks.init.TabsInit;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class BlockFactoryLampOne extends Block{

	public BlockFactoryLampOne() {
		
		super(Material.GLASS);
		
		this.setCreativeTab(TabsInit.FACTORY_BLOCKS);
		this.setHardness(1.0F);
		this.setLightLevel(20.0F); //Выставляет свет
		this.setLightOpacity(7); //Выставляет поглощение света блоками за ним
		this.setRegistryName("factory_block_lamp_one");
		this.setResistance(1.0F);
		this.setUnlocalizedName("superblocks.factory_block_lamp_one");
		
	}
	
	 @Override
	    public boolean isOpaqueCube(IBlockState state) {  //чтобы при другой модельке не было иксрей еффекта
		 
	        return false;
	        
	    }

	    @Override
	    public boolean isFullCube(IBlockState state) { //Делает блок полным, тобишь свет нормально работает
	    	
	        return true;
	        
	    }
}
