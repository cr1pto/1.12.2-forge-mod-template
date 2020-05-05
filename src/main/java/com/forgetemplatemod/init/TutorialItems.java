package com.forgetemplatemod.init;

import java.util.ArrayList;

import com.forgetemplatemod.Main;
import com.forgetemplatemod.items.AluminumIngot;
import com.forgetemplatemod.items.AluminumPickaxe;
import com.forgetemplatemod.items.AluminumSword;
import com.forgetemplatemod.items.RegisteredItemBase;

import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class TutorialItems {

	public static final ArrayList<RegisteredItemBase> ITEMS = new ArrayList<RegisteredItemBase>();
	
	public static final AluminumIngot aluminumIngot = new AluminumIngot("aluminum_ingot");	
	public static final AluminumSword aluminumSword = new AluminumSword(Main.ALUMINUM_TOOL_MATERIAL, "aluminum_sword");
	public static final AluminumPickaxe aluminumPickaxe = new AluminumPickaxe(Main.ALUMINUM_TOOL_MATERIAL, "aluminum_pickaxe");
	
//	public static final Material TOOL_MATERIAL = EnumHelper.add
	
	public static void register(IForgeRegistry<Item> registry) {		
//		for(RegisteredItemBase item : ITEMS) {
//			registry.register(item);
//		}
		
		registry.registerAll(aluminumIngot, aluminumSword, aluminumPickaxe);
	}
	
//	public static void registerSwords(IForgeRegistry<ItemSword> registry) {
//		
//	}

	public static void registerModels() {
		for(RegisteredItemBase item : ITEMS) {
			item.registerItemModel();
		}
		
		aluminumSword.registerItemModel();
		aluminumPickaxe.registerItemModel();
	}

}
