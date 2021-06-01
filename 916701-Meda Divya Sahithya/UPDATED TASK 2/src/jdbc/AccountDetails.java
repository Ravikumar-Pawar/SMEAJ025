package jdbc;
import jdbc.Login;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Button;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.io.*;

public class AccountDetails extends  JFrame {

	private JPanel contentPane;
	static String url = "jdbc:mysql://localhost:3306/divya";
	static String uname = "root";
	static String pass ="Divya02!";
	int pin;
	String accname1=Login.getAccName();
	String accpass1=Login.getAccPass();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					AccountDetails frame = new AccountDetails();
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
	public AccountDetails() {
		try{
			
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		
		//step 3 -- start connect to database pass parameters 
		Connection connection = DriverManager.getConnection(url, uname, pass);
		
		//step 4 -- SQL statement
		Statement statement = connection.createStatement();
	
		//statement.executeUpdate(query);
		ResultSet rs = statement.executeQuery("select * from register where UNAME='"+accname1+"' and pass='"+accpass1+"'");
		rs.next();
	     pin=rs.getInt("pin");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 519, 445);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblNewLabel = new JLabel("ACCOUNT DETAILS");
		lblNewLabel.setForeground(new Color(255, 99, 71));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel.setBounds(115, 0, 281, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ACCOUNT ID");
		lblNewLabel_1.setForeground(new Color(165, 42, 42));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(28, 49, 127, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(" PASSWORD");
		lblNewLabel_2.setForeground(new Color(165, 42, 42));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(20, 110, 135, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("PHONE NUMBER");
		lblNewLabel_3.setForeground(new Color(165, 42, 42));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(28, 143, 127, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("DOB");
		lblNewLabel_4.setForeground(new Color(165, 42, 42));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4.setBounds(28, 174, 127, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("EMAIL");
		lblNewLabel_5.setForeground(new Color(165, 42, 42));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_5.setBounds(28, 209, 127, 14);
		contentPane.add(lblNewLabel_5);
		
		
		
		Label label = new Label(rs.getString("ACC_ID"));
		label.setForeground(new Color(205, 92, 92));
		label.setBounds(239, 41, 157, 22);
		contentPane.add(label);
		
		JPasswordField label_1 = new JPasswordField(rs.getString("pass"));
		label_1.setForeground(new Color(205, 92, 92));
		label_1.setBounds(239, 102, 157, 22);
		contentPane.add(label_1);
		
		Label label_2 = new Label(rs.getString("phone"));
		label_2.setForeground(new Color(205, 92, 92));
		label_2.setBounds(239, 135, 157, 22);
		contentPane.add(label_2);
		
		Label label_3 = new Label(rs.getString("dob"));
		label_3.setForeground(new Color(205, 92, 92));
		label_3.setBounds(239, 166, 157, 22);
		contentPane.add(label_3);
		
		Label label_4 = new Label(rs.getString("address"));
		label_4.setForeground(new Color(205, 92, 92));
		label_4.setBounds(239, 279, 157, 22);
		contentPane.add(label_4);
		
		Label label_4_1 = new Label(rs.getString("amount"));
		label_4_1.setForeground(new Color(205, 92, 92));
		label_4_1.setBounds(239, 316, 157, 22);
		contentPane.add(label_4_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("GENDER");
		lblNewLabel_5_1.setForeground(new Color(165, 42, 42));
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_5_1.setBounds(28, 246, 127, 14);
		contentPane.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("NAME");
		lblNewLabel_2_1.setForeground(new Color(165, 42, 42));
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2_1.setBounds(28, 80, 146, 14);
		contentPane.add(lblNewLabel_2_1);
		
		Label label_5 = new Label(rs.getString("UNAME"));
		label_5.setForeground(new Color(205, 92, 92));
		label_5.setBounds(239, 74, 157, 22);
		contentPane.add(label_5);
		
		Label label_41 = new Label(rs.getString("Gender"));
		label_41.setForeground(new Color(205, 92, 92));
		label_41.setBounds(239, 238, 157, 22);
		contentPane.add(label_41);
		
		Label label_4_2 = new Label(rs.getString("email"));
		label_4_2.setForeground(new Color(205, 92, 92));
		label_4_2.setBounds(239, 201, 157, 22);
		contentPane.add(label_4_2);
		
		}
		catch (Exception e) {
			System.out.println(e);
		}
		Button button = new Button("Back");
		button.setBackground(new Color(230, 230, 250));
		button.setForeground(new Color(95, 158, 160));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Transaction t=new Transaction();
				t.setVisible(true);
			}});
		button.setFont(new Font("Dialog", Font.BOLD, 12));
		button.setActionCommand("back");
		button.setBounds(423, 384, 70, 22);
		contentPane.add(button);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("ADDRESS");
		lblNewLabel_5_1_1.setForeground(new Color(165, 42, 42));
		lblNewLabel_5_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_5_1_1.setBounds(28, 287, 127, 14);
		contentPane.add(lblNewLabel_5_1_1);
		
		JLabel lblNewLabel_5_1_2 = new JLabel("ACCOUNT BALANCE");
		lblNewLabel_5_1_2.setForeground(new Color(165, 42, 42));
		lblNewLabel_5_1_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_5_1_2.setBounds(28, 324, 127, 14);
		contentPane.add(lblNewLabel_5_1_2);
		
		
		Button button_1 = new Button("CHANGE PIN");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				
				//step 3 -- start connect to database pass parameters 
				Connection connection = DriverManager.getConnection(url, uname, pass);
				
				//step 4 -- SQL statement
				Statement statement1 = connection.createStatement();
                 JTextField p=new JPasswordField();
                  Object[] ob= {p};
				int result=JOptionPane.showConfirmDialog(null,ob, "Enter your  Previous PIN ",JOptionPane.OK_CANCEL_OPTION);
				if(pin==result) {
					int new_pin=JOptionPane.showConfirmDialog(null,ob, "Enter your  NEW PIN ",JOptionPane.OK_CANCEL_OPTION);
					int confirm_pin=JOptionPane.showConfirmDialog(null,ob, "RE-Enter your  NEW PIN to confirm ",JOptionPane.OK_CANCEL_OPTION);
					if(new_pin==confirm_pin)
					{
					if(pin==new_pin) {
						JOptionPane.showMessageDialog(null, "OLD and NEW PIN are SAME...Enter another one!!!");
					}
					else {
					pin=new_pin;
					String que="update register set pin='"+pin+"' where UNAME='"+accname1+"'";
					statement1.executeUpdate(que);
					JOptionPane.showMessageDialog(null, "Your NEW PIN is Successfully Updated");
					
				}}}
             else {
            	 JOptionPane.showMessageDialog(null, "Password doesn't match with new password!!");
				   }
				
				}
				
				catch(Exception ex){
					System.out.println(ex);
					JOptionPane.showMessageDialog(null, "Sry!!!!NEW PIN not Updated");
				}
			}
		});
		button_1.setForeground(new Color(255, 69, 0));
		button_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		button_1.setBackground(new Color(255, 255, 255));
		button_1.setActionCommand("back");
		button_1.setBounds(239, 356, 157, 22);
		contentPane.add(button_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 222, 173));
		panel.setBounds(10, 30, 176, 348);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 160, 122));
		panel_1.setBounds(184, 30, 309, 348);
		contentPane.add(panel_1);
			
	}
}
