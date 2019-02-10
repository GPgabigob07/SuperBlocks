package com.maxfreemen.superblocks.common.blocks;

import com.maxfreemen.superblocks.init.TabsInit;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockLaboratoryHazardDark extends Block {
	
public BlockLaboratoryHazardDark() {
		
		super(Material.IRON);
		
		this.setCreativeTab(TabsInit.LABORATORY_BLOCKS);
		this.setHardness(2.0F); //�������� ������ ��� � ����������� ������
		this.setHarvestLevel("pickaxe", 2); //������ �������� ������
		this.setRegistryName("laboratory_block_hazard_dark");
		this.setResistance(15.0F); //������������������ ��� � �����
		this.setUnlocalizedName("superblocks.laboratory_block_hazard_dark");
}
}
