package abstract_interface;

import java.util.*;

import view.*;
import model.*;

public abstract class AbstractTwoPlayerGameController implements IController {
	protected View view;
	protected List<Round> rounds;
	protected Player player;
	protected AI computer;
	protected Round currentR;
	protected FinalResult result;

	public AbstractTwoPlayerGameController() {
		rounds = new ArrayList<Round>();
		view = new View();
	}

	public abstract boolean execute();

	public float[] getStatistic(List<Round> rounds) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setParticipants() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean roundRun() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void displayRoundResult() {
		// TODO Auto-generated method stub

	}

	@Override
	public void report() {
		// TODO Auto-generated method stub

	}
}
