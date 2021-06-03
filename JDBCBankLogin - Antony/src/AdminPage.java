import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminPage frame = new AdminPage();
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
	public AdminPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 550, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton adminViewAllBtn = new JButton("View All Users");
		adminViewAllBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewAllUsers viewAllUsers = new ViewAllUsers();
				viewAllUsers.setVisible(true);
			}
		});
		adminViewAllBtn.setBackground(SystemColor.activeCaption);
		adminViewAllBtn.setBounds(176, 95, 163, 38);
		contentPane.add(adminViewAllBtn);
		
		JButton adminDeleteBtn = new JButton("Delete A User");
		adminDeleteBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DeletePage deletePage = new DeletePage();
				deletePage.setVisible(true);
				
			}
		});
		adminDeleteBtn.setBackground(new Color(255, 0, 0));
		adminDeleteBtn.setBounds(176, 176, 163, 38);
		contentPane.add(adminDeleteBtn);
		
		JLabel welcomeAdmin = new JLabel("Welcome Admin!");
		welcomeAdmin.setFont(new Font("Quantico", Font.BOLD, 24));
		welcomeAdmin.setBounds(153, 32, 204, 28);
		contentPane.add(welcomeAdmin);
	}
}
