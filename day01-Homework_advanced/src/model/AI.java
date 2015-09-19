package model;

import java.util.Random;
import util.Locale;
import view.View;
import abstract_interface.ICharacterService;

public class AI implements ICharacterService {
	private static final String name = Locale.getValue("computer");
	public static String getName() {
		return name;
	}	
	@Override
	public Input generateInput(View v){
		int randNum = getRandomNumByRange(1,3);	
		return Input.getInputByIndex(randNum);
	}
	private static int getRandomNumByRange(int min,int max){
		return new Random().nextInt((max - min) + 1) + min;
	}
}
