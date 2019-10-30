package com.github.SeraSherry.treemagic.item;

import net.minecraft.item.Item;
import com.github.SeraSherry.treemagic.creativetab.CreativeTabsLoader;

public class ItemSparkleSeed extends Item{
    public ItemSparkleSeed()
    {
        super();
        this.setUnlocalizedName("sparkleSeed");
        this.setCreativeTab(CreativeTabsLoader.tabTreeMagic);
    }
}
