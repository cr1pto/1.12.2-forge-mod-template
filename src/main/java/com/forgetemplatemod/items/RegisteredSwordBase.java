package com.forgetemplatemod.items;

import com.forgetemplatemod.Main;

import net.minecraft.item.ItemSword;

public class RegisteredSwordBase extends ItemSword{

	protected String name;
	
	public RegisteredSwordBase(ToolMaterial material, String name) {
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
