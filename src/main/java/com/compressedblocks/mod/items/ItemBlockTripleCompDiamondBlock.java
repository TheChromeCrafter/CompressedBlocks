package com.compressedblocks.mod.items;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemBlockTripleCompDiamondBlock extends ItemBlock
{
    public ItemBlockTripleCompDiamondBlock(Block p_i45328_1_) {
        super(p_i45328_1_);
    }


    @Override
    public void addInformation(ItemStack p_77624_1_, EntityPlayer p_77624_2_, List lines, boolean p_77624_4_) {
        lines.add("729 Diamond Blocks");
        lines.add("Usable For Beacons");
    }
}
