package com.maxfreemen.extendedblocks.client.gui;

import com.maxfreemen.extendedblocks.tileentity.TileEntityConcreteMixer;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.util.ResourceLocation;

public class GuiConcreteMixer extends GuiContainer
{
    public static final int WIDTH = 180;
    public static final int HEIGHT = 166;
   
   
   // private final TileEntityConcreteMixer te;
   
    private static final ResourceLocation TEXTURES = new ResourceLocation("extendedblocks" + ":textures/gui/concrete_mixer.png");
    //private int ix = 0;
    //private int iy = 0;
   
    public GuiConcreteMixer(TileEntityConcreteMixer tileEntity, ContainerConcreteMixer container) {
        super(container);
 
        xSize = WIDTH;
        ySize = HEIGHT;
       
        //this.te = tileEntity;
    }
   
    @Override
    public void initGui()
    {
        // Here add you all sorts of buttons
    }
   
    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) 
    { 
    this.drawDefaultBackground(); 
    mc.renderEngine.bindTexture(TEXTURES); 
    int x = (this.width - this.xSize) / 2; 
    int y = (this.height - this.xSize) / 2; 
    drawTexturedModalRect(x, y, 0, 0, xSize, ySize); 
    } 
   
    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY)
    {
        this.fontRenderer.drawString("Cement mixer", 6, 6, 4210752);
    }
}