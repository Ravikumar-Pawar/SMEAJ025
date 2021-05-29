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
	private JLabel accno;
	private JLabel fname;
	private JLabel branch;
	private JLabel acctype;
	private JLabel phno;
	

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
		contentPane.setBackground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome");
		lblNewLabel.setFont(new Font("Britannic Bold", Font.PLAIN, 16));
		lblNewLabel.setBounds(145, 11, 75, 29);
		contentPane.add(lblNewLabel);
		
		fname = new JLabel("");
		fname.setFont(new Font("Britannic Bold", Font.PLAIN, 16));
		fname.setBounds(220, 17, 87, 17);
		contentPane.add(fname);
		
		JLabel lblNewLabel_2 = new JLabel("User Details");
		lblNewLabel_2.setFont(new Font("Courier New", Font.BOLD, 16));
		lblNewLabel_2.setForeground(Color.BLUE);
		lblNewLabel_2.setBounds(33, 51, 120, 20);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Account Number");
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_3.setBounds(33, 89, 127, 29);
		contentPane.add(lblNewLabel_3);
		
		accno = new JLabel("");
		accno.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		accno.setBounds(230, 89, 134, 23);
		contentPane.add(accno);
		
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
		
		acctype = new JLabel("");
		acctype.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		acctype.setBounds(230, 194, 134, 23);
		contentPane.add(acctype);
		
		JLabel lblNewLabel_9 = new JLabel("Phone Number");
		lblNewLabel_9.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_9.setBounds(33, 254, 127, 29);
		contentPane.add(lblNewLabel_9);
		
		phno = new JLabel("");
		phno.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		phno.setBounds(230, 248, 134, 29);
		contentPane.add(phno);
		
		
	}

	public JLabel getAccno() {
		return accno;
	}


	public JLabel getFname() {
		return fname;
	}


	public JLabel getBranch() {
		return branch;
	}


	public JLabel getAcctype() {
		return acctype;
	}


	public JLabel getPhno() {
		return phno;
	}



}
