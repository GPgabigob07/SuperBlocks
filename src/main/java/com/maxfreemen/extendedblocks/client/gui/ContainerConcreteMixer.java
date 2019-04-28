package com.maxfreemen.extendedblocks.client.gui;

import com.maxfreemen.extendedblocks.tileentity.TileEntityConcreteMixer;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class ContainerConcreteMixer extends Container {
 
    private TileEntityConcreteMixer te;
 
    public ContainerConcreteMixer(IInventory playerInventory, TileEntityConcreteMixer te) {
        this.te = te;
 
       
        addOwnSlots();
        addPlayerSlots(playerInventory);
    }
 
    private void addOwnSlots()
    {
        IItemHandler itemHandler = this.te.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null);
        int x = 9;
        int y = 6;
 
        addSlotToContainer(new SlotItemHandler(itemHandler, 0, x, y));
        addSlotToContainer(new SlotItemHandler(itemHandler, 1, x + 18, y));
        addSlotToContainer(new OutputSlot(itemHandler, 1, x + 36, y));
    }
 
    private void addPlayerSlots(IInventory playerInventory) {
        // Slots for the main inventory
       
        for (int i = 0; i < 3; ++i)
        {
            for (int j = 0; j < 9; ++j)
            {
                this.addSlotToContainer(new Slot(playerInventory, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }
 
        // Slots for the hot bar
        for (int k = 0; k < 9; ++k)
        {
            this.addSlotToContainer(new Slot(playerInventory, k, 8 + k * 18, 142));
        }
    }
 
    @Override
    public ItemStack transferStackInSlot(EntityPlayer playerIn, int index) {
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = this.inventorySlots.get(index);
 
        if (slot != null && slot.getHasStack()) {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();
 
            if (index < TileEntityConcreteMixer.SIZE) {
                if (!this.mergeItemStack(itemstack1, TileEntityConcreteMixer.SIZE, this.inventorySlots.size(), true)) {
                    return ItemStack.EMPTY;
                }
            } else if (!this.mergeItemStack(itemstack1, 0, TileEntityConcreteMixer.SIZE, false)) {
                return ItemStack.EMPTY;
            }
 
            if (itemstack1.isEmpty()) {
                slot.putStack(ItemStack.EMPTY);
            } else {
                slot.onSlotChanged();
            }
        }
 
        return itemstack;
    }
 
    @Override
    public boolean canInteractWith(EntityPlayer playerIn) {
        return te.canInteractWith(playerIn);
    }
   
    static class OutputSlot extends SlotItemHandler
    {
 
        public OutputSlot(IItemHandler itemHandler, int index, int xPosition, int yPosition)
        {
            super(itemHandler, index, xPosition, yPosition);
        }
 
        public boolean isItemValid(ItemStack stack)
        {
            return false;
        }
    }
}