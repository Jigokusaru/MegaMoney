package com.jigokusaru.jmmm.init;

import com.jigokusaru.jmmm.JMMM;
import com.jigokusaru.jmmm.Reference;
import com.jigokusaru.jmmm.handlers.EnumHandler;
import com.jigokusaru.jmmm.items.ItemCoin;
import com.jigokusaru.jmmm.items.ItemVendingMachine;
import com.jigokusaru.jmmm.utils.Util;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item coin;
	public static Item vendingmachine;
	
	public static void init(){
		
		coin = new ItemCoin("coin");
		vendingmachine = new ItemVendingMachine("vendingmachine",ModBlocks.vendingmachine);
		
	}
	
	public static void register(){
		
		registerItem(coin);
		registerItem(vendingmachine);
	}
	
	public static void registerRenders(){
		registerRender(vendingmachine);
		for(int i = 0; i < EnumHandler.CoinTypes.values().length; i++){ 
				registerRender(coin,i, "coin" + EnumHandler.CoinTypes.values()[i].getName());
		}
	
	}
	
	public static void registerItem(Item item){
		item.setCreativeTab(JMMM.items);
		GameRegistry.register(item);
		Util.getLogger().info("Registered Item "+ item.getUnlocalizedName().substring(5));
	}
	
	public static void registerRender(Item item){
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID, item.getUnlocalizedName().substring(5)),"inventory"));
		Util.getLogger().info("Register Render for" + item.getUnlocalizedName().substring(5));
	
	}
	
	public static void registerRender(Item item, int meta, String fileName){
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(new ResourceLocation(Reference.MODID, fileName),"inventory"));
		Util.getLogger().info("Register Render for" + item.getUnlocalizedName().substring(5));
	
	}
	
	

}
