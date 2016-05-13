package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.FizzBuzzModel;
import view.FizzBuzzView;

public class FizzBuzzController implements ActionListener{
	private FizzBuzzView _view;
	private FizzBuzzModel _model;
	
	public FizzBuzzController (FizzBuzzModel theModel) {
		this._model = theModel;
	}
	
	public void setFizzBuzzView(FizzBuzzView theView){
		this._view = theView;
	}
	
	public FizzBuzzView getView(){
		return _view;
	}
	
	@Override
	public void actionPerformed(ActionEvent _pEvt) {
		// TODO Auto-generated method stub
		Object source = _pEvt.getSource();
		
		if(source == _view._btnSave){
			try{
				int _pFizz = _view.getFizzValue();
				int _pBuzz = _view.getBuzzValue();
				int _pTime = _view.getTimeValue();
				
				_model.setConfiguration(_pFizz,_pBuzz,_pTime);
				_view.displayMessage("The values have been saved");
				_view.setConfiguration();
				
			}catch(Exception e){
				_view.displayErrorMessage("Error");
			}
		}
		if(source == _view._btnStart){
			try{
				int _pTime = _model.get_Time();
				int _pFizz = _model.get_Fizz();
				int _pBuzz = _model.get_Buzz();
				int _pNumber = _model.get_Number();
				
				_view.start(_pNumber, _pFizz, _pBuzz, _pTime);
			}catch(Exception e){
				_view.displayErrorMessage("Error");
			}
		}
		if(source == _view._btnOk){
			try{
				int _pFizz = 0;
				int _pBuzz = 0;
				if(_view._chckbxFizz.isSelected()){
					_pFizz = 1;
				}
				if(_view._chckbxBuzz.isSelected()){
					_pBuzz = 1;
				}
				_model.checkOption(_pFizz,_pBuzz);
				
			}catch(Exception e){
				_view.displayErrorMessage("Error");
			}
		}
		
	}
}
