package jdbc;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Button;

import java.sql.*;
import javax.swing.JPasswordField;

public class Loginpage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	public static String name;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Loginpage frame = new Loginpage();
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
	public Loginpage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 553, 436);
		contentPane = new JPanel();
		contentPane.setBackground(Color.MAGENTA);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BANK DETAILS");
		lblNewLabel.setBounds(150, 5, 185, 29);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("USERNAME");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_1.setBounds(200, 83, 122, 13);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(200, 118, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(200, 192, 96, 19);
		contentPane.add(passwordField);
		
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
		chckbxNewCheckBox.setBounds(321, 191, 93, 21);
		contentPane.add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_2 = new JLabel("PASSWORD");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_2.setBounds(200, 166, 96, 13);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(92, 274, 29, -4);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("UPDATE");
		btnNewButton_2.setBackground(Color.YELLOW);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Update u = new Update();
				u.setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("Arial", Font.BOLD, 10));
		btnNewButton_2.setBounds(195, 316, 85, 21);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("DELETE");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Delete d = new Delete();
				d.setVisible(true);
			}
		});
		btnNewButton_3.setFont(new Font("Arial", Font.BOLD, 10));
		btnNewButton_3.setBounds(350, 316, 85, 21);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_1 = new JButton("LOGIN");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					name = textField.getText();
					String Password = passwordField.getText();
					String url = "jdbc:mysql://localhost:3306/test";
					String username = "root";
					String password = "Hemasree@2119";
					Class.forName("com.mysql.cj.jdbc.Driver");
					
					Connection connection = DriverManager.getConnection(url, username, password);
					Statement statement = connection.createStatement();
					String Query = "select * from login where name='"+name+"' and password='"+Password+"'";
					ResultSet rs=statement.executeQuery(Query);
					
						if(rs.next()) 
						{
						String accname = rs.getString("name");
						
						JOptionPane.showMessageDialog(null, "login successfully");
						Transaction t = new Transaction();
						t.setVisible(true);
					}
						else {
							if(textField.getText().isEmpty() || passwordField.getText().toString().isEmpty()) {
								JOptionPane.showMessageDialog(null, "Fill all the details...");
							}
							else {
								JOptionPane.showMessageDialog(null, "details are incorrect!!!");
							}
						}
					statement.close();
					connection.close();
				}
				catch(Exception ex) {
					System.out.println(ex);
				}
			}
		});
		btnNewButton_1.setBackground(Color.GREEN);
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 10));
		btnNewButton_1.setBounds(45, 316, 85, 21);
		contentPane.add(btnNewButton_1);
		
		
		
		
		
	}
}
