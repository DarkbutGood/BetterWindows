package com.Dark_but_Good.BetterWindows;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)
public class Main {

    public static final String MODID = "bw";
    public static final String MODNAME = "Better Windows";
    public static final String VERSION = "1.0.0";

    @Instance
    public static Main instance = new Main();
    
    public static final BetterWindowsTab tabBetterWindows = new BetterWindowsTab("tabBetterWindows");
   
    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
    	   this.proxy.preInit(e);
    }

    @EventHandler
    public void init(FMLInitializationEvent e) {
    	   this.proxy.init(e);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
    	   this.proxy.postInit(e);
    }
    
    @SidedProxy(clientSide="com.Dark_but_Good.BetterWindows.ClientProxy", serverSide="com.Dark_but_Good.BetterWindows.ServerProxy")
    public static CommonProxy proxy;
}