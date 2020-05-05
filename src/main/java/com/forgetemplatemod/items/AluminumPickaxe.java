package com.forgetemplatemod.items;

import com.forgetemplatemod.Main;

import net.minecraft.item.ItemPickaxe;

public class AluminumPickaxe extends ItemPickaxe {

	protected String name;
	
	public AluminumPickaxe(ToolMaterial material, String name) {
		super(material);
		this.name = name;

		setRegistryName(name);
		setUnlocalizedName(name);
		
//		TutorialItems.ITEMS.add(this);
		
	}
	
	public void registerItemModel() {
		Main.proxy.registerItemRenderer(this, 0, name);
	}

}
