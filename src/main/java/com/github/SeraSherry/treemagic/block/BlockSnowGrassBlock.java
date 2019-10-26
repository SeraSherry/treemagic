package com.github.SeraSherry.treemagic.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockSnowGrassBlock extends Block
{
    public BlockSnowGrassBlock()
    {
        super(Material.ground);
        this.setUnlocalizedName("snowGrassBlcok");
        this.setHardness(0.5F);
        this.setStepSound(soundTypeGrass);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
}
