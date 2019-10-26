package com.github.SeraSherry.treemagic.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CreativeTabsLoader
{
    public static CreativeTabs tabTreeMagic;

    public CreativeTabsLoader(FMLPreInitializationEvent event)
    {
        tabTreeMagic = new CreativeTabsTreeMagic();
    }
}
