package jdbc;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
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

public class MainLogin extends JFrame {

	private JPanel contentPane;
	public JTextField textField;
	private JPasswordField passwordField;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainLogin frame = new MainLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public MainLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.pink);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("ABC Bank");
		lblNewLabel.setForeground(Color.MAGENTA);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(175, 40, 150, 14);
		contentPane.setBorder(new LineBorder(Color.cyan, 30));
		contentPane.add(lblNewLabel);

		Button button = new Button("Admin Login");
		button.setForeground(Color.black);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AdminLogin adminLogin = new AdminLogin();
				adminLogin.setVisible(true);
			}
		});
		button.setFont(new Font("Dialog", Font.BOLD, 12));
		button.setBackground(new Color(240, 230, 140));
		button.setBounds(156, 86, 138, 22);
		contentPane.add(button);

		Button button_1 = new Button("Accountant Login");
		button_1.setForeground(Color.black);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg1) {
				Login login = new Login();
				login.setVisible(true);
			}
		});
		button_1.setFont(new Font("Dialog", Font.BOLD, 12));
		button_1.setBackground(new Color(240, 230, 140));
		button_1.setBounds(156, 150, 138, 22);
		contentPane.add(button_1);

	}

}
