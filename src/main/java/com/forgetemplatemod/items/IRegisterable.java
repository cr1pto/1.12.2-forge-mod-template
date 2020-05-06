package com.forgetemplatemod.items;

import net.minecraftforge.registries.IForgeRegistry;

public interface IRegisterable<T> {
	void registerItemModel();
	void updateRegistryAndLocalizedName(String name);
}
