package com.forgetemplatemod.items;

import com.forgetemplatemod.Main;
import com.forgetemplatemod.init.ItemsRegistry;

import net.minecraft.item.ItemSpade;

public abstract class ItemShovelBase extends ItemSpade implements IRegisterable {

	protected String name;
	
	public ItemShovelBase(ToolMaterial material, String name) {
		super(material);
		
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
