package com.maxfreemen.extendedblocks.common.blocks;

import com.maxfreemen.extendedblocks.init.TabsInit;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class BlockFactoryLampOne extends Block{

	public BlockFactoryLampOne() {
		
		super(Material.GLASS);
		
		this.setCreativeTab(TabsInit.FACTORY_BLOCKS);
		this.setHardness(1.0F);
		this.setLightLevel(20.0F); //���������� ����
		this.setLightOpacity(7); //���������� ���������� ����� ������� �� ���
		this.setRegistryName("factory_block_lamp_one");
		this.setResistance(1.0F);
		this.setUnlocalizedName("extendedblocks.factory_block_lamp_one");
		
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
