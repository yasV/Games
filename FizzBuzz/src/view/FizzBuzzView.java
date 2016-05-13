package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import controller.FizzBuzzController;
import model.Function;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Window.Type;

public class FizzBuzzView extends JFrame implements Function{

	private JPanel contentPane;
	private JTextField _txtFizzValue;
	private JTextField _txtBuzzValue;
	private JTextField _txtTime;
	private JLabel _lblTime;
	private JLabel _lblNumber;
	public JButton _btnSave;
	public JButton _btnStart;
	public JButton _btnOk;
	public JCheckBox _chckbxFizz;
	public JCheckBox _chckbxBuzz;
	private FizzBuzzController _controller;
	/**
	 * Create the frame.
	 */
	
	public FizzBuzzView(FizzBuzzController _TheController){
		setTitle("FIZZBUZZ GAME");
		setResizable(false);
		_controller = _TheController;
		_controller.setFizzBuzzView(this);
		initialize();
		addevents();
	}
	
	private void addevents() {
		this._btnSave.addActionListener(_controller);
		this._btnStart.addActionListener(_controller);
		this._btnOk.addActionListener(_controller);
	}
	
	public void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 514, 345);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 153, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(33, 21, 137, 284);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblConfigurations = new JLabel("Configurations");
		lblConfigurations.setFont(new Font("Aharoni", Font.BOLD, 12));
		lblConfigurations.setForeground(Color.WHITE);
		lblConfigurations.setBounds(25, 5, 85, 14);
		panel.add(lblConfigurations);
		
		JLabel _lblFizzValue = new JLabel("Fizz Value");
		_lblFizzValue.setForeground(Color.WHITE);
		_lblFizzValue.setFont(new Font("Aharoni", Font.BOLD, 12));
		_lblFizzValue.setBounds(10, 34, 70, 14);
		panel.add(_lblFizzValue);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 21, 117, 2);
		panel.add(separator);
		
		_txtFizzValue = new JTextField();
		_txtFizzValue.setBounds(10, 55, 86, 20);
		panel.add(_txtFizzValue);
		_txtFizzValue.setColumns(10);
		
		JLabel _lblBuzzValue = new JLabel("Buzz Value");
		_lblBuzzValue.setFont(new Font("Aharoni", Font.BOLD, 12));
		_lblBuzzValue.setForeground(Color.WHITE);
		_lblBuzzValue.setBounds(10, 86, 70, 14);
		panel.add(_lblBuzzValue);
		
		_txtBuzzValue = new JTextField();
		_txtBuzzValue.setColumns(10);
		_txtBuzzValue.setBounds(10, 103, 86, 20);
		panel.add(_txtBuzzValue);
		
		_lblTime = new JLabel("Time");
		_lblTime.setForeground(Color.WHITE);
		_lblTime.setFont(new Font("Aharoni", Font.BOLD, 12));
		_lblTime.setBounds(10, 140, 70, 14);
		panel.add(_lblTime);
		
		_txtTime = new JTextField();
		_txtTime.setColumns(10);
		_txtTime.setBounds(10, 157, 86, 20);
		panel.add(_txtTime);
		
		_btnSave = new JButton("Save");
		_btnSave.setForeground(new Color(0, 102, 204));
		_btnSave.setBackground(Color.LIGHT_GRAY);
		_btnSave.setFont(new Font("Aharoni", Font.BOLD, 14));
		_btnSave.setBounds(21, 209, 89, 23);
		panel.add(_btnSave);
		
		
		_lblNumber = new JLabel("");
		_lblNumber.setHorizontalAlignment(SwingConstants.CENTER);
		_lblNumber.setForeground(Color.WHITE);
		_lblNumber.setFont(new Font("Arial Black", Font.BOLD, 21));
		_lblNumber.setBounds(304, 56, 43, 42);
		contentPane.add(_lblNumber);
		
		_chckbxFizz = new JCheckBox("Fizz");
		_chckbxFizz.setForeground(new Color(0, 0, 0));
		_chckbxFizz.setBackground(new Color(0, 153, 153));
		_chckbxFizz.setFont(new Font("Aharoni", Font.BOLD, 18));
		_chckbxFizz.setEnabled(false);
		_chckbxFizz.setBounds(250, 176, 97, 23);
		contentPane.add(_chckbxFizz);
		
		_chckbxBuzz = new JCheckBox("Buzz");
		_chckbxBuzz.setForeground(new Color(0, 0, 0));
		_chckbxBuzz.setBackground(new Color(0, 153, 153));
		_chckbxBuzz.setFont(new Font("Aharoni", Font.BOLD, 18));
		_chckbxBuzz.setEnabled(false);
		_chckbxBuzz.setBounds(349, 176, 97, 23);
		contentPane.add(_chckbxBuzz);
		
		_btnOk = new JButton("OK");
		_btnOk.setBackground(Color.GRAY);
		_btnOk.setForeground(new Color(0, 51, 204));
		_btnOk.setFont(new Font("Aharoni", Font.BOLD, 14));
		_btnOk.setEnabled(false);
		_btnOk.setBounds(287, 217, 89, 23);
		contentPane.add(_btnOk);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(FizzBuzzView.class.getResource("/image/chalk-board-icon.png")));
		lblNewLabel.setBounds(258, 11, 175, 133);
		contentPane.add(lblNewLabel);
		
		_btnStart = new JButton("Start Game");
		_btnStart.setForeground(new Color(0, 102, 204));
		_btnStart.setFont(new Font("Aharoni", Font.BOLD, 14));
		_btnStart.setBackground(Color.LIGHT_GRAY);
		_btnStart.setBounds(269, 272, 132, 23);
		contentPane.add(_btnStart);
	}
	
	public int getFizzValue(){
		return Integer.parseInt(_txtFizzValue.getText());
	}
	
	public int getBuzzValue(){
		return Integer.parseInt(_txtBuzzValue.getText());
	}
	
	public int getTimeValue(){
		return Integer.parseInt(_txtTime.getText());
	}
	
	public void displayErrorMessage(String errorMessage){
		JOptionPane.showMessageDialog(this, errorMessage);
	}
	
	public void displayMessage(String message){
		JOptionPane.showMessageDialog(this, message);
	}
	
	public void start(int number,int fizz, int buzz, int time){
		this._lblNumber.setText(Integer.toString(number));
		this._txtTime.setText(Integer.toString(time));
		this._txtBuzzValue.setText(Integer.toString(buzz));
		this._txtFizzValue.setText(Integer.toString(fizz));
		this._chckbxBuzz.setSelected(false);
		this._chckbxFizz.setSelected(false);
		this._chckbxBuzz.setEnabled(true);
		this._chckbxFizz.setEnabled(true);
		this._btnOk.setEnabled(true);
	}
	
	public void continueGame(int _pNumber){
		this._lblNumber.setText(Integer.toString(_pNumber));
		this._chckbxBuzz.setSelected(false);
		this._chckbxFizz.setSelected(false);
	}
	
	public void end(String _pType, int _pNumber){
		this._chckbxBuzz.setEnabled(false);
		this._chckbxFizz.setEnabled(false);
		this._btnOk.setEnabled(false);
		this.displayErrorMessage("You lost the game. The number " + _pNumber + " is " + _pType);
	}
	
	public void setConfiguration(){
		this._chckbxBuzz.setEnabled(false);
		this._chckbxFizz.setEnabled(false);
		this._btnOk.setEnabled(false);
	}
}
