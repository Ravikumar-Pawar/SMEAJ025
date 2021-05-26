package jdbc;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.Button;
import java.awt.Color;

public class Transaction extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Transaction frame = new Transaction();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Transaction() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MONEY TRANSACTION");
		lblNewLabel.setForeground(new Color(205, 92, 92));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(99, 11, 280, 23);
		contentPane.add(lblNewLabel);
		
		Button button = new Button("CHECK ACCOUNT DETAILS");
		button.setForeground(new Color(255, 255, 255));
		button.setFont(new Font("Dialog", Font.BOLD, 12));
		button.setBackground(new Color(255, 127, 80));
		button.setBounds(150, 58, 171, 22);
		contentPane.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AccountDetails acc=new AccountDetails();
				acc.setVisible(true);
			}});
		
		Button button_1 = new Button("WITHDRAW MONEY");
		button_1.setForeground(new Color(255, 255, 255));
		button_1.setBackground(new Color(135, 206, 250));
		button_1.setFont(new Font("Dialog", Font.BOLD, 12));
		button_1.setBounds(150, 113, 171, 22);
		contentPane.add(button_1);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Withdraw w= new Withdraw();
				w.setVisible(true);
			}});
		
		
		Button button_2 = new Button("DEPOSIT MONEY");
		button_2.setForeground(new Color(255, 255, 255));
		button_2.setFont(new Font("Dialog", Font.BOLD, 12));
		button_2.setBackground(new Color(50, 205, 50));
		button_2.setBounds(150, 174, 171, 22);
		contentPane.add(button_2);
		
		Button button_2_1 = new Button("LOGOUT");
		button_2_1.setForeground(new Color(255, 255, 255));
		button_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login l=new Login();
				l.setVisible(true);
			}
		});
		button_2_1.setFont(new Font("Dialog", Font.BOLD, 12));
		button_2_1.setBackground(new Color(128, 128, 128));
		button_2_1.setBounds(150, 229, 171, 22);
		contentPane.add(button_2_1);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Deposit d= new Deposit();
				d.setVisible(true);
			}});
	}
}
