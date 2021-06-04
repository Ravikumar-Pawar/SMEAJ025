package jdbc;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;


import java.sql.*;

import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.TextField;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JCheckBox;

public class Register extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_3;
	private JTextField textField_4;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	
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
		
		String url = "jdbc:mysql://localhost:3306/test";
		String username = "root";
		String password = "Hemasree@2119";
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 565, 587);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("REGISTER DETAILS");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setBounds(162, 37, 215, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("USER NAME");
		lblNewLabel_1.setFont(new Font("Arial", Font.ITALIC, 15));
		lblNewLabel_1.setBounds(10, 103, 95, 18);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PASSWORD");
		lblNewLabel_2.setFont(new Font("Arial", Font.ITALIC, 15));
		lblNewLabel_2.setBounds(10, 131, 95, 34);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("DOB");
		lblNewLabel_3.setFont(new Font("Arial", Font.ITALIC, 15));
		lblNewLabel_3.setBounds(10, 228, 55, 18);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("CONTACT NO");
		lblNewLabel_4.setFont(new Font("Arial", Font.ITALIC, 15));
		lblNewLabel_4.setBounds(10, 262, 121, 24);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("ADDRESS DETAILS");
		lblNewLabel_5.setFont(new Font("Arial", Font.ITALIC, 15));
		lblNewLabel_5.setBounds(10, 375, 144, 45);
		contentPane.add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setBounds(217, 97, 160, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(217, 140, 160, 25);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(217, 182, 160, 24);
		contentPane.add(passwordField_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Show pwd");
		chckbxNewCheckBox.setFont(new Font("Arial", Font.BOLD, 10));
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox.isSelected())
				{
					passwordField.setEchoChar((char)0);
				}
				else 
				{
					passwordField.setEchoChar('*');
				}
			}
		});
		chckbxNewCheckBox.setBounds(403, 139, 93, 21);
		contentPane.add(chckbxNewCheckBox);
		
		textField_3 = new JTextField();
		textField_3.setBounds(217, 256, 160, 24);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(218, 375, 184, 45);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("CURRENT ACC");
		rdbtnNewRadioButton_1.setFont(new Font("Arial", Font.ITALIC, 15));
		rdbtnNewRadioButton_1.setBounds(363, 339, 151, 18);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_8 = new JLabel("GENDER");
		lblNewLabel_8.setFont(new Font("Arial", Font.ITALIC, 15));
		lblNewLabel_8.setBounds(10, 305, 95, 13);
		contentPane.add(lblNewLabel_8);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(217, 222, 160, 24);
		contentPane.add(dateChooser);
		
		JRadioButton male = new JRadioButton("MALE");
		male.setFont(new Font("Arial", Font.ITALIC, 15));
		male.setBounds(162, 302, 103, 21);
		contentPane.add(male);
		
		JRadioButton female = new JRadioButton("FEMALE");
		female.setFont(new Font("Arial", Font.ITALIC, 15));
		female.setBounds(363, 302, 103, 21);
		contentPane.add(female);
		
		JLabel lblNewLabel_6 = new JLabel("RE-ENTER PASSWORD");
		lblNewLabel_6.setFont(new Font("Arial", Font.ITALIC, 15));
		lblNewLabel_6.setBounds(10, 186, 184, 18);
		contentPane.add(lblNewLabel_6);
		
		
		JLabel lblNewLabel_7 = new JLabel("ACCOUNT TYPE");
		lblNewLabel_7.setFont(new Font("Arial", Font.ITALIC, 15));
		lblNewLabel_7.setBounds(10, 339, 131, 18);
		contentPane.add(lblNewLabel_7);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("SAVINGS ACC");
		rdbtnNewRadioButton.setFont(new Font("Arial", Font.ITALIC, 15));
		rdbtnNewRadioButton.setBounds(162, 339, 151, 18);
		contentPane.add(rdbtnNewRadioButton);
		
		JLabel lblNewLabel_9 = new JLabel("Are u sure above details are crct");
		lblNewLabel_9.setFont(new Font("Arial", Font.ITALIC, 15));
		lblNewLabel_9.setBounds(10, 456, 224, 18);
		contentPane.add(lblNewLabel_9);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("yes");
		rdbtnNewRadioButton_2.setFont(new Font("Arial", Font.BOLD, 15));
		rdbtnNewRadioButton_2.setBounds(266, 456, 55, 21);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("no");
		rdbtnNewRadioButton_3.setFont(new Font("Arial", Font.BOLD, 15));
		rdbtnNewRadioButton_3.setBounds(347, 456, 60, 21);
		contentPane.add(rdbtnNewRadioButton_3);
		
		
		
		JButton btnNewButton = new JButton("REGISTER");
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				String Username = textField.getText();
				String Password = passwordField.getText();
				String reenterpassword = passwordField_1.getText();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				String dob = sdf.format(dateChooser.getDate());
				String contact = textField_3.getText();
				String address = textField_4.getText();
				
				String gender = "";
				if(male.isSelected())
				{
					gender = "MALE";
				}
				else if(female.isSelected())
				{
					gender = "FEMALE";
				}
				
				String account = "";
				if(rdbtnNewRadioButton.isSelected())
				{
					account = "SAVINGS ACC";
				}
				else if(rdbtnNewRadioButton_1.isSelected())
				{
					account = "CURRENT ACC";
				}
				
				String details = "";
				if(rdbtnNewRadioButton_2.isSelected())
				{
					details = "yes";
				}
				else if(rdbtnNewRadioButton_3.isSelected())
				{
					details = "no";
				}
				
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				
				
				Connection connection = DriverManager.getConnection(url, username, password);
				Statement statement = connection.createStatement();
				String query1 = "select * from login where name ='"+Username+"'";
				
				Pattern pattern = Pattern.compile("[6-9][0-9]{9}");
				Matcher matcher = pattern.matcher(contact);
				
				
				
				if(matcher.matches()) 
				{
					PreparedStatement ps = connection.prepareStatement("insert into login(name,password,date_of_birth,number,gender,accounttype,address,reenterpassword,checkdetails) values(?,?,?,?,?,?,?,?,?)");
					ps.setString(1,Username);
					ps.setString(2, Password);
					ps.setString(8, reenterpassword);
					ps.setDate(3,java.sql.Date.valueOf(dob));
					ps.setLong(4, Long.parseLong(contact));
					ps.setString(6, account);
					ps.setString(7, address);
					ps.setString(5, gender);
					ps.setString(9, details);
					
					ResultSet rs = statement.executeQuery(query1);
					
					if(rdbtnNewRadioButton.isSelected()==true && rdbtnNewRadioButton_1.isSelected()==true)
					{
						JOptionPane.showMessageDialog(null, "choose only one option for account type!!!...");
					}
					else 
					{
						if(!(passwordField.getText().equalsIgnoreCase(passwordField_1.getText())))
					
					{
						JOptionPane.showMessageDialog(null, "password doesn't match...");
						
					}
					
					else 
						{
						if(Username.isEmpty() || Password.isEmpty() || reenterpassword.isEmpty() || dob.isEmpty() || contact.isEmpty() || address.isEmpty()) 
						{
						JOptionPane.showMessageDialog(null, "Enter all the details..!!");
						}
						else 
						{
							if(rdbtnNewRadioButton_3.isSelected())
							{
								JOptionPane.showMessageDialog(null, "Check the details once...");
							}
							else 
							{
								if(rdbtnNewRadioButton_2.isSelected())
								{
									JOptionPane.showMessageDialog(null, "Proceed....");
								}	
								if(rs.next()) 
								{
									JOptionPane.showMessageDialog(null, "sorry "+Username+"\n entered existing details...");
								}
								else
								{
									ps.executeUpdate();
						
									JOptionPane.showMessageDialog(null, "Thankyou "+Username+"\n You have registered successfully..!!");
									Loginpage l = new Loginpage();
									l.setVisible(true);
					
								}
							}
						}
						}
				
					}
				}		
				else if(!matcher.matches()) 
				{
					JOptionPane.showMessageDialog(null, "Enter valid contact number");
				}
					
				statement.close();
				connection.close();
				}
				catch(Exception ex) 
				{
					System.out.println(ex);
				}
			
			}
		});
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnNewButton.setBounds(217, 505, 144, 24);
		contentPane.add(btnNewButton);
		
		
		
		
		
		
		
		
		
		
		}
}
