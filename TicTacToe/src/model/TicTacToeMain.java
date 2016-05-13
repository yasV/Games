package model;

import controller.TicTacToeController;
import view.TicTacToeView;

public class TicTacToeMain {
	public static void main(String[] args) {
		TicTacToeModel _model = new TicTacToeModel();
		TicTacToeController _controller = new TicTacToeController(_model);
		
		TicTacToeView _view = new TicTacToeView(_controller);
		_model.cleanView();
		_model.addContactView(_view);
		_view.setVisible(true);
	}

}
