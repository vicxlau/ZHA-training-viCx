package controller;

import java.util.*;
import model.*;
import view.*;
import abstract_interface.*;
import util.Locale;

public class PSSGameController implements IStatistic{
	private View view;
	private List<Round> rounds;
	private Player player;
	private AI computer;
	private Round currentR; 
	private FinalResult result;
	
	public PSSGameController(){
		rounds = new ArrayList<Round>();	
		view = new View();
	}	
	public boolean execute(){
		//Show initial game msg
		view.initDisplay();
		//set up player and computer
		setParticipants();
		
		// execute game content if player doesn't stop
		if(view.selectGameStart()=='Y'){
			while(true){
				if(roundRun())break;			
			}
		}
		
		//store and display game report after player stops the game
		result = new FinalResult(Round.finalResult(rounds),rounds.size(),Round.getPlayerScore(rounds) , Round.getComputerScore(rounds));
		report();
		
		//return game result (for future program extension, e.g. multiple games under the program)
		return result.getResult() == Result.WIN;
	}
	//set up player & computer
	private void setParticipants(){
		player = new Player(view);		
		computer = new AI();
	}
	//game main logic
	private boolean roundRun() {
		//Record round info.
		currentR = new Round(player.generateInput(view),computer.generateInput(view));		
		rounds.add(currentR);

		//Display player input, computer input & result in this round
		displayRoundResult();
		
		// continue till player stops
		return (view.selectGameContinue()=='N');
	}	
	//display result of current round 
	private void displayRoundResult(){
		view.displayPlayerGame(currentR.getPlayerInput().getValue());
		view.displayComputerGame(currentR.getComputerInput().getValue());
		view.displayResult(currentR.getResultMsg());
	}
	//display report of the whole game
	private void report(){
		view.displayReport(player.getName(),computer.getName(), 
				result.gettRounds(),
				result.getpScore(),getStatistic(rounds),result.getResultMsg());
	}
	//return player performance statistic of the whole game
	@Override
	public float[] getStatistic (List<Round> rounds){
		int[] result = new int[Input.values().length];
		for(Input i :Input.values()){
			for(Round r :rounds){
				if(i.equals(r.getPlayerInput())) result[i.getIndex()-1]++;				
			}
		}
		float[] fResult = new float[result.length];
		if(rounds.size()!=0)
			for (int i = 0; i < result.length; i++) {
				fResult[i] = (float) result[i] / (float) rounds.size();
			}
		return fResult;
	}
}
