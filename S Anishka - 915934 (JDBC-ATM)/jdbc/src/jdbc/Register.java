package jdbc;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;

import javax.swing.JTextField;
import javax.swing.JWindow;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Button;
import java.awt.TextField;

public class Register extends JFrame {
	static String url = "jdbc:mysql://localhost:3306/sys";
	static String uname = "root";
	static String pass ="Anishka1999@";
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
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
	public Register() {
		
		//step 5 -- Execute Query
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		JWindow win = new JWindow();
		contentPane.setBorder(new LineBorder(Color.red, 10));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	
		JLabel lblNewLabel = new JLabel("Registration");
		lblNewLabel.setForeground(Color.red);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel.setBounds(89, 11, 281, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(28, 56, 127, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("CREATE PASSWORD");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(28, 93, 146, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("PHONE NUMBER");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(28, 133, 127, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("DOB");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4.setBounds(28, 180, 127, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("ADDRESS");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_5.setBounds(28, 221, 127, 14);
		contentPane.add(lblNewLabel_5);
		
		
		TextField textField_4 = new TextField();
		textField_4.setBounds(256, 172, 138, 22);
		contentPane.add(textField_4);
		
		
		TextField textField_3 = new TextField();
		textField_3.setBounds(256, 133, 138, 22);
		contentPane.add(textField_3);
		
		
		TextField textField_2 = new TextField();
		textField_2.setBounds(256, 93, 138, 22);
		contentPane.add(textField_2);
		
		
		TextField textField_1 = new TextField();
		textField_1.setBounds(256, 48, 138, 22);
		contentPane.add(textField_1);
		
	    TextField textField_5 = new TextField();
		textField_5.setBounds(256, 213, 138, 22);
		contentPane.add(textField_5);
		
		Button button_1 = new Button("Back");
		button_1.setForeground(new Color(25, 25, 112));
		button_1.setBackground(new Color(135, 206, 235));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login register=new Login();
				register.setVisible(true);
			}});
		button_1.setFont(new Font("Dialog", Font.BOLD, 12));
		button_1.setActionCommand("back");
		button_1.setBounds(287, 239, 70, 22);
		contentPane.add(button_1);
		
		Button button = new Button("Register");
		button.setForeground(new Color(25, 25, 112));
		button.setBackground(new Color(135, 206, 235));
		button.setFont(new Font("Dialog", Font.BOLD, 12));
		button.setBounds(159, 239, 70, 22);
		contentPane.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					 String aname=textField_1.getText();
					 String address=textField_5.getText();
					 //yyyy-MM-dd
					 String dob=textField_4.getText();
					 String phone=textField_3.getText();
					 String pwd=textField_2.getText();
					 Class.forName("com.mysql.cj.jdbc.Driver");
				    Connection connection = DriverManager.getConnection(url, uname, pass);
			       Statement statement = connection.createStatement();
			     String query1="select * from register"; 
				PreparedStatement p=connection.prepareStatement("insert into register (username,password,dob,phone,address) values(?,?,?,?,?)");
				p.setString(1,aname);
				p.setString(2,pwd);
				p.setLong(4,Long.parseLong(phone));
				p.setDate(3,java.sql.Date.valueOf(dob));
				p.setString(5,address);
				
				if(aname.isEmpty() || pwd.isEmpty()|| phone.isEmpty()||dob.isEmpty()||address.isEmpty())
					{
						JOptionPane.showMessageDialog(null, "Enter all the details");
					}
					else {
						p.executeUpdate();
						ResultSet rs = statement.executeQuery(query1);
						rs.next();
						JOptionPane.showMessageDialog(null, "Thanks  "+aname+"\n You have successfully registered");	
					}
					
				
				statement.close();
				connection.close();
				
				}
				
				catch (Exception e) {
					System.out.println(e);
					JOptionPane.showMessageDialog(null, textField.getText()+" Already Registered \n Please Login ");
				}
			}
				
		});
		

}	
}
