package com.maxfreemen.extendedblocks.client;

import com.maxfreemen.extendedblocks.common.CommonProxy;
import com.maxfreemen.extendedblocks.init.BlocksInit;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {
	
	@Override
    public void preInit(FMLPreInitializationEvent event) {
		
        super.preInit(event);
        
    }

    @Override
    public void init(FMLInitializationEvent event) {
    	
        super.init(event);
        
        BlocksInit.registerBlockRenders();
        
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {
    	
        super.postInit(event);
        
    }

}