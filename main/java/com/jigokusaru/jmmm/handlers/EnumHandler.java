package com.jigokusaru.jmmm.handlers;

import net.minecraft.util.IStringSerializable;

public class EnumHandler {
	
	public static enum CoinTypes implements IStringSerializable{
		COPPER("copper",0),
		Silver("silver",1),
		GOLD("gold",2);
		
		private int ID;
		private String name;
		
		private CoinTypes(String name,int ID){
			this.ID =ID;
			this.name = name;
			
		}

		@Override
		public String getName() {
			return this.name ;
		}
		
		public int getID() {
			return ID;
		}
		
		@Override
		public String toString() {
			return getName();
		}
		
	}

}
