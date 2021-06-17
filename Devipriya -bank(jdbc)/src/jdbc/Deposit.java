package jdbc;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Label;
import java.awt.Font;
import java.awt.TextField;
import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Deposit extends JFrame {
	static String url = "jdbc:mysql://localhost:3306/devi";
	static String uname = "root";
	static String pass ="Devi@2919";
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
	public Deposit() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(211, 211, 211));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Label label = new Label("Enter the money to be deposited");
		label.setAlignment(Label.CENTER);
		label.setFont(new Font("Dialog", Font.BOLD, 17));
		label.setBounds(10, 10, 382, 22);
		contentPane.add(label);
		
		TextField textField = new TextField();
		textField.setBounds(71, 51, 262, 22);
		contentPane.add(textField);
		
		Label label_1 = new Label("Your money has been deposited Successfully!!!");
		label_1.setFont(new Font("Dialog", Font.BOLD, 12));
		label_1.setForeground(new Color(128, 0, 0));
		label_1.setBounds(59, 142, 333, 53);
		contentPane.add(label_1);
		label_1.setVisible(false);
		
		Button button = new Button("Deposit");
		button.setBackground(new Color(152, 251, 152));
		button.setFont(new Font("Dialog", Font.BOLD, 12));
		button.setBounds(346, 51, 64, 22);
		contentPane.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection connection = DriverManager.getConnection(url, uname, pass);
				   Statement statement = connection.createStatement();
				   int amount=Integer.parseInt(textField.getText());
				   JTextField password = new JPasswordField();
				   Object[] ob= {password};
					int result=JOptionPane.showConfirmDialog(null,ob, "Enter your pin ",JOptionPane.OK_CANCEL_OPTION);
				   String accname=Login.getAccName();
				   String query="select pin,amount from register where UNAME='"+accname+"'";
				   ResultSet rs=statement.executeQuery(query);
				   rs.next();
				   int amount1=rs.getInt("amount");
				   int pin=rs.getInt("pin");
				   if(pin==result) {
				   amount1=amount+amount1;
				   String query1="insert into transaction (acc_name,deposit,avbl_amount,trans_date) values('"+accname+"','"+amount+"','"+amount1+"','"+java.time.LocalDate.now()+"')";
				   statement.executeUpdate(query1);
			       PreparedStatement p=connection.prepareStatement("update register set amount='"+amount1+"' where UNAME='"+accname+"'");
			       p.executeUpdate();
			       label_1.setVisible(true);
				   Label label_2 = new Label("Available Balance:"+amount1);
				   label_2.setForeground(new Color(128, 0, 0));
				   label_2.setBounds(104, 201, 250, 22);
				   contentPane.add(label_2);
				   }
				   else {
					   JOptionPane.showMessageDialog(null, "Enter Valid pin");
				   }
				 }
				catch (Exception ex) {
					System.out.println(ex);
				}
		
				
				
			}
		});
	    Button button_1 = new Button("LOGOUT");
		button_1.setBackground(new Color(144, 238, 144));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login j=new Login();
				j.setVisible(true);
			}
		});
		button_1.setFont(new Font("Dialog", Font.BOLD, 12));
		button_1.setBounds(274, 98, 70, 22);
		contentPane.add(button_1);

		Button button_2 = new Button("Back");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Transaction t=new Transaction();
				t.setVisible(true);
			}
		});
		button_2.setFont(new Font("Dialog", Font.BOLD, 12));
		button_2.setBackground(new Color(144, 238, 144));
		button_2.setBounds(71, 98, 70, 22);
		contentPane.add(button_2);
		
		
	}
	
	
}
