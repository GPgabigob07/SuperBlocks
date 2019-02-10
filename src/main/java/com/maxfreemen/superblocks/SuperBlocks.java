package com.maxfreemen.superblocks;

import com.maxfreemen.superblocks.common.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "superblocks", name = "Super Blocks", version = "alfa-0.1", dependencies = "required-after:forge@[14.23.5.2768,)", useMetadata = true, acceptedMinecraftVersions = "[1.12.2]", modLanguage = "java", updateJSON = "https://raw.githubusercontent.com/MaxFreemen/SuperBlocks/master/versions.json")
public class SuperBlocks {

	@SidedProxy(clientSide = "com.maxfreemen.superblocks.client.ClientProxy", serverSide = "com.maxfreemen.superblocks.common.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
	    proxy.preInit(event);
	    
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		
	    proxy.init(event);
	    
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	    proxy.postInit(event);
	    
	}
	
}