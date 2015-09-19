package model;

import util.Locale;

public enum Input {
//	SCISSOR(1,"剪刀"),STONE(2,"石头"),PAPER(3,"布");
	SCISSOR(1,Locale.getValue("scissor")),STONE(2,Locale.getValue("stone")),PAPER(3,Locale.getValue("paper"));
	private int index;
	private String value;
	
	private Input(int i,String s){
		index = i;
		value = s;		
	}	
	public static String getAllInput(){
		String result = "";
		for (Input input : Input.values()) {
			result+=(input.getIndex() + "." + input.getValue() + " ");
		}
		return result;
	}
	public static Input getInputByIndex(int input){
		for(Input i :Input.values()){
			if(i.getIndex()==input){
				return i;
			}
		}
		return null;
	}
	public int compare(Input obj){
		if(this == obj) return 0;
		switch(this){
			case SCISSOR:
				switch(obj){
//					case Scissor: 
					case STONE: return -1;
					case PAPER: return 1;
				}
				break;
			case STONE:
				switch(obj){
					case SCISSOR: return 1;
//					case STONE:
					case PAPER: return -1;
				}
				break;
			default:
				switch(obj){
					case SCISSOR: return -1;
					case STONE: return 1;
//					case PAPER:
				}
				break;				
		}
		return -2;		//error
	}
	
	public String getValue(){
		return value;
	}	
	public int getIndex(){
		return index;
	}
//	public String getValue(){
//		switch(this){
//			case SCISSOR:
//				return "";
//			case STONE:
//				return "";
//			case PAPER:
//				return "";
//		}
//		return "";
//	}
}
