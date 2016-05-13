package model;

import java.util.ArrayList;
import java.util.Iterator;

import view.FizzBuzzView;


/**
 * @author Yasiell-PC
 *
 */
/**
 * @author Yasiell-PC
 *
 */
public class FizzBuzzModel {
	
	private int _Fizz = 3;
	private int _Buzz = 5;
	private int _Time = 15;
	private int _Number = 1;
	private static ArrayList<Function> _views=new ArrayList<Function>();

	public FizzBuzzModel(){
		this(null);
	}

	public FizzBuzzModel(Function _pView) {
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
	
	public int get_Fizz() {
		return _Fizz;
	}
	public void set_Fizz(int _Fizz) {
		this._Fizz = _Fizz;
	}
	public int get_Buzz() {
		return _Buzz;
	}
	public void set_Buzz(int _Buzz) {
		this._Buzz = _Buzz;
	}
	public int get_Time() {
		return _Time;
	}
	public void set_Time(int _Time) {
		this._Time = _Time;
	}
	
	public int get_Number() {
		return _Number;
	}
	public void set_Number() {
		this._Number = 1;
	}
	
	public void setConfiguration(int _pFizz,int _pBuzz, int _pTime){
		set_Fizz(_pFizz);
		set_Buzz(_pBuzz);
		set_Time(_pTime);
	}
	
	public void checkOption(int _pFizz,int _pBuzz){
		switch(correctOption()){
			case "BOTH":
				if( (_pFizz == 1) && (_pBuzz == 1)){
					continueGame();
					break;
				}
				else{
					endGame("FIZZ BUZZ");
					break;
				}
			case "FIZZ":
				if( (_pFizz == 1) && (_pBuzz == 0) ){
					continueGame();
					break;
				}
				else{
					endGame("FIZZ");
					break;
				}
			case "BUZZ":
				if( (_pFizz == 0) && (_pBuzz == 1)){
					continueGame();
					break;
				}
				else{
					endGame("BUZZ");
					break;
				}
			case "NONE":
				if( (_pFizz == 0) && (_pBuzz == 0)){
					continueGame();
					break;
				}
				else{
					endGame("NONE");
					break;
				}
		}
	}
	
	public String correctOption(){
		if(((_Number % _Fizz) == 0 ) && ((_Number % _Buzz) == 0 ) ){
			return "BOTH";
		}
		if((_Number % _Fizz) == 0){
			return "FIZZ";
		}
		if((_Number % _Buzz) == 0){
			return "BUZZ";
		}
		return "NONE";
	}
	
	public void continueGame(){
		_Number ++;
		Iterator<Function> _notifier = _views.iterator();
		while (_notifier.hasNext()){
			_notifier.next().continueGame(_Number);
		}
	}
	
	public void endGame(String _pType){
		Iterator<Function> _notifier = _views.iterator();
		while (_notifier.hasNext()){
			_notifier.next().end(_pType, _Number);
		}
		_Number = 1;
	}
}
