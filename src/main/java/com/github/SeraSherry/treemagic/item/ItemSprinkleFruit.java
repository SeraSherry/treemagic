package com.github.SeraSherry.treemagic.item;

import net.minecraft.item.Item;
import com.github.SeraSherry.treemagic.creativetab.CreativeTabsLoader;

public class ItemSprinkleFruit extends Item{
    public ItemSprinkleFruit()
    {
        super();
        this.setUnlocalizedName("sprinkleFruit");
        this.setCreativeTab(CreativeTabsLoader.tabTreeMagic);
    }
}
