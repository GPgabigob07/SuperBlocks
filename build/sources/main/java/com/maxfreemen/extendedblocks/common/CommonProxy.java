package com.maxfreemen.extendedblocks.common;

import com.maxfreemen.extendedblocks.init.BlocksInit;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


public class CommonProxy {
	
	public void preInit(FMLPreInitializationEvent event) {
		
		BlocksInit.registerBlocks();

    }
	
    public void init(FMLInitializationEvent event) {
	
    }
    

    public void postInit(FMLPostInitializationEvent event) {

    }
    

    

}