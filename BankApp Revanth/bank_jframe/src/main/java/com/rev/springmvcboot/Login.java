package com.rev.springmvcboot;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Color;
import java.awt.Button;
import java.awt.TextField;
import java.awt.Label;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;


public class Login extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.YELLOW);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Label label = new Label("Welcome to ABC bank");
		label.setFont(new Font("Dialog", Font.BOLD, 16));
		label.setForeground(Color.YELLOW);
		label.setBackground(Color.RED);
		label.setBounds(108, 10, 193, 22);
		contentPane.add(label);
		
		TextField username = new TextField();
		username.setBounds(198, 67, 103, 22);
		contentPane.add(username);
		
		TextField password = new TextField();
		password.setBounds(198, 123, 103, 22);
		contentPane.add(password);
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(48, 67, 86, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(48, 123, 82, 14);
		contentPane.add(lblNewLabel_1);
		
		
		Button button = new Button("Login");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (username.getText().isEmpty() || password.getText().isEmpty()) {
					JOptionPane.showMessageDialog(button, "Fill all the fields");
				}
				
				else {
					try {
	
						Class.forName("com.mysql.cj.jdbc.Driver");
	
						String url="jdbc:mysql://localhost:3306/mybank";
						String uname="revanth";
						String pass="revanth5";
						String query = "SELECT pass_word,username from user_details where username='"+ username.getText()+"'";
	
						Connection con = DriverManager.getConnection(url, uname, pass);
	
						Statement st = con.createStatement();
						ResultSet rs = st.executeQuery(query);
						rs.next();
						
						String correctPassword = rs.getString(1);
						String user=rs.getString(1);
						if (password.getText().equals(correctPassword)) {
	
							Welcome welcome = new Welcome();
						
	
							welcome.setVisible(true);
	
						} else {
							
							JOptionPane.showMessageDialog(button, "Wrong Password");
							
						}
						con.close();
						st.close();
	
					} catch (ClassNotFoundException e1) {
						e1.printStackTrace();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
					
				}
			}
			
		});
		button.setBackground(Color.GREEN);
		button.setBounds(48, 190, 70, 22);
		contentPane.add(button);
		
		Button button_1 = new Button("Register");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					Register registerPage = new Register();
					registerPage.setVisible(true);
				
				
			}
		});
		button_1.setBackground(Color.ORANGE);
		button_1.setBounds(231, 190, 70, 22);
		contentPane.add(button_1);
		
		
		
		
		
		
		
	}
}
