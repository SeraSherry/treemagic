package com.github.SeraSherry.treemagic.item;

import net.minecraft.item.Item;
import com.github.SeraSherry.treemagic.creativetab.CreativeTabsLoader;

public class ItemTeaOil extends Item
{
    public ItemTeaOil()
    {
        super();
        this.setUnlocalizedName("teaOil");
        this.setCreativeTab(CreativeTabsLoader.tabTreeMagic);
    }
}
