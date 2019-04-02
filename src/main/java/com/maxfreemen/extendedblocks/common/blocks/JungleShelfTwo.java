package com.maxfreemen.extendedblocks.common.blocks;

import com.maxfreemen.extendedblocks.init.TabsInit;
import net.minecraft.block.BlockBookshelf;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;


public class JungleShelfTwo extends BlockBookshelf {
	
	public JungleShelfTwo() {
		
		
		this.setCreativeTab(TabsInit.MEDIEVAL_BLOCKS);
		this.setHardness(2.0F); //�������� ������ ��� � ����������� ������
		this.setHarvestLevel("pickaxe", 2); //������ �������� ������
		this.setRegistryName("jungle_shelf_two");
		this.setResistance(15.0F); //������������������ ��� � �����
		this.setUnlocalizedName("extendedblocks.jungle_shelf_two");
		
		
	}
	
	@Override
	public float getEnchantPowerBonus(World world, BlockPos pos) {
		return 1;
	}

    
    
}
