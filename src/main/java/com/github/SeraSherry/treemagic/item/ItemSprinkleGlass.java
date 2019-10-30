package com.github.SeraSherry.treemagic.item;

import net.minecraft.item.Item;
import com.github.SeraSherry.treemagic.creativetab.CreativeTabsLoader;

public class ItemSprinkleGlass extends Item{
    public ItemSprinkleGlass()
    {
        super();
        this.setUnlocalizedName("sprinkleGlass");
        this.setCreativeTab(CreativeTabsLoader.tabTreeMagic);
    }
}
