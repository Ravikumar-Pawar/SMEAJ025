package com.rev.springmvcboot;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Welcome extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome frame = new Welcome();
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
	public Welcome()  {
		getContentPane().setBackground(Color.YELLOW);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 550, 400);
		getContentPane().setLayout(null);
		
		Button detailsbutton = new Button("userdetails");
		detailsbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserDetails userdetails = new UserDetails();
				setValues(userdetails);
				userdetails.setVisible(true);
				
			}
			private void setValues(UserDetails userdetails) {

				try {

					Class.forName("com.mysql.cj.jdbc.Driver");

					String url="jdbc:mysql://localhost:3306/mybank";
					String uname="revanth";
					String pass="revanth5";
					String query = "SELECT firstname,acc_no,city,acc_type,ph_no,balance from user_details";

					Connection con = DriverManager.getConnection(url, uname, pass);

					Statement st = con.createStatement();
					ResultSet rs = st.executeQuery(query);
					rs.next();
					
					String fname = rs.getString(1);
					int acc_no = rs.getInt(2);
					String branch = rs.getString(3);
					String acc_type = rs.getString(4);
					String ph_no = rs.getString(5);
					String balance=rs.getString(6);
					
					userdetails.getF_name().setText(fname);
					userdetails.getAcc_no().setText(String.valueOf(acc_no));
					userdetails.getBranch().setText(branch);
					userdetails.getAcc_type().setText(acc_type);
					userdetails.getPh_no().setText(ph_no);
					userdetails.getBalance().setText(balance);

				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}

		});
		detailsbutton.setBackground(Color.PINK);
		detailsbutton.setBounds(178, 30, 128, 22);
		getContentPane().add(detailsbutton);
		
		Button withdraw = new Button("Withdraw");
		withdraw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Withdraw withdraw = new Withdraw();
				withdraw.setVisible(true);
			}
		});
		withdraw.setBackground(Color.PINK);
		withdraw.setBounds(178, 102, 128, 22);
		getContentPane().add(withdraw);
		
		Button deposit = new Button("Deposit");
		deposit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Deposit deposit=new Deposit();
				deposit.setVisible(true);
			}
		});
		deposit.setBackground(Color.PINK);
		deposit.setBounds(178, 184, 128, 22);
		getContentPane().add(deposit);
		
		Button logout = new Button("Logout");
		logout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login login=new Login();
				login.setVisible(true);
			}
			
		});
		logout.setBackground(Color.PINK);
		logout.setBounds(178, 261, 128, 22);
		getContentPane().add(logout);
		
		
	}

}