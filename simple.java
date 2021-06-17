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
import javax.swing.JTextPane;
import java.awt.Label;

public class simple extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					simple frame = new simple();
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
	public simple() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 391, 434);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Button button = new Button("1");
		button.setFont(new Font("Dialog", Font.BOLD, 18));
		button.setBounds(31, 142, 66, 33);
		contentPane.add(button);
		
		Button button_1 = new Button("2");
		button_1.setFont(new Font("Dialog", Font.BOLD, 18));
		button_1.setBounds(111, 142, 66, 33);
		contentPane.add(button_1);
		
		Button button_2 = new Button("3");
		button_2.setFont(new Font("Dialog", Font.BOLD, 18));
		button_2.setBounds(193, 142, 66, 33);
		contentPane.add(button_2);
		
		Button button_3 = new Button("4");
		button_3.setFont(new Font("Dialog", Font.BOLD, 18));
		button_3.setBounds(31, 192, 66, 33);
		contentPane.add(button_3);
		
		Button button_4 = new Button("5");
		button_4.setFont(new Font("Dialog", Font.BOLD, 18));
		button_4.setBounds(111, 192, 66, 33);
		contentPane.add(button_4);
		
		Button button_5 = new Button("6");
		button_5.setFont(new Font("Dialog", Font.BOLD, 18));
		button_5.setBounds(193, 192, 66, 33);
		contentPane.add(button_5);
		
		Button button_6 = new Button("7");
		button_6.setFont(new Font("Dialog", Font.BOLD, 18));
		button_6.setBounds(31, 241, 66, 33);
		contentPane.add(button_6);
		
		Button button_7 = new Button("8");
		button_7.setFont(new Font("Dialog", Font.BOLD, 18));
		button_7.setBounds(111, 241, 66, 33);
		contentPane.add(button_7);
		
		Button button_8 = new Button("9");
		button_8.setFont(new Font("Dialog", Font.BOLD, 18));
		button_8.setBounds(193, 241, 66, 33);
		contentPane.add(button_8);
		
		Button button_9 = new Button("0");
		button_9.setFont(new Font("Dialog", Font.BOLD, 18));
		button_9.setBounds(111, 291, 66, 33);
		contentPane.add(button_9);
		
		Button button_10 = new Button("Add");
		button_10.setFont(new Font("Dialog", Font.BOLD, 16));
		button_10.setBounds(284, 142, 66, 33);
		contentPane.add(button_10);
		
		Button button_11 = new Button("Sub");
		button_11.setFont(new Font("Dialog", Font.BOLD, 16));
		button_11.setBounds(284, 192, 66, 33);
		contentPane.add(button_11);
		
		Button button_12 = new Button("Mul");
		button_12.setFont(new Font("Dialog", Font.BOLD, 16));
		button_12.setBounds(284, 241, 66, 33);
		contentPane.add(button_12);
		
		Button button_13 = new Button("Div");
		button_13.setFont(new Font("Dialog", Font.BOLD, 16));
		button_13.setBounds(284, 291, 66, 33);
		contentPane.add(button_13);
		
		Button button_14 = new Button("C");
		button_14.setFont(new Font("Dialog", Font.BOLD, 18));
		button_14.setBounds(111, 342, 66, 33);
		contentPane.add(button_14);
		
		Button button_15 = new Button(".");
		button_15.setFont(new Font("Dialog", Font.BOLD, 18));
		button_15.setBounds(193, 291, 66, 33);
		contentPane.add(button_15);
		
		Button button_16 = new Button("+/-");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_16.setFont(new Font("Dialog", Font.BOLD, 18));
		button_16.setBounds(31, 291, 66, 33);
		contentPane.add(button_16);
		
		textField_1 = new JTextField();
		textField_1.setBounds(31, 66, 319, 33);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		Label label = new Label("CALCULATOR");
		label.setFont(new Font("Times New Roman", Font.BOLD, 18));
		label.setBackground(Color.PINK);
		label.setBounds(31, 10, 319, 42);
		contentPane.add(label);
		
		
	}
}
