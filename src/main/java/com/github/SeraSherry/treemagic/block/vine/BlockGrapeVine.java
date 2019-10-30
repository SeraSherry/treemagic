package com.github.SeraSherry.treemagic.block.vine;

import com.github.SeraSherry.treemagic.creativetab.CreativeTabsLoader;
import net.minecraft.block.BlockVine;

public class BlockGrapeVine extends BlockVine{
    public BlockGrapeVine()
    {
        super();
        this.setUnlocalizedName("grapeVine");
        this.setCreativeTab(CreativeTabsLoader.tabTreeMagic);
        this.setHardness(0.5F);
    }
}
