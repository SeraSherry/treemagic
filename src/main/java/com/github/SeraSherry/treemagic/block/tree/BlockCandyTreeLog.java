package com.github.SeraSherry.treemagic.block.tree;

import net.minecraft.block.BlockLog;
import com.github.SeraSherry.treemagic.creativetab.CreativeTabsLoader;

public class BlockCandyTreeLog extends BlockLog{
    public BlockCandyTreeLog()
    {
        super();
        this.setUnlocalizedName("candyTreeLog");
        this.setCreativeTab(CreativeTabsLoader.tabTreeMagic);
        this.setHardness(1.0F);
    }
}
