package abstract_interface;

public interface IView {
	public void initDisplay();
	public String selectCharacter();
	public String selectInput();
	public char selectGameContinue();
	public char selectGameStart();
	public void displayPlayerGame(String s);
	public void displayComputerGame(String s);
	public void displayResult(String b);
	public void displayReport(String p,String c, int total, int pScore,float[] fStat, String result);
}
