package com.jigokusaru.jmmm.items;

import com.jigokusaru.jmmm.Reference;
import com.jigokusaru.jmmm.handlers.EnumHandler.CoinTypes;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;

public class ItemCoin extends Item{
	
public ItemCoin(String unlocalizedName){
		
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID,unlocalizedName));
		this.setHasSubtypes(true);
	}
	@Override
	public void getSubItems(Item item, CreativeTabs tab, NonNullList<ItemStack> items) {
		for(int i=0; i < CoinTypes.values().length; i++){
			items.add(new ItemStack(item, 1 , i));
		}
	}
	
	@Override
		public String getUnlocalizedName(ItemStack stack) {
		for(int i=0; i < CoinTypes.values().length; i++){
			if(stack.getItemDamage() == i){
				return this.getUnlocalizedName() + "." + CoinTypes.values()[i].getName();
			}
			
			else{
				continue;
			}
		}
		return this.getUnlocalizedName() + "." + CoinTypes.COPPER.getName();
		}

}
