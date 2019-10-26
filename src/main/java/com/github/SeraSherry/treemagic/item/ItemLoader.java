package com.github.SeraSherry.treemagic.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemLoader {
    public static Item teaTree = new ItemTeaTree();
    public static Item teaOil = new ItemTeaOil();

    public ItemLoader(FMLPreInitializationEvent event)
    {
        register(teaTree, "tea_tree");
    }

    @SideOnly(Side.CLIENT)
    public static void registerRenders()
    {
        registerRender(teaTree);
    }

    private static void register(Item item, String name)
    {
        GameRegistry.registerItem(item.setRegistryName(name));
    }

    @SideOnly(Side.CLIENT)
    private static void registerRender(Item item)
    {
        ModelResourceLocation model = new ModelResourceLocation(item.getRegistryName(), "inventory");
        ModelLoader.setCustomModelResourceLocation(item, 0, model);
    }
}
