package com.jigokusaru.jmmm;

import com.jigokusaru.jmmm.creativetabs.TabJmmmBlocks;
import com.jigokusaru.jmmm.creativetabs.TabJmmmItems;
import com.jigokusaru.jmmm.handlers.RecipeHandler;
import com.jigokusaru.jmmm.init.ModBlocks;
import com.jigokusaru.jmmm.init.ModItems;
import com.jigokusaru.jmmm.proxy.CommonProxy;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, version = Reference.VERSION, name = Reference.NAME)
public class JMMM {
	
	public static CreativeTabs blocks = new TabJmmmBlocks();
	public static CreativeTabs items = new TabJmmmItems();
	
	com.jigokusaru.jmmm.handlers.EventHandler eventHandler = new com.jigokusaru.jmmm.handlers.EventHandler();
	
	
	@Mod.Instance(Reference.MODID)
	public static JMMM instance;
	
	@SidedProxy(serverSide = Reference.SERVER_PROXY_CLASS, clientSide = Reference.CLIENT_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e){
		ModItems.init();
		ModBlocks.init();
		ModItems.register();
		ModBlocks.register();
		
		proxy.registerRenders();
		
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent e){
		proxy.registerModelBackeryVariants();
		
		RecipeHandler.registerCraftingRecipes();
		RecipeHandler.registerSmeltingRecipes();
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent e){
		
	}
	
	

}
