package com.rev.springmvcboot;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Withdraw extends JFrame {

	private JPanel contentPane;
	private JTextField with;
	private JTextField password;
	private JTextField username;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Withdraw frame = new Withdraw();
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
	public Withdraw() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter amount to withdraw");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(10, 95, 206, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblEnterPassword = new JLabel("Enter Password");
		lblEnterPassword.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEnterPassword.setForeground(Color.RED);
		lblEnterPassword.setBounds(10, 133, 135, 27);
		contentPane.add(lblEnterPassword);
		
		with = new JTextField();
		with.setBounds(273, 99, 118, 22);
		contentPane.add(with);
		with.setColumns(10);
		
		password = new JTextField();
		password.setBounds(273, 138, 118, 22);
		contentPane.add(password);
		password.setColumns(10);
		
		JButton withbtn = new JButton("Withdraw");
		withbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (username.getText().isEmpty() || password.getText().isEmpty()) {
					JOptionPane.showMessageDialog(withbtn, "Fill all the fields");
				}
				else {
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
						
						String url="jdbc:mysql://localhost:3306/mybank";
						String uname="revanth";
						String pass="revanth5";
						String query = "SELECT balance,username from user_details where username='"+ username.getText()+"'";
						Connection con = DriverManager.getConnection(url, uname, pass);
						
						Statement st = con.createStatement();
						ResultSet rs = st.executeQuery(query);
						
						rs.next(); 
						    String user=rs.getString("username");
							int balance=rs.getInt("balance");
							int withdraw=Integer.parseInt(with.getText());
							
							
							if(balance>withdraw) {
								balance=balance-withdraw;
								PreparedStatement p=con.prepareStatement("update user_details set balance='"+balance+"' where username='"+user+"'");
						        p.executeUpdate();
								JOptionPane.showMessageDialog(null, "Withdraw of Rs."+withdraw+" successfull.Available balance is"+balance);
							
							}
							con.close();
							st.close();
						
					}catch (ClassNotFoundException e1) {
						e1.printStackTrace();
					}catch (SQLException e1)  {   
						e1.printStackTrace();
					}
				}
			}
		});
		withbtn.setFont(new Font("Tahoma", Font.BOLD, 15));
		withbtn.setForeground(Color.RED);
		
		withbtn.setBounds(149, 195, 110, 23);
		contentPane.add(withbtn);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome to ABC bank");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBounds(100, 11, 215, 31);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Username");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(10, 63, 187, 21);
		contentPane.add(lblNewLabel_2);
		
		username = new JTextField();
		username.setBounds(273, 53, 118, 35);
		contentPane.add(username);
		username.setColumns(10);
	}
}
