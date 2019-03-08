package com.maxfreemen.extendedblocks.common.blocks;

import com.maxfreemen.extendedblocks.init.TabsInit;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockPlanksOakVertical extends Block {
	
	public BlockPlanksOakVertical() {
		
		super(Material.WOOD);
		
		this.setCreativeTab(TabsInit.MEDIEVAL_BLOCKS);
		this.setHardness(2.0F); //�������� ������ ��� � ����������� ������
		this.setHarvestLevel("hand", 0); //������ �������� ������
		this.setRegistryName("planks_oak_vertical");
		this.setResistance(15.0F); //������������������ ��� � �����
		this.setUnlocalizedName("extendedblocks.planks_oak_vertical");
		
	}
}
