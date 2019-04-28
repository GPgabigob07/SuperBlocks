package com.maxfreemen.extendedblocks.client;

import com.maxfreemen.extendedblocks.SuperBlocks;
import com.maxfreemen.extendedblocks.client.gui.GuiHandler;
import com.maxfreemen.extendedblocks.common.CommonProxy;
import com.maxfreemen.extendedblocks.init.BlocksInit;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;


public class ClientProxy extends CommonProxy {
	
	@Override
    public void preInit(FMLPreInitializationEvent event) {
		
        super.preInit(event);
        
    }

    @Override
    public void init(FMLInitializationEvent event) {
    	
        super.init(event);
        
        NetworkRegistry.INSTANCE.registerGuiHandler(SuperBlocks.instance, new GuiHandler());
        
        BlocksInit.registerBlockRenders();
        

    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {
    	
        super.postInit(event);
        
    }

    


}