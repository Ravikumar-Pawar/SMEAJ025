package jdbc;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;

public class Update extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Update frame = new Update();
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
	public Update() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("UPDATION");
		lblNewLabel.setLabelFor(this);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(136, 11, 147, 37);
		contentPane.add(lblNewLabel);
		
		
		JButton btnNewButton = new JButton("Update Phone Number");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 
				String result=(String)JOptionPane.showInputDialog(null,null, "Enter your pin ",JOptionPane.OK_CANCEL_OPTION,null,null,null);
					if(result.equals("2000")){try {
						String url = "jdbc:mysql://localhost:3306/userDetailsDB";
						String uname = "Dharani";
						String pass = "Adync&583";    
					
					Class.forName("com.mysql.cj.jdbc.Driver");
					
					Connection connection = DriverManager.getConnection(url, uname, password);
					Statement statement = connection.createStatement();
					String name=(String)JOptionPane.showInputDialog(null,null,"Enter the Customer Name to update  Phone Number",JOptionPane.PLAIN_MESSAGE,null,null,null);
					String que="select username from customerdetails where username='"+name+"'";
					ResultSet rs=statement.executeQuery(que);
					if(!rs.next())
					{
					JOptionPane.showMessageDialog(null, " Enter Valid AccountHolder Name!");
					}
					else {
					String phone=(String)JOptionPane.showInputDialog(null,null,"Enter the   Phone number to update ",JOptionPane.PLAIN_MESSAGE,null,null,null);
					//Phone validation
				     Pattern pattern=Pattern.compile("[6-9][0-9]{9}");
				     Matcher matcher1=pattern.matcher(phone);
				     if(matcher1.matches())
				     {
					String query="update  customerdetails  set phno='"+Long.parseLong(phone)+"'where username='"+name+"'";
					if(statement.executeUpdate(query)==1)
					
					{
						JOptionPane.showMessageDialog(null, " Phone Number Updated Successfully!");
						
					}
					}
					
						
					
					
					statement.close();
					connection.close();
					}} 
				catch (Exception ex) {
					System.out.println(ex);
				}
				
			}
					else {
						JOptionPane.showMessageDialog(null, "Enter valid password!");
					}
					
					}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(136, 72, 164, 23);
		contentPane.add(btnNewButton);
		
//		JButton btnUpdateEmail = new JButton("Update Email");
//		btnUpdateEmail.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				
//				String result=(String)JOptionPane.showInputDialog(null,null, "Enter your pin ",JOptionPane.OK_OPTION,null,null,null);
//					if(result.equals("DIVYA")){try {
//					String url = "jdbc:mysql://localhost:3306/divya";
//					String uname = "root";
//					String password ="Divya02!";
//                    Class.forName("com.mysql.cj.jdbc.Driver");
//					
//					Connection connection = DriverManager.getConnection(url, uname, password);
//					Statement statement = connection.createStatement();
//
//					String name=(String)JOptionPane.showInputDialog(null,null,"Enter the ACCHOLDER Name to update Email",JOptionPane.PLAIN_MESSAGE,null,null,null);
//					
//					String que="select UNAME from register where UNAME='"+name+"'";
//					ResultSet rs=statement.executeQuery(que);
//					if(!rs.next())
//					{
//					JOptionPane.showMessageDialog(null, " Enter Valid AccountHolder Name!");
//					}
//					else {
//						String email=(String)JOptionPane.showInputDialog(null,null,"Enter EMAIL to update ",JOptionPane.PLAIN_MESSAGE,null,null,null);
//						//Mail validation
//					     Pattern pattern2=Pattern.compile("^[A-Za-z0-9_.-]+@[A-Za-z0-9]+.com$");
//					     Matcher matcher2=pattern2.matcher(email);
//						if(matcher2.matches()) {
//						String query="update register set email='"+email+"' where UNAME='"+name+"'";
//						if(statement.executeUpdate(query)==1)
//					
//					{
//						JOptionPane.showMessageDialog(null, " Email Updated Successfully!");
//						
//					}}
//					else {
//						
//							JOptionPane.showMessageDialog(null, "Sorry!! Cannot able to update Email!\n Enter valid Email!");
//						
//						
//						
//					}
					
					statement.close();
					connection.close();
					}} catch (Exception ex) {
					System.out.println(ex);
				}}
					else {
						JOptionPane.showMessageDialog(null, " Enter Valid password!");
					}
			}
		});
		btnUpdateEmail.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnUpdateEmail.setBounds(136, 127, 164, 23);
		contentPane.add(btnUpdateEmail);
		
		JButton btnUpdateAddress = new JButton("Update City");
		btnUpdateAddress.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String result=(String)JOptionPane.showInputDialog(null,null, "Enter your pin ",JOptionPane.OK_CANCEL_OPTION,null,null,null);
				if(result.equals("2000")){
					try {
				
					String url = "jdbc:mysql://localhost:3306/userDetailsDB";
					String uname = "Dharani";
					String pass = "Adync&583";
                    Class.forName("com.mysql.cj.jdbc.Driver");
					Connection connection = DriverManager.getConnection(url, uname, password);
					Statement statement = connection.createStatement();
					String name=(String)JOptionPane.showInputDialog(null,null,"Enter the Customer Name to update City",JOptionPane.PLAIN_MESSAGE,null,null,null);
					String que="select username from customerdetails where username='"+name+"'";
					ResultSet rs=statement.executeQuery(que);
					if(!rs.next())
					{
					JOptionPane.showMessageDialog(null, "Kindly Enter Valid Customer Name!");
					}
					else {
					String add=(String)JOptionPane.showInputDialog(null,null,"Enter the City to update",JOptionPane.PLAIN_MESSAGE,null,null,null);
					
					String query="update customerdetails set city='"+add+"' where username='"+name+"'";
					
					if(statement.executeUpdate(query)==1)
					
					{
						JOptionPane.showMessageDialog(null, " City Updated Successfully!");
						
					}
					else {
						
							JOptionPane.showMessageDialog(null, "Sorry!! Not able to update City!");
						
						
						
					}
					
					statement.close();
					connection.close();
					}} 
					catch (Exception ex) {
					System.out.println(ex);
				}
			}
				else {
					JOptionPane.showMessageDialog(null, "Kindly Enter Valid Password");
				}
			}
			
		});
		btnUpdateAddress.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnUpdateAddress.setBounds(136, 176, 164, 23);
		contentPane.add(btnUpdateAddress);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminPage a=new AdminPage();
				a.setVisible(true);
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBack.setBounds(136, 227, 164, 23);
		contentPane.add(btnBack);
	}
}