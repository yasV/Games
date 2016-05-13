package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.TicTacToeModel;
import view.TicTacToeView;


public class TicTacToeController implements ActionListener{
	private TicTacToeView _view;
	private TicTacToeModel _model;
	
	public TicTacToeController (TicTacToeModel theModel) {
		this._model = theModel;
	}
	
	public void setTicTacToeView(TicTacToeView theView){
		this._view = theView;
	}
	
	public TicTacToeView getView(){
		return _view;
	}
	@Override
	public void actionPerformed(ActionEvent _pEvt) {
		// TODO Auto-generated method stub
		Object source = _pEvt.getSource();
		
		if(source == _view._btnNewGame){}
		
		if(source == _view._btn11){}
		if(source == _view._btn12){}
		if(source == _view._btn13){}
		
		if(source == _view._btn21){}
		if(source == _view._btn22){}
		if(source == _view._btn23){}
		
		if(source == _view._btn31){}
		if(source == _view._btn32){}
		if(source == _view._btn33){}
	}

}
