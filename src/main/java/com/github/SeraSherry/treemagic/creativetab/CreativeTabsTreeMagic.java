package com.github.SeraSherry.treemagic.creativetab;

import com.github.SeraSherry.treemagic.item.ItemLoader;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabsTreeMagic extends CreativeTabs{
    public CreativeTabsTreeMagic()
    {
        super("TreeMagic");
        this.setBackgroundImageName("TreeMagic.png");
    }

    @Override
    public Item getTabIconItem()
    {
        return ItemLoader.teaTree;
    }

    @Override
    public boolean hasSearchBar()
    {
        return true;
    }
}
