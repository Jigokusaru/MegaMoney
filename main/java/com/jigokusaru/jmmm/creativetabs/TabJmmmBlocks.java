package com.jigokusaru.jmmm.creativetabs;

import com.jigokusaru.jmmm.init.ModBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabJmmmBlocks extends CreativeTabs {
	
	public TabJmmmBlocks() {
		super("jmmmblocks");
	}
	
	@Override 
	public ItemStack getTabIconItem() {
		return new ItemStack(ModBlocks.vendingmachine);
	}
	

}
