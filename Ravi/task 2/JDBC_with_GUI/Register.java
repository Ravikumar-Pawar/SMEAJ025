package com.mysql.jdbc.com;
import java.sql.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.imageio.plugins.tiff.ExifParentTIFFTagSet;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Register extends JFrame {

	private JPanel contentPane;
	private JTextField UserName;
	private JPasswordField Password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
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
	public Register() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 537, 392);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Register for JDBC Login");
		lblNewLabel.setForeground(new Color(139, 0, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel.setBounds(76, 11, 207, 49);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("User Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(101, 99, 89, 31);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(101, 177, 170, 23);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.setBackground(new Color(240, 255, 240));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				

				try {
					String url = "jdbc:mysql://localhost:3306/jdbc_training";
					String uname = "ravi";
					String password ="";
					String query="insert into logindetails values (?, ?)";
					Class.forName("com.mysql.cj.jdbc.Driver");
					
					Connection connection = DriverManager.getConnection(url, uname, password);
					
					//Prepared statemed used here
					Statement statement = connection.createStatement();
					PreparedStatement pstmt = connection.prepareStatement(query);
					
					// input from user
					if(!UserName.getText().isEmpty()|| !Password.getText().toString().isEmpty())
					{
					pstmt.setString(1, UserName.getText());
					pstmt.setString(2, Password.getText().toString());	
					//inserted values
					pstmt.executeUpdate();			
					}
					
					//display the result using normal statemnt 
					String query1="select * from logindetails";
					ResultSet rs = statement.executeQuery(query1);
					
					if(rs.next())
					{	
						if(UserName.getText().isEmpty() || Password.getText().toString().isEmpty())
						{
							JOptionPane.showMessageDialog(null, "Enter User Name and Password");
						}
						else {
							JOptionPane.showMessageDialog(null, "Thanks  "+UserName.getText()+"\n You have successfully registered");	
						}
						
					}
					

					statement.close();
					connection.close();
				} catch (Exception e) {
					System.out.println(e);
					JOptionPane.showMessageDialog(null, UserName.getText()+" Already Registered \n Please Login ");
					

				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(132, 271, 103, 39);
		contentPane.add(btnNewButton);
		
		UserName = new JTextField();
		UserName.setBounds(101, 130, 170, 31);
		contentPane.add(UserName);
		UserName.setColumns(10);
		
		Password = new JPasswordField();
		Password.setBounds(101, 211, 170, 31);
		contentPane.add(Password);
	}
}
