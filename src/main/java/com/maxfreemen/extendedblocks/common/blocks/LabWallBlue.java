package com.maxfreemen.extendedblocks.common.blocks;

import com.maxfreemen.extendedblocks.init.TabsInit;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class LabWallBlue extends Block {
	
	public LabWallBlue() {
		
		super(Material.IRON);
		
		this.setCreativeTab(TabsInit.LABORATORY_BLOCKS);
		this.setHardness(2.0F); //�������� ������ ��� � ����������� ������
		this.setHarvestLevel("pickaxe", 2); //������ �������� ������
		this.setRegistryName("blue_lab_wall");
		this.setResistance(15.0F); //������������������ ��� � �����
		this.setUnlocalizedName("extendedblocks.blue_lab_wall");
		
	}

}