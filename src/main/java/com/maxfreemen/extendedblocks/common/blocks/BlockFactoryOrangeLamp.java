package com.maxfreemen.extendedblocks.common.blocks;

import com.maxfreemen.extendedblocks.init.TabsInit;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class BlockFactoryOrangeLamp extends Block {

	public BlockFactoryOrangeLamp() {
		
		super(Material.GLASS);
		
		this.setCreativeTab(TabsInit.FACTORY_BLOCKS);
		this.setHardness(1.0F);
		this.setLightLevel(20.0F); //���������� ����
		this.setLightOpacity(7); //���������� ���������� ����� ������� �� ���
		this.setRegistryName("factory_block_orange_lamp");
		this.setResistance(1.0F);
		this.setUnlocalizedName("extendedblocks.factory_block_orange_lamp");
		
	}
	
	 @Override
	    public boolean isOpaqueCube(IBlockState state) {  //����� ��� ������ �������� �� ���� ������ �������
		 
	        return false;
	        
	    }

	    @Override
	    public boolean isFullCube(IBlockState state) { //������ ���� ������, ������ ���� ��������� ��������
	    	
	        return true;
	        
	    }
}
