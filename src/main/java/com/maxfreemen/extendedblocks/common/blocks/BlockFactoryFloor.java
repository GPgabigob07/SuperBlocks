package com.maxfreemen.extendedblocks.common.blocks;

import com.maxfreemen.extendedblocks.init.TabsInit;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;

public class BlockFactoryFloor extends Block {

	public BlockFactoryFloor() {
		
		super(Material.IRON);
		
		this.setCreativeTab(TabsInit.FACTORY_BLOCKS);
		this.setHardness(15.0F);
		this.setLightLevel(0.0F);
		this.setLightOpacity(7); 
		this.setRegistryName("factory_floor");
		this.setResistance(1.0F);
		this.setUnlocalizedName("extendedblocks.factory_floor");
		
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

