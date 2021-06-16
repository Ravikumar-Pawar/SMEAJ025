package bankatm;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Deposit extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private JTextField dep;
	private JTextField password;

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
		contentPane.setBackground(new Color(135, 206, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBackground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(32, 69, 88, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter amount to Deposit");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(32, 134, 207, 24);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(32, 198, 88, 24);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Deposit Amount");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setBounds(100, 11, 180, 24);
		contentPane.add(lblNewLabel_3);
		
		username = new JTextField();
		username.setBounds(283, 73, 101, 24);
		contentPane.add(username);
		username.setColumns(10);
		
		dep = new JTextField();
		dep.setBounds(283, 138, 101, 24);
		contentPane.add(dep);
		dep.setColumns(10);
		
		password = new JTextField();
		password.setBounds(283, 202, 101, 20);
		contentPane.add(password);
		password.setColumns(10);
		
		final JButton btnNewButton = new JButton("Deposit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (username.getText().isEmpty() || password.getText().isEmpty()) {
					JOptionPane.showMessageDialog(btnNewButton, "Fill all the fields");
				}
				else {
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
						
						String url="jdbc:mysql://localhost:3306/bankatm";
						String uname="root";
						String pass="Ravihema@1";
						String query = "SELECT balance,username from user_details where username='"+ username.getText()+"'";
						Connection con = DriverManager.getConnection(url, uname, pass);
						
						Statement st = con.createStatement();
						ResultSet rs = st.executeQuery(query);
						
						rs.next(); 
						    String user=rs.getString("username");
							int balance=rs.getInt("balance");
							int deposit=Integer.parseInt(dep.getText());
							
							
								balance=balance+deposit;
								PreparedStatement p=con.prepareStatement("update user_details set balance='"+balance+"' where username='"+user+"'");
						        p.executeUpdate();
								JOptionPane.showMessageDialog(null, "Deposit of Rs."+deposit+" successfull.Available balance is"+balance);
							
							
							con.close();
							st.close();
						
					}catch (ClassNotFoundException e1) {
						e1.printStackTrace();
					}catch (SQLException e1)  {   
						e1.printStackTrace();
					}
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(158, 227, 122, 23);
		contentPane.add(btnNewButton);
	}
}