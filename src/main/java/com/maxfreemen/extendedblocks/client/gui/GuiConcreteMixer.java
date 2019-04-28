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
        mc.getTextureManager().bindTexture(TEXTURES);
        drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
    }
   
    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY)
    {
        this.fontRenderer.drawString("This is cool machine for mix concrete!", 6, 6, 4210752);
    }
}