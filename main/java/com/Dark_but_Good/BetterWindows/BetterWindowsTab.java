package com.Dark_but_Good.BetterWindows;

import com.Dark_but_Good.BetterWindows.blocks.ModBlocks;
import com.Dark_but_Good.BetterWindows.items.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BetterWindowsTab extends CreativeTabs{

	public BetterWindowsTab(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		return ModItems.Underwater;
	}
}