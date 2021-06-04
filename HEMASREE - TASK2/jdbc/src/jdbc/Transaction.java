package jdbc;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;

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
		setBounds(100, 100, 513, 518);
		contentPane = new JPanel();
		contentPane.setBackground(Color.YELLOW);
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TRANSACTION DETAILS");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblNewLabel.setBounds(146, 40, 315, 34);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("BALANCE ENQUIRY");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a1) 
			{
				Balance be = new Balance();
				be.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 15));
		btnNewButton.setBounds(146, 128, 204, 47);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("WITHDRAWAL AMOUNT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a2) 
			{
				Withdraw wa = new Withdraw();
				wa.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 15));
		btnNewButton_1.setBounds(146, 215, 219, 47);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("DEPOSIT MONEY");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a3) 
			{
				Deposit dm = new Deposit();
				dm.setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("Arial", Font.BOLD, 15));
		btnNewButton_2.setBounds(153, 323, 197, 41);
		contentPane.add(btnNewButton_2);
		
		Button button = new Button("BACK");
		button.setBackground(Color.PINK);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				 Loginpage l = new Loginpage();
				 l.setVisible(true);
			}
		});
		button.setFont(new Font("Arial Black", Font.BOLD, 15));
		button.setBounds(194, 414, 124, 45);
		contentPane.add(button);
		
		
			
	}
}
