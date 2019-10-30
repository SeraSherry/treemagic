package com.github.SeraSherry.treemagic.item;

import net.minecraft.item.Item;
import com.github.SeraSherry.treemagic.creativetab.CreativeTabsLoader;

public class ItemSeaSeed extends Item{
    public ItemSeaSeed()
    {
        super();
        this.setUnlocalizedName("seaSeed");
        this.setCreativeTab(CreativeTabsLoader.tabTreeMagic);
    }
}
