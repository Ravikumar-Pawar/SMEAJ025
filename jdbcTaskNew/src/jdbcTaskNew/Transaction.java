package jdbcTaskNew;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JTextPane;
import javax.swing.UIManager;

public class Transaction extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Transaction frame = new Transaction();
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
	public Transaction() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 527, 463);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(50, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("DEPOSIT");
		btnNewButton.setBackground(UIManager.getColor("Button.darkShadow"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Deposit d = new Deposit();
				d.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton.setBounds(189, 82, 112, 33);
		contentPane.add(btnNewButton);
		
		JButton btnWithdraw = new JButton("WITHDRAW");
		btnWithdraw.setBackground(UIManager.getColor("Button.darkShadow"));
		btnWithdraw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Withdraw w = new Withdraw();
				w.setVisible(true);
			}
		});
		btnWithdraw.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnWithdraw.setBounds(189, 148, 112, 33);
		contentPane.add(btnWithdraw);
		
		JButton btnViewBalance = new JButton("VIEW BALANCE");
		btnViewBalance.setBackground(UIManager.getColor("Button.darkShadow"));
		btnViewBalance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewBalance vb = new ViewBalance();
				vb.setVisible(true);
			}
		});
		btnViewBalance.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnViewBalance.setBounds(189, 217, 153, 33);
		contentPane.add(btnViewBalance);
		
		JButton btnLogout = new JButton("LOGOUT");
		btnLogout.setBackground(UIManager.getColor("Button.darkShadow"));
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
					JOptionPane.showMessageDialog(null,"Logout Successfull!!");
					HomePage hg = new HomePage();
					hg.setVisible(true);
				
				}
			
		});
		btnLogout.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnLogout.setBounds(189, 297, 112, 33);
		contentPane.add(btnLogout);
		
		JTextPane txtpnTransactionPage = new JTextPane();
		txtpnTransactionPage.setText("TRANSACTION PAGE");
		txtpnTransactionPage.setFont(new Font("Times New Roman", Font.BOLD, 17));
		txtpnTransactionPage.setBounds(151, 24, 191, 30);
		contentPane.add(txtpnTransactionPage);
	}
}
