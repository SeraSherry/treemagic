package com.github.SeraSherry.treemagic.client;

import com.github.SeraSherry.treemagic.block.BlockLoader;
import com.github.SeraSherry.treemagic.item.ItemLoader;

public class ItemRenderLoader {
    public ItemRenderLoader()
    {
        ItemLoader.registerRenders();
        BlockLoader.registerRenders();
    }
}
