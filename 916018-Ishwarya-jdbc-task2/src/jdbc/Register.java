package jdbc;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
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
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Button;
import java.awt.TextField;
import javax.swing.ImageIcon;
import com.toedter.calendar.JDateChooser;
import javax.swing.JRadioButton;

public class Register extends JFrame {
	static String url = "jdbc:mysql://localhost:3306/ishu";
	static String uname = "root";
	static String pass ="ishu02!";
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
		setBounds(100, 100, 519, 445);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registration Page");
		lblNewLabel.setForeground(new Color(219, 112, 147));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel.setBounds(113, 0, 281, 32);
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
		lblNewLabel_5.setBounds(28, 335, 127, 14);
		contentPane.add(lblNewLabel_5);
		
		
		TextField textField_3 = new TextField();
		textField_3.setBounds(256, 133, 138, 22);
		contentPane.add(textField_3);
		
		
		JTextField textField_2 = new JPasswordField();
		textField_2.setBounds(256, 93, 138, 22);
		contentPane.add(textField_2);
		
		
		TextField textField_1 = new TextField();
		textField_1.setBounds(256, 48, 138, 22);
		contentPane.add(textField_1);
		
	    TextField textField_5 = new TextField();
		textField_5.setBounds(268, 327, 138, 22);
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
		button_1.setBounds(324, 374, 70, 22);
		contentPane.add(button_1);
		
		Button button = new Button("Register");
		button.setForeground(new Color(25, 25, 112));
		button.setBackground(new Color(135, 206, 235));
		button.setFont(new Font("Dialog", Font.BOLD, 12));
		button.setBounds(160, 374, 70, 22);
		contentPane.add(button);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(256, 174, 138, 20);
		contentPane.add(dateChooser);
		
		JLabel lblNewLabel_7 = new JLabel("GENDER");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_7.setBounds(28, 253, 127, 22);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_6 = new JLabel("CREATE PIN");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_6.setBounds(28, 290, 127, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7_1 = new JLabel("EMAIL");
		lblNewLabel_7_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_7_1.setBounds(28, 213, 119, 22);
		contentPane.add(lblNewLabel_7_1);
		
		TextField textField_3_1 = new TextField();
		textField_3_1.setBounds(256, 213, 138, 22);
		contentPane.add(textField_3_1);
		
		JTextField textField_3_2 = new JPasswordField();
		textField_3_2.setBounds(268, 290, 138, 22);
		contentPane.add(textField_3_2);
		JRadioButton Female = new JRadioButton("Female");
		
		JRadioButton male = new JRadioButton("Male");
		male.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Female.isSelected())
				 {
					 Female.setSelected(false);
				 }
				 
			}
		});
		
		male.setBackground(new Color(255, 192, 203));
		male.setFont(new Font("Tahoma", Font.BOLD, 11));
		male.setBounds(246, 254, 78, 23);
		contentPane.add(male);
		
		
		Female.setBackground(new Color(255, 192, 203));
		Female.setFont(new Font("Tahoma", Font.BOLD, 11));
		Female.setBounds(369, 254, 78, 21);
		contentPane.add(Female);
		Female.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(male.isSelected())
				 {
					 male.setSelected(false);
				 }
				 
			}
		});
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 228, 225));
		panel.setBounds(10, 43, 171, 327);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 192, 203));
		panel_1.setBounds(184, 43, 309, 325);
		contentPane.add(panel_1);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					 String aname=textField_1.getText();
					 String address=textField_5.getText();
					 SimpleDateFormat sdf=new  SimpleDateFormat ("yyyy-MM-dd");
					 String dob=sdf.format(dateChooser.getDate());
					 String phone=textField_3.getText();
					 String pwd=textField_2.getText().toString();
					 String email=textField_3_1.getText();
					 String pin=textField_3_2.getText().toString();
					 String gender="";
					 if(male.isSelected())
					 {  
						 gender="Male";
						
					 }
					 else if(Female.isSelected())
					 {  gender="Female";
					    
					 }
					 
					 Class.forName("com.mysql.cj.jdbc.Driver");
				    Connection connection = DriverManager.getConnection(url, uname, pass);
			       Statement statement = connection.createStatement();
			     String query1="select * from register where UNAME='"+aname+"'"; 
			    //Phone NUmber Validation
			     Pattern pattern=Pattern.compile("[6-9][0-9]{9}");
			     Matcher matcher=pattern.matcher(phone);
			     //Name Validation
			     String regex = "^[A-Za-z\s]*$";
				Pattern pattern1=Pattern.compile(regex);
			     Matcher matcher1=pattern1.matcher(aname);
			     //Mail validation
			     Pattern pattern2=Pattern.compile("^[A-Za-z0-9_.-]+@[A-Za-z0-9]+.com$");
			     Matcher matcher2=pattern2.matcher(email);
			     //Pin Validation
			     Pattern pattern3=Pattern.compile("^[0-9]{4}");
			     Matcher matcher3=pattern3.matcher(pin);
			     
			     
			     if(matcher.matches() && matcher1.matches() && matcher2.matches()&& matcher3.matches()&& gender!="")
			     {
				PreparedStatement p=connection.prepareStatement("insert into register (UNAME,pass,dob,phone,email,gender,pin,address) values(?,?,?,?,?,?,?,?)");
				p.setString(1,aname);
				p.setString(2,pwd);
				p.setLong(4,Long.parseLong(phone));
				p.setDate(3,java.sql.Date.valueOf(dob));
				p.setString(5,email);
				p.setString(6,gender);
				p.setInt(7,Integer.parseInt(pin));
				p.setString(8,address);
				
				ResultSet rs = statement.executeQuery(query1);
				
				if(rs.next())
				{ 
					JOptionPane.showMessageDialog(null, "Sorry "+aname+"\n You have already registered");
				}
				else {   p.executeUpdate();
			          	JOptionPane.showMessageDialog(null, "Thanks  "+aname+"\n You have successfully registered");	
					}
			
			    
				
			     }
			     else if(!matcher.matches()) {
			    	 JOptionPane.showMessageDialog(null, "Enter Valid Phone Number");
			    	 
			     }
			     
			    else if(!matcher1.matches()) {
			    	 JOptionPane.showMessageDialog(null, "Name Should be in Alphabets Only");}
			     
			     
			     else if(!matcher2.matches()) {
			    	 JOptionPane.showMessageDialog(null, "Enter valid Email");
			     }
			     else if(gender=="") {
					 JOptionPane.showMessageDialog(null, "Select Gender");
				 }
			     else if(!matcher3.matches()) {
				    	 JOptionPane.showMessageDialog(null, "Pin should be of 4 digits only!!!");
				     }
			      
			     if(aname.isEmpty() || pwd.isEmpty()|| phone.isEmpty()||address.isEmpty()||email.isEmpty()||pin.isEmpty())
					{
						JOptionPane.showMessageDialog(null, "Enter all the details");
					}
					  
			     
				statement.close();
				connection.close();
				
				}
				
				catch (Exception e) {
					System.out.println(e);
					
				}
			}
				
		});
		

}	
}
