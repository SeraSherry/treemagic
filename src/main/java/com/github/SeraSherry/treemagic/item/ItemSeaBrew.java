package com.github.SeraSherry.treemagic.item;

import net.minecraft.item.Item;
import com.github.SeraSherry.treemagic.creativetab.CreativeTabsLoader;

public class ItemSeaBrew extends Item{
    public ItemSeaBrew()
    {
        super();
        this.setUnlocalizedName("seaBrew");
        this.setCreativeTab(CreativeTabsLoader.tabTreeMagic);
    }
}
