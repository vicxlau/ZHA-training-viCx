package model;

import view.View;
import abstract_interface.IPlayerService;

public class Player implements IPlayerService {
	private Characters c;

	public Player(View view) {
		c = Characters.getCharacterByIndex(Integer.parseInt(view
				.selectCharacter()));
	}

	public String getName() {
		return c.getName();
	}

	@Override
	public Input generateInput(View v) {
		return Input.getInputByIndex(Integer.parseInt(v.selectInput()));
	}
}
