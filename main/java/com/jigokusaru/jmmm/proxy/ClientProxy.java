package com.jigokusaru.jmmm.proxy;

import com.jigokusaru.jmmm.Reference;
import com.jigokusaru.jmmm.init.ModBlocks;
import com.jigokusaru.jmmm.init.ModItems;

import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.util.ResourceLocation;

public class ClientProxy extends CommonProxy{
	
	@Override
	public void registerRenders(){
		ModItems.registerRenders();
		ModBlocks.registerRenders();
		
	}
	@Override
	public void registerModelBackeryVariants(){
		ModelBakery.registerItemVariants(ModItems.coin, new ResourceLocation(Reference.MODID,"coincopper"), new ResourceLocation(Reference.MODID,"coinsilver"), new ResourceLocation(Reference.MODID,"coingold"));

		
	}

	

}
