package com.Dark_but_Good.BetterWindows.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems {

    public static Item Underwater;

    public static void createItems() {
    	GameRegistry.registerItem(Underwater = new BasicItem("Underwater"), "Underwater");
    }
}