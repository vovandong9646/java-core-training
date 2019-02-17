package com.swing.java;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;

public class SwingDesign {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingDesign window = new SwingDesign();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SwingDesign() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnFirstProjectabsolute = new JButton("Absolute Layout");
		btnFirstProjectabsolute.setBackground(new Color(204, 102, 51));
		btnFirstProjectabsolute.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				JOptionPane.showMessageDialog(null, "Welcome to Java GUI");
			}
		});
		btnFirstProjectabsolute.setFont(new Font("Consolas", Font.BOLD, 20));
		btnFirstProjectabsolute.setBounds(97, 201, 234, 49);
		frame.getContentPane().add(btnFirstProjectabsolute);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(31, 39, 77, 20);
		frame.getContentPane().add(comboBox);
		
		JLabel lblJavaGui = new JLabel("JAVA GUI");
		lblJavaGui.setBounds(153, 42, 70, 14);
		frame.getContentPane().add(lblJavaGui);
		
		JCheckBox chckbxCheckbox = new JCheckBox("checkbox1");
		chckbxCheckbox.setBounds(35, 84, 97, 23);
		frame.getContentPane().add(chckbxCheckbox);
		
		JCheckBox chckbxCheckbox_1 = new JCheckBox("checkbox2");
		chckbxCheckbox_1.setBounds(144, 84, 97, 23);
		frame.getContentPane().add(chckbxCheckbox_1);
		
		textField = new JTextField();
		textField.setBounds(97, 134, 234, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 121, 434, 2);
		frame.getContentPane().add(separator);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(97, 165, 234, 20);
		frame.getContentPane().add(passwordField);
	}
}
