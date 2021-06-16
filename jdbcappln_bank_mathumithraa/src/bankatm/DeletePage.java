package bankatm;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class DeletePage extends JFrame {

	private JPanel contentPane;
	private JTextField username;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeletePage frame = new DeletePage();
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
	public DeletePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		username = new JTextField();
		username.setBounds(92, 91, 230, 31);
		contentPane.add(username);
		username.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Enter the Username to be deleted");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(96, 49, 226, 31);
		contentPane.add(lblNewLabel);
		
		JButton deleteBtn = new JButton("Delete");
		deleteBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (username.getText().isEmpty()) {
					JOptionPane.showMessageDialog(deleteBtn, "Enter the User Name");
				}

				else {
					try {

						String query = "DELETE FROM user_details where username='" + username.getText() + "'";

						Connection con = MyConnection.getConnection();

						if (con == null) {
							JOptionPane.showMessageDialog(deleteBtn, "Some error occured. Try Again!");
							return;
						}

						Statement st = con.createStatement();
						int rowAffected = st.executeUpdate(query);
						
						if (rowAffected != 0) {
						
							JOptionPane.showMessageDialog(deleteBtn, "Deleted Successfully..");
							
						
						} else {

							JOptionPane.showMessageDialog(deleteBtn, "Cannot be deleted");

						}

					} catch (SQLException e1) {
						JOptionPane.showMessageDialog(deleteBtn, "Username not registered");
					}
				}
				
			}
		});
		deleteBtn.setForeground(new Color(0, 0, 0));
		deleteBtn.setBackground(new Color(0, 0, 0));
		deleteBtn.setBounds(162, 150, 89, 31);
		contentPane.add(deleteBtn);
		
		
	}
}