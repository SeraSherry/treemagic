package com.github.SeraSherry.treemagic.common;

import com.github.SeraSherry.treemagic.creativetab.CreativeTabsLoader;
import com.github.SeraSherry.treemagic.item.ItemLoader;
import com.github.SeraSherry.treemagic.block.BlockLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event)
    {
        new CreativeTabsLoader(event);
        new ItemLoader(event);
        new BlockLoader(event);
    }

    public void init(FMLInitializationEvent event)
    {

    }

    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
