package com.calculator.frontend.dwai;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
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
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 622);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 112, 636, 62);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(10, 48, 636, 53);
		contentPane.add(textPane);
		
		JButton btnNewButton = new JButton("1/x");
		btnNewButton.setBounds(423, 185, 102, 53);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("+");
		btnNewButton_1.setBounds(541, 249, 105, 57);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("-");
		btnNewButton_2.setBounds(541, 336, 105, 57);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("/");
		btnNewButton_3.setBounds(541, 499, 105, 53);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("*");
		btnNewButton_4.setBounds(541, 404, 105, 56);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("=");
		btnNewButton_5.setBounds(541, 185, 105, 53);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("7");
		btnNewButton_6.setBounds(10, 244, 113, 62);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("8");
		btnNewButton_7.setBounds(144, 244, 120, 62);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("9");
		btnNewButton_8.setBounds(283, 244, 120, 62);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("Root");
		btnNewButton_9.setBounds(423, 244, 102, 63);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("7");
		btnNewButton_10.setBounds(10, 336, 113, 53);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("8");
		btnNewButton_11.setBounds(144, 336, 117, 53);
		contentPane.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("9");
		btnNewButton_12.setBounds(283, 336, 120, 53);
		contentPane.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("Clear");
		btnNewButton_13.setBounds(423, 336, 102, 53);
		contentPane.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("4");
		btnNewButton_14.setBounds(10, 407, 113, 53);
		contentPane.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("5");
		btnNewButton_15.setBounds(148, 407, 113, 53);
		contentPane.add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("6");
		btnNewButton_16.setBounds(283, 407, 120, 53);
		contentPane.add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("%");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_17.setBounds(423, 407, 102, 53);
		contentPane.add(btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton("3");
		btnNewButton_18.setBounds(10, 499, 113, 53);
		contentPane.add(btnNewButton_18);
		
		JButton btnNewButton_19 = new JButton("2");
		btnNewButton_19.setBounds(144, 499, 129, 53);
		contentPane.add(btnNewButton_19);
		
		JButton btnNewButton_20 = new JButton("1");
		btnNewButton_20.setBounds(283, 499, 120, 53);
		contentPane.add(btnNewButton_20);
		
		JButton btnNewButton_21 = new JButton("0");
		btnNewButton_21.setBounds(423, 499, 112, 53);
		contentPane.add(btnNewButton_21);
	}
}
