package com.Dark_but_Good.BetterWindows.blocks;


import net.minecraft.block.Block;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public final class ModBlocks {

    public static Block Underwater_Art_Deco;

    public static void createBlocks() {
    	GameRegistry.registerBlock(Underwater_Art_Deco = new BasicBlock("Underwater_Art_Deco").setLightOpacity(0), "Underwater_Art_Deco");
    }
}