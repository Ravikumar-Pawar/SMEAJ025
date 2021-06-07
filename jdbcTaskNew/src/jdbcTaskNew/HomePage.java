package jdbcTaskNew;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JTextPane;

public class HomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 527, 381);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(50, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("LOG IN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login l = new Login();
				l.setVisible(true);
				
		
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.setBounds(105, 141, 100, 21);
		contentPane.add(btnNewButton);
		
		JButton btnSignUp = new JButton("SIGN UP");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Register r = new Register();
				r.setVisible(true);
				
				
			}
		});
		btnSignUp.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnSignUp.setBounds(292, 141, 111, 21);
		contentPane.add(btnSignUp);
		
		JTextArea txtrDoNotShare = new JTextArea();
		txtrDoNotShare.setBackground(SystemColor.control);
		txtrDoNotShare.setFont(new Font("Times New Roman", Font.BOLD, 11));
		txtrDoNotShare.setText("DON'T  SHARE YOUR USER NAME AND PASSWORD WITH ANYONE\r\nDON'T SHARE YOUR ONE TIME PASSWORD WITH ANYONE\r\nWE ENSURE SAFE AND SECURE BANKING");
		txtrDoNotShare.setBounds(60, 212, 397, 57);
		contentPane.add(txtrDoNotShare);
		
		JTextPane txtpnJdbcBank = new JTextPane();
		txtpnJdbcBank.setBackground(SystemColor.textHighlightText);
		txtpnJdbcBank.setFont(new Font("Times New Roman", Font.BOLD, 17));
		txtpnJdbcBank.setText("JDBC BANK - ONLINE BANKING SERVICE PORTAL");
		txtpnJdbcBank.setBounds(45, 32, 434, 30);
		contentPane.add(txtpnJdbcBank);
		
		JTextPane txtpnHomePage = new JTextPane();
		txtpnHomePage.setText("HOME PAGE");
		txtpnHomePage.setFont(new Font("Times New Roman", Font.BOLD, 17));
		txtpnHomePage.setBounds(192, 90, 119, 30);
		contentPane.add(txtpnHomePage);
	}
}
