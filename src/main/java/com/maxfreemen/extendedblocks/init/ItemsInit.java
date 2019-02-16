package com.maxfreemen.extendedblocks.init;

import com.maxfreemen.extendedblocks.common.items.ItemFactorySword;
import com.maxfreemen.extendedblocks.common.items.ItemTestSword;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Items;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemsInit {
	
	public static ToolMaterial TEST_TOOL_MATERIAL = EnumHelper.addToolMaterial("extendedblocks:test_tool_material", 3, 255, 25.0F, 45.0F, 8).setRepairItem(new ItemStack(Items.FLINT));;
	public static EnumRarity COMMON = EnumHelper.addRarity("rarity_common", TextFormatting.GOLD, "");
	
	public static final ItemSword TEST_SWORD = new ItemTestSword();
	public static final ItemSword FACTORY_SWORD = new ItemFactorySword();

	public static void registerItems() {
		
        setRegister(TEST_SWORD);
        setRegister(FACTORY_SWORD);
        
    }

    @SideOnly(Side.CLIENT)
    public static void registerItemRenders() {
    	
        setRender(TEST_SWORD);
        setRender(FACTORY_SWORD);
        
    }

    private static void setRegister(Item item) {
    	
        ForgeRegistries.ITEMS.register(item);
        
    }

    @SideOnly(Side.CLIENT)
    private static void setRender(Item item) {
    	
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));

    }
	
}