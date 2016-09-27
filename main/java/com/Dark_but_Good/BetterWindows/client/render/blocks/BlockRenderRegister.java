package com.Dark_but_Good.BetterWindows.client.render.blocks;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import com.Dark_but_Good.BetterWindows.blocks.ModBlocks;
import com.Dark_but_Good.BetterWindows.Main;

public final class BlockRenderRegister {
	
	public static void registerBlockRenderer() {
    	reg(ModBlocks.Underwater_Art_Deco);	
	}
	
    	public static String modid = Main.MODID;

    	public static void reg(Block block) {
    	    Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
    	    .register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(modid + ":" + block.getUnlocalizedName().substring(5), "inventory"));
    	
    	}
}