package jdbcTaskNew;

import java.awt.BorderLayout;


import java.sql.*;
import java.text.SimpleDateFormat;
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
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDateChooser;
import java.util.Date;
import java.awt.SystemColor;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.JPasswordField;

public class Register extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_7;
	private JTextField textField_8;
	private JPasswordField passwordField;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 527, 621);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(50, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setForeground(Color.BLACK);
		lblName.setBackground(Color.BLACK);
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblName.setBounds(46, 68, 182, 33);
		contentPane.add(lblName);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblGender.setBounds(46, 111, 182, 33);
		contentPane.add(lblGender);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblAge.setBounds(46, 154, 182, 33);
		contentPane.add(lblAge);
		
		JLabel lblAadharNumber = new JLabel("Aadhar Number");
		lblAadharNumber.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblAadharNumber.setBounds(46, 197, 182, 33);
		contentPane.add(lblAadharNumber);
		
		JLabel lblEnterNewUser = new JLabel("Enter new user name");
		lblEnterNewUser.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblEnterNewUser.setBounds(46, 246, 182, 33);
		contentPane.add(lblEnterNewUser);
		
		JLabel lblEnterNewPassword = new JLabel("Enter new Password");
		lblEnterNewPassword.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblEnterNewPassword.setBounds(46, 303, 182, 33);
		contentPane.add(lblEnterNewPassword);
		
		JLabel lblDateOfBirth = new JLabel("Date of Birth");
		lblDateOfBirth.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblDateOfBirth.setBounds(46, 352, 182, 33);
		contentPane.add(lblDateOfBirth);
		
		JLabel lblMobileNumber = new JLabel("Mobile Number");
		lblMobileNumber.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblMobileNumber.setBounds(46, 410, 182, 33);
		contentPane.add(lblMobileNumber);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblAddress.setBounds(46, 453, 182, 33);
		contentPane.add(lblAddress);
		
		textField = new JTextField();
		textField.setBounds(311, 76, 147, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(311, 119, 147, 25);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(311, 162, 147, 25);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(311, 205, 147, 25);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(311, 251, 147, 25);
		contentPane.add(textField_4);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(311, 311, 147, 19);
		contentPane.add(passwordField);
		
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(311, 366, 147, 19);
		contentPane.add(dateChooser);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(311, 418, 147, 25);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(311, 461, 147, 44);
		contentPane.add(textField_8);
		
		Button button = new Button("REGISTER");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String name = textField.getText();
					String gender = textField_1.getText();
					String age = textField_2.getText();
					String aadhar_num = textField_3.getText();
					String u_name = textField_4.getText();
					String pass = passwordField.getText();
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
					String dob = sdf.format(dateChooser.getDate());
					String mob_num = textField_7.getText();
					String address = textField_8.getText();
					Class.forName("com.mysql.cj.jdbc.Driver");
					String url = "jdbc:mysql://localhost:3306/jdbc_database";
					String us_name = "root";
					String pwd = "Infosys@7";
					Connection connection = DriverManager.getConnection(url,us_name,pwd);
					Statement statement = connection.createStatement();
					String query1 = "select * from register where acc_name ='"+name+"'";
					PreparedStatement p = connection.prepareStatement("insert into register(acc_name,gender,age,user_name,pass,aadhar_num,dob,mob_num,address) values(?,?,?,?,?,?,?,?,?)");
					p.setString(1,name);
					p.setString(2, gender);
					p.setInt(3, Integer.parseInt(age));
					p.setLong(6,Long.parseLong(aadhar_num));
					p.setString(4, u_name);
					p.setString(5,pass);
					p.setDate(7,java.sql.Date.valueOf(dob));
					p.setLong(8,Long.parseLong(mob_num));
					p.setString(9,address);
					
					if(name.isEmpty() || gender.isEmpty() || age.isEmpty() || aadhar_num.isEmpty() || u_name.isEmpty() || pass.isEmpty() || dob.isEmpty() || mob_num.isEmpty() || address.isEmpty()) {
						JOptionPane.showMessageDialog(null, "Enter all details..");
						
					}
					else {
						
						ResultSet rs = statement.executeQuery(query1);
						if(rs.next()) {
							JOptionPane.showMessageDialog(null, "Already registered..");
						}
						else {
							p.executeUpdate();
						
						JOptionPane.showMessageDialog(null, "Registered Successfully!!");
						Login l = new Login();
						l.setVisible(true);
						
						Register r = new Register();
						r.setVisible(false);
					}
					
				
					statement.close();
					connection.close();
					
					
					
					}
				}
				catch(Exception ex) {
					System.out.println(ex);
				
				}
				
			}
		});
		button.setBackground(UIManager.getColor("Button.darkShadow"));
		button.setFont(new Font("Times New Roman", Font.BOLD, 13));
		button.setBounds(234, 526, 104, 33);
		contentPane.add(button);
		
		JTextPane txtpnRegistrationPage = new JTextPane();
		txtpnRegistrationPage.setText("REGISTRATION PAGE");
		txtpnRegistrationPage.setFont(new Font("Times New Roman", Font.BOLD, 17));
		txtpnRegistrationPage.setBounds(139, 10, 199, 30);
		contentPane.add(txtpnRegistrationPage);
		
		
	
	}
}
