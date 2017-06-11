package com.jigokusaru.jmmm.creativetabs;


import com.jigokusaru.jmmm.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class TabJmmmItems extends CreativeTabs{

	public TabJmmmItems() {
		super("jmmmitems");
	}
	
	@Override 
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.coin,1 ,2);
	}
	
	

}
