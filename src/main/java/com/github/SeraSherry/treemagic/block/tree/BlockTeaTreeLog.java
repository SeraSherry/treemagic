package com.github.SeraSherry.treemagic.block.tree;

import com.github.SeraSherry.treemagic.common.CommonProxy;
import com.github.SeraSherry.treemagic.creativetab.CreativeTabsLoader;
import net.minecraft.block.BlockLog;

public class BlockTeaTreeLog extends BlockLog{
    public BlockTeaTreeLog(){
        super();
        this.setUnlocalizedName("teaTreeLog");
        this.setHardness(1.0F);
        this.setCreativeTab(CreativeTabsLoader.tabTreeMagic);
    }
}
