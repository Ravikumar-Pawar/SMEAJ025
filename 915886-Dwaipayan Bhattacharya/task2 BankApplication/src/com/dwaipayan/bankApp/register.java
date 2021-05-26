package com.dwaipayan.bankApp;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Properties;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import com.dwaipayan.bankApp.dataBase.registerDao;
import com.dwaipayan.bankApp.dateFormat.DateLabelFormatter;
import com.dwaipayan.bankApp.userDetails.UserDetails;

public class register extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JPasswordField passwordField;
	private UserDetails userDetails;
	JLabel promptLabel;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public register() {
		
		setBounds(100, 100, 688, 690);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 10));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("REGISTER NEW USER");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(246, 32, 235, 37);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(381, 108, 177, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(381, 160, 177, 30);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(381, 217, 177, 30);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(381, 279, 177, 30);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		UtilDateModel model = new UtilDateModel();
		Properties p = new Properties();
		p.put("text.today", "Today");
		p.put("text.month", "Month");
		p.put("text.year", "Year");
		JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
		JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
		datePicker.setSize(177, 35);
		datePicker.setLocation(381, 342);
		contentPane.add(datePicker);
		
	
		
		textField_5 = new JTextField();
		textField_5.setBounds(379, 410, 179, 30);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("FIRST  NAME");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(135, 111, 127, 27);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("LAST NAME");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(135, 163, 127, 27);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("EMAIL ID");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setBounds(135, 220, 108, 27);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("MOBILE NUMBER");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4.setBounds(135, 282, 145, 27);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("DATE OF BIRTH");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_5.setBounds(135, 342, 145, 27);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("USERNAME");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_6.setBounds(135, 413, 127, 27);
		contentPane.add(lblNewLabel_6);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(381, 473, 177, 30);
		contentPane.add(passwordField);
		
		
		promptLabel = new JLabel();
		contentPane.add(promptLabel);
		
		JLabel lblNewLabel_7 = new JLabel("PASSWORD");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_7.setBounds(135, 476, 127, 27);
		contentPane.add(lblNewLabel_7);
		
		JButton btnNewButton = new JButton("REGISTER");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(400, 561, 158, 37);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String firstName = textField.getText();
			
				String lastName = textField_1.getText();
				String emailid = textField_2.getText();
				String phoneNo = textField_3.getText();
				String dob = datePicker.getJFormattedTextField().getText();
				String username =textField_5.getText();
				String passWord = String.valueOf(passwordField.getPassword());
				
				userDetails = new UserDetails();
				userDetails.setFirstName(firstName);
				userDetails.setLastName(lastName);
				userDetails.setEmailId(emailid);
				userDetails.setPhoneNo(phoneNo);
				userDetails.setDateOfBirth(dob);
				userDetails.setUserName(username);
				userDetails.setPassword(passWord);
				
				
				
				registerDao reg = new registerDao();
				try {
					String msg = reg.performRegister(userDetails);
					JOptionPane.showMessageDialog(contentPane, msg);
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
				
			}
			
		});
		
		JButton btnNewButton_1 = new JButton("RESET");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(135, 561, 158, 37);
		contentPane.add(btnNewButton_1);
		
		
	}
}
