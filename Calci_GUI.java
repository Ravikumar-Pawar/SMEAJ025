import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Button;
import java.awt.Font;

public class Calci_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calci_GUI frame = new Calci_GUI();
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
	public Calci_GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 391, 381);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(175, 238, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setText("0");
		textField.setBounds(0, 43, 371, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		Button btnNewButton = new Button("7");
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBackground(new Color(255, 228, 181));
		btnNewButton.setBounds(0, 122, 95, 55);
		contentPane.add(btnNewButton);
		
		Button btnNewButton_1 = new Button("8");
		btnNewButton_1.setFont(new Font("Dialog", Font.BOLD, 16));
		btnNewButton_1.setBounds(91, 122, 95, 55);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.setBackground(new Color(255, 228, 181));
		
		Button btnNewButton_1_1 = new Button("9");
		btnNewButton_1_1.setFont(new Font("Dialog", Font.BOLD, 16));
		btnNewButton_1_1.setBackground(new Color(255, 228, 181));
		btnNewButton_1_1.setBounds(183, 122, 95, 55);
		contentPane.add(btnNewButton_1_1);
		
		Button btnNewButton_1_2 = new Button("x");
		btnNewButton_1_2.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 18));
		btnNewButton_1_2.setBackground(new Color(250, 128, 114));
		btnNewButton_1_2.setBounds(276, 122, 95, 55);
		contentPane.add(btnNewButton_1_2);
		
		Button btnNewButton_2 = new Button("4");
		btnNewButton_2.setFont(new Font("Dialog", Font.BOLD, 16));
		btnNewButton_2.setBackground(new Color(255, 228, 181));
		btnNewButton_2.setBounds(0, 173, 95, 55);
		contentPane.add(btnNewButton_2);
		
		Button btnNewButton_3 = new Button("5");
		btnNewButton_3.setFont(new Font("Blackadder ITC", Font.BOLD, 16));
		btnNewButton_3.setBackground(new Color(255, 228, 181));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(91, 173, 95, 55);
		contentPane.add(btnNewButton_3);
		
		Button btnNewButton_4 = new Button("6");
		btnNewButton_4.setFont(new Font("Dialog", Font.BOLD, 16));
		btnNewButton_4.setBackground(new Color(255, 228, 181));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setBounds(183, 173, 95, 55);
		contentPane.add(btnNewButton_4);
		
		Button btnX = new Button("-");
		btnX.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 18));
		btnX.setBackground(new Color(250, 128, 114));
		btnX.setBounds(276, 173, 95, 55);
		contentPane.add(btnX);
		
		Button btnNewButton_6 = new Button("1");
		btnNewButton_6.setFont(new Font("Blackadder ITC", Font.BOLD, 16));
		btnNewButton_6.setBackground(new Color(255, 228, 181));
		btnNewButton_6.setBounds(0, 225, 95, 55);
		contentPane.add(btnNewButton_6);
		
		Button btnNewButton_7 = new Button("2");
		btnNewButton_7.setFont(new Font("Dialog", Font.BOLD, 16));
		btnNewButton_7.setBackground(new Color(255, 228, 181));
		btnNewButton_7.setBounds(91, 225, 95, 55);
		contentPane.add(btnNewButton_7);
		
		Button btnNewButton_8 = new Button("3");
		btnNewButton_8.setFont(new Font("Dialog", Font.BOLD, 16));
		btnNewButton_8.setBackground(new Color(255, 228, 181));
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_8.setBounds(183, 225, 95, 55);
		contentPane.add(btnNewButton_8);
		
		Button btnNewButton_9 = new Button("+");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_9.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 18));
		btnNewButton_9.setBackground(new Color(250, 128, 114));
		btnNewButton_9.setBounds(276, 225, 95, 55);
		contentPane.add(btnNewButton_9);
		
		Button btnNewButton_10 = new Button("+/-");
		btnNewButton_10.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 18));
		btnNewButton_10.setBackground(new Color(250, 128, 114));
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_10.setBounds(0, 277, 95, 55);
		contentPane.add(btnNewButton_10);
		
		Button btnNewButton_11 = new Button("0");
		btnNewButton_11.setFont(new Font("Dialog", Font.BOLD, 16));
		btnNewButton_11.setBackground(new Color(255, 228, 181));
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_11.setBounds(91, 277, 95, 55);
		contentPane.add(btnNewButton_11);
		
		Button btnNewButton_12 = new Button(".");
		btnNewButton_12.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 18));
		btnNewButton_12.setBackground(new Color(250, 128, 114));
		btnNewButton_12.setBounds(183, 277, 95, 55);
		contentPane.add(btnNewButton_12);
		
		Button btnNewButton_13 = new Button("=");
		btnNewButton_13.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 18));
		btnNewButton_13.setBackground(new Color(250, 128, 114));
		btnNewButton_13.setBounds(276, 277, 95, 55);
		contentPane.add(btnNewButton_13);
		
		Button btnNewButton_5 = new Button("%");
		btnNewButton_5.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 18));
		btnNewButton_5.setBackground(new Color(250, 128, 114));
		btnNewButton_5.setBounds(0, 69, 95, 55);
		contentPane.add(btnNewButton_5);
		
		Button btnC = new Button("C");
		btnC.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 18));
		btnC.setBackground(new Color(250, 128, 114));
		btnC.setBounds(91, 69, 95, 55);
		contentPane.add(btnC);
		
		Button btnDel = new Button("del");
		btnDel.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 18));
		btnDel.setBackground(new Color(250, 128, 114));
		btnDel.setBounds(183, 69, 95, 55);
		contentPane.add(btnDel);
		
		Button btnNewButton_16 = new Button("/");
		btnNewButton_16.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 18));
		btnNewButton_16.setBackground(new Color(250, 128, 114));
		btnNewButton_16.setBounds(276, 69, 95, 55);
		contentPane.add(btnNewButton_16);
		
		JLabel lblNewLabel = new JLabel("CALCULATOR");
		lblNewLabel.setBackground(new Color(250, 250, 210));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(0, 0, 371, 44);
		contentPane.add(lblNewLabel);
	}
}
