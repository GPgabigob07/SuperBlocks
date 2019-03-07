package com.maxfreemen.extendedblocks.common.blocks;

import com.maxfreemen.extendedblocks.init.TabsInit;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockBricksOvergrown extends Block {
	
	public BlockBricksOvergrown() {
		
		super(Material.ROCK);
		
		this.setCreativeTab(TabsInit.FACTORY_BLOCKS);
		this.setHardness(2.0F); //�������� ������ ��� � ����������� ������
		this.setHarvestLevel("pickaxe", 2); //������ �������� ������
		this.setRegistryName("bricks_overgrown");
		this.setResistance(15.0F); //������������������ ��� � �����
		this.setUnlocalizedName("extendedblocks.bricks_overgrown");
		
	}
}
