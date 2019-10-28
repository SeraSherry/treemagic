package com.github.SeraSherry.treemagic.item;

import net.minecraft.item.Item;
import com.github.SeraSherry.treemagic.creativetab.CreativeTabsLoader;

public class ItemCandyBar extends Item{
    public ItemCandyBar()
    {
        super();
        this.setUnlocalizedName("candyBar");
        this.setCreativeTab(CreativeTabsLoader.tabTreeMagic);
    }
}
