package com.github.SeraSherry.treemagic.item;

import net.minecraft.item.Item;
import com.github.SeraSherry.treemagic.creativetab.CreativeTabsLoader;
public class ItemSeaFruit extends Item{
    public ItemSeaFruit()
    {
        super();
        this.setUnlocalizedName("seaFruit");
        this.setCreativeTab(CreativeTabsLoader.tabTreeMagic);
    }
}
