import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Welcome extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JLabel acc_no;
	private JLabel f_name;
	private JLabel branch;
	private JLabel acc_type;
	private JLabel ph_no;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome frame = new Welcome();
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
	public Welcome() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 550, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome");
		lblNewLabel.setFont(new Font("Britannic Bold", Font.PLAIN, 16));
		lblNewLabel.setBounds(145, 11, 75, 29);
		contentPane.add(lblNewLabel);
		
		f_name = new JLabel("");
		f_name.setFont(new Font("Britannic Bold", Font.PLAIN, 16));
		f_name.setBounds(220, 17, 87, 17);
		contentPane.add(f_name);
		
		JLabel lblNewLabel_2 = new JLabel("User Details");
		lblNewLabel_2.setFont(new Font("Courier New", Font.BOLD, 16));
		lblNewLabel_2.setForeground(Color.DARK_GRAY);
		lblNewLabel_2.setBounds(33, 51, 120, 20);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Account Number");
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_3.setBounds(33, 89, 127, 29);
		contentPane.add(lblNewLabel_3);
		
		acc_no = new JLabel("");
		acc_no.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		acc_no.setBounds(230, 89, 134, 23);
		contentPane.add(acc_no);
		
		JLabel lblNewLabel_5 = new JLabel("Branch");
		lblNewLabel_5.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_5.setBounds(33, 141, 120, 29);
		contentPane.add(lblNewLabel_5);
		
		branch = new JLabel("");
		branch.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		branch.setBounds(230, 135, 134, 29);
		contentPane.add(branch);
		
		JLabel lblNewLabel_7 = new JLabel("Account Type");
		lblNewLabel_7.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_7.setBounds(33, 194, 127, 29);
		contentPane.add(lblNewLabel_7);
		
		acc_type = new JLabel("");
		acc_type.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		acc_type.setBounds(230, 194, 134, 23);
		contentPane.add(acc_type);
		
		JLabel lblNewLabel_9 = new JLabel("Phone Number");
		lblNewLabel_9.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_9.setBounds(33, 254, 127, 29);
		contentPane.add(lblNewLabel_9);
		
		ph_no = new JLabel("");
		ph_no.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		ph_no.setBounds(230, 248, 134, 29);
		contentPane.add(ph_no);
		
		
	}

	public JLabel getAcc_no() {
		return acc_no;
	}


	public JLabel getF_name() {
		return f_name;
	}


	public JLabel getBranch() {
		return branch;
	}


	public JLabel getAcc_type() {
		return acc_type;
	}


	public JLabel getPh_no() {
		return ph_no;
	}



}
