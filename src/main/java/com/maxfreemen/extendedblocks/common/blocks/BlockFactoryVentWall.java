package com.maxfreemen.extendedblocks.common.blocks;

import com.maxfreemen.extendedblocks.init.TabsInit;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockFactoryVentWall extends Block {
	
	public BlockFactoryVentWall() {
		
		super(Material.IRON);
		
		this.setCreativeTab(TabsInit.FACTORY_BLOCKS);
		this.setHardness(2.0F); //�������� ������ ��� � ����������� ������
		this.setHarvestLevel("pickaxe", 2); //������ �������� ������
		this.setRegistryName("factory_block_vent_wall");
		this.setResistance(15.0F); //������������������ ��� � �����
		this.setUnlocalizedName("extendedblocks.factory_block_vent_wall");
		
	}
}
