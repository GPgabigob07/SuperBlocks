package com.maxfreemen.superblocks.init;

import com.maxfreemen.superblocks.common.blocks.BlockFactoryOrangeOne;
import com.maxfreemen.superblocks.common.blocks.BlockFactoryOrangeTwo;
import com.maxfreemen.superblocks.common.blocks.BlockLaboratory;
import com.maxfreemen.superblocks.common.blocks.BlockLaboratoryDarkClean;
import com.maxfreemen.superblocks.common.blocks.BlockLaboratoryDarkPipe;
import com.maxfreemen.superblocks.common.blocks.BlockLaboratoryHazardDark;
import com.maxfreemen.superblocks.common.blocks.BlockLaboratoryHazardLight;
import com.maxfreemen.superblocks.common.blocks.BlockLaboratoryLight;
import com.maxfreemen.superblocks.common.blocks.BlockLaboratoryLightPipe;
import com.maxfreemen.superblocks.common.blocks.BlockLaboratoryTop;
import com.maxfreemen.superblocks.common.blocks.BlockLamp;
import com.maxfreemen.superblocks.common.blocks.LaboratoryBlockVentA;
import com.maxfreemen.superblocks.common.blocks.LaboratoryBlockVentB;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlocksInit {
	
	public static final Block LAMP = new BlockLamp();
	public static final Block LABORATORY_BLOCK = new BlockLaboratory();
	public static final Block LABORATORY_BLOCK_DARK_CLEAN = new BlockLaboratoryDarkClean();
	public static final Block LABORATORY_BLOCK_DARK_PIPE = new BlockLaboratoryDarkPipe();
	public static final Block LABORATORY_BLOCK_TOP = new BlockLaboratoryTop();
	public static final Block LABORATORY_BLOCK_LIGHT =  new BlockLaboratoryLight();
	public static final Block LABORATORY_BLOCK_LIGHT_PIPE =  new BlockLaboratoryLightPipe();
	public static final Block LABORATORY_BLOCK_HAZARD_LIGHT =  new BlockLaboratoryHazardLight();
	public static final Block LABORATORY_BLOCK_HAZARD_DARK =  new BlockLaboratoryHazardDark();
	public static final Block LABORATORY_BLOCK_VENT_A =  new LaboratoryBlockVentA();
	public static final Block LABORATORY_BLOCK_VENT_B =  new LaboratoryBlockVentB();
	public static final Block FACTORY_BLOCK_ORANGE_ONE =  new BlockFactoryOrangeOne();
	public static final Block FACTORY_BLOCK_ORANGE_TWO =  new BlockFactoryOrangeTwo();
	
	
	public static void registerBlocks() {
		
        setRegister(LAMP);
        setRegister(LABORATORY_BLOCK);
        setRegister(LABORATORY_BLOCK_DARK_CLEAN);
        setRegister(LABORATORY_BLOCK_DARK_PIPE);
        setRegister(LABORATORY_BLOCK_TOP);
        setRegister(LABORATORY_BLOCK_LIGHT);
        setRegister(LABORATORY_BLOCK_LIGHT_PIPE);
        setRegister(LABORATORY_BLOCK_HAZARD_LIGHT);
        setRegister(LABORATORY_BLOCK_HAZARD_DARK);
        setRegister(LABORATORY_BLOCK_VENT_A);
        setRegister(LABORATORY_BLOCK_VENT_B);
        setRegister(FACTORY_BLOCK_ORANGE_ONE);
        setRegister(FACTORY_BLOCK_ORANGE_TWO);
        
    }

    @SideOnly(Side.CLIENT)
    public static void registerBlockRenders() {
    	
        setRender(LAMP);
        setRender(LABORATORY_BLOCK);
        setRender(LABORATORY_BLOCK_DARK_CLEAN);
        setRender(LABORATORY_BLOCK_DARK_PIPE);
        setRender(LABORATORY_BLOCK_TOP);
        setRender(LABORATORY_BLOCK_LIGHT);
        setRender(LABORATORY_BLOCK_LIGHT_PIPE);
        setRender(LABORATORY_BLOCK_HAZARD_LIGHT);
        setRender(LABORATORY_BLOCK_HAZARD_DARK);
        setRender(LABORATORY_BLOCK_VENT_A);
        setRender(LABORATORY_BLOCK_VENT_B);
        setRender(FACTORY_BLOCK_ORANGE_ONE);
        setRender(FACTORY_BLOCK_ORANGE_TWO);
        
    }

    private static void setRegister(Block block) {
    	
        ForgeRegistries.BLOCKS.register(block);
        ForgeRegistries.ITEMS.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
        
    }

    @SideOnly(Side.CLIENT)
    private static void setRender(Block block) {
    	
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));

    }

}