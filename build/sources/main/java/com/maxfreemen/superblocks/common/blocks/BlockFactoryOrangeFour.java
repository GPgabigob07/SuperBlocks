package com.maxfreemen.superblocks.common.blocks;

import com.maxfreemen.superblocks.init.TabsInit;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockFactoryOrangeFour extends Block {
	
	public BlockFactoryOrangeFour() {
		
		super(Material.IRON);
		
		this.setCreativeTab(TabsInit.FACTORY_BLOCKS);
		this.setHardness(2.0F); //�������� ������ ��� � ����������� ������
		this.setHarvestLevel("pickaxe", 2); //������ �������� ������
		this.setRegistryName("factory_block_orange_four");
		this.setResistance(15.0F); //������������������ ��� � �����
		this.setUnlocalizedName("superblocks.factory_block_orange_four");
		
	}
}
