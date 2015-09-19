package model;

import abstract_interface.IResult;

public class FinalResult implements IResult {
	private Result result;
	private int tRounds;
	private int pScore; 
	private int cScore;
	
	public FinalResult(int index, int totalRounds, int scorePlayer, int scoreComputer){
		result = Result.getResultByIndex(index);
		tRounds = totalRounds;
		pScore = scorePlayer;
		cScore = scoreComputer;
	}
	
	public String getResultMsg() {
		return result.getResultMsg();
	}

	public Result getResult() {
		return result;
	}
	
	public int getpScore() {
		return pScore;
	}

	public void setpScore(int pScore) {
		this.pScore = pScore;
	}

	public int getcScore() {
		return cScore;
	}

	public void setcScore(int cScore) {
		this.cScore = cScore;
	}
	
	public int gettRounds() {
		return tRounds;
	}
	
	public void settRounds(int tRounds) {
		this.tRounds = tRounds;
	}
}


//--=== Version 2
//public class FinalResult implements IResult {
//	private Result result;
//	private int tRounds;
//	private int pScore; 
//	private int cScore;
//	
//	public FinalResult(int index, int totalRounds, int scorePlayer, int scoreComputer){
//		result = Result.getResultByIndex(index);
//		tRounds = totalRounds;
//		pScore = scorePlayer;
//		cScore = scoreComputer;
//	}
//	
//	public String getResultMsg() {
//		return result.getResultMsg();
//	}
//	
//	public Result getResult() {
//		return result;
//	}
//	
//	public int getpScore() {
//		return pScore;
//	}
//	
//	public void setpScore(int pScore) {
//		this.pScore = pScore;
//	}
//	
//	public int getcScore() {
//		return cScore;
//	}
//	
//	public void setcScore(int cScore) {
//		this.cScore = cScore;
//	}
//	
//	public int gettRounds() {
//		return tRounds;
//	}
//	
//	public void settRounds(int tRounds) {
//		this.tRounds = tRounds;
//	}
//}


//--=== Version 1
//public enum GameResult implements IResult {
//	WIN(1,"恭喜恭喜！"),DRAW(0,"打成平手，下次再和你一分高下！"),LOSE(-1,"^_^,你输了，真笨!");
//	private int index;
//	private String value;
//	private int tRounds;
//	private int pScore; 
//	private int cScore;
//	
//	GameResult(int i,String s){
//		index = i;
//		value = s;
//	}
//	
//	public static GameResult getResultByIndex(int index, int t, int p, int c){
//		for(GameResult g :GameResult.values()){
//			if(g.getIndex()== index){
//				g.setpScore(p);
//				g.setcScore(c);
//				g.settRounds(t);
//				return g;
//			}
//		}
//		return null;
//	}
//	
////	public String toString(){
////		
////	}
//	
//	public int getIndex() {
//		return index;
//	}
//	
//	public void setIndex(int index) {
//		this.index = index;
//	}
//	
//	public String getValue() {
//		return value;
//	}
//	
//	public void setValue(String value) {
//		this.value = value;
//	}
//	
//	public int getpScore() {
//		return pScore;
//	}
//	
//	public void setpScore(int pScore) {
//		this.pScore = pScore;
//	}
//	
//	public int getcScore() {
//		return cScore;
//	}
//	
//	public void setcScore(int cScore) {
//		this.cScore = cScore;
//	}
//	
//	public int gettRounds() {
//		return tRounds;
//	}
//	
//	public void settRounds(int tRounds) {
//		this.tRounds = tRounds;
//	}
//}
