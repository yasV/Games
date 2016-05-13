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
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToeView frame = new TicTacToeView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public TicTacToeView(TicTacToeController theController){
		_controller = theController;
		_controller.setTicTacToeView(this);
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
	public TicTacToeView() {
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
		_btn11.setBounds(10, 11, 64, 66);
		panel.add(_btn11);
		
		_btn21 = new JButton("");
		_btn21.setBounds(10, 88, 64, 66);
		panel.add(_btn21);
		
		_btn31 = new JButton("");
		_btn31.setBounds(10, 165, 64, 66);
		panel.add(_btn31);
		
		_btn12 = new JButton("");
		_btn12.setBounds(84, 11, 64, 66);
		panel.add(_btn12);
		
		_btn22 = new JButton("");
		_btn22.setBounds(84, 88, 64, 66);
		panel.add(_btn22);
		
		_btn32 = new JButton("");
		_btn32.setBounds(84, 165, 64, 66);
		panel.add(_btn32);
		
		_btn33 = new JButton("");
		_btn33.setBounds(158, 165, 64, 66);
		panel.add(_btn33);
		
		_btn23 = new JButton("");
		_btn23.setBounds(158, 88, 64, 66);
		panel.add(_btn23);
		
		_btn13 = new JButton("");
		_btn13.setBounds(158, 11, 64, 66);
		panel.add(_btn13);
		
		JLabel _lblPlayerOne = new JLabel("Player one");
		_lblPlayerOne.setFont(new Font("Aharoni", Font.BOLD, 14));
		_lblPlayerOne.setBounds(393, 31, 89, 14);
		contentPane.add(_lblPlayerOne);
	}
	
	
	public void displayErrorMessage(String errorMessage){
		JOptionPane.showMessageDialog(this, errorMessage);
	}
	
	public void displayMessage(String message){
		JOptionPane.showMessageDialog(this, message);
	}
}
