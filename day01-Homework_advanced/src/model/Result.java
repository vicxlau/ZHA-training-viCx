package model;

import abstract_interface.IResult;

public enum Result implements IResult {
		WIN(1,"恭喜恭喜！"),DRAW(0,"打成平手，下次再和你一分高下！"),LOSE(-1,"^_^,你输了，真笨!");
		private int index;
		private String value;
		
		Result(int i,String s){
			index = i;
			value = s;
		}
		
		public static Result getResultByIndex(int index){
			for(Result g :Result.values()){
				if(g.getIndex()== index){
					return g;
				}
			}
			return null;
		}

		public int getIndex() {
			return index;
		}
		@Override
		public String getResultMsg() {
			return value;
		}
}
