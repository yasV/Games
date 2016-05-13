package model;

import java.util.ArrayList;
import java.util.Iterator;

public class TicTacToeModel {
	private static ArrayList<Function> _views=new ArrayList<Function>();
	private int _SizeBoard = 3;
	private String[][] _Board = new String[_SizeBoard][_SizeBoard];
	private boolean _PlayerActual;
	private String _PlayerX = "X";
	private String _PlayerO = "O";
	private int _Total;
	private boolean _PlayerWin;
	
	public TicTacToeModel(){
		this(null);
	}

	public TicTacToeModel(Function _pView) {
		if (_views !=null){
			_views.add(_pView);
		}
	}
	
	public void cleanView (){
		_views.removeAll(_views);
	}
	
	public void addContactView(Function _pView){
		if (!_views.contains(_pView)){
			_views.add(_pView);
		}
	}
	
	public void clearBoard(){
		_PlayerWin = false;
		_PlayerActual = true;
		_Total = 9;
		for(int _columns = 0; _columns < _SizeBoard; _columns++){
			for(int _rows = 0; _rows < _SizeBoard; _rows++){
				_Board[_rows][_columns] = " ";
			}
		}
		
		Iterator<Function> _notifier = _views.iterator();
		while (_notifier.hasNext()){
			_notifier.next().startGame(_PlayerActual);
		}
	}
	
	public void modifyBoard(int _pRow, int _pColumn){
		String _position = Integer.toString(_pRow)+ Integer.toString(_pColumn);
		String _value = null;
		_Total--;
		if(_PlayerActual){
			_Board[_pRow-1][_pColumn-1] = _PlayerX;
			_value = _PlayerX;
			_PlayerActual = false;
		}
		else{
			_Board[_pRow-1][_pColumn-1] = _PlayerO;
			_value = _PlayerO;
			_PlayerActual = true;
		}
		checkWin(_value);
		if(_PlayerWin){
			endGame(_position,_value,false);
		}
		if((_Total == 0)){
			endGame(_position,_value,true);
		}
		else{
			continueGame(_position,_value);
		}
	}
	
	public void checkWin(String pValue){
		boolean diagonalValue = checkDiagonal(pValue);
		boolean verticalValue = checkVertical(pValue);
		boolean horizontalValue = checkHorizontal(pValue);
		
		if(diagonalValue || verticalValue || horizontalValue){
			_PlayerWin = true;
		}
	}
	
	public boolean checkDiagonal(String pValue){
		//Diagonal Review
		if( (_Board[0][0] == pValue) && (_Board[1][1] == pValue) && (_Board[2][2] == pValue)){
			return true;
		}
		else if( (_Board[2][0] == pValue) && (_Board[1][1] == pValue) && (_Board[0][2] == pValue)){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean checkVertical(String pValue){
		//Vertical Review
		if( (_Board[0][0] == pValue) && (_Board[0][1] == pValue) && (_Board[0][2] == pValue)){
			return true;
		}
		else if( (_Board[1][0] == pValue) && (_Board[1][1] == pValue) && (_Board[1][2] == pValue)){
			return true;
		}
		else if( (_Board[2][0] == pValue) && (_Board[2][1] == pValue) && (_Board[2][2] == pValue)){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean checkHorizontal(String pValue){
		//Horizontal Review
		if( (_Board[0][0] == pValue) && (_Board[1][0] == pValue) && (_Board[2][0] == pValue)){
			return true;
		}
		else if( (_Board[0][1] == pValue) && (_Board[1][1] == pValue) && (_Board[2][1] == pValue)){
			return true;
		}
		else if( (_Board[0][2] == pValue) && (_Board[1][2] == pValue) && (_Board[2][2] == pValue)){
			return true;
		}
		else{
			return false;
		}
	}
	
	public void continueGame(String _Position, String _Value){
		Iterator<Function> _notifier = _views.iterator();
		while (_notifier.hasNext()){
			_notifier.next().continueGame(_PlayerActual,_Position, _Value);
		}
	}
	
	public void endGame(String _Position,String _Value, boolean pTimeOver){
		String _message = "none";
		
		if(!pTimeOver){
			if (_Value == _PlayerX){
				_message = "one";
			}
			if (_Value == _PlayerO){
				_message = "two";
			}
		}
		
		Iterator<Function> _notifier = _views.iterator();
		while (_notifier.hasNext()){
			_notifier.next().endGame(_message,_Position, _Value);
		}
	}
}
