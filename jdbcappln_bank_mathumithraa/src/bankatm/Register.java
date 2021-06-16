package bankatm;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Register extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private JTextField firstname;
	private JTextField lastname;
	private JTextField ph_no;
	private JTextField city;
	private JPasswordField password;
	private JTextField balance;

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
		setBounds(200, 200, 550, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(244, 164, 96));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registration Page");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBackground(Color.YELLOW);
		lblNewLabel.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel.setBounds(202, 11, 154, 23);
		contentPane.add(lblNewLabel);
		
		username = new JTextField();
		username.setBounds(95, 56, 133, 23);
		contentPane.add(username);
		username.setColumns(11);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 60, 82, 19);
		contentPane.add(lblNewLabel_1);
		
		firstname = new JTextField();
		firstname.setBounds(95, 118, 133, 23);
		contentPane.add(firstname);
		firstname.setColumns(11);
		
		JLabel lblNewLabel_2 = new JLabel("First Name");
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_2.setBounds(10, 118, 75, 23);
		contentPane.add(lblNewLabel_2);
		
		lastname = new JTextField();
		lastname.setBounds(95, 177, 133, 23);
		contentPane.add(lastname);
		lastname.setColumns(11);
		
		JLabel lblNewLabel_3 = new JLabel("Last Name");
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_3.setBounds(10, 177, 75, 23);
		contentPane.add(lblNewLabel_3);
		
		final JRadioButton savingsAcc = new JRadioButton("Savings Account");
		savingsAcc.setBounds(119, 223, 109, 23);
		contentPane.add(savingsAcc);
		
		final JRadioButton currentAcc = new JRadioButton("Current Account");
		currentAcc.setBounds(119, 249, 109, 23);
		contentPane.add(currentAcc);
		
		ButtonGroup G = new ButtonGroup();
		G.add(savingsAcc);
		G.add(currentAcc);
		
		JLabel lblNewLabel_4 = new JLabel("Account Type");
		lblNewLabel_4.setLabelFor(currentAcc);
		lblNewLabel_4.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_4.setBounds(10, 227, 103, 19);
		contentPane.add(lblNewLabel_4);
		
		ph_no = new JTextField();
		ph_no.setBounds(381, 54, 143, 23);
		contentPane.add(ph_no);
		ph_no.setColumns(11);
		
		JLabel lblNewLabel_5 = new JLabel("Phone Number");
		lblNewLabel_5.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_5.setBounds(261, 56, 110, 23);
		contentPane.add(lblNewLabel_5);
		
		city = new JTextField();
		city.setBounds(381, 118, 143, 23);
		contentPane.add(city);
		city.setColumns(11);
		
		JLabel lblNewLabel_6 = new JLabel("City");
		lblNewLabel_6.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_6.setBounds(261, 118, 95, 23);
		contentPane.add(lblNewLabel_6);
		
		final JFormattedTextField dob = new JFormattedTextField(new SimpleDateFormat("dd/MM/yyyy"));
		dob.setText("dd/MM/yyyy");
		dob.setBounds(381, 177, 143, 21);
		contentPane.add(dob);
		
		JLabel lblNewLabel_7 = new JLabel("DOB");
		lblNewLabel_7.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_7.setBounds(261, 175, 55, 23);
		contentPane.add(lblNewLabel_7);
		
		password = new JPasswordField();
		password.setBounds(381, 225, 143, 23);
		contentPane.add(password);
		
		JLabel lblNewLabel_8 = new JLabel("Password");
		lblNewLabel_8.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_8.setBounds(261, 223, 95, 18);
		contentPane.add(lblNewLabel_8);
		
		balance = new JTextField();
		balance.setBounds(381, 289, 143, 20);
		contentPane.add(balance);
		balance.setColumns(11);
		

		JLabel lblNewLabel_9 = new JLabel("Balance");
		lblNewLabel_9.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_9.setBounds(261, 290, 69, 14);
		contentPane.add(lblNewLabel_9);
		
		
		final JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				boolean isEmpty = username.getText().isEmpty() || firstname.getText().isEmpty() || lastname.getText().isEmpty() || (!savingsAcc.isSelected() && !currentAcc.isSelected()) || city.getText().isEmpty() || dob.getText().isEmpty() || password.getText().isEmpty()|| balance.getText().isEmpty();
				
				if (isEmpty) {
					JOptionPane.showMessageDialog(btnNewButton, "Fill all the fields!");
				}
				
				else {
					
					try {
						
						Class.forName("com.mysql.cj.jdbc.Driver");
						String url="jdbc:mysql://localhost:3306/bankatm";
						String uname="root";
						String pass="Ravihema@1";
						String query = "insert into user_details(username,firstname,lastname,acc_type,ph_no,city,dob,pass_word,balance) values(?,?,?,?,?,?,?,?,?)";
	
						Connection con = DriverManager.getConnection(url, uname, pass);
						
						if(checkIfUserNameAlreadyExists(username.getText(), con)) {
							JOptionPane.showMessageDialog(btnNewButton, "Username already exists");
						}
						
						else {
							String acc_type = savingsAcc.isSelected() ? "Savings" : currentAcc.isSelected() ? "Current" : "None";
							
							PreparedStatement pst = con.prepareStatement(query);
							pst.setString(1, username.getText());
							pst.setString(2, firstname.getText());
							pst.setString(3, lastname.getText());
							pst.setString(4, acc_type);
							pst.setString(5, ph_no.getText());
							pst.setString(6, city.getText());
							pst.setDate(7, new java.sql.Date(((java.util.Date)dob.getValue()).getTime()));
							pst.setString(8, password.getText());
							pst.setString(9,balance.getText());
							
							int row = pst.executeUpdate();
							
							if (row > 0) {
								JOptionPane.showMessageDialog(btnNewButton, "Registration Successful :)");
							} else {
								JOptionPane.showMessageDialog(btnNewButton, "Some Error Occurred :(");
							}
						}
						
	
					} catch (ClassNotFoundException e1) {
						e1.printStackTrace();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
					
				}
				
			}

			private boolean checkIfUserNameAlreadyExists(String username, Connection con) {
				
				try {
					
					String query = "select count(*) from user_details where username='"+username+"'";
					
					Statement st = con.createStatement();
					
					ResultSet result = st.executeQuery(query);
					result.next();
					
					if (result.getInt(1) != 0) {
						return true;
					} else {
						return false;
					}
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
				return true;
				
			}
		});
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setBounds(213, 314, 103, 33);
		contentPane.add(btnNewButton);
		
		
		
	}
}

