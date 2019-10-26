package com.github.SeraSherry.treemagic.item;

import net.minecraft.item.Item;
import com.github.SeraSherry.treemagic.creativetab.CreativeTabsLoader;

public class ItemTeaTree extends Item
{
    public ItemTeaTree()
    {
        super();
        this.setUnlocalizedName("teaTree");
        this.setCreativeTab(CreativeTabsLoader.tabTreeMagic);
    }
}
