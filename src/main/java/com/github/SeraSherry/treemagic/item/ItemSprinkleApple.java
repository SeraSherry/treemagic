package com.github.SeraSherry.treemagic.item;

import net.minecraft.item.Item;
import com.github.SeraSherry.treemagic.creativetab.CreativeTabsLoader;

public class ItemSprinkleApple extends Item{
    public ItemSprinkleApple()
    {
        super();
        this.setUnlocalizedName("sprinkleApple");
        this.setCreativeTab(CreativeTabsLoader.tabTreeMagic);
    }
}
