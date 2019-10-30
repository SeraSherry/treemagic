package com.github.SeraSherry.treemagic.item;

import net.minecraft.item.Item;
import com.github.SeraSherry.treemagic.creativetab.CreativeTabsLoader;

public class ItemGrape extends Item{
    public ItemGrape()
    {
        super();
        this.setUnlocalizedName("grape");
        this.setCreativeTab(CreativeTabsLoader.tabTreeMagic);
    }
}
