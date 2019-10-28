package com.github.SeraSherry.treemagic.item;

import net.minecraft.item.Item;
import com.github.SeraSherry.treemagic.creativetab.CreativeTabsLoader;

public class ItemCandySyrup extends Item
{
    public ItemCandySyrup()
    {
        super();
        this.setUnlocalizedName("candySyrup");
        this.setCreativeTab(CreativeTabsLoader.tabTreeMagic);
    }
}
