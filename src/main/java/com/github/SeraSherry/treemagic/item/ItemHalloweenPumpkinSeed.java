package com.github.SeraSherry.treemagic.item;

import net.minecraft.item.Item;
import com.github.SeraSherry.treemagic.creativetab.CreativeTabsLoader;

public class ItemHalloweenPumpkinSeed extends Item{
    public ItemHalloweenPumpkinSeed()
    {
        super();
        this.setUnlocalizedName("halloweenPumpkinSeed");
        this.setCreativeTab(CreativeTabsLoader.tabTreeMagic);
    }
}
