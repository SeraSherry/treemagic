package com.github.SeraSherry.treemagic.item;

import net.minecraft.item.Item;
import com.github.SeraSherry.treemagic.creativetab.CreativeTabsLoader;

public class ItemTeaSeed extends Item
{
    public ItemTeaSeed()
    {
        super();
        this.setUnlocalizedName("teaSeed");
        this.setCreativeTab(CreativeTabsLoader.tabTreeMagic);
    }
}
