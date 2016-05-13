package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import model.Function;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.TicTacToeController;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class TicTacToeView extends JFrame implements Function{

	private JPanel contentPane;
	private JLabel _lblPlayer;
	private TicTacToeController _controller;
	public JButton _btnNewGame;
	public JButton _btn11;
	public JButton _btn12;
	public JButton _btn13;
	
	public JButton _btn21;
	public JButton _btn22;
	public JButton _btn23;
	
	public JButton _btn31;
	public JButton _btn32;
	public JButton _btn33;
	
	
	public TicTacToeView(TicTacToeController theController){
		_controller = theController;
		_controller.setTicTacToeView(this);
		initialize();
		addevents();
	}
	private void addevents() {
		this._btnNewGame.addActionListener(_controller);
		
		this._btn11.addActionListener(_controller);
		this._btn12.addActionListener(_controller);
		this._btn13.addActionListener(_controller);
		
		this._btn21.addActionListener(_controller);
		this._btn22.addActionListener(_controller);
		this._btn23.addActionListener(_controller);
		
		this._btn31.addActionListener(_controller);
		this._btn32.addActionListener(_controller);
		this._btn33.addActionListener(_controller);
		
	}
	/**
	 * Create the frame.
	 */
	public void initialize() {
		setTitle("TICTACTOE");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 511, 347);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 153, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		_btnNewGame = new JButton("New Game");
		_btnNewGame.setBackground(Color.GRAY);
		_btnNewGame.setForeground(new Color(153, 0, 0));
		_btnNewGame.setFont(new Font("Aharoni", Font.BOLD, 13));
		_btnNewGame.setBounds(353, 256, 119, 30);
		contentPane.add(_btnNewGame);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(50, 31, 237, 243);
		contentPane.add(panel);
		panel.setLayout(null);
		
		_btn11 = new JButton("");
		_btn11.setEnabled(false);
		_btn11.setBounds(10, 11, 64, 66);
		panel.add(_btn11);
		
		_btn21 = new JButton("");
		_btn21.setEnabled(false);
		_btn21.setBounds(10, 88, 64, 66);
		panel.add(_btn21);
		
		_btn31 = new JButton("");
		_btn31.setEnabled(false);
		_btn31.setBounds(10, 165, 64, 66);
		panel.add(_btn31);
		
		_btn12 = new JButton("");
		_btn12.setEnabled(false);
		_btn12.setBounds(84, 11, 64, 66);
		panel.add(_btn12);
		
		_btn22 = new JButton("");
		_btn22.setEnabled(false);
		_btn22.setBounds(84, 88, 64, 66);
		panel.add(_btn22);
		
		_btn32 = new JButton("");
		_btn32.setEnabled(false);
		_btn32.setBounds(84, 165, 64, 66);
		panel.add(_btn32);
		
		_btn33 = new JButton("");
		_btn33.setEnabled(false);
		_btn33.setBounds(158, 165, 64, 66);
		panel.add(_btn33);
		
		_btn23 = new JButton("");
		_btn23.setEnabled(false);
		_btn23.setBounds(158, 88, 64, 66);
		panel.add(_btn23);
		
		_btn13 = new JButton("");
		_btn13.setEnabled(false);
		_btn13.setBounds(158, 11, 64, 66);
		panel.add(_btn13);
		
		_lblPlayer = new JLabel("Welcome Press New Game");
		_lblPlayer.setFont(new Font("Aharoni", Font.BOLD, 14));
		_lblPlayer.setBounds(297, 99, 198, 60);
		contentPane.add(_lblPlayer);
	}
	
	
	public void displayErrorMessage(String errorMessage){
		JOptionPane.showMessageDialog(this, errorMessage);
	}
	
	public void displayMessage(String message){
		JOptionPane.showMessageDialog(this, message);
	}
	
	public void startGame(boolean pPlayer){
		_btn11.setText("");
		_btn12.setText("");
		_btn13.setText("");
		
		_btn21.setText("");
		_btn22.setText("");
		_btn23.setText("");
		
		_btn31.setText("");
		_btn32.setText("");
		_btn33.setText("");
		
		_btn11.setEnabled(true);
		_btn12.setEnabled(true);
		_btn13.setEnabled(true);
		
		_btn21.setEnabled(true);
		_btn22.setEnabled(true);
		_btn23.setEnabled(true);
		
		_btn31.setEnabled(true);
		_btn32.setEnabled(true);
		_btn33.setEnabled(true);
		
		if(pPlayer){
			this._lblPlayer.setText("Player One is your turn");
		}
		else{
			this._lblPlayer.setText("Player Two is your turn");
		}
	}
	
	public void continueGame(boolean pPlayer,String pPosition, String pValue){
		if(pPlayer){
			this._lblPlayer.setText("Player One is your turn");
		}
		else{
			this._lblPlayer.setText("Player Two is your turn");
		}
		
		switch(pPosition){
			case"11":
				_btn11.setEnabled(false);
				_btn11.setText(pValue);
				break;
				
			case"12":
				_btn12.setEnabled(false);
				_btn12.setText(pValue);
				break;
				
			case"13":
				_btn13.setEnabled(false);
				_btn13.setText(pValue);
				break;
				
			case"21":
				_btn21.setEnabled(false);
				_btn21.setText(pValue);
				break;
				
			case"22":
				_btn22.setEnabled(false);
				_btn22.setText(pValue);
				break;
				
			case"23":
				_btn23.setEnabled(false);
				_btn23.setText(pValue);
				break;
				
			case"31":
				_btn31.setEnabled(false);
				_btn31.setText(pValue);
				break;
				
			case"32":
				_btn32.setEnabled(false);
				_btn32.setText(pValue);
				break;
				
			case"33":
				_btn33.setEnabled(false);
				_btn33.setText(pValue);
				break;
		}
	}
	
	public void endGame(String pMessage, String pPosition,String pValues){
		String _Message = "";
		String _Value = "";
		switch(pMessage){
			case "one":
				_Message = "Player One wins";
				break;
			case "two":
				_Message = "Player Two wins";
				break;
			case "none":
				_Message = "Nobody wins";
				break;
		}
		setBottomText(pPosition,pValues);
		disableBottom();
		this.displayMessage(_Message);
		this._lblPlayer.setText("");
	}
	
	public void disableBottom(){
		_btn11.setEnabled(false);
		_btn12.setEnabled(false);
		_btn13.setEnabled(false);
		
		_btn21.setEnabled(false);
		_btn22.setEnabled(false);
		_btn23.setEnabled(false);
		
		_btn31.setEnabled(false);
		_btn32.setEnabled(false);
		_btn33.setEnabled(false);
	}
	
	public void setBottomText(String pPosition,String pValue){
		switch(pPosition){
		case"11":
			_btn11.setText(pValue);
			break;
			
		case"12":
			_btn12.setText(pValue);
			break;
			
		case"13":
			_btn13.setText(pValue);
			break;
			
		case"21":
			_btn21.setText(pValue);
			break;
			
		case"22":
			_btn22.setText(pValue);
			break;
			
		case"23":
			_btn23.setText(pValue);
			break;
			
		case"31":
			_btn31.setText(pValue);
			break;
			
		case"32":
			_btn32.setText(pValue);
			break;
			
		case"33":
			_btn33.setText(pValue);
			break;
	}
	}
}
