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
import javax.swing.UIManager;

public class calci extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calci frame = new calci();
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
	public calci() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 562, 580);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("ToolBar.shadow"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setText("0");
		textField.setBounds(10, 64, 377, 52);
		contentPane.add(textField);
		textField.setColumns(10);
		
		Button btnNewButton = new Button("7");
		btnNewButton.setForeground(UIManager.getColor("ToolBar.highlight"));
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBackground(UIManager.getColor("ToolBar.foreground"));
		btnNewButton.setBounds(100, 269, 95, 55);
		contentPane.add(btnNewButton);
		
		Button btnNewButton_1 = new Button("8");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setFont(new Font("Dialog", Font.BOLD, 16));
		btnNewButton_1.setBounds(196, 269, 95, 55);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.setBackground(UIManager.getColor("ToolBar.highlight"));
		
		Button btnNewButton_1_1 = new Button("9");
		btnNewButton_1_1.setForeground(UIManager.getColor("ToolBar.highlight"));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1.setFont(new Font("Dialog", Font.BOLD, 16));
		btnNewButton_1_1.setBackground(UIManager.getColor("ToolBar.foreground"));
		btnNewButton_1_1.setBounds(292, 269, 95, 55);
		contentPane.add(btnNewButton_1_1);
		
		Button btnNewButton_1_2 = new Button("x");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_2.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 18));
		btnNewButton_1_2.setBackground(UIManager.getColor("ToolBar.highlight"));
		btnNewButton_1_2.setBounds(10, 269, 95, 55);
		contentPane.add(btnNewButton_1_2);
		
		Button btnNewButton_2 = new Button("4");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setFont(new Font("Dialog", Font.BOLD, 16));
		btnNewButton_2.setBackground(UIManager.getColor("ToolBar.highlight"));
		btnNewButton_2.setBounds(100, 213, 95, 55);
		contentPane.add(btnNewButton_2);
		
		Button btnNewButton_3 = new Button("5");
		btnNewButton_3.setForeground(UIManager.getColor("ToolBar.highlight"));
		btnNewButton_3.setFont(new Font("Blackadder ITC", Font.BOLD, 16));
		btnNewButton_3.setBackground(UIManager.getColor("ToolBar.foreground"));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(196, 213, 95, 55);
		contentPane.add(btnNewButton_3);
		
		Button btnNewButton_4 = new Button("6");
		btnNewButton_4.setFont(new Font("Dialog", Font.BOLD, 16));
		btnNewButton_4.setBackground(UIManager.getColor("ToolBar.highlight"));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setBounds(292, 213, 95, 55);
		contentPane.add(btnNewButton_4);
		
		Button btnX = new Button("-");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnX.setForeground(UIManager.getColor("ToolBar.highlight"));
		btnX.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 18));
		btnX.setBackground(UIManager.getColor("ToolTip.foreground"));
		btnX.setBounds(10, 114, 95, 55);
		contentPane.add(btnX);
		
		Button btnNewButton_6 = new Button("1");
		btnNewButton_6.setForeground(UIManager.getColor("ToolBar.highlight"));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_6.setFont(new Font("Blackadder ITC", Font.BOLD, 16));
		btnNewButton_6.setBackground(UIManager.getColor("ToolBar.foreground"));
		btnNewButton_6.setBounds(100, 163, 95, 55);
		contentPane.add(btnNewButton_6);
		
		Button btnNewButton_7 = new Button("2");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_7.setFont(new Font("Dialog", Font.BOLD, 16));
		btnNewButton_7.setBackground(UIManager.getColor("ToolBar.highlight"));
		btnNewButton_7.setBounds(196, 163, 95, 55);
		contentPane.add(btnNewButton_7);
		
		Button btnNewButton_8 = new Button("3");
		btnNewButton_8.setForeground(UIManager.getColor("ToolBar.highlight"));
		btnNewButton_8.setFont(new Font("Dialog", Font.BOLD, 16));
		btnNewButton_8.setBackground(UIManager.getColor("ToolBar.foreground"));
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_8.setBounds(292, 163, 95, 55);
		contentPane.add(btnNewButton_8);
		
		Button btnNewButton_9 = new Button("+");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_9.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 18));
		btnNewButton_9.setBackground(UIManager.getColor("ToolBar.highlight"));
		btnNewButton_9.setBounds(10, 163, 95, 55);
		contentPane.add(btnNewButton_9);
		
		Button btnNewButton_11 = new Button("0");
		btnNewButton_11.setForeground(UIManager.getColor("ToolBar.foreground"));
		btnNewButton_11.setFont(new Font("Dialog", Font.BOLD, 16));
		btnNewButton_11.setBackground(UIManager.getColor("ToolBar.highlight"));
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_11.setBounds(100, 320, 95, 55);
		contentPane.add(btnNewButton_11);
		
		Button btnNewButton_12 = new Button(".");
		btnNewButton_12.setForeground(UIManager.getColor("ToolBar.highlight"));
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_12.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 18));
		btnNewButton_12.setBackground(UIManager.getColor("ToolBar.foreground"));
		btnNewButton_12.setBounds(10, 213, 95, 55);
		contentPane.add(btnNewButton_12);
		
		Button btnNewButton_13 = new Button("=");
		btnNewButton_13.setForeground(UIManager.getColor("Tree.background"));
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_13.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 18));
		btnNewButton_13.setBackground(UIManager.getColor("ToolTip.foreground"));
		btnNewButton_13.setBounds(191, 320, 196, 55);
		contentPane.add(btnNewButton_13);
		
		Button btnNewButton_5 = new Button("%");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_5.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 18));
		btnNewButton_5.setBackground(UIManager.getColor("ToolBar.highlight"));
		btnNewButton_5.setBounds(100, 114, 95, 55);
		contentPane.add(btnNewButton_5);
		
		Button btnC = new Button("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnC.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 18));
		btnC.setBackground(UIManager.getColor("ToolBar.highlight"));
		btnC.setBounds(292, 114, 95, 55);
		contentPane.add(btnC);
		
		Button btnDel = new Button("del");
		btnDel.setForeground(UIManager.getColor("ToolBar.highlight"));
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDel.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 18));
		btnDel.setBackground(UIManager.getColor("ToolBar.foreground"));
		btnDel.setBounds(196, 114, 95, 55);
		contentPane.add(btnDel);
		
		Button btnNewButton_16 = new Button("/");
		btnNewButton_16.setForeground(UIManager.getColor("ToolBar.highlight"));
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_16.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 18));
		btnNewButton_16.setBackground(UIManager.getColor("ToolBar.foreground"));
		btnNewButton_16.setBounds(10, 320, 95, 55);
		contentPane.add(btnNewButton_16);
		
		JLabel lblNewLabel = new JLabel("CALCULATOR");
		lblNewLabel.setBackground(Color.ORANGE);
		lblNewLabel.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 35));
		lblNewLabel.setBounds(93, 10, 481, 44);
		contentPane.add(lblNewLabel);
	}
}
