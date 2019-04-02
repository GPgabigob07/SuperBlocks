package com.maxfreemen.extendedblocks.common.blocks;

import com.maxfreemen.extendedblocks.init.TabsInit;
import net.minecraft.block.BlockBookshelf;

public class SpruceShelf extends BlockBookshelf {
	

	public SpruceShelf() {
		
		
		
		this.setCreativeTab(TabsInit.MEDIEVAL_BLOCKS);
		this.setHardness(2.0F); //�������� ������ ��� � ����������� ������
		this.setHarvestLevel("pickaxe", 2); //������ �������� ������
		this.setRegistryName("spruce_shelf");
		this.setResistance(15.0F); //������������������ ��� � �����
		this.setUnlocalizedName("extendedblocks.spruce_shelf");
	
		
	}

    
    
}
