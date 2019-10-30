package com.github.SeraSherry.treemagic.item;

import net.minecraft.item.Item;
import com.github.SeraSherry.treemagic.creativetab.CreativeTabsLoader;

public class ItemSprinkleCandy extends Item{
    public ItemSprinkleCandy()
    {
        super();
        this.setUnlocalizedName("sprinkleCandy");
        this.setCreativeTab(CreativeTabsLoader.tabTreeMagic);

    }
}
