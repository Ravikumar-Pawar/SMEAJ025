package jdbc;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import jdbc.Loginpage;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Label;

public class Balance extends JFrame {

	private JPanel contentPane;
	public static String name;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Balance frame = new Balance();
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
	public Balance() {
		
		try {
			
			String result=(String)JOptionPane.showInputDialog(null,null, "Enter your password ",JOptionPane.PLAIN_MESSAGE,null,null,null);

			String url = "jdbc:mysql://localhost:3306/test";
			String username = "root";
			String password = "Hemasree@2119";
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url, username, password);
			Statement statement = connection.createStatement();
			String Query = "select amount from login where name='"+Loginpage.name+"'";
			ResultSet rs = statement.executeQuery(Query);
			rs.next();
			
			
		
			
			
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 485);
		contentPane = new JPanel();
		contentPane.setBackground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CHECK BALANCE");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(160, 50, 210, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("YOUR BALANCE IS .....");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_1.setBounds(53, 140, 224, 25);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("HOMEPAGE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Loginpage l = new Loginpage();
				l.setVisible(true);
			}
		});

		btnNewButton.setFont(new Font("Arial", Font.BOLD, 15));
		btnNewButton.setBounds(96, 321, 134, 31);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Transaction t = new Transaction();
				t.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 15));
		btnNewButton_1.setBounds(362, 321, 85, 31);
		contentPane.add(btnNewButton_1);
		
		Label label = new Label(rs.getString("amount"));
		label.setFont(new Font("Arial", Font.BOLD, 16));
		label.setForeground(Color.BLUE);
		label.setBounds(168, 218, 109, 31);
		contentPane.add(label);
		
		
		}
		catch(Exception e1) {
			System.out.println(e1);
		}
		
			
			
		
		
	}
}
