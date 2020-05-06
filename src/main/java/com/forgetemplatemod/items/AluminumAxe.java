package com.forgetemplatemod.items;

import com.forgetemplatemod.Main;

import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraftforge.common.util.EnumHelper;

public class AluminumAxe extends ItemAxeBase {
	
	public static final Item.ToolMaterial ALUMINUM_TOOL_MATERIAL = EnumHelper.addToolMaterial("ALUMINUM", 3, 99999, 9999, 9999999, 14); 
	
	public AluminumAxe(String name) {
		super(ALUMINUM_TOOL_MATERIAL, name);		
	}
}
