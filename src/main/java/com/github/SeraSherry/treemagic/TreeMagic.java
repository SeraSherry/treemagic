package com.github.SeraSherry.treemagic;

import com.github.SeraSherry.treemagic.common.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * @author SeraSherry :)
 */

@Mod(modid = TreeMagic.MODID, name = TreeMagic.NAME, version = TreeMagic.VERSION, acceptedMinecraftVersions = "1.8.9")

public class TreeMagic
{
    public static final String MODID = "treemagic";
    public static final String NAME = "Tree Magic";
    public static final String VERSION = "1.0.0";

    @Instance(TreeMagic.MODID)
    public static TreeMagic instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }

    @SidedProxy(clientSide = "com.github.SeraSherry.TreeMagic.client.ClientProxy",
            serverSide = "com.github.SeraSherry.TreeMagic.common.CommonProxy")
    public static CommonProxy proxy;

}