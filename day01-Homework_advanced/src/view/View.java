package view;

import model.Input;
import util.Locale;
import abstract_interface.IView;

public class View extends BasicView implements IView {
	private static final String WELCOME = Locale.getValue("welcome");
	private static final String START = Locale.getValue("start");
	private static final String RULE = Locale.getValue("rule");
	private static final String CHOOSECHARACTER = Locale
			.getValue("choose-character");
	private static final String PLEASEGUESS = Locale.getValue("please-guess");
	private static final String CONTINUE = Locale.getValue("continue");
	private static final String KICKSTART = Locale.getValue("kick-start");
	private static final String YOURGUESS = Locale.getValue("your-guess");
	private static final String COMPUTERGUESS = Locale
			.getValue("computer-guess");
	private static final String GAMENUMBER = Locale.getValue("game-number");
	private static final String RESULT = Locale.getValue("result");
	private static final String ANALYSIS = Locale.getValue("analysis");

	public void initDisplay() {
		print("----------" + WELCOME + "-------------\n");
		print("\t\t***************\n" + "\t\t** " + START + "   **\n"
				+ "\t\t***************\n\n" + RULE);
		print(Input.getAllInput());
		print("\n");
	}

	public String selectCharacter() {
		return displayRequestInput(CHOOSECHARACTER + " （1:刘备 2：孙权 3：曹操 ）： ");
	}

	public String selectInput() {
		return displayRequestInput(PLEASEGUESS + "(" + Input.getAllInput()  + ")");
	}

	public char selectGameContinue() {
		return displayRequestInput(CONTINUE + "（y/n）:").toUpperCase().charAt(0);
	}

	public char selectGameStart() {
		return displayRequestInput(KICKSTART + "（y/n）:").toUpperCase()
				.charAt(0);
	}

	public void displayPlayerGame(String s) {
		print(YOURGUESS + s + "\n");
	}

	public void displayComputerGame(String s) {
		print(COMPUTERGUESS + s + "\n");
	}

	public void displayResult(String resultMsg) {
		// String str = "";
		// switch (b) {
		// case 1:
		// str = "恭喜， 你赢了！";
		// break;
		// case -1:
		// str = "^_^,你输了，真笨!";
		// break;
		// default:
		// str = "和局,真衰！嘿嘿,等着瞧吧 !";
		// break;
		// }
		print(RESULT + resultMsg + "\n");
	}

	public void displayReport(String p, String c, int total, int pScore,
			float[] fStat, String result) {
		print("---------------------------------------------------\n" + "\t\t"
				+ p + " VS " + c + "\n" + GAMENUMBER + "\t" + total + "\n"
				+ RESULT + "\t\t" + result + "\n");
		if (total > 0) {
			String statistic = "============= " + ANALYSIS
					+ " ==============\n";
			for (int i = 0; i < fStat.length; i++) {
				statistic += Input.values()[i].getValue() + ": \t"
						+ String.format("%.2f", fStat[i] * 100) + "% \n";
			}
			print(statistic);
		}
		print("---------------------------------------------------\n");
	}
}
