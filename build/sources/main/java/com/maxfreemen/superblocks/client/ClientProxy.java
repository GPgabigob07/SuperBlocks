package com.maxfreemen.superblocks.client;

import com.maxfreemen.superblocks.common.CommonProxy;
import com.maxfreemen.superblocks.init.BlocksInit;
import com.maxfreemen.superblocks.init.ItemsInit;

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
        ItemsInit.registerItemRenders();
        
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {
    	
        super.postInit(event);
        
    }

}