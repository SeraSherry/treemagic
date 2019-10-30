package com.github.SeraSherry.treemagic.block.vine;

import com.github.SeraSherry.treemagic.creativetab.CreativeTabsLoader;
import net.minecraft.block.BlockVine;

public class BlockSprinkleVine extends BlockVine{
    public BlockSprinkleVine()
    {
        super();
        this.setUnlocalizedName("sprinkleVine");
        this.setCreativeTab(CreativeTabsLoader.tabTreeMagic);
        this.setHardness(0.5F);
    }
}
