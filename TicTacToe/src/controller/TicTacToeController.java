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
		
		if(source == _view._btnNewGame){
			try{
				_model.clearBoard();
			}catch(Exception e){
				_view.displayErrorMessage("Error");
			}
		}
		
		if(source == _view._btn11){
			try{
				_model.modifyBoard(1,1);
			}catch(Exception e){
				_view.displayErrorMessage("Error");
			}
		}
		
		if(source == _view._btn12){
			try{
				_model.modifyBoard(1,2);
			}catch(Exception e){
				_view.displayErrorMessage("Error");
			}
		}
		
		if(source == _view._btn13){
			try{
				_model.modifyBoard(1,3);
			}catch(Exception e){
				_view.displayErrorMessage("Error");
			}
		}
		
		if(source == _view._btn21){
			try{
				_model.modifyBoard(2,1);
			}catch(Exception e){
				_view.displayErrorMessage("Error");
			}
		}
		
		if(source == _view._btn22){
			try{
				_model.modifyBoard(2,2);
			}catch(Exception e){
				_view.displayErrorMessage("Error");
			}
		}
		
		if(source == _view._btn23){
			try{
				_model.modifyBoard(2,3);
			}catch(Exception e){
				_view.displayErrorMessage("Error");
			}
		}
		
		if(source == _view._btn31){
			try{
				_model.modifyBoard(3,1);
			}catch(Exception e){
				_view.displayErrorMessage("Error");
			}
		}
		
		if(source == _view._btn32){
			try{
				_model.modifyBoard(3,2);
			}catch(Exception e){
				_view.displayErrorMessage("Error");
			}
		}
		
		if(source == _view._btn33){
			try{
				_model.modifyBoard(3,3);
			}catch(Exception e){
				_view.displayErrorMessage("Error");
			}
		}
	}

}
