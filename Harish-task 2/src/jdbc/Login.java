package jdbc;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
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

public class Login extends JFrame {
	public static String accname;
	public static String accpass;
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
	public Login() {
		/*JLabel backgnd;
		setSize(1200,700);
		getContentPane().setLayout(null);
		ImageIcon img=new ImageIcon("login.jpg");
		backgnd=new JLabel("",img,JLabel.CENTER);
		backgnd.setBounds(-144,11,1413,700);
		getContentPane().add(backgnd);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		*/
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 153, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JLabel lblNewLabel = new JLabel("ONLINE ATM");
		lblNewLabel.setForeground(new Color(184, 134, 11));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel.setBounds(129, 11, 150, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setForeground(new Color(128, 0, 128));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(93, 36, 75, 20);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(93, 56, 247, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setForeground(new Color(128, 0, 128));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(93, 87, 75, 14);
		contentPane.add(lblNewLabel_2);
		
		Button button = new Button("New User");
		button.setForeground(new Color(184, 134, 11));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Register register=new Register();
				register.setVisible(true);
			}});
		button.setFont(new Font("Dialog", Font.BOLD, 12));
		button.setBackground(new Color(240, 230, 140));
		button.setBounds(270, 186, 70, 22);
		contentPane.add(button);
		
		Button button_1 = new Button("Login");
		button_1.setForeground(new Color(184, 134, 11));
		button_1.setFont(new Font("Dialog", Font.BOLD, 14));
		button_1.setBackground(new Color(240, 230, 140));
		button_1.setBounds(93, 186, 70, 22);
		contentPane.add(button_1);
		
		
		button_1.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent arg0) {
				
				
						try {
							String url = "jdbc:mysql://localhost:3306/harish";
							String uname = "root";
							String password ="harish06!";
							String query="select * from register where UNAME='"+textField.getText()+"' and pass='"+passwordField.getText().toString()+"'";
							Class.forName("com.mysql.cj.jdbc.Driver");
							
							Connection connection = DriverManager.getConnection(url, uname, password);
							Statement statement = connection.createStatement();
							ResultSet rs = statement.executeQuery(query);
							if(rs.next())
							{
								accname=rs.getString("UNAME");
								accpass=rs.getString("pass");
								JOptionPane.showMessageDialog(null, "Welcome "+textField.getText()+"\n Login Successfull");
								Transaction t=new Transaction();
							     t.setVisible(true);
							}
							else {
								if(textField.getText().isEmpty() || passwordField.getText().toString().isEmpty()) {
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
		passwordField = new JPasswordField();
		passwordField.setBounds(93, 112, 247, 20);
		contentPane.add(passwordField);
		
		JLabel label = new JLabel("New label");
		label.setBounds(122, 115, 46, 14);
		contentPane.add(label);
		
		Button button_1_1 = new Button("HomePage");
		button_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Homepage m=new Homepage();
				m.setVisible(true);
			}
		});
		button_1_1.setForeground(new Color(184, 134, 11));
		button_1_1.setFont(new Font("Dialog", Font.BOLD, 14));
		button_1_1.setBackground(new Color(240, 230, 140));
		button_1_1.setBounds(173, 229, 106, 22);
		contentPane.add(button_1_1);
		
				
		
	}
	public static String getAccName() {
		return accname;
	}
	public static String getAccPass() {
		return accpass;
				
	}
}
