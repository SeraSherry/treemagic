package com.github.SeraSherry.treemagic.item;

import net.minecraft.item.Item;
import com.github.SeraSherry.treemagic.creativetab.CreativeTabsLoader;

public class ItemSprinklePotion extends Item{
    public ItemSprinklePotion()
    {
        super();
        this.setUnlocalizedName("sprinklePotion");
        this.setCreativeTab(CreativeTabsLoader.tabTreeMagic);
    }
}
