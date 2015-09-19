package model;
import java.util.List;

import model.Input;

public class Round {
	public static final int PLAYER =0;
	public static final int COMPUTER =1;
	Input[] inputs = new Input[2];
	Result result = null;
	
	public Input getPlayerInput() {
		return inputs[PLAYER];
	}
	public Input getComputerInput() {
		return inputs[COMPUTER];
	}
	public Round(Input o1, Input o2){
		inputs[PLAYER] = o1;
		inputs[COMPUTER] = o2;
		result = Result.getResultByIndex(state());
	}
	public static int getPlayerScore(List<Round> rounds){
		int score = 0;
		for(Round r : rounds){
			if(r.isWin()) score++;
		}
		return score;
	}
	public static int getComputerScore(List<Round> rounds){
		int score = 0;
		for(Round r : rounds){
			if(r.isLose()) score++;
		}
		return score;
	}
	public static int finalResult(List<Round> rounds){
		int cScore = Round.getComputerScore(rounds);
		int pScore = Round.getPlayerScore(rounds);		
		if(cScore == pScore) return 0;
		if(cScore > pScore) return -1;
		else return 1;
	}
	public boolean isWin(){
		return (state() == 1);
	}
	public boolean isDraw(){
		return (state() == 0);
	}
	public boolean isLose(){
		return (state() == -1);
	}
	public int state(){
		return inputs[0].compare(inputs[1]);
	}
	public String getResultMsg() {
		return result.getResultMsg();
	}
	public void setResult(int index) {
		result = Result.getResultByIndex(index);
	}
	
}
