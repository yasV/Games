package model;

import controller.FizzBuzzController;
import view.FizzBuzzView;

public class FizzBuzzMain {
	
	public static void main(String[] args) {
			FizzBuzzModel _model = new FizzBuzzModel();
			FizzBuzzController _controller = new FizzBuzzController(_model);
			
			FizzBuzzView _view = new FizzBuzzView(_controller);
			_model.cleanView();
			_model.addContactView(_view);
			_view.setVisible(true);
	    }
}
