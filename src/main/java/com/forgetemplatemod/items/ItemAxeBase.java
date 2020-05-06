package com.forgetemplatemod.items;

import com.forgetemplatemod.Main;
import com.forgetemplatemod.init.ItemsRegistry;

import net.minecraft.item.ItemAxe;

public abstract class ItemAxeBase extends ItemAxe implements IRegisterable {

	protected String name;
	
	protected ItemAxeBase(ToolMaterial material, String name) {
		super(material, 9999, 9999);
			
		this.name = name;
		
		updateRegistryAndLocalizedName(name);
	}
	
	public void registerItemModel() {
		Main.proxy.registerItemRenderer(this, 0, name);
	}

	@Override
	public void updateRegistryAndLocalizedName(String name) {
		
		setRegistryName(name);
		setUnlocalizedName(name);
		
		ItemsRegistry.ITEMS.add(this);
	}
	
	
}
