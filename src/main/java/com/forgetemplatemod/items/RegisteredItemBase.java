package com.forgetemplatemod.items;

import com.forgetemplatemod.Main;
import com.forgetemplatemod.init.TutorialItems;

public class RegisteredItemBase extends ItemBase {

	public RegisteredItemBase(String name) {
		super(name);
		
		//used for language files
		setUnlocalizedName(name);
		//used for registering the item and its models
		setRegistryName(name);
		
		TutorialItems.ITEMS.add(this);
	}

	public void registerItemModel() {
		Main.proxy.registerItemRenderer(this, 0, name);
	}
	
}
