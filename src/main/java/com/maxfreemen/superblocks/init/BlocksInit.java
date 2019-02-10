package com.maxfreemen.superblocks.init;

import com.maxfreemen.superblocks.common.blocks.BlockDarkComputer;
import com.maxfreemen.superblocks.common.blocks.BlockLaboratory;
import com.maxfreemen.superblocks.common.blocks.BlockLamp;

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
	public static final Block DARK_COMPUTER = new BlockDarkComputer();
	
	public static void registerBlocks() {
		
        setRegister(LAMP);
        setRegister(LABORATORY_BLOCK);
        setRegister(DARK_COMPUTER);
        
    }

    @SideOnly(Side.CLIENT)
    public static void registerBlockRenders() {
    	
        setRender(LAMP);
        setRender(LABORATORY_BLOCK);
        setRender(DARK_COMPUTER);
        
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