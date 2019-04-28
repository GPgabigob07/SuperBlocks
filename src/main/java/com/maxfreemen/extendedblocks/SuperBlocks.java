package com.maxfreemen.extendedblocks;

import com.maxfreemen.extendedblocks.common.CommonProxy;
import com.maxfreemen.extendedblocks.tileentity.TileEntityConcreteMixer;
import com.maxfreemen.extendedblocks.util.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = "extendedblocks", name = "Extended Blocks", version = "alfa-0.4", dependencies = "required-after:forge@[14.23.5.2768,)", useMetadata = true, acceptedMinecraftVersions = "[1.12.2]", modLanguage = "java", updateJSON = "https://raw.githubusercontent.com/MaxFreemen/SuperBlocks/master/versions.json")
public class SuperBlocks {
	
	 
    @Instance
    public static SuperBlocks instance;
    {
    	GameRegistry.registerTileEntity(TileEntityConcreteMixer.class, new ResourceLocation(Reference.MOD_ID + ":concrete_mixer"));
    }

	@SidedProxy(clientSide = "com.maxfreemen.extendedblocks.client.ClientProxy", serverSide = "com.maxfreemen.extendedblocks.common.CommonProxy")
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