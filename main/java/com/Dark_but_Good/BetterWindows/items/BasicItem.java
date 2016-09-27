package com.Dark_but_Good.BetterWindows.items;
import com.Dark_but_Good.BetterWindows.BetterWindowsTab;
import com.Dark_but_Good.BetterWindows.Main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BasicItem extends Item {

	public BasicItem(String unlocalizedName) {
	    super();

	    this.setUnlocalizedName(unlocalizedName);
	    this.setCreativeTab(Main.tabBetterWindows);
	}
}