package com.forgetemplatemod;


import com.forgetemplatemod.init.TutorialBlocks;
import com.forgetemplatemod.init.TutorialItems;
import com.forgetemplatemod.proxy.CommonProxy;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid= Main.MOD_ID, version = Main.VERSION, name = Main.NAME)
public class Main {
	public static final String MOD_ID = "template_mod";
	public static final String VERSION = "1.0";
	public static final String NAME = "Forge Template Mod";
	
	@Instance
	public static Main main;	
	
	/**
	 * must include package paths
	 */
	@SidedProxy(serverSide = "com.forgetemplatemod.proxy.CommonProxy", clientSide = "com.forgetemplatemod.proxy.ClientProxy")
	public static CommonProxy proxy;
	
	public static final Item.ToolMaterial ALUMINUM_TOOL_MATERIAL = EnumHelper.addToolMaterial("ALUMINUM", 3, 99999, 9999, 9999999, 14);  
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
	
	@EventHandler
	public void serverStarting(FMLServerStartingEvent event) {
		
	}
	
	/**
	 * This is something we need to immediately load in our event bus at mod construction time (built)
	 * @author ezric
	 *
	 */
	@EventBusSubscriber
	public static class RegistrationHandler{
		
		@SubscribeEvent
		public static void registerBlocks(RegistryEvent.Register<Block> event) {
			TutorialBlocks.register(event.getRegistry());
		}
		
		@SubscribeEvent
		public static void registerItem(RegistryEvent.Register<Item> event) {
			TutorialItems.register(event.getRegistry());
			TutorialBlocks.registerItemBlocks(event.getRegistry());
		}
		
		@SubscribeEvent
		public static void registerItems(ModelRegistryEvent event) {
			TutorialItems.registerModels();
			TutorialBlocks.registerModels();
		}
		
		
	}
}
