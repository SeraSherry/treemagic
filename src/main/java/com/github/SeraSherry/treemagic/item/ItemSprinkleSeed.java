package com.github.SeraSherry.treemagic.item;

import net.minecraft.item.Item;
import com.github.SeraSherry.treemagic.creativetab.CreativeTabsLoader;

public class ItemSprinkleSeed extends Item
{
    public ItemSprinkleSeed()
    {
        super();
        this.setUnlocalizedName("sprinkleSeed");
        this.setCreativeTab(CreativeTabsLoader.tabTreeMagic);
    }
}
