package com.github.SeraSherry.treemagic.item;

import net.minecraft.item.Item;
import com.github.SeraSherry.treemagic.creativetab.CreativeTabsLoader;

public class ItemHalloweenPumpkinPie extends Item{
    public ItemHalloweenPumpkinPie()
    {
        super();
        this.setUnlocalizedName("halloweenPumpkinPie");
        this.setCreativeTab(CreativeTabsLoader.tabTreeMagic);
    }
}
