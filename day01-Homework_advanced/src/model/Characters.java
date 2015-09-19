package model;

import util.Locale;

public enum Characters{ 
	LAU(1,Locale.getValue("character-LAU")),
	SUEN(2,Locale.getValue("character-SUEN")),
	CHO(3,Locale.getValue("character-CHO"));
	private int index;
	private String name;

	Characters(int i,String s){
		index = i;
		name = s;		
	}

	//Static methods
	public static Characters getCharacterByIndex(int input){
		for(Characters c :Characters.values()){
			if(c.getIndex()==input){
				return c;
			}
		}
		return null;
	}
	public static String getAllCharacters(){
		String result = "";
		for (Characters chara : Characters.values()) {
			result+=(chara.getIndex() + "." + chara.getName() + " ");
		}
		return result;
	}
	
	//Public getters
	public int getIndex(){
		return index;
	}
	public String getName(){
		return name;
	}
}