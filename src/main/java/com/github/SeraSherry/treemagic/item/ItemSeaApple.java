package com.github.SeraSherry.treemagic.item;

import net.minecraft.item.Item;
import com.github.SeraSherry.treemagic.creativetab.CreativeTabsLoader;
public class ItemSeaApple extends Item{
    public ItemSeaApple()
    {
        super();
        this.setUnlocalizedName("seaApple");
        this.setCreativeTab(CreativeTabsLoader.tabTreeMagic);
    }
}
