import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private JTextField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("   Welcome To JDBC");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblNewLabel.setBounds(118, 11, 188, 40);
		contentPane.add(lblNewLabel);

		username = new JTextField();
		username.setBounds(83, 86, 236, 34);
		contentPane.add(username);
		username.setColumns(10);

		password = new JPasswordField();
		password.setBounds(83, 155, 236, 34);
		contentPane.add(password);
		password.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("UserName");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(83, 62, 92, 24);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(83, 131, 97, 22);
		contentPane.add(lblNewLabel_2);

		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (username.getText().isEmpty() || password.getText().isEmpty()) {
					JOptionPane.showMessageDialog(btnNewButton, "Fill all the fields");
				}
				
				else {
					try {
	
						Class.forName("com.mysql.cj.jdbc.Driver");
	
						String url = "jdbc:mysql://localhost:3306/smejdbc";
						String uname = "pcuser";
						String pass = "antonyr5052";
						String query = "SELECT pass_word from user_details where username='"+ username.getText()+"'";
	
						Connection con = DriverManager.getConnection(url, uname, pass);
	
						Statement st = con.createStatement();
						ResultSet rs = st.executeQuery(query);
						rs.next();
						
						String correctPassword = rs.getString(1);
	
						if (password.getText().equals(correctPassword)) {
	
							Welcome welcome = new Welcome();
							setValues(welcome);
	
							welcome.setVisible(true);
	
						} else {
							
							JOptionPane.showMessageDialog(btnNewButton, "Wrong Password");
							
						}
	
					} catch (ClassNotFoundException e1) {
						e1.printStackTrace();
					} catch (SQLException e1) {
						JOptionPane.showMessageDialog(btnNewButton, "Username not registered");
					}
				}
			}

			private void setValues(Welcome welcome) {

				try {

					Class.forName("com.mysql.cj.jdbc.Driver");

					String url = "jdbc:mysql://localhost:3306/smejdbc";
					String uname = "pcuser";
					String pass = "antonyr5052";
					String query = "SELECT firstname,acc_no,city,acc_type,ph_no from user_details where username='"+ username.getText()+"'";

					Connection con = DriverManager.getConnection(url, uname, pass);

					Statement st = con.createStatement();
					ResultSet rs = st.executeQuery(query);
					rs.next();
					
					String fname = rs.getString(1);
					int acc_no = rs.getInt(2);
					String branch = rs.getString(3);
					String acc_type = rs.getString(4);
					String ph_no = rs.getString(5);
					
					welcome.getF_name().setText(fname);
					welcome.getAcc_no().setText(String.valueOf(acc_no));
					welcome.getBranch().setText(branch);
					welcome.getAcc_type().setText(acc_type);
					welcome.getPh_no().setText(ph_no);
					

				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}

			}
		});
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(83, 211, 89, 39);
		contentPane.add(btnNewButton);

		JButton registerBtn = new JButton("Register");
		registerBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterPage registerPage = new RegisterPage();
				registerPage.setVisible(true);
			}
		});
		registerBtn.setBackground(Color.CYAN);
		registerBtn.setBounds(217, 211, 89, 39);
		contentPane.add(registerBtn);
	}
}
