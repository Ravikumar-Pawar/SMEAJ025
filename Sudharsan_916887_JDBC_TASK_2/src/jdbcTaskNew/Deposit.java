package jdbcTaskNew;

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
import java.awt.Button;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JTextPane;

public class Deposit extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Deposit frame = new Deposit();
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
	public Deposit() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 527, 383);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(50, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterAmountTo = new JLabel("Enter Amount to Deposit");
		lblEnterAmountTo.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblEnterAmountTo.setBounds(99, 127, 190, 26);
		contentPane.add(lblEnterAmountTo);
		
		textField = new JTextField();
		textField.setBounds(320, 127, 121, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		Button button = new Button("DEPOSIT");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					try {
					
					long deposit = Integer.parseInt(textField.getText());
					
					String result=(String)JOptionPane.showInputDialog(null,null,"Enter your password",JOptionPane.PLAIN_MESSAGE,null,null,null);
					
					String url = "jdbc:mysql://localhost:3306/jdbc_database";
					String uname = "root";
					String password ="Infosys@7";
					Class.forName("com.mysql.cj.jdbc.Driver");
					String query = "select amount,pass from register where user_name ='"+Login.name+"'";
					
				
					
					Connection connection = DriverManager.getConnection(url, uname, password);
					Statement statement = connection.createStatement();
					ResultSet rs = statement.executeQuery(query);
					rs.next();
					String pass=rs.getString("pass");
					if(result.equals(pass)) {
						long amount = rs.getLong("amount");
						
							amount=amount+deposit;
							String query1 ="insert into transaction(name,deposit,avail_balance,trans_date) values ('"+Login.name+"','"+deposit+"','"+amount+"','"+java.time.LocalDate.now()+"')";
							String query2 ="update register set amount='"+amount+"'where user_name='"+Login.name+"'";
							statement.executeUpdate(query1);
							statement.executeUpdate(query2);
							JOptionPane.showMessageDialog(null, "Deposit successfull!!");
						
						
					}
					else {
						JOptionPane.showMessageDialog(null,"Enter valid password..");
					}
						
					}
					
				catch(Exception ex) {
					System.out.println(ex);
				}
				
				}
			
		});
		button.setBackground(Color.LIGHT_GRAY);
		button.setFont(new Font("Times New Roman", Font.BOLD, 12));
		button.setBounds(148, 231, 96, 21);
		contentPane.add(button);
		
		Button button_1 = new Button("BACK");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Transaction t = new Transaction();
				t.setVisible(true);
			}
		});
		button_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		button_1.setBackground(Color.LIGHT_GRAY);
		button_1.setBounds(304, 231, 96, 21);
		contentPane.add(button_1);
		
		JTextPane txtpnDepositPage = new JTextPane();
		txtpnDepositPage.setText("DEPOSIT PAGE");
		txtpnDepositPage.setFont(new Font("Times New Roman", Font.BOLD, 17));
		txtpnDepositPage.setBounds(194, 51, 140, 30);
		contentPane.add(txtpnDepositPage);

	}
}
