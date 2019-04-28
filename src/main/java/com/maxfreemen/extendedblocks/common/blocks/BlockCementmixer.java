package com.maxfreemen.extendedblocks.common.blocks;

import com.maxfreemen.extendedblocks.SuperBlocks;
import com.maxfreemen.extendedblocks.init.TabsInit;
import com.maxfreemen.extendedblocks.tileentity.TileEntityConcreteMixer;

import net.minecraft.block.Block;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockCementmixer extends Block implements ITileEntityProvider {
	
	public static final PropertyDirection FACING = BlockHorizontal.FACING;

	public BlockCementmixer() {
		
		super(Material.ROCK);
		
		this.setCreativeTab(TabsInit.CRAFTING_BLOCKS);
		this.setHardness(2.0F);
		this.setHarvestLevel("pickaxe", 2);
		this.setRegistryName("cement_mixer");
		this.setResistance(20.0F);
		this.setUnlocalizedName("extendedblocks.cement_mixer");
		this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
		
	}
	
	@Override
    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state)
    {
        return false;
    }
	
	protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] {FACING});
    }

    public IBlockState withRotation(IBlockState state, Rotation rot)
    {
        return state.withProperty(FACING, rot.rotate((EnumFacing)state.getValue(FACING)));
    }

    public IBlockState withMirror(IBlockState state, Mirror mirrorIn)
    {
        return state.withRotation(mirrorIn.toRotation((EnumFacing)state.getValue(FACING)));
    }

    public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
    {
        return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
    }

    public int getMetaFromState(IBlockState state)
    {
        int i = 0;
        i = i | ((EnumFacing)state.getValue(FACING)).getHorizontalIndex();
        return i;
    }
    
    public IBlockState getStateFromMeta(int meta)
    {
        return this.getDefaultState().withProperty(FACING, EnumFacing.getHorizontal(meta));
    }
    @Override
    public TileEntity createTileEntity(World world, IBlockState state)
    {
        return new TileEntityConcreteMixer();
    }
 
    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileEntityConcreteMixer();
    }
 
    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
        playerIn.openGui(SuperBlocks.instance, 2, worldIn, pos.getX(), pos.getY(), pos.getZ());
        return true;
    }
    }


