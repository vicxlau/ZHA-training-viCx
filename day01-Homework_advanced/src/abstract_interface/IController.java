package abstract_interface;

public interface IController extends IStatistic {
	public boolean execute();

	// set up player & computer
	public void setParticipants();

	// game main logic
	public boolean roundRun();

	// display result of current round
	public void displayRoundResult();

	// display report of the whole game
	public void report();
}
