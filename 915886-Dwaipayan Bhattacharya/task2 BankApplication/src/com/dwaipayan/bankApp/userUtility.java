package com.dwaipayan.bankApp;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.LineBorder;

import com.dwaipayan.bankApp.dataBase.UtilityDao;
import com.dwaipayan.bankApp.userDetails.UserAccountDetails;
public class userUtility<UserDetails> extends JFrame {

	private JPanel contentPane;
	private UtilityDao utd;
	private UserDetails userDetails;
	private String password ;
	JPasswordField pf = new JPasswordField ();

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public userUtility(UserAccountDetails userAccountDetails) throws ClassNotFoundException, SQLException {
		utd = new UtilityDao();
		 
	    userAccountDetails.setAvailableBalance(utd.checkBalance(userAccountDetails));
		setBounds(100, 100, 651, 598);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 10));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Your Available Balance is: "+utd.checkBalance(userAccountDetails));
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(172, 115, 312, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Welcome! "+ userAccountDetails.getUserName());
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(222, 81, 222, 22);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("User DashBoard");
		lblNewLabel.setForeground(SystemColor.textHighlight);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(189, 27, 242, 43);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("WITHDRAW");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(189, 182, 255, 37);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String amount = (String)JOptionPane.showInputDialog(contentPane,"ENTER WITHDRAWAL AMOUNT","ABC BANK DEPOSIT",JOptionPane.PLAIN_MESSAGE,null,null,"50");
				
				int okCancel = JOptionPane.showConfirmDialog(null, pf,"ENTER PASSWORD",JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
			
				if(okCancel == JOptionPane.OK_OPTION) {
					 password = new String(pf.getPassword());
					
					}
		
			
			utd = new UtilityDao();
				try {
					if(password.equals(utd.getUserDetails(userAccountDetails).getPassword()))
					{
				
					if(utd.performWithdrawal(userAccountDetails, amount))
							{
						String msg = "AMOUNT RS. "+amount+" WITHDRAWN SUCCESSFULLY!\n\n"+"Available Balance: "+utd.checkBalance(userAccountDetails);
						lblNewLabel_1.setText("Your Available Balance is: "+utd.checkBalance(userAccountDetails));
						JOptionPane.showMessageDialog(contentPane, msg);
							}
					else {
						String msg = "AMOUNT RS. "+amount+" CAN NOT BE WITHDRAWN!\n\n"+"INSUFFICIENT BALANCE!\n\n"+"Available Balance: "+utd.checkBalance(userAccountDetails);
						JOptionPane.showMessageDialog(contentPane, msg);
					}
				}else
				{
					JOptionPane.showMessageDialog(contentPane, "INCORRECT PASSWORD!");
				}
					}
				
				catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
			
		});
		
		
		JButton btnNewButton_2 = new JButton("CHECK BALANCE");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_2.setBounds(189, 341, 255, 37);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("LOGOUT");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_3.setBounds(189, 431, 252, 37);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_1 = new JButton("DEPOSIT AMOUNT");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(189, 262, 255, 37);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String amount = (String)JOptionPane.showInputDialog(contentPane,"ENTER DEPOSIT AMOUNT","ABC BANK DEPOSIT",JOptionPane.PLAIN_MESSAGE,null,null,"50");
				utd = new UtilityDao();
				try {
					int okCancel = JOptionPane.showConfirmDialog(null, pf,"ENTER PASSWORD",JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
					
					if(okCancel == JOptionPane.OK_OPTION) {
						 password = new String(pf.getPassword());
						
						}
					if(password.equals(utd.getUserDetails(userAccountDetails).getPassword()))
					{
					if(utd.performDeposit(userAccountDetails, amount))
							{
						String msg = "AMOUNT RS. "+amount+" DEPOSITED SUCCESSFULLY!\n\n"+"Available Balance: "+utd.checkBalance(userAccountDetails);
						lblNewLabel_1.setText("Your Available Balance is: "+utd.checkBalance(userAccountDetails));
						JOptionPane.showMessageDialog(contentPane, msg);
							}
				}else {
					JOptionPane.showMessageDialog(contentPane, "INCORRECT PASSWORD!");
				}
				
				
				}catch (ClassNotFoundException | SQLException e1) {
				
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
			
		});
		
		
	}
}
