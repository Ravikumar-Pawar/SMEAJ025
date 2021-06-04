package jdbc;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Delete extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private String name;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Delete frame = new Delete();
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
	public Delete() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 410);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DELETION PAGE");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setBounds(116, 24, 172, 37);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter the username");
		lblNewLabel_1.setFont(new Font("Arial", Font.ITALIC, 15));
		lblNewLabel_1.setBounds(27, 113, 145, 29);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(235, 113, 118, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Enter the password");
		lblNewLabel_2.setFont(new Font("Arial", Font.ITALIC, 15));
		lblNewLabel_2.setBounds(27, 189, 145, 25);
		contentPane.add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setEchoChar('*');
		passwordField.setBounds(235, 183, 118, 29);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("DELETE");
		btnNewButton.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				String pwd=(String)JOptionPane.showInputDialog(null,null, "Enter your password ",JOptionPane.PLAIN_MESSAGE,null,null,null);
				String nm=(String)JOptionPane.showInputDialog(null,null, "Enter your name ",JOptionPane.PLAIN_MESSAGE,null,null,null);
				String acc=(String)JOptionPane.showInputDialog(null,null, "Enter your account type ",JOptionPane.PLAIN_MESSAGE,null,null,null);
				
				try {
				String url = "jdbc:mysql://localhost:3306/test";
				String username = "root";
				String password = "Hemasree@2119";
			
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				
				
				Connection connection = DriverManager.getConnection(url, username, password);
					String query = "delete from login where name= ? and password=? and accounttype=?";
					PreparedStatement preparedStmt = connection.prepareStatement(query);
					preparedStmt.setString(1, nm);
					preparedStmt.setString(2, pwd);
					preparedStmt.setString(3, acc);
					preparedStmt.execute();
					JOptionPane.showMessageDialog(null,"Deleted successfully...");
			      
			      connection.close();
			    }
			    catch (Exception ex)
			    {
			    	System.out.println(ex);
			    	
			    }
			}
		});
		
			
	
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 15));
		btnNewButton.setBounds(166, 275, 122, 37);
		contentPane.add(btnNewButton);
	}
}
