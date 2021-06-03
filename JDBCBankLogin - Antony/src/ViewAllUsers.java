import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class ViewAllUsers extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewAllUsers frame = new ViewAllUsers();
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
	public ViewAllUsers() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 650, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("All Users");
		lblNewLabel.setFont(new Font("Quicksand Bold", Font.PLAIN, 20));
		lblNewLabel.setBounds(233, 29, 89, 30);
		contentPane.add(lblNewLabel);
		
		DefaultListModel<String> ulm = getAllUsers();
		
		JList<String> allUsersList = new JList<>();
		allUsersList.setBounds(121, 97, 357, 389);
		allUsersList.setModel(ulm);
		contentPane.add(allUsersList);
		
	}

	private DefaultListModel<String> getAllUsers() {

		DefaultListModel<String> usersListModel = new DefaultListModel<>();

		try {

			String query = "SELECT acc_no, firstname, lastname from user_details";

			Connection con = MyConnection.getConnection();

			if (con == null) {
				JOptionPane.showMessageDialog(new JLabel(), "Some error occured. Try Again!");
			}

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);

			while (rs.next()) {
				usersListModel.addElement(rs.getInt(1) + " ".repeat(8) + "-" + " ".repeat(8) + rs.getString(2) + " " + rs.getString(3));
			}

			return usersListModel;

		} catch (SQLException s) {
			s.printStackTrace();
		}

		return null;
	}

}
