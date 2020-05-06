package com.forgetemplatemod.items;

import com.forgetemplatemod.Main;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;

public class AluminumShovel extends ItemShovelBase {

	public static final Item.ToolMaterial ALUMINUM_TOOL_MATERIAL = EnumHelper.addToolMaterial("ALUMINUM", 3, 99999, 9999, 9999999, 14);
	
	public AluminumShovel(String name) {
		super(ALUMINUM_TOOL_MATERIAL, name);
	}

}
