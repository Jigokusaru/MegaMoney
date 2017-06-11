package com.jigokusaru.jmmm.init;

import com.jigokusaru.jmmm.JMMM;
import com.jigokusaru.jmmm.Reference;
import com.jigokusaru.jmmm.blocks.BlockBed;
import com.jigokusaru.jmmm.blocks.BlockVendingMachine;
import com.jigokusaru.jmmm.utils.Util;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks{
	
	public static Block vendingmachine;
	
	public static void init(){
		
		vendingmachine = new BlockVendingMachine("vendingmachine");
		
	}
	
	public static void register(){
		
		registerBlock(vendingmachine);
	}
	
	public static void registerRenders(){
		registerRender(vendingmachine);
		
	}
	
	public static void registerBlock(Block block){
		if(!(block == vendingmachine)){
			block.setCreativeTab(JMMM.blocks);
		}
		GameRegistry.register(block);
		GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
		Util.getLogger().info("Registered block "+block.getUnlocalizedName().substring(5));
	}
	
	public static void registerBlock(Block block, ItemBlock itemblock){
		block.setCreativeTab(JMMM.blocks);
		GameRegistry.register(block);
		GameRegistry.register(itemblock.setRegistryName(block.getRegistryName()));
		Util.getLogger().info("Registered block "+block.getUnlocalizedName().substring(5));
	}
	
	
	
	public static void registerRender(Block block){
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block),0, new ModelResourceLocation(new ResourceLocation(Reference.MODID, block.getUnlocalizedName().substring(5)),"inventory"));

		Util.getLogger().info("Registered rendered for "+block.getUnlocalizedName().substring(5));
	}
	
	public static void registerRender(Block block, int meta, String fileName){
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), meta, new ModelResourceLocation(new ResourceLocation(Reference.MODID, fileName),"inventory"));
		Util.getLogger().info("Register Render for" + block.getUnlocalizedName().substring(5));
	
	}

}