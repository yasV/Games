package model;

import java.util.ArrayList;

public class TicTacToeModel {
	private static ArrayList<Function> _views=new ArrayList<Function>();
	private int[][] _Board = new int[3][3];
	
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
}
