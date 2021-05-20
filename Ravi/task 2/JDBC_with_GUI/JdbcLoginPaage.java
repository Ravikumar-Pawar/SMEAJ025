package com.mysql.jdbc.com;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.*;
import java.awt.event.*;

public class JdbcLoginPaage extends JFrame {

	private JPanel contentPane;
	private JTextField user;
	private JPasswordField pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JdbcLoginPaage frame = new JdbcLoginPaage();
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
	public JdbcLoginPaage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 509, 445);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("welcome To JDBC ");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel.setBounds(145, 11, 212, 35);
		contentPane.add(lblNewLabel);
		
		user = new JTextField();
		user.setBounds(139, 91, 218, 35);
		contentPane.add(user);
		user.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				try {
					String url = "jdbc:mysql://localhost:3306/jdbc_training";
					String uname = "ravi";
					String password ="";
					String query="select * from logindetails where username='"+user.getText()+"' and password='"+pass.getText().toString()+"'";
					Class.forName("com.mysql.cj.jdbc.Driver");
					
					Connection connection = DriverManager.getConnection(url, uname, password);
					Statement statement = connection.createStatement();
					ResultSet rs = statement.executeQuery(query);
					
					if(rs.next())
					{
						
						
							JOptionPane.showMessageDialog(null, "Welcome "+user.getText()+"\n Login Successfull");

					
						
					}
					else {
						if(user.getText().isEmpty() || pass.getText().toString().isEmpty()) {
							JOptionPane.showMessageDialog(null, "Enter User Name and password\n");
						}
						else {
							JOptionPane.showMessageDialog(null, "Incorrect details");
						}
						
					}
					
					
					statement.close();
					connection.close();
				} catch (Exception e) {
					System.out.println(e);
				}
				
			}
		});
		btnNewButton.setBounds(145, 276, 89, 35);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(142, 66, 86, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(145, 142, 76, 14);
		contentPane.add(lblNewLabel_2);
		
		pass = new JPasswordField();
		pass.setBounds(145, 167, 218, 35);
		contentPane.add(pass);
		
		JButton btnNewButton_1 = new JButton("New User");
		btnNewButton_1.setBackground(new Color(255, 127, 80));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Register register = new Register();
				register.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(283, 277, 89, 34);
		contentPane.add(btnNewButton_1);
	}
}
