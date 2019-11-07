package com.github.SeraSherry.treemagic.block.tree;

import net.minecraft.block.BlockLog;
import com.github.SeraSherry.treemagic.creativetab.CreativeTabsLoader;

public class BlockSeaTreeLog extends BlockLog{
    public BlockSeaTreeLog()
    {
        super();
        this.setUnlocalizedName("seaTreeLog");
        this.setCreativeTab(CreativeTabsLoader.tabTreeMagic);
    }
}
