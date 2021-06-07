package jdbcTaskNew;

import java.awt.BorderLayout;
import java.sql.*;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Button;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import java.awt.SystemColor;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.JPasswordField;

public class Login extends JFrame {

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
		setBounds(100, 100, 527, 384);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(50, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(262, 145, 126, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(262, 201, 126, 30);
		contentPane.add(passwordField);
		
		Button button = new Button("Login");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					name = textField.getText();
					String password = passwordField.getText();
					String url = "jdbc:mysql://localhost:3306/jdbc_database";
					String user = "root";
					String pwd = "Infosys@7";
					Class.forName("com.mysql.cj.jdbc.Driver");
					String query = "select * from register where user_name = '"+name+"' and pass = '"+password+"' ";
					
					Connection connection = DriverManager.getConnection(url,user,pwd);
					Statement statement = connection.createStatement();
					ResultSet rs = statement.executeQuery(query);
					if (rs.next()) {
						String acc_name = rs.getString("user_name");
						JOptionPane.showMessageDialog(null, "Welcome "+name+"\n Login Successfull!");
						Transaction t = new Transaction();
						t.setVisible(true);
					}
					else {
						if(textField.getText().isEmpty() || passwordField.getText().isEmpty()) {
							JOptionPane.showMessageDialog(null, "Enter username and password..");
						}
						else {
							JOptionPane.showMessageDialog(null,"Incorrect Details..");
						}
					}
					statement.close();
					connection.close();
				}
				catch(Exception ex){
					System.out.println(ex);
				}
			}
		});
		button.setBackground(UIManager.getColor("Button.darkShadow"));
		button.setFont(new Font("Times New Roman", Font.BOLD, 14));
		button.setForeground(Color.BLACK);
		button.setBounds(213, 262, 85, 33);
		contentPane.add(button);
		
		JTextPane txtpnLoginPage = new JTextPane();
		txtpnLoginPage.setText("LOGIN PAGE");
		txtpnLoginPage.setFont(new Font("Times New Roman", Font.BOLD, 17));
		txtpnLoginPage.setBounds(195, 65, 126, 30);
		contentPane.add(txtpnLoginPage);
		
		JTextPane txtpnUserName = new JTextPane();
		txtpnUserName.setText("User Name");
		txtpnUserName.setFont(new Font("Times New Roman", Font.BOLD, 17));
		txtpnUserName.setBounds(81, 145, 126, 30);
		contentPane.add(txtpnUserName);
		
		JTextPane txtpnPassword = new JTextPane();
		txtpnPassword.setText("Password");
		txtpnPassword.setFont(new Font("Times New Roman", Font.BOLD, 17));
		txtpnPassword.setBounds(81, 201, 126, 30);
		contentPane.add(txtpnPassword);
		
	
	}

}
