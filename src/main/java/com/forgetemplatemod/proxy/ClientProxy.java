package com.forgetemplatemod.proxy;

import com.forgetemplatemod.Main;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

/**
 * Client-side proxy
 * @author ezric
 *
 */
public class ClientProxy extends CommonProxy{
	/**
	 * Find the mod ID in the assets folder in [mod id]/models/[item id].json
	 */
	@Override
	public void registerItemRenderer(Item item, int metadataValue, String itemId) {
		ModelLoader.setCustomModelResourceLocation(item, metadataValue, new ModelResourceLocation(Main.MOD_ID + ":" + itemId, "inventory"));
	}
}
