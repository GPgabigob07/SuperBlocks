package com.maxfreemen.extendedblocks.common.blocks;

import com.maxfreemen.extendedblocks.init.TabsInit;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;

public class BlockFactoryGlass extends Block {

	public BlockFactoryGlass() {
		
		super(Material.GLASS);
		
		this.setCreativeTab(TabsInit.FACTORY_BLOCKS);
		this.setHardness(2.0F);
		this.setHarvestLevel("pickaxe", 3);
		this.setRegistryName("factory_glass");
		this.setResistance(30.0F);
		this.setUnlocalizedName("extendedblocks.factory_glass");

		
	}
	
	@Override
	public BlockRenderLayer getBlockLayer() { 
	return BlockRenderLayer.TRANSLUCENT; 
	}
	
	@Override
    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }
	
}
