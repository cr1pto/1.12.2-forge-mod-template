package com.forgetemplatemod.items;

import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.item.ItemTool;

public class ItemToolBase extends ItemTool {

	protected String name;
	
	public ItemToolBase(float attackDamageIn, float attackSpeed, ToolMaterial material,
			Set<Block> effectiveBlocks, String name) {
		super(attackDamageIn, attackSpeed, material, effectiveBlocks);
		this.name = name;		
	}

}
