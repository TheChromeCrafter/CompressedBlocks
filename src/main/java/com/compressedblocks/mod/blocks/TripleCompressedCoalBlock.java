package com.compressedblocks.mod.blocks;

import com.compressedblocks.mod.creativetab.CreativeTabCompressedBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.IBlockAccess;

public class TripleCompressedCoalBlock extends BlockCB
{
    public TripleCompressedCoalBlock()
    {
        super();
        this.setBlockName("TripleCompCoalBlock");
        this.setStepSound(soundTypeMetal);
        this.setBlockTextureName("TripleCompCoalBlock");
        this.setHardness(30.0F);
        this.setResistance(100.0f);
        this.setHarvestLevel("pickaxe", 3);

    }
    @Override
    public boolean isBeaconBase(IBlockAccess worldObj, int x, int y, int z, int beaconX, int beaconY, int beaconZ) {
        return true;
    }
}


