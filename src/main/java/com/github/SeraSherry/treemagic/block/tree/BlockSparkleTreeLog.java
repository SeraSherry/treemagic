package com.github.SeraSherry.treemagic.block.tree;

import net.minecraft.block.BlockLog;
import com.github.SeraSherry.treemagic.creativetab.CreativeTabsLoader;

public class BlockSparkleTreeLog extends BlockLog{
    public BlockSparkleTreeLog()
    {
        super();
        this.setUnlocalizedName("sparkleTreeLog");
        this.setCreativeTab(CreativeTabsLoader.tabTreeMagic);
    }
}
