package com.github.SeraSherry.treemagic.item;

import net.minecraft.item.Item;
import com.github.SeraSherry.treemagic.creativetab.CreativeTabsLoader;

public class ItemCandySeed extends Item{
    public ItemCandySeed()
    {
        super();
        this.setUnlocalizedName("candySeed");
        this.setCreativeTab(CreativeTabsLoader.tabTreeMagic);
    }
}
