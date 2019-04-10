package com.maxfreemen.extendedblocks.common.blocks;

import com.maxfreemen.extendedblocks.init.TabsInit;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockHazardYellow extends Block {
	
	public BlockHazardYellow() {
		
		super(Material.IRON);
		
		this.setCreativeTab(TabsInit.FACTORY_BLOCKS);
		this.setHardness(2.0F); //�������� ������ ��� � ����������� ������
		this.setHarvestLevel("pickaxe", 2); //������ �������� ������
		this.setRegistryName("hazard_yellow");
		this.setResistance(15.0F); //������������������ ��� � �����
		this.setUnlocalizedName("extendedblocks.hazard_yellow");
		
	}
}