package jdbc;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Withdraw extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Withdraw frame = new Withdraw();
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
	public Withdraw() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 477, 416);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WITHDRAWAL AMOUNT");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(146, 39, 250, 42);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER THE AMOUNT TO BE WITHDRAWAL");
		lblNewLabel_1.setFont(new Font("Arial", Font.ITALIC, 15));
		lblNewLabel_1.setBounds(22, 110, 342, 31);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(32, 151, 150, 42);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					long withdraw = Long.parseLong(textField.getText());
					
					String result=(String)JOptionPane.showInputDialog(null,null, "Enter your password ",JOptionPane.PLAIN_MESSAGE,null,null,null);
					
					String url = "jdbc:mysql://localhost:3306/test";
					String username = "root";
					String password = "Hemasree@2119";
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection connection = DriverManager.getConnection(url, username, password);
					Statement statement = connection.createStatement();
					String Query = "select amount,password from login where name='"+Loginpage.name+"'";
					ResultSet rs = statement.executeQuery(Query);
					rs.next();
					
					String pwd = rs.getString("password");
					if(result.equals(pwd))
					{

						long amount = rs.getLong("amount");
						
						if(amount>withdraw)
						{
							amount = amount-withdraw;
							String Query1 = "insert into transaction(name,withdraw,availableamount,transactiondate) values('"+Loginpage.name+"','"+withdraw+"','"+amount+"','"+java.time.LocalDate.now()+"')";
							String Query2 = "update login set amount='"+amount+"' where name ='"+Loginpage.name+"'";
							
							statement.executeUpdate(Query1);
							statement.executeUpdate(Query2);
							
							JOptionPane.showMessageDialog(null, "withdrawal successfull...");
							
							
							}
							else {
								JOptionPane.showMessageDialog(null, "Enter valid amount!! Your balance is...."+amount);
								
							}
				}
					else {
						JOptionPane.showMessageDialog(null,"sorry!!! Enter correct password..");
					}
					}
						
					
				catch(Exception e1) {
					System.out.println(e1);
				}
				
			}
		});
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 15));
		btnNewButton.setBounds(256, 150, 85, 41);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Transaction t = new Transaction();
				t.setVisible(true);
			}
		});
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 15));
		btnNewButton_1.setBounds(144, 288, 108, 42);
		contentPane.add(btnNewButton_1);
	}

}
