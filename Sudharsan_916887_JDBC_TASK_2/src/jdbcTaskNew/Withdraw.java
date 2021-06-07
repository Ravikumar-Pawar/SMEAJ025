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
import java.awt.Label;

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
import javax.swing.UIManager;

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
		setBounds(100, 100, 527, 320);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(50, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterAmountTo = new JLabel("Enter Amount to Withdraw");
		lblEnterAmountTo.setBackground(Color.BLACK);
		lblEnterAmountTo.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblEnterAmountTo.setBounds(85, 109, 188, 37);
		contentPane.add(lblEnterAmountTo);
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setBounds(303, 115, 129, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		Button button = new Button("WITHDRAW");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					long withdraw = Integer.parseInt(textField.getText());
					
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
						if(amount>withdraw) {
							amount=amount-withdraw;
							String query1 ="insert into transaction(name,withdraw,avail_balance,trans_date) values ('"+Login.name+"','"+withdraw+"','"+amount+"','"+java.time.LocalDate.now()+"')";
							String query2 ="update register set amount='"+amount+"'where user_name='"+Login.name+"'";
							statement.executeUpdate(query1);
							statement.executeUpdate(query2);
							JOptionPane.showMessageDialog(null, "Withdraw successfull!!");
						}
						else {
							JOptionPane.showMessageDialog(null,"Enter valid amount to withdraw....Available Balance is"+amount);
							
						}
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
		button.setBackground(UIManager.getColor("Button.darkShadow"));
		button.setFont(new Font("Times New Roman", Font.BOLD, 13));
		button.setBounds(121, 227, 137, 21);
		contentPane.add(button);
		
		Button button_1 = new Button("BACK");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Transaction t = new Transaction();
				t.setVisible(true);
			}
		});
		button_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		button_1.setBackground(UIManager.getColor("Button.darkShadow"));
		button_1.setBounds(295, 227, 137, 21);
		contentPane.add(button_1);
		
		JTextPane txtpnWithdrawPage = new JTextPane();
		txtpnWithdrawPage.setText("WITHDRAW PAGE");
		txtpnWithdrawPage.setFont(new Font("Times New Roman", Font.BOLD, 17));
		txtpnWithdrawPage.setBounds(188, 36, 164, 30);
		contentPane.add(txtpnWithdrawPage);
		
	}

}
