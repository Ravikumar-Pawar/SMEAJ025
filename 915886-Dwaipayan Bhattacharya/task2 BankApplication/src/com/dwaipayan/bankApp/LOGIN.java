package com.dwaipayan.bankApp;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import com.dwaipayan.bankApp.dataBase.LoginDao;
import com.dwaipayan.bankApp.userDetails.UserAccountDetails;

import javax.swing.JPasswordField;

public class LOGIN extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	
	private LoginDao login;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public LOGIN() {
		
		setBounds(100, 100, 677, 508);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 10));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(267, 11, 107, 55);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(390, 128, 227, 47);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(390, 244, 227, 47);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER USERNAME ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setForeground(SystemColor.textHighlight);
		lblNewLabel_1.setBounds(120, 144, 157, 31);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER PASSWORD");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setForeground(SystemColor.textHighlight);
		lblNewLabel_2.setBounds(122, 260, 163, 31);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(400, 364, 125, 47);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			   String username = textField.getText();
			   String password = String.valueOf(passwordField.getPassword());
			   login = new LoginDao();
			   try {
				if(login.performLogin(username, password))
				   {
					String msg ="LOGIN SUCCESSFUL!\n\n WELCOME!\n";
					UserAccountDetails usa = new UserAccountDetails();
					usa.setUserName(username);
					@SuppressWarnings("unchecked")
					userUtility ut = new userUtility(usa);
					ut.setVisible(true);
					JOptionPane.showMessageDialog(ut, msg);
					dispose();
					   }
				else {
					String msg ="ENTERED USERNAME OR PASSWORD IS INVALID!\n\n OR\n REGISTER FIRST!\n";
					JOptionPane.showMessageDialog(contentPane, msg);
				}
				
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			   
				
			}
			
		});
		
		JButton btnNewButton_1 = new JButton("RESET");
		btnNewButton_1.setForeground(SystemColor.textHighlight);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(152, 364, 125, 47);
		contentPane.add(btnNewButton_1);
		
		
	}
}
