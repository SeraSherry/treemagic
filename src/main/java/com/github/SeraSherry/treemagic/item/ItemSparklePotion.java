package com.github.SeraSherry.treemagic.item;

import net.minecraft.item.Item;
import com.github.SeraSherry.treemagic.creativetab.CreativeTabsLoader;

public class ItemSparklePotion extends Item{
    public ItemSparklePotion()
    {
        super();
        this.setUnlocalizedName("sparklePotion");
        this.setCreativeTab(CreativeTabsLoader.tabTreeMagic);
    }
}
