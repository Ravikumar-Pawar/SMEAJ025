package jdbc;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Button;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Color;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Button button = new Button("View All Account Details");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AccHolder_Details register=new AccHolder_Details();
				register.setVisible(true);
			}
		});
		button.setFont(new Font("Dialog", Font.BOLD, 12));
		button.setBounds(125, 61, 166, 22);
		contentPane.add(button);
		
		JLabel lblNewLabel = new JLabel(" ADMIN PAGE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(147, 11, 166, 14);
		contentPane.add(lblNewLabel);
		
		Button button_1 = new Button("Delete AccHolder  Account ");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String url = "jdbc:mysql://localhost:3306/divya";
					String uname = "root";
					String password ="Divya02!";
					String name=(String)JOptionPane.showInputDialog(null,null,"Enter the ACCHOLDER Name to delete his/her Account",JOptionPane.PLAIN_MESSAGE,null,null,null);
					String query="delete from register where UNAME='"+name+"'";
					Class.forName("com.mysql.cj.jdbc.Driver");
					
					Connection connection = DriverManager.getConnection(url, uname, password);
					Statement statement = connection.createStatement();
					if(statement.executeUpdate(query)==1)
					
					{
						JOptionPane.showMessageDialog(null, " Account Deleted Successfully!");
						
					}
					else {
						
							JOptionPane.showMessageDialog(null, "Sorry!! Cannot delete Account!");
						
						
						
					}
					
					statement.close();
					connection.close();
				} catch (Exception ex) {
					System.out.println(ex);
				}
				
			}
			
		});
		button_1.setFont(new Font("Dialog", Font.BOLD, 12));
		button_1.setBounds(125, 121, 166, 22);
		contentPane.add(button_1);
		
		Button button_2 = new Button("Update Details of AccHolder");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Update u=new Update();
				u.setVisible(true);
			}
		});
		button_2.setFont(new Font("Dialog", Font.BOLD, 12));
		button_2.setBounds(125, 173, 166, 22);
		contentPane.add(button_2);
		
		Button button_2_1 = new Button("LOGOUT");
		button_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Homepage m=new Homepage();
				m.setVisible(true);
			}
		});
		button_2_1.setFont(new Font("Dialog", Font.BOLD, 12));
		button_2_1.setBounds(125, 229, 166, 22);
		contentPane.add(button_2_1);
		
	}
}