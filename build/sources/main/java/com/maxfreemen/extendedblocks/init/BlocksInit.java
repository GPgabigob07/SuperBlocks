package com.maxfreemen.extendedblocks.init;

import com.maxfreemen.extendedblocks.common.blocks.BlockBench;
import com.maxfreemen.extendedblocks.common.blocks.BlockCementmixer;
import com.maxfreemen.extendedblocks.common.blocks.BlockFactoryLampOne;
import com.maxfreemen.extendedblocks.common.blocks.BlockFactoryLampTwo;
import com.maxfreemen.extendedblocks.common.blocks.BlockFactoryOne;
import com.maxfreemen.extendedblocks.common.blocks.BlockFactoryOrangeFour;
import com.maxfreemen.extendedblocks.common.blocks.BlockFactoryOrangeLamp;
import com.maxfreemen.extendedblocks.common.blocks.BlockFactoryOrangeOne;
import com.maxfreemen.extendedblocks.common.blocks.BlockFactoryOrangeThree;
import com.maxfreemen.extendedblocks.common.blocks.BlockFactoryOrangeTwo;
import com.maxfreemen.extendedblocks.common.blocks.BlockFactoryThree;
import com.maxfreemen.extendedblocks.common.blocks.BlockFactoryTwo;
import com.maxfreemen.extendedblocks.common.blocks.BlockFactoryVent;
import com.maxfreemen.extendedblocks.common.blocks.BlockFactoryVentWall;
import com.maxfreemen.extendedblocks.common.blocks.BlockLaboratory;
import com.maxfreemen.extendedblocks.common.blocks.BlockLaboratoryDarkClean;
import com.maxfreemen.extendedblocks.common.blocks.BlockLaboratoryDarkPipe;
import com.maxfreemen.extendedblocks.common.blocks.BlockLaboratoryHazardDark;
import com.maxfreemen.extendedblocks.common.blocks.BlockLaboratoryHazardLight;
import com.maxfreemen.extendedblocks.common.blocks.BlockLaboratoryLight;
import com.maxfreemen.extendedblocks.common.blocks.BlockLaboratoryLightPipe;
import com.maxfreemen.extendedblocks.common.blocks.BlockLaboratoryTop;
import com.maxfreemen.extendedblocks.common.blocks.BlockLamp;
import com.maxfreemen.extendedblocks.common.blocks.BlockMilitaryBarricade;
import com.maxfreemen.extendedblocks.common.blocks.BlockMilitaryBench;
import com.maxfreemen.extendedblocks.common.blocks.BlockMilitaryBox;
import com.maxfreemen.extendedblocks.common.blocks.BlockMilitaryCanvasGreen;
import com.maxfreemen.extendedblocks.common.blocks.BlockMilitaryCanvasYellow;
import com.maxfreemen.extendedblocks.common.blocks.BlockMilitaryGlass;
import com.maxfreemen.extendedblocks.common.blocks.BlockMilitaryWallOne;
import com.maxfreemen.extendedblocks.common.blocks.BlockRoadBasic;
import com.maxfreemen.extendedblocks.common.blocks.BlockRoadWhiteFour;
import com.maxfreemen.extendedblocks.common.blocks.BlockRoadWhiteOne;
import com.maxfreemen.extendedblocks.common.blocks.BlockRoadWhiteThree;
import com.maxfreemen.extendedblocks.common.blocks.BlockRoadWhiteTwo;
import com.maxfreemen.extendedblocks.common.blocks.BlockRoadYellowFour;
import com.maxfreemen.extendedblocks.common.blocks.BlockRoadYellowOne;
import com.maxfreemen.extendedblocks.common.blocks.BlockRoadYellowThree;
import com.maxfreemen.extendedblocks.common.blocks.BlockRoadYellowTwo;
import com.maxfreemen.extendedblocks.common.blocks.BlockSandBag;
import com.maxfreemen.extendedblocks.common.blocks.BlockSpikeOne;
import com.maxfreemen.extendedblocks.common.blocks.BlockSpikeThree;
import com.maxfreemen.extendedblocks.common.blocks.BlockSpikeTwo;
import com.maxfreemen.extendedblocks.common.blocks.BlockStonecutter;
import com.maxfreemen.extendedblocks.common.blocks.LaboratoryBlockVentA;
import com.maxfreemen.extendedblocks.common.blocks.LaboratoryBlockVentB;

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
	public static final Block FACTORY_BLOCK_ORANGE_THREE =  new BlockFactoryOrangeThree();
	public static final Block FACTORY_BLOCK_ONE =  new BlockFactoryOne();
	public static final Block FACTORY_BLOCK_TWO =  new BlockFactoryTwo();
	public static final Block FACTORY_BLOCK_THREE =  new BlockFactoryThree();
	public static final Block FACTORY_BLOCK_VENT =  new BlockFactoryVent();	
	public static final Block FACTORY_BLOCK_ORANGE_LAMP =  new BlockFactoryOrangeLamp();	
	public static final Block FACTORY_BLOCK_LAMP_ONE =  new BlockFactoryLampOne();	
	public static final Block FACTORY_BLOCK_LAMP_TWO =  new BlockFactoryLampTwo();	
	public static final Block FACTORY_BLOCK_ORANGE_FOUR =  new BlockFactoryOrangeFour();
	public static final Block FACTORY_BLOCK_VENT_WALL =  new BlockFactoryVentWall();
	public static final Block ROAD_YELLOW_ONE = new BlockRoadYellowOne();
	public static final Block ROAD_YELLOW_TWO = new BlockRoadYellowTwo();
	public static final Block ROAD_YELLOW_THREE = new BlockRoadYellowThree();
	public static final Block ROAD_YELLOW_FOUR = new BlockRoadYellowFour();
	public static final Block ROAD_BLOCK_BASIC = new BlockRoadBasic();
	public static final Block ROAD_WHITE_ONE = new BlockRoadWhiteOne();
	public static final Block ROAD_WHITE_TWO = new BlockRoadWhiteTwo();
	public static final Block ROAD_WHITE_THREE = new BlockRoadWhiteThree();
	public static final Block ROAD_WHITE_FOUR = new BlockRoadWhiteFour();
	public static final Block CEMENT_MIXER = new BlockCementmixer();
	public static final Block BENCH_BLOCK = new BlockBench();
	public static final Block STONECUTTER = new BlockStonecutter();
	public static final Block BENCH_MILITARY_BLOCK = new BlockMilitaryBench();
	public static final Block SPIKE_ONE_BLOCK = new BlockSpikeOne();
	public static final Block SPIKE_TWO_BLOCK = new BlockSpikeTwo();
	public static final Block SPIKE_THREE_BLOCK = new BlockSpikeThree();
	public static final Block SAND_BAG = new BlockSandBag();
	public static final Block MILITARY_BOX = new BlockMilitaryBox();
	public static final Block MILITARY_BARRICADE = new BlockMilitaryBarricade();
	public static final Block CANVAS_GREEN = new BlockMilitaryCanvasGreen();
	public static final Block CANVAS_YELLOW = new BlockMilitaryCanvasYellow();
	public static final Block MILITARY_GLASS = new BlockMilitaryGlass();
	public static final Block MILITARY_WALL_ONE = new BlockMilitaryWallOne();


	
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
        setRegister(FACTORY_BLOCK_ORANGE_THREE);
        setRegister(FACTORY_BLOCK_ONE);
        setRegister(FACTORY_BLOCK_TWO);
        setRegister(FACTORY_BLOCK_THREE);
        setRegister(FACTORY_BLOCK_VENT);
        setRegister(FACTORY_BLOCK_ORANGE_LAMP);
        setRegister(FACTORY_BLOCK_LAMP_ONE);
        setRegister(FACTORY_BLOCK_LAMP_TWO);
        setRegister(FACTORY_BLOCK_ORANGE_FOUR);
        setRegister(FACTORY_BLOCK_VENT_WALL);
        setRegister(ROAD_YELLOW_ONE);
        setRegister(ROAD_YELLOW_TWO);
        setRegister(ROAD_YELLOW_THREE);
        setRegister(ROAD_YELLOW_FOUR);
        setRegister(ROAD_BLOCK_BASIC);
        setRegister(ROAD_WHITE_ONE);
        setRegister(ROAD_WHITE_TWO);
        setRegister(ROAD_WHITE_THREE);
        setRegister(ROAD_WHITE_FOUR);
        setRegister(CEMENT_MIXER);
        setRegister(BENCH_BLOCK);
        setRegister(STONECUTTER);
        setRegister(BENCH_MILITARY_BLOCK);
        setRegister(SPIKE_ONE_BLOCK);
        setRegister(SPIKE_TWO_BLOCK);
        setRegister(SPIKE_THREE_BLOCK);
        setRegister(SAND_BAG);
        setRegister(MILITARY_BOX);
        setRegister(MILITARY_BARRICADE);
        setRegister(CANVAS_GREEN);
        setRegister(CANVAS_YELLOW);
        setRegister(MILITARY_GLASS);
        setRegister(MILITARY_WALL_ONE);
        
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
        setRender(FACTORY_BLOCK_ORANGE_THREE);
        setRender(FACTORY_BLOCK_ONE);
        setRender(FACTORY_BLOCK_TWO);
        setRender(FACTORY_BLOCK_THREE);
        setRender(FACTORY_BLOCK_VENT);
        setRender(FACTORY_BLOCK_ORANGE_LAMP);
        setRender(FACTORY_BLOCK_LAMP_ONE);
        setRender(FACTORY_BLOCK_LAMP_TWO);
        setRender(FACTORY_BLOCK_ORANGE_FOUR);
        setRender(FACTORY_BLOCK_VENT_WALL);
        setRender(ROAD_YELLOW_ONE);
        setRender(ROAD_YELLOW_TWO);
        setRender(ROAD_YELLOW_THREE);
        setRender(ROAD_YELLOW_FOUR);
        setRender(ROAD_BLOCK_BASIC);
        setRender(ROAD_WHITE_ONE);
        setRender(ROAD_WHITE_TWO);
        setRender(ROAD_WHITE_THREE);
        setRender(ROAD_WHITE_FOUR);
        setRender(CEMENT_MIXER);
        setRender(BENCH_BLOCK);
        setRender(STONECUTTER);
        setRender(BENCH_MILITARY_BLOCK);
        setRender(SPIKE_ONE_BLOCK);
        setRender(SPIKE_TWO_BLOCK);
        setRender(SPIKE_THREE_BLOCK);
        setRender(SAND_BAG);
        setRender(MILITARY_BOX);
        setRender(MILITARY_BARRICADE);
        setRender(CANVAS_GREEN);
        setRender(CANVAS_YELLOW);
        setRender(MILITARY_GLASS);
        setRender(MILITARY_WALL_ONE);
        
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