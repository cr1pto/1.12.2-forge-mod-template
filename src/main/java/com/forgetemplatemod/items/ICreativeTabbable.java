package com.forgetemplatemod.items;

import net.minecraft.creativetab.CreativeTabs;

public interface ICreativeTabbable<T> {
	T setCreativeTab(CreativeTabs tab);
}
