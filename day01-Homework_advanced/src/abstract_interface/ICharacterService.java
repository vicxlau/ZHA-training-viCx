package abstract_interface;
import model.Input;
import view.View;

public interface ICharacterService {
	public Input generateInput(View v);
}