package com.github.SeraSherry.treemagic.item;

import net.minecraft.item.Item;
import com.github.SeraSherry.treemagic.creativetab.CreativeTabsLoader;

public class ItemSeaSyrup extends Item{
    public ItemSeaSyrup()
    {
        super();
        this.setUnlocalizedName("seaSyrup");
        this.setCreativeTab(CreativeTabsLoader.tabTreeMagic);
    }
}
