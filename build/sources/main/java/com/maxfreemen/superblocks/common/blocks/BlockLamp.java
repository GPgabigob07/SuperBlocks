package com.maxfreemen.superblocks.common.blocks;

import com.maxfreemen.superblocks.init.TabsInit;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class BlockLamp extends Block {

	public BlockLamp() {
		
		super(Material.GLASS);
		
		this.setCreativeTab(TabsInit.LABORATORY_BLOCKS);
		this.setHardness(1.0F);
		this.setLightLevel(7.0F); //���������� ����
		this.setLightOpacity(7); //���������� ���������� ����� ������� �� ���
		this.setRegistryName("lamp");
		this.setResistance(1.0F);
		this.setUnlocalizedName("superblocks.lamp");
		
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