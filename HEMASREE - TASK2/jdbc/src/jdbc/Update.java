package jdbc;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Update extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Update frame = new Update();
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
	public Update() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 435, 418);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("UPDATE DETAILS");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setBounds(112, 26, 172, 27);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("PASSWORD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String result=(String)JOptionPane.showInputDialog(null,null, "Enter your password ",JOptionPane.PLAIN_MESSAGE,null,null,null);
				
				try {
						String url = "jdbc:mysql://localhost:3306/test";
						String username = "root";
						String password = "Hemasree@2119";
					
						Class.forName("com.mysql.cj.jdbc.Driver");
						
						
						
						Connection connection = DriverManager.getConnection(url, username, password);
						Statement statement = connection.createStatement();
						String name = (String)JOptionPane.showInputDialog(null,null, "Enter your name ",JOptionPane.PLAIN_MESSAGE,null,null,null);
						String Username = (String)JOptionPane.showInputDialog(null,null, "Enter your old password ",JOptionPane.PLAIN_MESSAGE,null,null,null);
						String query2 = "select name from login where password = '"+password+"'";
						
						ResultSet rs = statement.executeQuery(query2);
						
						if(!rs.next()) 
						{
							
							String pwd = (String)JOptionPane.showInputDialog(null,null, "Enter new password to update ",JOptionPane.PLAIN_MESSAGE,null,null,null);
						
							String query1 = "update login set password='"+password+"' where name = '"+name+"'";
							
							if(statement.executeUpdate(query1)==1)
								{
									JOptionPane.showMessageDialog(null,"password updated successfully...");
								}
							else 
							{
								JOptionPane.showMessageDialog(null,"Enter correct details!!");
							}
							
							statement.close();
							connection.close();
							}
						}
							catch(Exception ex) 
							{
								System.out.println(ex);
							}
				
			}
		});
		
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 15));
		btnNewButton.setBounds(127, 94, 157, 27);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CONTACT NO");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String result = (String)JOptionPane.showInputDialog(null,null, "Enter your password ",JOptionPane.PLAIN_MESSAGE,null,null,null);
				
				try {
						String url = "jdbc:mysql://localhost:3306/test";
						String username = "root";
						String password = "Hemasree@2119";
					
						Class.forName("com.mysql.cj.jdbc.Driver");
						
						
						
						Connection connection = DriverManager.getConnection(url, username, password);
						Statement statement = connection.createStatement();
						String name = (String)JOptionPane.showInputDialog(null,null, "Enter your name ",JOptionPane.PLAIN_MESSAGE,null,null,null);
						String Username = (String)JOptionPane.showInputDialog(null,null, "Enter your old number ",JOptionPane.PLAIN_MESSAGE,null,null,null);
						String query2 = "select name from login where password = '"+password+"'";
						
						ResultSet rs = statement.executeQuery(query2);
						if(!rs.next()) 
						{
							String number = (String)JOptionPane.showInputDialog(null,null, "Enter new number to update ",JOptionPane.PLAIN_MESSAGE,null,null,null);
						
							Pattern pattern = Pattern.compile("[6-9][0-9]{9}");
							Matcher matcher = pattern.matcher(number);
							
							if(matcher.matches()) 
							{
								String query3 = "update login set number='"+Long.parseLong(number)+"' where name = '"+name+"'";
								if(statement.executeUpdate(query3)==1)
								{
									JOptionPane.showMessageDialog(null,"Number updated successfully...");
								}
								else 
								{
									JOptionPane.showMessageDialog(null,"Choose correct pattern for number!!!.");
								}
							}
							statement.close();
							connection.close();
							}
						}
							catch(Exception ex) 
							{
								System.out.println(ex);
							}
				}
							
				
				});
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 15));
		btnNewButton_1.setBounds(127, 175, 157, 27);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("ADDRESS");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String result=(String)JOptionPane.showInputDialog(null,null, "Enter your password ",JOptionPane.PLAIN_MESSAGE,null,null,null);
				
				try {
						String url = "jdbc:mysql://localhost:3306/test";
						String username = "root";
						String password = "Hemasree@2119";
					
						Class.forName("com.mysql.cj.jdbc.Driver");
						
						
						
						Connection connection = DriverManager.getConnection(url, username, password);
						Statement statement = connection.createStatement();
						String name = (String)JOptionPane.showInputDialog(null,null, "Enter your name ",JOptionPane.PLAIN_MESSAGE,null,null,null);
						String Username = (String)JOptionPane.showInputDialog(null,null, "Enter your old address ",JOptionPane.PLAIN_MESSAGE,null,null,null);
						String query2 = "select name from login where password = '"+password+"'";
						
						ResultSet rs = statement.executeQuery(query2);
						
						if(!rs.next()) 
						{
							
							String address = (String)JOptionPane.showInputDialog(null,null, "Enter new address to update ",JOptionPane.PLAIN_MESSAGE,null,null,null);
						
							String query1 = "update login set address='"+address+"' where name = '"+name+"'";
							
							if(statement.executeUpdate(query1)==1)
								{
									JOptionPane.showMessageDialog(null,"Address updated successfully...");
								}
							else 
							{
								JOptionPane.showMessageDialog(null,"Enter correct details!!.");
							}
							
							statement.close();
							connection.close();
							}
						}
							catch(Exception ex) 
							{
								System.out.println(ex);
							}
				
						
			}
					});
		btnNewButton_2.setFont(new Font("Arial", Font.BOLD, 15));
		btnNewButton_2.setBounds(127, 264, 157, 27);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("BACK");
		btnNewButton_3.setForeground(Color.RED);
		btnNewButton_3.setBackground(Color.YELLOW);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Loginpage l = new Loginpage();
				l.setVisible(true);
			}
		});
		btnNewButton_3.setFont(new Font("Arial", Font.BOLD, 15));
		btnNewButton_3.setBounds(151, 344, 85, 27);
		contentPane.add(btnNewButton_3);
	}
}
