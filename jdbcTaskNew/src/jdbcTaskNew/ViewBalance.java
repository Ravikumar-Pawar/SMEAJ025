package jdbcTaskNew;

import java.awt.BorderLayout;

import jdbcTaskNew.Login;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import jdbcTaskNew.Login;
import java.awt.Label;
import javax.swing.JTextPane;
import com.toedter.calendar.JDateChooser;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.JTable;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class ViewBalance extends JFrame {

	private JPanel contentPane;
	public String acc_hol_name;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewBalance frame = new ViewBalance();
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
	public ViewBalance() {
		try {
			
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 527, 315);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(50, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAvailableAccountBalance = new JLabel("Available Account Balance");
		lblAvailableAccountBalance.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblAvailableAccountBalance.setBounds(84, 128, 186, 38);
		contentPane.add(lblAvailableAccountBalance);
		
		
		Button button = new Button("BACK");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Transaction t = new Transaction();
				t.setVisible(true);
			}
		});
		button.setFont(new Font("Times New Roman", Font.BOLD, 14));
		button.setBackground(UIManager.getColor("Button.darkShadow"));
		button.setBounds(209, 213, 112, 21);
		contentPane.add(button);
		
		JLabel lblAccountHolderName = new JLabel("Account Holder Name");
		lblAccountHolderName.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblAccountHolderName.setBounds(95, 61, 186, 38);
		contentPane.add(lblAccountHolderName);
		
	
		
		
		
		
		
	
			
				String url = "jdbc:mysql://localhost:3306/jdbc_database";
				String uname = "root";
				String password ="Infosys@7";
				Class.forName("com.mysql.cj.jdbc.Driver");
				String query = "select amount,acc_name from register where user_name ='"+Login.name+"'";
				
				//String query1 = "select withdraw,trans_date from transaction where name = '"+Login.name+"'";
				
				
				Connection connection = DriverManager.getConnection(url, uname, password);
				Statement statement = connection.createStatement();
				
				ResultSet rs = statement.executeQuery(query);
				rs.next();
				
				
				
				JLabel lblNewLabel_1 = new JLabel(rs.getString("acc_name"));
				lblNewLabel_1.setBounds(291, 69, 140, 24);
				contentPane.add(lblNewLabel_1);
				
				JLabel lblNewLabel_1_2 = new JLabel(rs.getString("amount"));
				lblNewLabel_1_2.setBounds(291, 135, 140, 24);
				contentPane.add(lblNewLabel_1_2);
				
				JTextPane txtpnBalancePage = new JTextPane();
				txtpnBalancePage.setText("ACCOUNT DETAILS PAGE");
				txtpnBalancePage.setFont(new Font("Times New Roman", Font.BOLD, 17));
				txtpnBalancePage.setBounds(135, 21, 226, 30);
				contentPane.add(txtpnBalancePage);
				
				
				//ResultSet rs1 = statement.executeQuery(query1);
				//rs1.next();
				
				//JLabel lblNewLabel_1_2_1 = new JLabel(rs1.getString("withdraw"));
				//lblNewLabel_1_2_1.setBounds(315, 253, 140, 24);
				//contentPane.add(lblNewLabel_1_2_1);
				
				//JLabel lblNewLabel_1_2_1_1 = new JLabel(rs1.getString("deposit"));
				//lblNewLabel_1_2_1_1.setBounds(315, 297, 140, 24);
				//contentPane.add(lblNewLabel_1_2_1_1);
				
				///JLabel lblNewLabel_1_2_1_2 = new JLabel(rs1.getString("trans_date"));
				//lblNewLabel_1_2_1_2.setBounds(315, 349, 140, 24);
				//contentPane.add(lblNewLabel_1_2_1_2);
				
				
				
			
			
				
				
				
				
				statement.close();
				connection.close();
				
			}
			
			catch(Exception ex) {
				System.out.println(ex);
			}
			
			
		
		}
}
