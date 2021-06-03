package jdbc;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Button;
import jdbc.Login;
import javax.swing.JPasswordField;


// admin user name = ani , password = ani
public class AdminLogin extends JFrame {
	public static String admin_name;
	public static String admin_password;
	private JPanel contentPane;
	public JTextField textField;
	private JPasswordField passwordField;
	
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
	public AdminLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(150, 191, 200));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("WELCOME TO ATM");
		lblNewLabel.setForeground(new Color(184, 134, 11));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(129, 11, 150, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Admin name");
		lblNewLabel_1.setForeground(new Color(100, 0, 100));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(93, 36, 75, 20);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(93, 56, 247, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setForeground(new Color(100, 0, 100));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(93, 87, 75, 14);
		contentPane.add(lblNewLabel_2);
		
		
		Button button_1 = new Button("Login");
		button_1.setForeground(new Color(128, 134, 128));
		button_1.setFont(new Font("Dialog", Font.BOLD, 14));
		button_1.setBackground(new Color(240, 230, 140));
		button_1.setBounds(93, 186, 70, 22);
		contentPane.add(button_1);
		
		
		button_1.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent arg0) {
				
				
						try {
							String url = "jdbc:mysql://localhost:3306/sys";
							String uname = "root";
							String password ="Anishka1999@";
							String query="select * from admin where admin_name='"+textField.getText()+"' and admin_password='"+passwordField.getText().toString()+"'";
							Class.forName("com.mysql.cj.jdbc.Driver");
							
							Connection connection = DriverManager.getConnection(url, uname, password);
							Statement statement = connection.createStatement();
							ResultSet rs = statement.executeQuery(query);
							
							
							
							
							if(rs.next())
							{
								admin_name=rs.getString("admin_name");
								admin_password=rs.getString("admin_password");
								JOptionPane.showMessageDialog(null, "Welcome "+textField.getText()+"\n Login Successfull");
								AccountantDetails ad=new AccountantDetails();
							     ad.setVisible(true);
							}
							else {
								if(textField.getText().isEmpty() || passwordField.getText().toString().isEmpty()) {
									JOptionPane.showMessageDialog(null, "Enter Admin Name and password\n");
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
		passwordField = new JPasswordField();
		passwordField.setBounds(93, 112, 247, 20);
		contentPane.add(passwordField);
		
				
		
	}
	public static String getAccName() {
		return admin_name;
	}
	public static String getAccPass() {
		return admin_password;
				
	}
}
